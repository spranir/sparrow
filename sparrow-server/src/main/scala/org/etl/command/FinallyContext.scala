package org.etl.command

class FinallyContext(val errorContext:ErrorContext) extends Context {
  def getValue(variable: String): String = {
    errorContext.getValue(variable)
  }
  def getMe():java.util.Map[String,String] = {
    errorContext.getMe
  }
}