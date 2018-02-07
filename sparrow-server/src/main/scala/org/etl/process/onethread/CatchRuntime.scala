package org.etl.process.onethread

import org.etl.sparrow.Catch
import org.etl.command.Context

class CatchRuntime(val catchBlock:Catch, val context:Context) {
  
  def execute():Context = {
    
    context
  }
}