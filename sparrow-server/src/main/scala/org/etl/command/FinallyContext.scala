package org.etl.command

class FinallyContext(val errorContext:ErrorContext) extends Context {
  def getValue(variable: String): String = {
    errorContext.getValue(variable)
  }
  def getMe():java.util.Map[String,String] = {
    errorContext.getMe
  }

  def getMeAsIs():Map[String, String] = {
    errorContext.getMeAsIs
  }
  def addValue(key: String, value: String): Unit = {
    
  }
}