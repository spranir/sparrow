package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Action
import org.etl.command.Context
import org.etl.util.ResourceAccess
import org.etl.SparrowStandaloneSetup
import org.etl.server.PathResolver
import org.etl.SparrowStandaloneSetup
import org.etl.command.TryContext
import org.etl.parser.antlr.SparrowParser
import java.io.FileReader
import org.etl.server.ProcessExecutor
import org.etl.command.CommandProxy
import org.etl.server.ProcessAST

class CallProcessAction extends org.etl.command.Action with LazyLogging {

  

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {

    val callProcessAsIs: org.etl.sparrow.Callprocess = action.asInstanceOf[org.etl.sparrow.Callprocess]
    val callProcess: org.etl.sparrow.Callprocess = CommandProxy.createProxy(callProcessAsIs, classOf[org.etl.sparrow.Callprocess], context)

    val name = callProcess.getName
    val fileRelativePath: String = callProcess.getSource
    val processName: String = callProcess.getTarget
    val dbSrc = callProcess.getDatasource
    val sql = callProcess.getValue.replaceAll("\"", "")
    val id=context.getValue("process-id")
    
    logger.info("Callprocess id#{}, name#{}, calledprocess#{}, calledfile#{}, db=#{}",id, name, processName, fileRelativePath, dbSrc)
    
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)
    val columnCount = rs.getMetaData.getColumnCount

    
    
    while (rs.next()) {

      for (i <- 1 until columnCount) {
        val key = rs.getMetaData.getColumnLabel(i)
        val value = rs.getString(i)
        context.addValue(key, value)

      }
      
      val runtimeContext = ProcessAST.loadProcessAST(processName, fileRelativePath, context)
      
      try {
        //TODO - change to create(config.get("runmode"))
        val runtime = ProcessExecutor.execute("org.etl.process.onethread", runtimeContext)
        
      } catch {
        case ex: Throwable => {
          handleError(ex)
        }
      } finally {
        val onFinally = runtimeContext.process.getFinally
        handleFinally()
      }
    }
    logger.info("Completed callprocess name#{}, calledprocess#{}, calledfile#{}, db=#{}",name, processName, fileRelativePath, dbSrc)
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    true
  }
  
  def handleError(ex: Throwable) = {
    logger.info("Error section of call process")
  }

  def handleFinally() = {
    logger.info("Finally section of call process")
  }

}