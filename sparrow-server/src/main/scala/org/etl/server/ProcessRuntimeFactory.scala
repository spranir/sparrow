package org.etl.server

object ProcessRuntimeFactory {
  
  def create(mode:String):ProcessRuntime = {
    
    if(mode.equals("onethread"))
    {
      new OneThreadProcessRuntime
    }
    else
    {
      new OneThreadProcessRuntime
    }
  }
}