package org.etl.command

trait Context {
  
  def getValue(variable:String):String
}