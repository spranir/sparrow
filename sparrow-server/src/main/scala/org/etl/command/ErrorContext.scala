package org.etl.command

class ErrorContext(val tryContext:Context) extends Context {
  
  def getValue(variable: String): String = {
    tryContext.getValue(variable)
  }
  def getMe():java.util.Map[String,String] = {
    tryContext.getMe
  }
  def getMeAsIs():Map[String, String] = {
    tryContext.getMeAsIs
  }
  def addValue(key: String, value: String): Unit = {
    
  }
}