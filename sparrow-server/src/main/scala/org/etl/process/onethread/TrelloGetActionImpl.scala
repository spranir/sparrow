package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context
import org.etl.command.CommandProxy

class TrelloGetActionImpl extends org.etl.command.Action with LazyLogging {
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

  def executeIf(context: Context, action: Action): Boolean = {
    true
  }
}