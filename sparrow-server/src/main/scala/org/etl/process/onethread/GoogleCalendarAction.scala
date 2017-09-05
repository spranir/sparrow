package org.etl.process.onethread

import com.typesafe.scalalogging.LazyLogging
import org.etl.command.Context
import org.etl.sparrow.Action

class GoogleCalendarAction extends org.etl.command.Action with LazyLogging {
  def execute(context: Context, action: Action): Context = {
    ???
  }

  def executeIf(context: Context, action: Action): Boolean = {
    ???
  }
}