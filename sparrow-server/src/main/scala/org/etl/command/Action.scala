package org.etl.command

trait Action {
  
  def execute(context: Context, action:org.etl.sparrow.Action) :Context 
}