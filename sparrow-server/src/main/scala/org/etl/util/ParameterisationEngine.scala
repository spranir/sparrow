package org.etl.util

import org.etl.command.Context
import org.apache.commons.text.StrSubstitutor



object ParameterisationEngine {
  
  def resolve(inputString:String, context:Context):String={
    val configMap = context.getMe
    val paramEngine = new StrSubstitutor(configMap)
    val output = paramEngine.replace(inputString)
    output
  }
}