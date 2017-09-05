package org.etl.process.onethread

import org.etl.command.Context
import org.etl.sparrow.Try

class TryRuntime(val tryBlock:Try, val context:Context) {
  
  def execute():Context = {
    
    context
  }
}