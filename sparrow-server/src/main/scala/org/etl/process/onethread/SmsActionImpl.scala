package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess
import com.clicksend.ClickSendClient
import com.clicksend.models.SmsMessage
import com.clicksend.models.SmsMessageCollection
import java.util.ArrayList
import org.etl.util.ParameterisationEngine

class SmsActionImpl extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val smsAsIs: org.etl.sparrow.ClickSendSms = action.asInstanceOf[org.etl.sparrow.ClickSendSms]
    val sms: org.etl.sparrow.ClickSendSms = CommandProxy.createProxy(smsAsIs, classOf[org.etl.sparrow.ClickSendSms], context)

    val userId = sms.getUserid
    val securityKey = sms.getSecurityKey
    val sql = sms.getValue
    val dbSrc = sms.getTarget
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)
    val clickSendClient = new ClickSendClient(userId, securityKey);
    val smsController = clickSendClient.getSMS();
    val messageCollection = new SmsMessageCollection();
    val messages = new ArrayList[SmsMessage]();
    while (rs.next()) {
      val body = rs.getString("body")
      val mobile = rs.getString("mobile")
      val country = rs.getString("country")
      val source = rs.getString("source")
      val smsMessage = new SmsMessage();
      smsMessage.setSource(source);
      smsMessage.setBody(body);
      smsMessage.setTo(mobile);
      smsMessage.setCountry(country);
      messages.add(smsMessage)
    }
    messageCollection.setMessages(messages)
    val response = smsController.sendSms(messageCollection);
    try {}
    finally {
      stmt.close
      conn.close
    }
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val smsAsIs: org.etl.sparrow.ClickSendSms = action.asInstanceOf[org.etl.sparrow.ClickSendSms]
    val sms: org.etl.sparrow.ClickSendSms = CommandProxy.createProxy(smsAsIs, classOf[org.etl.sparrow.ClickSendSms], context)

    val expression = sms.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }
}