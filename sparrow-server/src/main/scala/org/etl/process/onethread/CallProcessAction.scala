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
import org.etl.server.ProcessRuntimeFactory
import org.etl.command.CommandProxy

class CallProcessAction extends org.etl.command.Action with LazyLogging {
  
    
  def handleError(ex: Throwable) = {
    logger.info("Error section of call process")
  }

  def handleFinally() = {
    logger.info("Finally section of call process")
  }

  def execute(context: org.etl.command.Context,action: org.etl.sparrow.Action): org.etl.command.Context = {
    
    val callProcessAsIs:org.etl.sparrow.Callprocess = action.asInstanceOf[org.etl.sparrow.Callprocess]
    val callProcess:org.etl.sparrow.Callprocess = CommandProxy.createProxy(callProcessAsIs, classOf[org.etl.sparrow.Callprocess], context)
    
    val definition:String = callProcess.getSource
    val processName:String = callProcess.getTarget
    val dbSrc = callProcess.getDatasource
    val sql = callProcess.getValue.replaceAll("\"", "")
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    val rs = stmt.executeQuery(sql)
    val columnCount=rs.getMetaData.getColumnCount
    while(rs.next())
    {
      
      for (i <- 1 until columnCount)
      {
        val key = rs.getMetaData.getColumnLabel(i)
        val value = rs.getString(i)
        context.addValue(key, value)
        
      }
      val sparrowHero = new SparrowStandaloneSetup
      val guiceInjector = sparrowHero.createInjectorAndDoEMFRegistration      
      val basePath = context.getMe.get("basepath");
      println("basepath="+basePath)
      val path = PathResolver.resolvePath(processName, definition, basePath)
      val parser = guiceInjector.getInstance(classOf[SparrowParser]);
      val result = parser.parse(new FileReader(path));
      val eRoot = result.getRootASTElement();
      val process: org.etl.sparrow.Process = eRoot.asInstanceOf[org.etl.sparrow.Process]
      val tryContext = new TryContext(context.getMeAsIs, processName)
      try {
      //TODO - change to create(config.get("runmode"))
      val runtime = ProcessRuntimeFactory.create("org.etl.process.onethread")
      runtime.execute(process, tryContext)
    } catch {
      case ex: Throwable => {
        handleError(ex)
      }
    } finally {
      val onFinally = process.getFinally
      handleFinally()
    }
    }
    context
  }
  

  def executeIf(context: org.etl.command.Context,action: org.etl.sparrow.Action): Boolean = {
    true
  }

  
}