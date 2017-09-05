package org.etl.server

import org.etl.command.Context

trait ProcessRuntime {
  
  def execute(process:org.etl.sparrow.Process, context:Context)
}