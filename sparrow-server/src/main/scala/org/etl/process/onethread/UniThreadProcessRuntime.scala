package org.etl.process.onethread

import org.etl.command.Context
import org.etl.server.ProcessRuntime
import org.etl.command.ErrorContext
import com.typesafe.scalalogging.LazyLogging
import org.etl.command.FinallyContext
import org.etl.command.TryContext
import org.etl.sparrow.Catch
import org.etl.sparrow.Finally

class UniThreadProcessRuntime extends ProcessRuntime with LazyLogging{
  
  def execute(process:org.etl.sparrow.Process, context:Context)={
    var errotContext:ErrorContext=null
    try {
     
    } catch {
      case ex: Throwable => {
        val onError = process.getCatch
        errotContext=executeCatch(onError, context.asInstanceOf[TryContext])
        logError(ex)
      }
    } finally {
      val onFinally = process.getFinally
      executeFinally(onFinally, errotContext)
    }
  }
  
  def logError(ex: Throwable) = {
    logger.error("Error executing process", ex)  
  }

  def executeCatch(onError: Catch, context:TryContext):ErrorContext = {
    val errorContext:ErrorContext = new ErrorContext(context)
    //put the error handling code in here
    errorContext
  }

  def executeFinally(onFinally: Finally, errotContext: ErrorContext) = {
    //add the stub meant for finallyContext
    val finallyContext:FinallyContext = new FinallyContext(errotContext)
  }


}