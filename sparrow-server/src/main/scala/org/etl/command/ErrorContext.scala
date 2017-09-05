package org.etl.command

class ErrorContext(val tryContext:Context) extends Context {
  
  def getValue(variable: String): String = {
    tryContext.getValue(variable)
  }
}