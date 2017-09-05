package org.etl.server

import org.etl.process.onethread.UniThreadProcessRuntime

object ProcessRuntimeFactory {
  
  def create(mode:String):ProcessRuntime = {
    
    if(mode.equals("org.etl.process.onethread"))
    {
      new UniThreadProcessRuntime
    }
    else
    {
      new UniThreadProcessRuntime
    }
  }
}