package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.CommandProxy
import java.io.File

class DropFileAction extends org.etl.command.Action with LazyLogging {
  def execute(context: org.etl.command.Context,action: org.etl.sparrow.Action): org.etl.command.Context = 
  {
    val dropFileAsIs: org.etl.sparrow.Dropfile = action.asInstanceOf[org.etl.sparrow.Dropfile]
    val dropFile: org.etl.sparrow.Dropfile = CommandProxy.createProxy(dropFileAsIs, classOf[org.etl.sparrow.Dropfile], context)

    val file = dropFile.getTarget
    val name = dropFile.getName
    
    val filePath = new File(file)
    filePath.delete
    
    context
  }
  
  def executeIf(context: org.etl.command.Context,action: org.etl.sparrow.Action): Boolean = 
  {
    true
  }
}