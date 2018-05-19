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

class SmsCustomerTest {
  val JSON_FACTORY:JsonFactory = JacksonFactory.getDefaultInstance();
  @Test def runProcess()={
    val df = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
    val date = df.format(new Date(System.currentTimeMillis()))
    val instanceName = "candy.sendsms.customer.process#2" 
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
  
}