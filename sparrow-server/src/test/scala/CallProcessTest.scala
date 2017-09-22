import org.junit.Test
import org.etl.config.ConfigurationService
import org.etl.server.PathResolver
import org.etl.SparrowStandaloneSetup
import org.etl.command.TryContext
import org.etl.parser.antlr.SparrowParser
import java.io.FileReader
import org.etl.server.ProcessRuntimeFactory


class CallProcessTest {
  
  @Test def runProcess()={
    System.currentTimeMillis()
    val urla = this.getClass.getClassLoader.getResource("auth/Dhuruva-BMS-fa750e3a8102.p12")
    println(urla)
    val url = this.getClass.getClassLoader.getResource("configstore.props")
    val instanceName = "test.callprocess.process#1" 
    val config:Map[String, String] = ConfigurationService.getAllConfig(instanceName)
    val fileRelativePath = config.get("filepath").get;
    println("filepath="+fileRelativePath)
    val basePath = config.get("basepath").get;
    println("basepath="+basePath)
    val path = PathResolver.resolvePath(instanceName, fileRelativePath, basePath)
    val sparrowHero = new SparrowStandaloneSetup
    val guiceInjector = sparrowHero.createInjectorAndDoEMFRegistration
    val parser = guiceInjector.getInstance(classOf[SparrowParser]);
    val result = parser.parse(new FileReader(path));
    val eRoot = result.getRootASTElement();
    val process: org.etl.sparrow.Process = eRoot.asInstanceOf[org.etl.sparrow.Process]
    val tryContext = new TryContext(config, instanceName)
    try {
      //TODO - change to create(config.get("runmode"))
      val runtime = ProcessRuntimeFactory.create("org.etl.process.onethread")
      runtime.execute(process, tryContext)
    } catch {
      case ex: Throwable => {
        ex.printStackTrace()
      }
    } finally {
      
    }
  }
  
  @Test def relativePath {
    System.currentTimeMillis()
    val url = this.getClass.getClassLoader.getResource("auth/Dhuruva-BMS-fa750e3a8102.p12")
    println(url)
  }
}