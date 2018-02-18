package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.CommandProxy
import com.facebook.ads.sdk.APIContext
import com.facebook.ads.sdk.AdAccount
import com.facebook.ads.sdk.Campaign
import org.etl.util.ResourceAccess
import org.etl.util.ParameterisationEngine

/**
 * //https://developers.facebook.com/docs/marketing-api/guides/lead-ads/retrieving/v2.9
 * //https://developers.facebook.com/docs/marketing-api/guides/lead-ads/retrieving/v2.9
 * //1.https://developers.facebook.com/apps
 * // -- App display name - in.junome.fubar.app (https://developers.facebook.com/apps/318205931969703/settings/)
 * // -- Under marketing api/tools
 * // -----ads_management, ads_read, manage_notifications, manage_pages, read_insights, rsvp_event
 * // App secret - 632b2b7e5a1d1a86348aa3ec73606cfd
 * // Client token - 4097cb4c0fff4c502dff24f31c36f0e6
 * // Access token - EAAEhaBeKXKcBAE991IXtywQPyCSOSOtOKo7n1UhLZCZCQQPg2Ps5dTZB9gPMGte41u0q0yzjLfEqqkXTaxKNHZA7CMTLq8cRRupt8l1Kmg2EzhcR9ZCXBuOsZB9JpzmLGX1ZBubDyjRwM6q4UlqzXmYv3qbazgBVeJHe13SGV7bWkcVIPtqVx4r
 * // Account id - 1385910988364458
 * public static final String ACCESS_TOKEN = "EAAEhaBeKXKcBAE991IXtywQPyCSOSOtOKo7n1UhLZCZCQQPg2Ps5dTZB9gPMGte41u0q0yzjLfEqqkXTaxKNHZA7CMTLq8cRRupt8l1Kmg2EzhcR9ZCXBuOsZB9JpzmLGX1ZBubDyjRwM6q4UlqzXmYv3qbazgBVeJHe13SGV7bWkcVIPtqVx4r";
 * public static final Long ACCOUNT_ID = 1385910988364458L;
 * public static final String APP_SECRET = "632b2b7e5a1d1a86348aa3ec73606cfd";
 */
class FBLeadCreateAction extends org.etl.command.Action with LazyLogging {

  val NAME = 1
  val EMAIL = 2
  val MOBILE = 3
  val ALT_MOBILE = 4
  val LOCALITY = 5
  val TARGETED_CITY = 6
  val LEADSOURCE_CAMPAIGN = 7;
  val LEADSOURCE_CHANNEL = 8;
  val COMPANY = 9;
  val LEADGEN_DATE = 10;
  val COA_APROX = 11;
  val PROFESSION = 12;
  val BUDGET = 13;
  val LEADSOURCE_METADATA = 14;
  val INTENT_METADATA = 15;
  val BATCH_ID = 16;

  val InsertSql = "replace into leads_soft (  name, email, mobile, alt_mobile, locality, targeted_city, leadsource_campaign, leadsource_channel, company, leadgen_date, coa_aprox, profession, budget, leadsource_metadata, intent_metadata, batch_id, updated_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?,now());"
  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val fbAsIs: org.etl.sparrow.FBCLead = action.asInstanceOf[org.etl.sparrow.FBCLead]
    val fb: org.etl.sparrow.FBCLead = CommandProxy.createProxy(fbAsIs, classOf[org.etl.sparrow.FBCLead], context)

    val accessToken = fb.getAccessToken
    val appSecret = fb.getAppSecret
    val accountId = fb.getAccountId
    val campaignIdList = {
      if (fb.getCampaignId.contains(","))
        fb.getCampaignId.split(",")
      else
        Array(fb.getCampaignId)
    }
    val fieldsToSelect = fb.getValue
    val fieldArray = fieldsToSelect.split(",")
    val dbTarget = fb.getTarget
    val tgtConn = ResourceAccess.rdbmsConn(dbTarget)
    val stmt = tgtConn.prepareStatement(InsertSql)

    val fbContext = new APIContext(accessToken, appSecret);
    val fbAccount = new AdAccount(accountId, fbContext)

    campaignIdList.foreach {
      campaignId =>
        {
          val campaign = Campaign.fetchById(campaignId, fbContext)
          val adList = campaign.getAds.requestNameField().execute()

          //Need to know how to use the lamba and keep my life simple
          if (!adList.isEmpty()) {
            val adListIter = adList.iterator()
            while (adListIter.hasNext()) {
              val ad = adListIter.next()

              val leadList = ad.getLeads.requestAllFields().execute();
              if (!leadList.isEmpty()) {
                val leadListIter = leadList.listIterator
                while (leadListIter.hasNext()) {

                  val lead = leadListIter.next
                  val createdAt = lead.getFieldCreatedTime

                  val leadSourceMeta = "ad_id=" + lead.getFieldAdId + ",<br/> ad_name=" + lead.getFieldAdName + "<br/>, adset_id=" + lead.getFieldAdsetId +
                    "<br/>, adset_name=" + lead.getFieldAdsetName + "<br/>, campaign_id=" + lead.getFieldCampaignId + "<br/>,form_id=" +
                    lead.getFieldFormId + "<br/>,id=" + lead.getFieldId + "<br/>, dailybudget=" + 0
                  //ad.getFieldAdset.getFieldDailyBudget - will try later

                  val userGenData = lead.getFieldFieldData

                  val intentMeta = new StringBuilder
                  if (!userGenData.isEmpty) {
                    val usergeniter = userGenData.listIterator
                    while (usergeniter.hasNext()) {
                      val userData = usergeniter.next()
                      val name = userData.getFieldName.trim
                      val value = userData.getFieldValues.toArray().mkString(",")
                      if (name.equals("email")) {
                        stmt.setString(EMAIL, value)
                      } else if (name.equals("full_name")) {
                        stmt.setString(NAME, value)
                      } else if (name.equals("city")) {
                        stmt.setString(TARGETED_CITY, value)
                        stmt.setString(LOCALITY, value)
                      } else if (name.equals("company_name")) {
                        stmt.setString(COMPANY, value)
                      } else if (name.equals("phone_number")) {
                        val prunedValue = {
                          if (value.length > 10)
                            value.substring(value.length - 10, value.length)
                          else
                            value
                        }
                        stmt.setString(MOBILE, prunedValue)
                        stmt.setString(ALT_MOBILE, value)
                      } else if (name.equals("job_title")) {
                        stmt.setString(PROFESSION, value)
                      } else {
                        intentMeta.append(name).append("=").append(value).append("\n")
                      }
                      usergeniter.remove
                    }
                  }
                  stmt.setString(INTENT_METADATA, intentMeta.toString)
                  stmt.setString(LEADSOURCE_METADATA, leadSourceMeta)
                  stmt.setString(LEADSOURCE_CAMPAIGN, lead.getFieldCampaignName)
                  stmt.setInt(BUDGET, 0)
                  stmt.setInt(COA_APROX, 0)
                  stmt.setString(LEADSOURCE_CHANNEL, "FB")
                  stmt.setString(LEADGEN_DATE, createdAt)
                  val processid = context.getValue("process-id")
                  stmt.setInt(BATCH_ID, Integer.parseInt(processid))
                  stmt.executeUpdate
                  tgtConn.commit
                  leadListIter.remove
                } //leadList.iterator().hasNext()
              } //!leadList.isEmpty()
            } //adListIter.hasNext()
          } //!adList.isEmpty()

          try {}
          finally {
            stmt.close
            tgtConn.close
          }
        }
    }

    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val fbAsIs: org.etl.sparrow.FBCLead = action.asInstanceOf[org.etl.sparrow.FBCLead]
    val fb: org.etl.sparrow.FBCLead = CommandProxy.createProxy(fbAsIs, classOf[org.etl.sparrow.FBCLead], context)
    val expression = fb.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }

  //email	full_name	phone_number	city	company_name	job_title

}