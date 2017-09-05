package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.sparrow.Action
import org.etl.command.Context

class FetchVariableAction  extends org.etl.command.Action with LazyLogging {
  def execute(context: Context, action: Action): Context = {
    ???
  }

  def executeIf(context: Context, action: Action): Boolean = {
    ???
  }
  
}