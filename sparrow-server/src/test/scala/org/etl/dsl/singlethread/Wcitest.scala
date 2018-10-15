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
import java.text.DateFormat
import java.text.SimpleDateFormat

class Wcitest {
  val JSON_FACTORY:JsonFactory = JacksonFactory.getDefaultInstance();
  @Test def runProcess()={
    val df = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
    val date = df.format(new Date(System.currentTimeMillis()))
    val instanceName = "wordpress.candy.leadingestion#1" 
    val runtimeContext = ProcessAST.loadProcessAST(instanceName,"{}")
    try {
      
      val runtime = ProcessExecutor.execute("org.etl.process.onethread", runtimeContext)
      
    } catch {
      case ex: Throwable => {
        ex.printStackTrace()
      }
    } finally {
      
    }
  }
  
  
  
  /**/
  
 /*@Test def runContactJson()={
   val httpTransport = GoogleNetHttpTransport.newTrustedTransport();
   val credential = GoogleCredential.fromStream(new FileInputStream(new File("F:\\google-service-account-keys\\juno-console-10be801e4371.json")))
    .createScoped(Collections.singleton(PeopleServiceScopes.CONTACTS));
   
   
   val peopleService:PeopleService =
        new PeopleService.Builder(httpTransport, JSON_FACTORY, credential).setApplicationName("bonsai-crm").build();
    
    val person = new Person
    val phoneList = new java.util.ArrayList[PhoneNumber]
    val phone = new PhoneNumber
    phone.setValue("+919884024699")
    phoneList.add(phone)
    
    val nameList =  new java.util.ArrayList[Name]
    val name = new Name
    name.setDisplayName("Jana poornavelsamy")
    nameList.add(name)
    
    val emailList = new java.util.ArrayList[EmailAddress]
    val email = new EmailAddress
    email.setDisplayName("jpvel@junome.in")
    email.setValue("jpvel@junome.in")
    emailList.add(email)
    
    person.setPhoneNumbers(phoneList)
    person.setNames(nameList)
    person.setEmailAddresses(emailList)
    val contact = peopleService.people.createContact(person)
    val output = contact.execute()
    println(output)
 }*/
  
  @Test def relativePath {
    System.currentTimeMillis()
    val url = this.getClass.getClassLoader.getResource("auth/Dhuruva-BMS-fa750e3a8102.p12")
    println(url)
  }
}