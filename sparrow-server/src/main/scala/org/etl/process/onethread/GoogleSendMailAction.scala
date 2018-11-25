package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.CommandProxy
import org.etl.sparrow.GooglecontactPUT
import org.etl.util.ParameterisationEngine
import org.etl.util.ResourceAccess
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import java.io.File
import java.util.Collections
import com.google.api.services.people.v1.PeopleServiceScopes
import com.google.api.services.people.v1.model.Person
import com.google.api.services.people.v1.model.PhoneNumber
import com.google.api.services.people.v1.model.EmailAddress
import com.google.api.services.people.v1.model.Name
import com.google.api.services.people.v1.PeopleService
import java.util.concurrent.atomic.AtomicInteger
import com.google.api.services.people.v1.model.Source
import com.google.api.services.people.v1.model.Address
import com.google.api.services.people.v1.model.ProfileMetadata
import com.google.api.services.people.v1.model.Url
import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Message

class GoogleSendMailAction extends org.etl.command.Action with LazyLogging {
  
  val detailMap = new java.util.HashMap[String, String]
  val JSON_FACTORY: JsonFactory = JacksonFactory.getDefaultInstance();
  
  //https://developers.google.com/gmail/api/quickstart/java
  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val contactPut: GooglecontactPUT = action.asInstanceOf[GooglecontactPUT]
    val contact: org.etl.sparrow.GooglecontactPUT = CommandProxy.createProxy(contactPut, classOf[org.etl.sparrow.GooglecontactPUT], context)
    val dbSrc = contact.getDbSrc
    val accountId = contact.getAccount
    val mail = contact.getImpersonatedUser
    val relativePath = contact.getPtwelveFile
    val key = contact.getPrivateKey
    val project = contact.getProject
    val authStore = this.getClass.getClassLoader.getResource(relativePath).getPath
    val sql = contact.getValue
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)
    val httpTransport = GoogleNetHttpTransport.newTrustedTransport();

    val credential: GoogleCredential = new GoogleCredential.Builder().setTransport(httpTransport).
      setJsonFactory(JSON_FACTORY).
      setServiceAccountId(accountId).
      setServiceAccountPrivateKeyId(key).
      setServiceAccountPrivateKeyFromP12File(new File(authStore)).
      setServiceAccountProjectId(project).
      setServiceAccountScopes(Collections.singleton(PeopleServiceScopes.CONTACTS)).
      setServiceAccountUser(mail).build()
      
     val service = new Gmail.Builder(httpTransport, JSON_FACTORY, credential)
                .setApplicationName(project)
                .build();
    
    val message = createEMail()
    service.users().messages().send(accountId, message)
    context
  }

  def createEMail(emailContent:MimeMessage):Message = {
    
  }
  
  def createMimeMessage():MimeMessage = {
    
  }
  
  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val contactPut: GooglecontactPUT = action.asInstanceOf[GooglecontactPUT]
    val contact: org.etl.sparrow.GooglecontactPUT = CommandProxy.createProxy(contactPut, classOf[org.etl.sparrow.GooglecontactPUT], context)
    val expression = contact.getCondition
    try {
      val output = ParameterisationEngine.doYieldtoTrue(expression)
      detailMap.putIfAbsent("condition-output", output.toString())
      output
    } finally {
       if(expression!=null)
      detailMap.putIfAbsent("condition", "LHS=" + expression.getLhs + ", Operator=" + expression.getOperator + ", RHS=" + expression.getRhs)

    }
  }

  def generateAudit(): java.util.Map[String, String] = {
    detailMap
  }
}