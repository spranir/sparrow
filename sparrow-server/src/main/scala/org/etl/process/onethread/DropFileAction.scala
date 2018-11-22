package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.CommandProxy
import java.io.File
import org.etl.util.ParameterisationEngine

class DropFileAction extends org.etl.command.Action with LazyLogging {
  val detailMap = new java.util.HashMap[String, String]
  def execute(context: org.etl.command.Context,action: org.etl.sparrow.Action): org.etl.command.Context = 
  {
    val dropFileAsIs: org.etl.sparrow.Dropfile = action.asInstanceOf[org.etl.sparrow.Dropfile]
    val dropFile: org.etl.sparrow.Dropfile = CommandProxy.createProxy(dropFileAsIs, classOf[org.etl.sparrow.Dropfile], context)

    val file = dropFile.getTarget
    val name = dropFile.getName
    val id = context.getValue("process-id")
    
     logger.info("Dropfile id#{}, name#{}, file#{}, db=#{}", id, name, file)
     
    val filePath = new File(file)
    try{
    filePath.delete
    logger.info("Completed dropfile id#{}, name#{}, file#{}, db=#{}", id, name, file)
    }
    finally{
      detailMap.put("file", file)
    }
    
    context
  }
  
  def executeIf(context: org.etl.command.Context,action: org.etl.sparrow.Action): Boolean = 
  {
    val dropFileAsIs: org.etl.sparrow.Dropfile = action.asInstanceOf[org.etl.sparrow.Dropfile]
    val dropFile: org.etl.sparrow.Dropfile = CommandProxy.createProxy(dropFileAsIs, classOf[org.etl.sparrow.Dropfile], context)

    val expression = dropFile.getCondition
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