package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.Action
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.charset.StandardCharsets
import java.nio.file.StandardOpenOption
import org.etl.util.ParameterisationEngine

class DoozleAction extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val doozleAsIs: org.etl.sparrow.Doozle = action.asInstanceOf[org.etl.sparrow.Doozle]
    val doozle: org.etl.sparrow.Doozle = CommandProxy.createProxy(doozleAsIs, classOf[org.etl.sparrow.Doozle], context)

    val dbSrc = doozle.getOn
    val table = doozle.getTarget
    val name = doozle.getName
    val ddlSql = doozle.getValue.replaceAll("\"", "")
    val id = context.getValue("process-id")

    logger.info("Doozle id#{}, name#{}, table#{}, db=#{}", id, name, table, dbSrc)

    val incomingJson = context.getValue("myjson")
    val storagePath = context.getValue("json.storagepath")
    storeJson(incomingJson, storagePath, table, id)

    logger.info("Sql=" + ddlSql)
    val conn = ResourceAccess.rdbmsConn(dbSrc)
    val stmt = conn.createStatement
    try {
      stmt.execute(ddlSql)
      logger.info("Completed doozle id#{}, name#{}, table#{}, db=#{}", id, name, table, dbSrc)
    } finally {
      stmt.close
      conn.close
    }
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val doozleAsIs: org.etl.sparrow.Doozle = action.asInstanceOf[org.etl.sparrow.Doozle]
    val doozle: org.etl.sparrow.Doozle = CommandProxy.createProxy(doozleAsIs, classOf[org.etl.sparrow.Doozle], context)

    val expression = doozle.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }

  def storeJson(incomingJson: String, storagePath: String, name: String, id: String) = {
    val finalPath = storagePath + "/" + name + ".json"
    Files.write(Paths.get(finalPath), incomingJson.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE)
    logger.info("File stored for doozle id#{}, path#{}", id, finalPath)
  }

}