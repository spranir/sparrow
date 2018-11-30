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
import scala.collection.JavaConversions._
import java.io.Writer
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.io.BufferedOutputStream
import java.io.File

class WriteCsvAction extends org.etl.command.Action with LazyLogging {

  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: Action): Context = {
    val writecsvAsIs = action.asInstanceOf[org.etl.sparrow.WriteCsv]
    val writecsv: org.etl.sparrow.WriteCsv = CommandProxy.createProxy(writecsvAsIs, classOf[org.etl.sparrow.WriteCsv], context)

    val from = writecsv.getSource
    val to: File = new File(writecsv.getTo)
    val name = writecsv.getName
    val id = context.getValue("process-id")
    val sqlList = writecsv.getValue.replaceAll("\"", "")
    logger.info("WriteCsv id#{}, name#{}, from#{}, sqlList#{}", id, name, from)

    val conn = ResourceAccess.rdbmsConn(from)
    conn.setAutoCommit(false)

    val stmt = conn.createStatement
    val ars: ResultSet = stmt.executeQuery(sqlList)
    val ncols: Int = ars.getMetaData.getColumnCount
    conn.commit

    val fop: FileOutputStream = new FileOutputStream(to)
    val out: Writer = new OutputStreamWriter(new BufferedOutputStream(fop))
    if (!to.exists()) {
      to.createNewFile()
    }

    for (i <- 1 until (ncols + 1)) {
      out.append(ars.getMetaData.getColumnName(i))
      if (i < ncols) out.append("\t") else out.append("\r\n")
    }
    while (ars.next()) {
      for (i <- 1 until (ncols + 1)) {
        out.append(ars.getString(i))
        if (i < ncols) out.append("\t") else out.append("\r\n")

      }
    }

    out.close()
    logger.info("Completed WriteCsv id#{}, name#{}, from#{}, sqlList#{}", id, name, from, sqlList)

    stmt.close
    conn.close
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
     // detailMap.putIfAbsent("condition", "LHS=" + expression.getLhs + ", Operator=" + expression.getOperator + ", RHS=" + expression.getRhs)
    }
  }
  def generateAudit(): java.util.Map[String, String] = {
    detailMap
  }

}