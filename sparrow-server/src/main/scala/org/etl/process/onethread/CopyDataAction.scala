package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.Action
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess
import org.json.JSONObject
import org.json.JSONArray
import org.eclipse.emf.common.util.EList
import org.etl.util.ParameterisationEngine
import java.util.ArrayList
import java.sql.SQLException
import akka.actor._

class CopydataAction extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val copydataAsIs: org.etl.sparrow.Copydata = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val source = copydata.getSource
    val destination = copydata.getTo
    val name = copydata.getName
    val ddlSql: String = copydata.getValue.replaceAll("\"", "")
    val id = context.getValue("process-id")

    val copydataDbConnfrom = ResourceAccess.rdbmsConn(source)
    val copydataStmtfrom = copydataDbConnfrom.createStatement
    val copydataDbConnto = ResourceAccess.rdbmsConn(destination)
    val copydataStmtto = copydataDbConnto.createStatement
    
    val output: Array[String] = ddlSql.split(";")
    val select: String = output(0)
    var insert: String = output(1)
    
    
    val rs = copydataStmtfrom.executeQuery(select)

    val cols: Int = rs.getMetaData().getColumnCount()
    var query: String = null
    var send: String = null
    while (rs.next()) {
      val i: Int = 0
      query = query + "("
      for (i <- 1 to cols) {
        query = query + "\"" + rs.getString(i) + "\"" + ","
      }
      query = query.substring(0, query.length() - 1) + "),"
    }

    query = query.replace("null(", "(").replace("\"null\"", "null")
    insert = insert + query.substring(0, query.length() - 1) + ";"
    println(insert)
    try {
      copydataStmtto.execute(insert)
    } catch {
      case ex: SQLException => {
        ex.printStackTrace()
      }
    } finally {
      copydataStmtfrom.close()
      copydataStmtto.close()
      copydataDbConnfrom.close()
      copydataDbConnto.close()
    }
    context

  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val copydataAsIs: org.etl.sparrow.Copydata = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val expression = copydata.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }
}

