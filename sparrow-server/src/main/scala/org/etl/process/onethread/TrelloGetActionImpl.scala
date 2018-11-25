package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context
import org.etl.command.CommandProxy
import org.etl.util.ParameterisationEngine

class TrelloGetActionImpl extends org.etl.command.Action with LazyLogging {
    val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: Action): Context = {
    
    val trelloGetAsIs: org.etl.sparrow.TrelloGET = action.asInstanceOf[org.etl.sparrow.TrelloGET]
    val trelloGet: org.etl.sparrow.TrelloGET = CommandProxy.createProxy(trelloGetAsIs, classOf[org.etl.sparrow.TrelloGET], context)

    val authInfo = trelloGet.getAuthtoken
    val board = trelloGet.getBoard
    val authKey = trelloGet.getKey
    val target = trelloGet.getTarget
    val user = trelloGet.getUseraccount
    val name = trelloGet.getName
    val sql = trelloGet.getValue
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
     val trelloGetAsIs: org.etl.sparrow.TrelloGET = action.asInstanceOf[org.etl.sparrow.TrelloGET]
    val trelloGet: org.etl.sparrow.TrelloGET = CommandProxy.createProxy(trelloGetAsIs, classOf[org.etl.sparrow.TrelloGET], context)

    val expression = trelloGet.getCondition
    try {
      val output = ParameterisationEngine.doYieldtoTrue(expression)
      detailMap.putIfAbsent("condition-output", output.toString())
      output
    } finally {
      detailMap.putIfAbsent("condition", "LHS=" + expression.getLhs + ", Operator=" + expression.getOperator + ", RHS=" + expression.getRhs)

    }
  }
  
  def generateAudit(): java.util.Map[String, String] = {
    detailMap
  }
  
}