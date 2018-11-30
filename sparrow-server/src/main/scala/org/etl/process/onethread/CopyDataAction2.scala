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

class CopydataAction2 extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val copydataAsIs: org.etl.sparrow.Copydata = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val source = copydata.getSource
    val destination = copydata.getTo
    val name = copydata.getName
    val ddlSql = copydata.getValue.replaceAll("\"", "")
    val id = context.getValue("process-id")

    val copydataDbConn = ResourceAccess.rdbmsConn(source)
    val copydataStmt = copydataDbConn.createStatement
    /*val copdatasql = copydata.getValue
    val copydataRs = copydataStmt.executeQuery(copdatasql)
    var copydataQuery = copydata.getValue
    var copydataInsert = copydata.getValue*/

    object CopyDataWithoutColumn {
      case class WriteData(insert: String)
        class ReadDataFromTb(write: ActorRef) extends Actor {

          def receive = {
            case "read" => {
              try {

                val rs = copydataStmt.executeQuery(ddlSql)
                val records = new ArrayList[ArrayList[String]]()
                val cols: Int = rs.getMetaData().getColumnCount()
                var j: Int = 0
                var insert: String = "Insert into test1 values"
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
              try {
                copydataStmt.execute(insert)
                sender() ! PoisonPill
                self ! PoisonPill
                println("After using the poisonpill" + insert)
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

        val system = ActorSystem("ReadSystem")
        val write = system.actorOf(Props[WriteDataToDb], name = "WriteData")
        val read = system.actorOf(Props(new ReadDataFromTb(write)), name = "ReadData")
        read ! "read"
      
    }
    context

  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val copydataAsIs: org.etl.sparrow.Copydata = action.asInstanceOf[org.etl.sparrow.Copydata]
    val copydata: org.etl.sparrow.Copydata = CommandProxy.createProxy(copydataAsIs, classOf[org.etl.sparrow.Copydata], context)

    val expression = copydata.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }

  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }
}

