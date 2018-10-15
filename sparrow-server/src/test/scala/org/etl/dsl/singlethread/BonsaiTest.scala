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
import com.facebook.ads.sdk.APIContext
import com.facebook.ads.sdk.AdAccount
import com.facebook.ads.sdk.Campaign
import com.facebook.ads.sdk.LeadgenForm
import java.util.HashMap

class BonsaiFileUploadLeadCreationTest {
  val JSON_FACTORY: JsonFactory = JacksonFactory.getDefaultInstance();
  

  @Test def testThroughFileLoad() = {
    val accessToken = "EAAEhaBeKXKcBAJSKgnD45yHW6PM7dvnD4Nt5fWZCpZCcH1JrdII80ZAOBZBo7gki5YktvhMsA0mujbrq3sMNFMZCePNXYI5Okbfvkn4XLCYuXelVnqNpI6Vi5eCtZAyI3YWipxD80OsuHrCkn8LaPXz8KrttJSXPeyvEygi5ZCw8QZDZD"
    val appSecret = "632b2b7e5a1d1a86348aa3ec73606cfd"
    val accountId = "1385910988364458"
    val fbContext = new APIContext(accessToken, appSecret);
    val fbAccount = new AdAccount(accountId, fbContext)
    val leadForm = new LeadgenForm(536104780150634L, fbContext)
    //https://www.facebook.com/ads/lead_gen/export_csv/?id=<FORM_ID>&amp;type=form&amp;from_date=1482698431&amp;to_date=1482784831
    val params: HashMap[String, Object] = new HashMap()
    params.put("from_date", "1536451200");
    params.put("to_date", "1536537599");
    
    val list = leadForm.getLeads.execute(params)
    val iter = list.withAutoPaginationIterator(true).iterator()
    var counter = 0
    while(iter.hasNext())
    {
      counter = counter+1
      println(counter)
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