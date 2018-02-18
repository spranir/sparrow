package org.etl.dsl.singlethread


import org.etl.server.ProcessAST
import org.junit.Test
import org.etl.server.ProcessExecutor
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.DateTime
import com.google.api.client.util.store.FileDataStoreFactory
import java.io.File
import java.io.File
import java.util.Arrays
import java.util.Collections
import java.util.Date
import java.util.TimeZone
import com.google.api.services.people.v1.PeopleService
import com.google.api.services.people.v1.PeopleServiceScopes
import com.google.api.services.people.v1.model.Person
import java.util.ArrayList
import com.google.api.services.people.v1.model.PhoneNumber
import com.google.api.services.people.v1.model.Name
import com.google.api.services.people.v1.model.EmailAddress
import java.io.FileInputStream
import com.google.api.services.calendar.CalendarScopes

class GoogleContact{
      
   val JSON_FACTORY:JsonFactory = JacksonFactory.getDefaultInstance();
   
  @Test def runContact()={
    val httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    //val dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
    val credential:GoogleCredential = new GoogleCredential.Builder().setTransport(httpTransport).
          setJsonFactory(JSON_FACTORY).
          setServiceAccountId("bonsai@bonsai-crm-under-tissow-org.iam.gserviceaccount.com").
          setServiceAccountPrivateKeyId("8debeae0d4910282754c67cadb177287d3ed8d86").
          setServiceAccountPrivateKeyFromP12File(new File("F:\\google-service-account-keys\\bonsai-crm-under-tissow-org-8debeae0d491.p12")).
          setServiceAccountProjectId("bonsai-crm-under-tissow-org").
          setServiceAccountScopes(Collections.singleton(PeopleServiceScopes.CONTACTS)).          
          setServiceAccountUser("junomeadmin@tissow.com").
          build();
    //credential.refreshToken()
    val peopleService:PeopleService =
        new PeopleService.Builder(httpTransport, JSON_FACTORY, credential).setApplicationName("bonsai-crm").build();
    
    val person = new Person
    val phoneList = new java.util.ArrayList[PhoneNumber]
    val phone = new PhoneNumber
    phone.setValue("+917358553540")
    phoneList.add(phone)
    
    val nameList =  new java.util.ArrayList[Name]
    val name = new Name
    name.setDisplayName("avel(Displayname)")
    name.setFamilyName("muthu(Familyname)")
    name.setGivenName("Kutti(Givenname)")
    
    nameList.add(name)
    
    val emailList = new java.util.ArrayList[EmailAddress]
    val email = new EmailAddress
    email.setDisplayName("11@junome.in")
    email.setValue("11@junome.in")
    emailList.add(email)
    
    person.setPhoneNumbers(phoneList)
    person.setNames(nameList)
    person.setEmailAddresses(emailList)
    val contact = peopleService.people.createContact(person)
    val output = contact.execute()
    println(output)      
  }
  
  /*@Test def runCalendar() = {
    val httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    //val dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
    val credential:GoogleCredential = new GoogleCredential.Builder().setTransport(httpTransport).
          setJsonFactory(JSON_FACTORY).
          setServiceAccountId("bonsai@bonsai-crm-under-tissow-org.iam.gserviceaccount.com").
          setServiceAccountPrivateKeyId("8debeae0d4910282754c67cadb177287d3ed8d86").
          setServiceAccountPrivateKeyFromP12File(new File("F:\\google-service-account-keys\\bonsai-crm-under-tissow-org-8debeae0d491.p12")).
          setServiceAccountProjectId("bonsai-crm-under-tissow-org").
          setServiceAccountScopes(Collections.singleton(CalendarScopes.CALENDAR)).          
          setServiceAccountUser("junomeadmin@tissow.com").
          build();
    val client = new com.google.api.services.calendar.Calendar.Builder(
          httpTransport, JSON_FACTORY, credential).setApplicationName("bonsai-crm").build();
    println(client.calendarList)
  }*/
  

}