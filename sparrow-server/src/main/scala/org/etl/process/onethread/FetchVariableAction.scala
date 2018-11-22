package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context
import org.etl.util.ParameterisationEngine
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess

class FetchVariableAction extends org.etl.command.Action with LazyLogging {
  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: Action): Context = {
    val fetchAsIs: org.etl.sparrow.Fetch = action.asInstanceOf[org.etl.sparrow.Fetch]
    val fetch: org.etl.sparrow.Fetch = CommandProxy.createProxy(fetchAsIs, classOf[org.etl.sparrow.Fetch], context)

    val source = fetch.getSource
    val name = fetch.getName
    val sql = fetch.getValue.trim
    val id = context.getValue("process-id")

    logger.info("Fetch id#{}, name#{}, sql#{}, db=#{}", id, name, sql, source)
    val conn = ResourceAccess.rdbmsConn(source)
    val stmt = conn.createStatement
    try {
      val rs = stmt.executeQuery(sql)
      val columnCount = rs.getMetaData.getColumnCount

      while (rs.next()) {

        for (i <- 1 until columnCount + 1) {
          val key = rs.getMetaData.getColumnLabel(i)
          val value = rs.getString(i)
          context.addValue(name + "." + key, value)          
        }
      }
    } finally {
      detailMap.put("source", source)
      detailMap.put("sql", sql)
      stmt.close
      conn.close
    }
    logger.info("Completed fetch id#{}, name#{}, sql#{}, db=#{}", id, name, sql, source)

    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    val fetchAsIs: org.etl.sparrow.Fetch = action.asInstanceOf[org.etl.sparrow.Fetch]
    val fetch: org.etl.sparrow.Fetch = CommandProxy.createProxy(fetchAsIs, classOf[org.etl.sparrow.Fetch], context)

    val expression = fetch.getCondition
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