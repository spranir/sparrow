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

class GContactCreateAction extends org.etl.command.Action with LazyLogging {
  val JSON_FACTORY: JsonFactory = JacksonFactory.getDefaultInstance();
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
    val peopleService: PeopleService =
      new PeopleService.Builder(httpTransport, JSON_FACTORY, credential).setApplicationName(project).build();

    while (rs.next()) {

      val name = rs.getString("name")
      val email = rs.getString("email")
      val location = rs.getString("location")
      val mobile = rs.getString("mobile")

      val person = new Person
      val phoneList = new java.util.ArrayList[PhoneNumber]
      val phone = new PhoneNumber
      phone.setValue(mobile)
      phoneList.add(phone)

      val nameList = new java.util.ArrayList[Name]
      val personName = new Name
      personName.setDisplayName(name)
      personName.setFamilyName(location)
      personName.setGivenName(name)

      nameList.add(personName)

      val emailList = new java.util.ArrayList[EmailAddress]
      val personEmail = new EmailAddress
      personEmail.setDisplayName(email)
      personEmail.setValue(email)
      emailList.add(personEmail)

      person.setPhoneNumbers(phoneList)
      person.setNames(nameList)
      person.setEmailAddresses(emailList)

      val contact = peopleService.people.createContact(person)
      val output = contact.execute()
    }
    try {}
    finally {
      stmt.close
      conn.close
    }
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val contactPut: GooglecontactPUT = action.asInstanceOf[GooglecontactPUT]
    val contact: org.etl.sparrow.GooglecontactPUT = CommandProxy.createProxy(contactPut, classOf[org.etl.sparrow.GooglecontactPUT], context)
    val expression = contact.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)    
  }
}