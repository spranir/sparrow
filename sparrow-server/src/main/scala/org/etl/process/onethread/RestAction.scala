package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.command.Action
import org.etl.command.CommandProxy
import org.etl.util.ResourceAccess
import org.json.JSONObject
import org.json.JSONArray
import in.chimera.httpclient.ChimeraRestClient



/**
 * 1. Authenticate
 * 	- Handle http and https
 *  - Handle alltrust and strict evaluation
 * 2. Add headers
 * 3. Add parent part
 * 4. Add child part
 * 5. Print the graph and headers
 * 6. Make the call
 * 7. Receive the ack
 * 8. Store the ack
 */
class RestAction extends org.etl.command.Action with LazyLogging {
  
  

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val restAsIs: org.etl.sparrow.Rest = action.asInstanceOf[org.etl.sparrow.Rest]
    val rest: org.etl.sparrow.Rest = CommandProxy.createProxy(restAsIs, classOf[org.etl.sparrow.Rest], context)

    val name = rest.getName
    val url = rest.getUrl
    val method = rest.getMethod
    val authResource = rest.getAuthtoken

    val headerDbSrc = rest.getHeaderdatafrom
    val headerSql = rest.getHeaderdata
    val headerConn = ResourceAccess.rdbmsConn(headerDbSrc)
    val headerStmt = headerConn.createStatement
    val headerRs = headerStmt.executeQuery(headerSql)
    val headerColumnCount = headerRs.getMetaData.getColumnCount
    val headerMap:java.util.Map[String,String] = new java.util.HashMap[String,String]
    
    for (headerCounter <- 1 until headerColumnCount) {
      val headerKey = headerRs.getMetaData.getColumnLabel(headerCounter)
      val headerValue = headerRs.getString(headerCounter)
      headerMap.put(headerKey, headerValue)
    }
    
    val parentName = rest.getParentName
    val bodyDbSrc = rest.getPostdatafrom
    val parentData = rest.getParentdata

    val bodayConn = ResourceAccess.rdbmsConn(bodyDbSrc)
    val bodyStmt = bodayConn.createStatement
    val bodyResultset = bodyStmt.executeQuery(parentData)
    bodyResultset.next
    
    
    val jsonPayload = new JSONObject
    
    val parentColumnCount = bodyResultset.getMetaData.getColumnCount
    for (i <- 1 until parentColumnCount) {
      val key = bodyResultset.getMetaData.getColumnLabel(i)
      val value = bodyResultset.getString(i)
      jsonPayload.put(key, value)
    }

    val parts = rest.getParts
    val iter = parts.iterator()
    while (iter.hasNext) {
      val part = iter.next()
      val name = part.getPartName
      val query = part.getPartData
      val partRs = bodyStmt.executeQuery(query)
      val partColCount = partRs.getMetaData.getColumnCount
      val partArray = new JSONArray;
      while (partRs.next) {
        val partObj = new JSONObject
        for (j <- 1 until partColCount) {
          val fieldName = partRs.getMetaData.getColumnLabel(j)
          val fieldValue = partRs.getString(j)
          partObj.put(fieldName, fieldValue)
          
        }        
       partArray.put(partObj) 
      }
      jsonPayload.put(name, partArray)
    }
    val jsonObject = jsonPayload.toString
    val restClient  = new ChimeraRestClient(url, authResource, authResource, authResource)
    restClient.createAuthToken
    val output = restClient.post(url, jsonObject)
    
    val ackSql = rest.getAckdata
    val ackTarget = rest.getAckdatato
    context
  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    true
  }

  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }
}

