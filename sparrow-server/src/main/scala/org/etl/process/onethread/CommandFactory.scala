package org.etl.process.onethread

import org.etl.command.Action

object CommandFactory {
                  
  def create(name:String) :Action={
      
    name.toLowerCase match {
      case "abort" =>  new AbortAction
      case "googlecal" => new GoogleCalendarAction
      case "transform" => new TransformAction
      case "assign" => new FetchVariableAction
      case "callprocess" => new CallProcessAction
      case "doozle"=>new DoozleAction
      case "rest"=>new RestAction
      case "writecsv"=> new WriteCsvAction
      case "copydata" => new CopydataAction
      case "trainseq" => new ModelTrainingAction
    }
  }
}