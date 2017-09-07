

package org.etl.command

import org.etl.util.ParameterisationEngine

class TryContext(val config:Map[String,String]) extends Context {
  
  def getValue(variable: String): String = {
    val input = config.get(variable).get
    val output = ParameterisationEngine.resolve(input, this)
    output
  }
  
  def getMe():java.util.Map[String,String] = {
    val configMap:java.util.Map[String, String] = new java.util.HashMap[String, String]
    config.foreach(t=>{
      configMap.put(t._1, t._2)
    })
    configMap
  }
}