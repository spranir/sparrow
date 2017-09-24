package org.etl.server

import org.etl.process.onethread.UniThreadProcessRuntime
import org.etl.command.TryContext
import java.net.InetAddress
import org.etl.audit.AuditService


object ProcessExecutor {
  
  def execute(mode:String, runtimeContext:RuntimeContext):ProcessRuntime = {
    
    if(mode.equals("org.etl.process.onethread"))
    {
      
      val tryContext = new TryContext(runtimeContext.configMap, runtimeContext.instanceName)
      val machine = InetAddress.getLocalHost.getHostAddress      
      //val instanceId = AuditService.insertInstanceAudit(runtimeContext.instanceName, mode, machine, runtimeContext.path)
      val runtime = new UniThreadProcessRuntime
      runtime.execute(runtimeContext.process, tryContext)
      runtime
    }
    else
    {
      new UniThreadProcessRuntime
    }
  }
}