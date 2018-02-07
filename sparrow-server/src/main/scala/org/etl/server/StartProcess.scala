package org.etl.server

import org.restlet.resource.ServerResource
import org.restlet.resource.Get
import java.io.BufferedReader
import java.io.FileReader
import org.etl.SparrowStandaloneSetup
import org.etl.parser.antlr.SparrowParser
import org.etl.config.ConfigurationService
import scala.collection.immutable.HashMap
import org.etl.command.TryContext
import org.etl.command.TryContext
import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Catch
import org.etl.command.ErrorContext
import org.etl.sparrow.Finally
import org.etl.command.FinallyContext
import org.etl.command.FinallyContext
import org.etl.audit.AuditService
import java.net.InetAddress
import org.restlet.resource.Post
import org.restlet.representation.Representation
import org.restlet.ext.json.JsonRepresentation

class StartProcess extends ServerResource with LazyLogging {
  val runMode = "org.etl.process.onethread"
  //sample url - http://localhost:8080/process/publish.demandforecast.process#1/start

  @Get("application/json")
  def represent(): String = {
    val inboundValue = getRequest.getAttributes.get("instance");

    val alias = getRequest().getAttributes().get("alias");
    val instanceName: String = inboundValue.asInstanceOf[String] + "#" + alias.asInstanceOf[String]
    logger.info("Starting the process=" + instanceName)
    val runtimeContext = ProcessAST.loadProcessAST(instanceName, "{}")

    try {

      ProcessExecutor.execute(runMode, runtimeContext)

    } catch {
      case ex: Throwable => {
        handleError(ex)
      }
    } finally {

      handleFinally()
    }
    "{\"start_status\": \"SUCCESS\"}"
  }

  @Post("application/json")
  def acceptAndReturnJson(json: JsonRepresentation): String = {
    val inboundValue = getRequest.getAttributes.get("instance");

    val alias = getRequest().getAttributes().get("alias");
    val instanceName: String = inboundValue.asInstanceOf[String] + "#" + alias.asInstanceOf[String]
    logger.info("Starting the process=" + instanceName + ", with incoming json=" + json)
    val jsonObject = json.getJsonObject.toString
    val runtimeContext = ProcessAST.loadProcessAST(instanceName, jsonObject)

    try {
      
      ProcessExecutor.execute(runMode, runtimeContext)

    } catch {
      case ex: Throwable => {
        handleError(ex)
      }
    } finally {

      handleFinally()
    }

    "{\"start_status\": \"SUCCESS\"}"
  }

  def handleError(ex: Throwable) = {
    ex.printStackTrace()
  }

  def handleFinally() = {
    println("Processing the request completed")
  }
}