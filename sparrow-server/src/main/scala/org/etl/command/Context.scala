package org.etl.command

trait Context {
  
  def getValue(variable:String):String
  def getMe():java.util.Map[String, String]
}