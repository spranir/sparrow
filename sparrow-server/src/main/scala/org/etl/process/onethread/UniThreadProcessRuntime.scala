package org.etl.process.onethread

import org.etl.command.Context
import org.etl.server.ProcessRuntime
import org.etl.command.ErrorContext
import com.typesafe.scalalogging.LazyLogging
import org.etl.command.FinallyContext
import org.etl.command.TryContext
import org.etl.sparrow.Catch
import org.etl.sparrow.Finally
import org.etl.sparrow.Action
import java.util.function.Consumer
import org.etl.audit.AuditService
import java.net.Inet4Address

case class AbortException(reason:String) extends Exception

class UniThreadProcessRuntime(name:String, id:Int) extends ProcessRuntime with LazyLogging{
  
  def execute(process:org.etl.sparrow.Process, context:Context)={
    var errorContext:ErrorContext=new ErrorContext(context.asInstanceOf[TryContext])
    try {
      
     executeChain(process.getTry.getAction, context)
    } catch {
      case ex: AbortException =>{
        logError(ex)
      }
      case ex: Throwable => {
        logError(ex)
        val onError = process.getCatch
        errorContext=executeCatch(onError, context.asInstanceOf[TryContext])
        errorContext.exception=ex
      }
      
    } finally {
      val onFinally = process.getFinally
      executeFinally(onFinally, errorContext)
    }
  }
  
  @throws(classOf[Exception])
  def executeChain(actionList:java.util.List[Action], context:Context)={
    
    val iterator = actionList.iterator()
    while(iterator.hasNext())
    {
      val action = iterator.next
      val actionRuntime = CommandFactory.create(action.eClass.getName)
      if(actionRuntime.executeIf(context, action))
      {
        val actionId = AuditService.insertCommandAudit(id, action.eClass().getName+"->"+action.getName, name)
        actionRuntime.execute(context, action)
        //TODO still need to fix the status part
        AuditService.updateCommandAudit(actionId, 1)
      }
    }
    
  }
  def logError(ex: Throwable) = {
    logger.error("Error executing process", ex)  
  }

  def executeCatch(onError: Catch, context:TryContext):ErrorContext = {
    val errorContext:ErrorContext = new ErrorContext(context)
    executeChain(onError.getAction, errorContext)
    errorContext
  }

  def executeFinally(onFinally: Finally, errorContext: ErrorContext):FinallyContext = {
    val finallyContext:FinallyContext = new FinallyContext(errorContext)
    executeChain(onFinally.getAction, finallyContext)
    val processId:String = errorContext.getValue("process-id")
    val contextLog:String = errorContext.completeStackTrace
    val status:Int = if(contextLog.isEmpty) 1 else -1
    AuditService.updateProcessAudit(Integer.parseInt(processId), status, contextLog, name)
    finallyContext
  }


}