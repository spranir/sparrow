package org.etl.process.onethread

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

class WriteCsvActionUsingOpenCsv extends org.etl.command.Action with LazyLogging {
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
    conn.setAutoCommit(false)

    val stmt = conn.createStatement
    val rs1: ResultSet = stmt.executeQuery(sqlList)
    var writer = new CSVWriter(new FileWriter(to), '\t')
    writer.writeAll(rs1, true)
    writer.close()
    println("Write Completed")
    conn.commit
    logger.info("Completed WriteCsv id#{}, name#{}, from#{}, sqlList#{}", id, name, from, sqlList)

    stmt.close
    conn.close
    context
  }

  def executeIf(context: Context, action: Action): Boolean = {
    val writecsvAsIs = action.asInstanceOf[org.etl.sparrow.WriteCsv]
    val writecsv: org.etl.sparrow.WriteCsv = CommandProxy.createProxy(writecsvAsIs, classOf[org.etl.sparrow.WriteCsv], context)

    val expression = writecsv.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }

}