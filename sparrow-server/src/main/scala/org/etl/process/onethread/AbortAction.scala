package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.CommandProxy
import org.etl.util.ParameterisationEngine

class AbortAction extends org.etl.command.Action with LazyLogging {

  def execute(context: Context, action: org.etl.sparrow.Action): Context = {
    val abortAsIs: org.etl.sparrow.Abort = action.asInstanceOf[org.etl.sparrow.Abort]
    val abort: org.etl.sparrow.Abort = CommandProxy.createProxy(abortAsIs, classOf[org.etl.sparrow.Abort], context)
    val message = abort.getMessage
    throw new AbortException(message)
  }

  def executeIf(context: Context, action: org.etl.sparrow.Action): Boolean = {
    val abortAsIs: org.etl.sparrow.Abort = action.asInstanceOf[org.etl.sparrow.Abort]
    val abort: org.etl.sparrow.Abort = CommandProxy.createProxy(abortAsIs, classOf[org.etl.sparrow.Abort], context)

    val expression = abort.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)

  }

}