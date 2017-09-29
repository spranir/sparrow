package org.etl.server

import org.etl.config.ConfigurationService
import com.typesafe.scalalogging.LazyLogging
import org.etl.SparrowStandaloneSetup
import org.etl.parser.antlr.SparrowParser
import java.io.FileReader
import org.etl.command.Context
import org.json.JSONObject

case class RuntimeContext(process: org.etl.sparrow.Process, configMap: Map[String, String], path: String, instanceName: String)

object ProcessAST extends LazyLogging {

  val sparrowHero = new SparrowStandaloneSetup
  val guiceInjector = sparrowHero.createInjectorAndDoEMFRegistration
  val parser = guiceInjector.getInstance(classOf[SparrowParser]);

  def loadProcessAST(instanceName: String, json:String) = {
    val config: Map[String, String] = ConfigurationService.getAllConfig(instanceName)
    val inputConfig = config+("myjson"->json)
    val fileRelativePath = config.get("filepath").get;
    logger.info("filepath=" + fileRelativePath)
    val basePath = config.get("basepath").get;
    logger.info("basepath=" + basePath)
    val path = PathResolver.resolvePath(instanceName, fileRelativePath, basePath)

    val result = parser.parse(new FileReader(path));
    val eRoot = result.getRootASTElement();
    val process: org.etl.sparrow.Process = eRoot.asInstanceOf[org.etl.sparrow.Process]
    RuntimeContext(process, inputConfig, path, instanceName)
  }

  def loadProcessAST(instanceName: String, fileRelativePath: String, context: Context) = {
    logger.info("filepath=" + fileRelativePath)
    val basePath = context.getValue("basepath");
    logger.info("basepath=" + basePath)
    val path = PathResolver.resolvePath(instanceName, fileRelativePath, basePath)
    val result = parser.parse(new FileReader(path));
    val eRoot = result.getRootASTElement();
    val process: org.etl.sparrow.Process = eRoot.asInstanceOf[org.etl.sparrow.Process]
    RuntimeContext(process, context.getMeAsIs, path, instanceName)
  }

}