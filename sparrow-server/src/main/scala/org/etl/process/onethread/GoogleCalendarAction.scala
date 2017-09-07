package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.sparrow.Action
import org.etl.sparrow.Googlecal
import org.etl.util.ResourceAccess
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.util.store.FileDataStoreFactory
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import java.io.File
import java.util.Collections
import com.google.api.services.calendar.model.Event
import com.google.api.services.calendar.model.EventDateTime
import java.util.Date
import com.google.api.client.util.DateTime
import java.util.TimeZone
import com.google.api.services.calendar.model.Event.Reminders
import java.util.Arrays

class GoogleCalendarAction extends org.etl.command.Action with LazyLogging {
  
  val DATA_STORE_DIR:java.io.File =
      new java.io.File(System.getProperty("user.home"), ".store/calendar_sample");
  
  val JSON_FACTORY:JsonFactory = JacksonFactory.getDefaultInstance();
  
  val CALENDAR_SCOPE="https://www.googleapis.com/auth/calendar"
  def execute(context: Context, action: Action): Context = {
    val cal:Googlecal = action.asInstanceOf[Googlecal]
    val dbSrc = cal.getSource
    val mail = cal.getUseraccount
    val relativePath = cal.getAuthstore
    val authStore = this.getClass.getClassLoader.getResource(relativePath).getPath
    val key = cal.getKey
    val sql = cal.getValue
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)
    val httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    val dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
    val credential:GoogleCredential = new GoogleCredential.Builder().setTransport(httpTransport).
          setJsonFactory(JSON_FACTORY).
          setServiceAccountId(mail).
          setServiceAccountPrivateKeyId(key).
          setServiceAccountPrivateKeyFromP12File(new File(authStore)).
          setServiceAccountScopes(Collections.singleton(CALENDAR_SCOPE)).   
          
          build();
    val client = new com.google.api.services.calendar.Calendar.Builder(
          httpTransport, JSON_FACTORY, credential).setApplicationName("sparrow").build();
    while(rs.next())
    {
      val calId = rs.getString("event_calendar_id")
      val interval = rs.getInt("event_interval")
      val startDate = rs.getDate("event_start")
      val endDate = rs.getString("event_end")
      val time = rs.getString("event_alert_time")
      val title = rs.getString("event_title")
      val description =rs.getString("description")
      val location = rs.getString("event_location")
      val event = new Event();
      val startDateG = new Date(startDate.getTime)
            
      
      val start = new DateTime(startDateG, TimeZone.getTimeZone("Asia/Kolkata"))
      event.setStart(new EventDateTime().setDateTime(start).setTimeZone("Asia/Kolkata"))
      
      val eventEnd = new Date(startDate.getTime+60*60*1000)      
      val dailyEnd  = new DateTime(eventEnd, TimeZone.getTimeZone("Asia/Kolkata"));
      event.setEnd(new EventDateTime().setDateTime(dailyEnd).setTimeZone("Asia/Kolkata"))
      
      event.setLocation(location)
      event.setSummary(title)
      event.setDescription(description)
      
      val endDateForRecur = endDate.replaceAll("-", "")+"T170000Z"
      println("Final date set for recurrence="+endDateForRecur)
      event.setRecurrence(Arrays.asList("RRULE:FREQ=WEEKLY;UNTIL="+endDateForRecur));

      
      val result = client.events().insert(calId, event).execute();
    }
    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    true
  }
}