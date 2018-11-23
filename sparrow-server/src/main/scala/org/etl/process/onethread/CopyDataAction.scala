package org.etl.process.onethread

import java.sql.SQLException
import java.util.ArrayList
import org.etl.command.CommandProxy
import org.etl.command.Context
import org.etl.sparrow.Action
import org.etl.util.ParameterisationEngine
import org.etl.util.ResourceAccess
import com.typesafe.scalalogging.LazyLogging
import akka.actor._

class CopyDataAction extends org.etl.command.Action with LazyLogging {
  case class WriteData(insert: String)
  val detailMap = new java.util.HashMap[String, String]
  def execute(context: Context, action: Action): Context = {
    val copydataAsIs = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val source = copydata.getSource
    val destination = copydata.getTo
    val name = copydata.getName
    val ddlSql = copydata.getValue.replaceAll("\"", "")
    val id = context.getValue("process-id")

    val copydataDbConn = ResourceAccess.rdbmsConn(source)
    val copydataStmt = copydataDbConn.createStatement
    val copdatasql = copydata.getValue
    val copydataRs = copydataStmt.executeQuery(copdatasql)
    var copydataQuery = copydata.getValue
    var copydataInsert = copydata.getValue

    class ReadDataFromTb(write: ActorRef) extends Actor {

      def receive = {
        case "read" => {
          try {

            val rs = copydataStmt.executeQuery(ddlSql)
            val records = new ArrayList[ArrayList[String]]()
            val cols: Int = rs.getMetaData().getColumnCount()
            var j: Int = 0
            var insert: String = "Insert into test(intTrafficID,intLenderID,vcADID,vcCharId,intTransactionId,bitECO,vcIPAddress,dtCreated,RawUserInfo) values"
            var query: String = null
            var send: String = null
            while (rs.next()) {
              val arr = new ArrayList[String]
              val i: Int = 0
              query = query + "("
              for (i <- 0 to cols - 1) {
                query = query + rs.getString(i + 1) + ","
              }
              query = query.substring(0, query.length() - 1) + "),"
              records.add(j, arr)
              j = j + 1
            }
            query = query.replace("null(", "('")
            query = query.replace(",", "','")
            query = query.replace(")','", "'),")
            query = query.replace("),(", "),('")
            insert = insert + query.substring(0, query.length() - 1) + ";"
            copydataDbConn.close()
            write ! WriteData(insert)
          } catch {
            case ex: SQLException => {
              ex.printStackTrace()
            }
          } finally {

            copydataStmt.close
            copydataDbConn.close

          }
        }
      }

    }

    class WriteDataToDb extends Actor {

      def receive = {
        case WriteData(insert) =>
          copydataStmt.execute(insert)
          sender() ! PoisonPill
          self ! PoisonPill
          println("After using the poisonpill" + insert)
      }
    }

    val system = ActorSystem("ReadSystem")
    val write = system.actorOf(Props[WriteDataToDb], name = "WriteData")
    val read = system.actorOf(Props(new ReadDataFromTb(write)), name = "ReadData")
    read ! "read"

    context

  }
  def executeIf(context: Context, action: Action): Boolean = {
    val copydataAsIs = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val expression = copydata.getCondition
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