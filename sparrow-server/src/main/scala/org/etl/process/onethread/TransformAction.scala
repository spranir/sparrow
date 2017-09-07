package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.sparrow.Transform
import org.etl.command.Context
import org.etl.util.ResourceAccess

class TransformAction extends org.etl.command.Action with LazyLogging {
  def execute(context: Context, action: Action): Context = {
    val transform:Transform = action.asInstanceOf[Transform]
    val dbSrc = transform.getOn
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    conn.setAutoCommit(false)
    val sqlList = transform.getValue
    val stmt = conn.createStatement
    val iter = sqlList.iterator
    while(iter.hasNext)
    {
      val sqlWithoutQuotes = iter.next.replaceAll("\"", "")
      val sqlList = sqlWithoutQuotes.split(";")
      println("executing script ="+sqlList)
      sqlList.foreach { sql =>
        if(!sql.isEmpty())
        stmt.execute(sql) }      
    }
    conn.commit
    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    true
  }
  
}