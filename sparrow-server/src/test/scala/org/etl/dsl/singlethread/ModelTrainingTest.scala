package org.etl.dsl.singlethread


import org.etl.server.ProcessAST
import org.junit.Test
import org.etl.server.ProcessExecutor

class ModelTrainingTest {
  
  @Test def runProcess()={
    
    System.currentTimeMillis()
   
    val instanceName = "ffsc.model.training#1" 
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
}