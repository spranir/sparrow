package org.etl.process.onethread

import org.etl.command.Action

object CommandFactory {
                  
  def create(name:String) :Action={
      
    name match {
      case "abort" =>  new AbortAction
      case "googlecal" => new GoogleCalendarAction
      case "transform" => new TransformAction
      case "assign" => new FetchVariableAction
    }
  }
}