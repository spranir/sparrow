package org.etl.dsl.singlethread

import org.junit.Test
import com.google.api.services.calendar.CalendarScopes
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import java.io.File
import java.util.Collections
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.json.JsonFactory

class GoogleCalendarActionTest {
    val JSON_FACTORY:JsonFactory = JacksonFactory.getDefaultInstance();
 @Test def runCalendar() = {
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
  }
}