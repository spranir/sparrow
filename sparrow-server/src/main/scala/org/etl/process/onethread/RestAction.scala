package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.Action
import org.etl.command.CommandProxy

class RestAction extends org.etl.command.Action with LazyLogging {
  
  
  def execute(context: org.etl.command.Context,action: org.etl.sparrow.Action): org.etl.command.Context = {
    val restAsIs: org.etl.sparrow.Rest = action.asInstanceOf[org.etl.sparrow.Rest]
    val rest: org.etl.sparrow.Rest = CommandProxy.createProxy(restAsIs, classOf[org.etl.sparrow.Rest], context)
    
    val url = rest.getUrl
    val method = rest.getMethod
    val headerSql = rest.getHeaderdata
    val ackSql = rest.getAckdata
    val ackTarget = rest.getAckdatato
    val authResource = rest.getAuthtoken
    val name=rest.getName
    context
  }

  def executeIf(context: org.etl.command.Context,action: org.etl.sparrow.Action): Boolean = {
    true
  }
  
}