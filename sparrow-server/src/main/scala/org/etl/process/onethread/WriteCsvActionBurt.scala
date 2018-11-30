/*package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context
import org.etl.util.ResourceAccess
import org.etl.command.CommandProxy
import org.etl.util.ParameterisationEngine
import java.io.FileWriter
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import com.opencsv.CSVWriter
import scala.collection.JavaConversions._

class WriteCsvAction extends org.etl.command.Action with LazyLogging {

  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: Action): Context = {
    val writecsvAsIs = action.asInstanceOf[org.etl.sparrow.WriteCsv]
    val writecsv: org.etl.sparrow.WriteCsv = CommandProxy.createProxy(writecsvAsIs, classOf[org.etl.sparrow.WriteCsv], context)

    val from = writecsv.getSource
    val to = writecsv.getTo
    val name = writecsv.getName
    val id = context.getValue("process-id")
    val sqlList = writecsv.getValue.replaceAll("\"", "")
    logger.info("WriteCsv id#{}, name#{}, from#{}, sqlList#{}", id, name, from)

    val conn = ResourceAccess.rdbmsConn(from)
    val stmt = conn.createStatement
    conn.setAutoCommit(false)
    try {

      val rs1: ResultSet = stmt.executeQuery(sqlList)
      var writer = new CSVWriter(new FileWriter(to), '\t')
      writer.writeAll(rs1, true)
      writer.close()
      println("Write Completed")
    } finally {
      conn.commit
      stmt.close
      conn.close

      detailMap.put("Soure", from)
      detailMap.put("destination", to)
      detailMap.put("name", name)
      detailMap.put("query", sqlList)
    }

    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    val writecsvAsIs = action.asInstanceOf[org.etl.sparrow.WriteCsv]
    val writecsv: org.etl.sparrow.WriteCsv = CommandProxy.createProxy(writecsvAsIs, classOf[org.etl.sparrow.WriteCsv], context)

    val expression = writecsv.getCondition
    try {
      val output = ParameterisationEngine.doYieldtoTrue(expression)
      detailMap.putIfAbsent("condition-output", output.toString())
      output
    } finally {
      //detailMap.putIfAbsent("condition", "LHS=" + expression.getLhs + ", Operator=" + expression.getOperator + ", RHS=" + expression.getRhs)

    }
  }
  def generateAudit(): java.util.Map[String, String] = {
    detailMap
  }

}*/