package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context
import org.etl.util.ResourceAccess
import org.etl.command.CommandProxy

class TransformAction extends org.etl.command.Action with LazyLogging {
  def execute(context: Context, action: Action): Context = {
    val transformAsIs = action.asInstanceOf[org.etl.sparrow.Transform]
    val transform:org.etl.sparrow.Transform = CommandProxy.createProxy(transformAsIs, classOf[org.etl.sparrow.Transform], context)
    
    val dbSrc = transform.getOn
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    conn.setAutoCommit(false)
    val sqlList = transform.getValue
    val stmt = conn.createStatement
    val iter = sqlList.iterator
    while (iter.hasNext) {
      val sqlWithoutQuotes = iter.next.replaceAll("\"", "")
      val sqlList = sqlWithoutQuotes.split(";")
      sqlList.foreach { sql =>
        if (!sql.isEmpty()) {
          logger.info("Executing script ="+sql.trim)
          stmt.execute(sql.trim)
        }
      }
    }
    conn.commit
    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    true
  }

}