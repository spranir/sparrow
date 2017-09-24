import org.junit.Test
import org.etl.config.ConfigurationService
import org.etl.server.PathResolver
import org.etl.SparrowStandaloneSetup
import org.etl.command.TryContext
import org.etl.parser.antlr.SparrowParser
import java.io.FileReader
import org.etl.server.ProcessExecutor
import org.etl.server.ProcessAST


class PublishDemandForecast {
  
  @Test def runProcess()={
    System.currentTimeMillis()
   
    val instanceName = "publish.demandforecast.process#1" 
    val runtimeContext = ProcessAST.loadProcessAST(instanceName)
    try {
      //TODO - change to create(config.get("runmode"))
      val runtime = ProcessExecutor.execute("org.etl.process.onethread", runtimeContext)

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