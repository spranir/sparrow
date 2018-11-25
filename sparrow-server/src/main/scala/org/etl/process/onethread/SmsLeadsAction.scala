package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.CommandProxy
import org.etl.util.ParameterisationEngine
import org.etl.util.ResourceAccess
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.client.methods.HttpGet
import java.net.URLEncoder
import org.apache.commons.text.StrSubstitutor

class SmsLeadsAction extends org.etl.command.Action with LazyLogging {

  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: org.etl.sparrow.Action): Context = {
    val smsAsIs: org.etl.sparrow.SmsLeadSms = action.asInstanceOf[org.etl.sparrow.SmsLeadSms]
    val sms: org.etl.sparrow.SmsLeadSms = CommandProxy.createProxy(smsAsIs, classOf[org.etl.sparrow.SmsLeadSms], context)
    val client = HttpClientBuilder.create().build();

    val name = sms.getName
    val sender = sms.getSender
    val url = sms.getUrl
    val dbSrc = sms.getDbSrc
    val user = sms.getAccount
    val password = sms.getPrivateKey
    val dryRun = sms.getDryrunNumber
    val sql = sms.getValue
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)

    try {
      while (rs.next()) {
        val comment = rs.getString("comment")
        val targetName = rs.getString("target_full_name")
        val targetStatus = rs.getString("target_status")
        val targetId = rs.getInt("target_id")
        val targetDescription = rs.getString("target_description")
        val targetLocation = rs.getString("target_location")
        val targetMobileNumber = rs.getString("target_mobile_number")
        val targetAltNumber = rs.getString("target_alternate_number")
        val targetCity = rs.getString("target_city")
        val targetBudget = rs.getString("target_budget")

        val body = rs.getString("body")

        val paramMap: java.util.Map[String, String] = new java.util.HashMap[String, String]
        paramMap.put("target_full_name", targetName)
        paramMap.put("target_status", targetStatus)
        paramMap.put("target_id", targetId.toString())
        paramMap.put("target_description", targetDescription)
        paramMap.put("target_location", targetLocation)
        paramMap.put("target_mobile_number", targetMobileNumber)
        paramMap.put("target_alternate_number", targetAltNumber)
        paramMap.put("target_city", targetCity)
        paramMap.put("target_budget", targetBudget)
       

        val mobile = {
          if (dryRun!=null && !dryRun.isEmpty())
            dryRun.trim
          else
            rs.getString("mobile")
        }
        val country = rs.getString("country")
        val source = rs.getString("source")

        val paramEngine = new StrSubstitutor(paramMap)
        val output = paramEngine.replace(body)
        val encodedMessage = URLEncoder.encode(output)
        val urlString = url + "username=" + user + "&password=" + password + "&sender=" + sender + "&numbers=" + mobile + "&message=" + encodedMessage
        val request = new HttpGet(urlString);
        request.addHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");
        request.addHeader("Upgrade-Insecure-Requests", "1")
        request.addHeader("Host", "smsleads.in")
        request.addHeader("Accept-Language", "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7")
        request.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
        val response = client.execute(request);
        logger.info("Sent sms using url {} with responsecode {}", url, response)
      }
    } finally {

      detailMap.put("dbSrc", dbSrc)
      detailMap.put("user", user)
      detailMap.put("password", password)
      detailMap.put("target", dryRun)
      detailMap.put("url", url)
      detailMap.put("sender", sender)
      detailMap.put("sql", sql)
      stmt.close
      conn.close
    }
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val smsAsIs: org.etl.sparrow.SmsLeadSms = action.asInstanceOf[org.etl.sparrow.SmsLeadSms]
    val sms: org.etl.sparrow.SmsLeadSms = CommandProxy.createProxy(smsAsIs, classOf[org.etl.sparrow.SmsLeadSms], context)
    val expression = sms.getCondition
    try {
      val output = ParameterisationEngine.doYieldtoTrue(expression)
      detailMap.putIfAbsent("condition-output", output.toString())
      output
    } finally {
      if (expression != null)
        detailMap.putIfAbsent("condition", "LHS=" + expression.getLhs + ", Operator=" + expression.getOperator + ", RHS=" + expression.getRhs)

    }
  }

  def generateAudit(): java.util.Map[String, String] = {
    this.detailMap
  }

}