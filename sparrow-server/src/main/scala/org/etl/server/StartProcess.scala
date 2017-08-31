package org.etl.server

import org.restlet.resource.ServerResource
import org.restlet.resource.Get
import java.io.BufferedReader
import java.io.FileReader
import org.etl.SparrowStandaloneSetup
import org.etl.parser.antlr.SparrowParser

class StartProcess extends ServerResource {

  @Get("application/json")
  def represent(): String = {
    val inboundValue = getRequest().getAttributes().get("processname");
    val processName: String = inboundValue.asInstanceOf[String]
    val path = PathResolver.resolvePath(processName)
    val sparrowHero = new SparrowStandaloneSetup
    val guiceInjector = sparrowHero.createInjectorAndDoEMFRegistration
    val parser = guiceInjector.getInstance(classOf[SparrowParser]);
    val result = parser.parse(new FileReader(path));
    val eRoot = result.getRootASTElement();
    val process: org.etl.sparrow.Process = eRoot.asInstanceOf[org.etl.sparrow.Process]
    try {
      val runtime = ProcessRuntimeFactory.create("onethread")
      runtime.execute(process)
    } catch {
      case ex: Throwable => {
        val onError = process.getOnError
      }
    } finally {
      val onFinally = process.getFinally
    }
    ""
  }

}