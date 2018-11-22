package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.CommandProxy
import org.etl.util.ParameterisationEngine
import org.etl.AbortException

class AbortAction extends org.etl.command.Action with LazyLogging {
  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: org.etl.sparrow.Action): Context = {
    val abortAsIs: org.etl.sparrow.Abort = action.asInstanceOf[org.etl.sparrow.Abort]
    val abort: org.etl.sparrow.Abort = CommandProxy.createProxy(abortAsIs, classOf[org.etl.sparrow.Abort], context)
    val message = abort.getValue.trim
    val id = context.getValue("process-id")
    val name = abort.getName

    logger.info("Abort action id#{}, name#{}, calledprocess#{}, message#{}", id, name, name, message)
    try {
      throw new AbortException(message)
    } finally {
      detailMap.putIfAbsent("message", message)
      detailMap.putIfAbsent("name", name)
    }
  }

  def executeIf(context: Context, action: org.etl.sparrow.Action): Boolean = {
    val abortAsIs: org.etl.sparrow.Abort = action.asInstanceOf[org.etl.sparrow.Abort]
    val abort: org.etl.sparrow.Abort = CommandProxy.createProxy(abortAsIs, classOf[org.etl.sparrow.Abort], context)

    val expression = abort.getCondition
    try {
      val output=ParameterisationEngine.doYieldtoTrue(expression)
      detailMap.putIfAbsent("condition-output", output.toString())
      output
    } finally {
        detailMap.putIfAbsent("condition", "LHS=" +expression.getLhs+", Operator="+expression.getOperator+", RHS="+expression.getRhs)
        
    }

  }

  def generateAudit(): java.util.Map[String, String] = {
    detailMap
  }

}