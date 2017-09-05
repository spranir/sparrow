package org.etl.audit

import org.etl.config.ConfigurationService
import java.sql.DriverManager
import java.sql.Statement

object AuditService {
  val globalConfig = ConfigurationService.getGlobalconfig()
  val url = globalConfig.get("audit_log_jdbc_url").get
  val driver = globalConfig.get("audit_log_jdbc_driver").get
  val user = globalConfig.get("audit_log_jdbc_user").get
  val password = globalConfig.get("audit_log_jdbc_password").get
  Class.forName(driver)

  def insertInstanceAudit(instanceName: String, runMode: String, machine: String, file: String): Integer = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("INSERT INTO instance_audit (instance_name, mode, start, hostname, file, status) VALUES ('?', '?', NOW(), ?, ?, 1);", Statement.RETURN_GENERATED_KEYS)
    try {
      st.setString(1, instanceName)
      st.setString(2, runMode)
      st.setString(3, machine)
      st.setString(4, file)
      val rowsUpdated = st.executeUpdate()
      conn.commit();
      val rs = st.getGeneratedKeys
      rs.next
      val pk = rs.getInt(1)
      rs.close()
      pk
    } catch {
      case t: Throwable =>
        t.printStackTrace()
        0
    } finally {
      st.close();
      conn.close()
    }
  }

  def updateProcessAudit(processId: Integer, status: Int, contextLog: String): Unit = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("update process_audit set end_time=now(), status=?, context_log=? where instance_id=?")
    try {
      st.setInt(1, status)
      st.setString(2, contextLog)
      st.setInt(3, processId)
      val rowsUpdated = st.executeUpdate()
      conn.commit();
    } catch {
      case t: Throwable =>
        t.printStackTrace()
    } finally {
      st.close();
      conn.close()
    }
  }

  def insertCommandAudit(instanceId: Int, actionName: String, processName: String): Integer = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("INSERT INTO command_audit (instance_id, start, action_name, process_name, status) VALUES (?, NOW(), ?, ?, '1')", Statement.RETURN_GENERATED_KEYS)
    try {
      st.setInt(1, instanceId)
      st.setString(2, actionName)
      st.setString(3, processName)
      val rowsUpdated = st.executeUpdate()
      conn.commit();
      val rs = st.getGeneratedKeys
      rs.next
      val pk = rs.getInt(1)
      rs.close()
      pk
    } catch {
      case t: Throwable =>
        t.printStackTrace()
        0
    } finally {
      st.close();
      conn.close()
    }
  }

  def updateCommandAudit(actionId: Integer, status: Integer): Unit = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("update command_audit set end_time=now(), status=?,  where action_id=?")
    try {
      st.setInt(1, status)
      val rowsUpdated = st.executeUpdate()
      conn.commit();
    } catch {
      case t: Throwable =>
        t.printStackTrace()
    } finally {
      st.close();
      conn.close()
    }
  }

  def insertStatementAudit(actionId: Int, actionName: String, processName: String): Int = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("INSERT INTO statement_audit (action_id, action_name, process_name, start, status) VALUES (?, ?, ?, NOW(),'1');", Statement.RETURN_GENERATED_KEYS)
    try {
      st.setInt(1, actionId)
      st.setString(2, actionName)
      st.setString(3, processName)

      val rowsUpdated = st.executeUpdate()
      conn.commit();
      val rs = st.getGeneratedKeys
      rs.next
      val pk = rs.getInt(1)
      rs.close()
      pk
    } catch {
      case t: Throwable =>
        t.printStackTrace()
        0
    } finally {
      st.close();
      conn.close()
    }
  }
  //,
  def updateStatementAudit(statementId: Integer, rowsW: Int, rowsR: Int, statement: String, status: Integer): Unit = {
    val conn = DriverManager.getConnection(url, user, password)
    conn.setAutoCommit(false)
    val st = conn.prepareStatement("update command_audit set end_time=now(), status=?, statement_config=?, rows_written=?, rows_read=? where statement_id=?")
    try {
      st.setInt(1, status)
      st.setString(2, statement)
      st.setInt(3, rowsW)
      st.setInt(4, rowsR)
      val rowsUpdated = st.executeUpdate()
      conn.commit();
    } catch {
      case t: Throwable =>
        t.printStackTrace()
    } finally {
      st.close();
      conn.close()
    }
  }
}