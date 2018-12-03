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
import scala.util.control.Exception.Finally
import java.io.File
import org.rauschig.jarchivelib.Archiver;
import org.rauschig.jarchivelib.ArchiverFactory;

class TarAction extends org.etl.command.Action with LazyLogging {

  def execute(context: org.etl.command.Context, action: org.etl.sparrow.Action): org.etl.command.Context = {
    val tarAsIs: org.etl.sparrow.Tar = action.asInstanceOf[org.etl.sparrow.Tar]
    val tar: org.etl.sparrow.Tar = CommandProxy.createProxy(tarAsIs, classOf[org.etl.sparrow.Tar], context)


    val name = tar.getName
    val file : String = tar.getValue.replaceAll("\"", "")
    val id = context.getValue("process-id")


    val output: Array[String] = file.split(";")
    val read: String = output(0)
    val write : String = output(1)
    
    val source: File = new File(read)
    val destination: File = new File(write)
    val archiver: Archiver = ArchiverFactory.createArchiver("tar", "gz")
    archiver.create(name,destination,source);
    
    logger.info("WriteCsv id#{}, name#{}, from#{}, sqlList#{}", id, name,read,write)
    println("Archive completed")

    context

  }

  def executeIf(context: org.etl.command.Context, action: org.etl.sparrow.Action): Boolean = {
    val tarAsIs: org.etl.sparrow.Tar = action.asInstanceOf[org.etl.sparrow.Tar]
    val tar: org.etl.sparrow.Tar = CommandProxy.createProxy(tarAsIs, classOf[org.etl.sparrow.Tar], context)

    val expression = tar.getCondition
    ParameterisationEngine.doYieldtoTrue(expression)
  }
}

