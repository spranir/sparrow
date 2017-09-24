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


class StartProcess extends ServerResource with LazyLogging {

  //sample url - http://localhost:8080/publish.demandforecast.process.1/start
  
  @Get("application/json")
  def represent(): String = {
    val inboundValue = getRequest().getAttributes().get("instance");
    val instanceName: String = inboundValue.asInstanceOf[String]
    val loadedTuple = ProcessAST.loadProcessAST(instanceName)
    
    val process = loadedTuple._3
    val config  = loadedTuple._1
    val path = loadedTuple._2
    val tryContext = new TryContext(config, instanceName)
    
    try {
      //TODO - change to create(config.get("runmode"))
      val runMode = "org.etl.process.onethread"
      val machine = InetAddress.getLocalHost.getHostAddress      
      val instanceId = AuditService.insertInstanceAudit(instanceName, runMode, machine, path)
      val runtime = ProcessRuntimeFactory.create(runMode)
      runtime.execute(process, tryContext)
    } catch {
      case ex: Throwable => {
        handleError(ex)
      }
    } finally {
      val onFinally = process.getFinally
      handleFinally()
      //AuditService.updateProcessAudit(processId, status, contextLog)
    }
    ""
  }

  
  def handleError(ex: Throwable) = {
    ???
  }

  def handleFinally() = {
    ???
  }
}