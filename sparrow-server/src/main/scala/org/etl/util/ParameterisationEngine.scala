package org.etl.util

import org.etl.command.Context
import org.apache.commons.text.StrSubstitutor

object ParameterisationEngine {

  def resolve(inputString: String, context: Context): String = {
    val configMap = context.getMe
    val paramEngine = new StrSubstitutor(configMap)
    val output = paramEngine.replace(inputString)
    output
  }

  def doYieldtoTrue(expression: org.etl.sparrow.Expression) = {
    expression match {
      case null => {
        true
      }
      case _ => {
        val lhs = expression.getLhs
        val rhs = expression.getRhs
        val oper = expression.getOperator
        oper match {
          case "<" => {
            val lhsInt = Integer.parseInt(lhs)
            val rhsInt = Integer.parseInt(rhs)

            lhsInt < rhsInt
          }
          case ">" => {
            val lhsInt = Integer.parseInt(lhs)
            val rhsInt = Integer.parseInt(rhs)

            lhsInt > rhsInt

          }
          case "==" => {
            lhs.equals(rhs)
          }
          case "contains" => {
            lhs.contains(rhs)
          }
        }
      }
    }

  }
}