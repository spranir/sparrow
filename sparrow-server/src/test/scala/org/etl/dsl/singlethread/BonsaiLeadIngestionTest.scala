package org.etl.dsl.singlethread

import java.text.SimpleDateFormat
import java.util.Date

import org.etl.server.ProcessAST
import org.etl.server.ProcessExecutor
import org.junit.Test

class BonsaiFBLeadingestionTest {
  
  @Test def runProcess() = {
    val df = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
    val date = df.format(new Date(System.currentTimeMillis()))
    val instanceName = "bonsai.leadingestion.process#1"
    val runtimeContext = ProcessAST.loadProcessAST(instanceName, "{}")
    try {

      val runtime = ProcessExecutor.execute("org.etl.process.onethread", runtimeContext)

    } catch {
      case ex: Throwable => {
        ex.printStackTrace()
      }
    } finally {

    }
  }

  
}