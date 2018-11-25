package org.etl.dsl.singlethread


import org.etl.server.ProcessAST
import org.junit.Test
import org.etl.server.ProcessExecutor

class WriteCsvFromDb {
  
  @Test def runProcess()={
    
    System.currentTimeMillis()
   
    val instanceName = "ffsc.writecsv.fromdb#1" 
    val runtimeContext = ProcessAST.loadProcessAST(instanceName,"{}")
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
  
  /*@Test def relativePath {
    System.currentTimeMillis()
    val url = this.getClass.getClassLoader.getResource("auth/Dhuruva-BMS-fa750e3a8102.p12")
    println(url)
  }*/
}