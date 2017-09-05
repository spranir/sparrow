

package org.etl.command

class TryContext(val config:Map[String,String]) extends Context {
  
  def getValue(variable: String): String = {
    config.get(variable).get
  }
}