package org.etl.server

trait ProcessRuntime {
  
  def execute(process:org.etl.sparrow.Process)
}