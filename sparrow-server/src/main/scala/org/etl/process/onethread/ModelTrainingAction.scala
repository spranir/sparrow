package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.Action
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess
import org.json.JSONObject
import org.json.JSONArray
import org.eclipse.emf.common.util.EList
import org.etl.util.ParameterisationEngine
import java.util.ArrayList
import java.sql.SQLException
import akka.actor._
import scala.util.control.Exception.Finally
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.entity.UrlEncodedFormEntity
import org.apache.http.impl.client.DefaultHttpClient
import com.google.gson.Gson
import org.apache.http.entity.StringEntity

class ModelTrainingAction extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val modeltrainingAsIs: org.etl.sparrow.TrainSequence = action.asInstanceOf[org.etl.sparrow.TrainSequence]
    val modeltraining: org.etl.sparrow.TrainSequence = CommandProxy.createProxy(modeltrainingAsIs, classOf[org.etl.sparrow.TrainSequence], context)

    try {
      val postData = modeltraining.getValue
      val gson = new Gson
      // create an HttpPost object
      val url = modeltraining.getUrl
      val post = new HttpPost(url)
      val hkey = modeltraining.getHkey
      val hvalue = modeltraining.getHvalue

      // set the Content-type
      post.setHeader(hkey, hvalue)

      // add the JSON as a StringEntity
      post.setEntity(new StringEntity(gson.toJson(postData)))
      // send the post request
      val response = (new DefaultHttpClient).execute(post)
      var content = ""
      val entity = response.getEntity()
      if (entity != null) {
        val inputStream = entity.getContent()
        content = scala.io.Source.fromInputStream(inputStream).getLines.mkString
        inputStream.close
      }

      val resultObj = new JSONObject(content.toString())
      if (resultObj.getString("message").equals("success")) {
        println("success")
        true

      } else {
        println("error")
      }
      logger.info("response from python script  #{}", resultObj.getString("message"))
      false
    } catch {
      case e: Exception => false
    }
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val modeltrainingAsIs: org.etl.sparrow.TrainSequence = action.asInstanceOf[org.etl.sparrow.TrainSequence]
    val modeltraining: org.etl.sparrow.TrainSequence = CommandProxy.createProxy(modeltrainingAsIs, classOf[org.etl.sparrow.TrainSequence], context)

    val expression = modeltraining.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }
}

