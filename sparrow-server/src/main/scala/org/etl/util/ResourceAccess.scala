package org.etl.util

import java.sql.Connection
import org.etl.config.ConfigurationService
import org.etl.config.Resource
import net.liftweb.json.JsonParser
import java.sql.DriverManager
import net.liftweb.json.JsonAST.JString
import net.liftweb.json.DefaultFormats
import net.liftweb.json.JsonAST.JValue

object ResourceAccess {
  implicit val formats = DefaultFormats
  case class UserPass(user: String, password: String)
  def rdbmsConn(name: String): Connection = {
    val connResource: Resource = ConfigurationService.getResourceConfig(name)
    val authInfo = JsonParser.parse(connResource.auth_info)
    val userPass = authInfo.extract[UserPass]

    val conn = DriverManager.
      getConnection(connResource.url,
        userPass.user, userPass.password)
    conn
  }
}