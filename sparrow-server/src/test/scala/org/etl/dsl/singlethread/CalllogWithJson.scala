package org.etl.dsl.singlethread

import org.junit.Test
import org.etl.config.ConfigurationService
import org.etl.server.PathResolver
import org.etl.SparrowStandaloneSetup
import org.etl.command.TryContext
import org.etl.parser.antlr.SparrowParser
import java.io.FileReader
import org.etl.server.ProcessExecutor
import org.etl.server.ProcessAST
import org.junit.Test
import org.etl.server.ProcessExecutor
import java.nio.charset.StandardCharsets._
import java.nio.file.{Files, Paths}



class Calllogwithjson {
  
  @Test def runProcess()={
    
    System.currentTimeMillis()
   
    val instanceName = "candy.uploadcalllog.process#1" 
    val filePath = this.getClass.getResource("calllog.json").getPath.toString
    val osAppropriatePath = if (System.getProperty( "os.name" ).contains( "indow" ))  filePath.substring(1) else filePath
    val json = new String(Files.readAllBytes(Paths.get(osAppropriatePath)), UTF_8)
    val runtimeContext = ProcessAST.loadProcessAST(instanceName,json)
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