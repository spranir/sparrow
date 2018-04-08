/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.etl.sparrow.SparrowPackage;
import org.etl.sparrow.Updatedaudit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Updatedaudit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.UpdatedauditImpl#getLogsink <em>Logsink</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.UpdatedauditImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.UpdatedauditImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatedauditImpl extends ActionImpl implements Updatedaudit
{
  /**
   * The default value of the '{@link #getLogsink() <em>Logsink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogsink()
   * @generated
   * @ordered
   */
  protected static final String LOGSINK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogsink() <em>Logsink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogsink()
   * @generated
   * @ordered
   */
  protected String logsink = LOGSINK_EDEFAULT;

  /**
   * The default value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasource()
   * @generated
   * @ordered
   */
  protected static final String DATASOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasource()
   * @generated
   * @ordered
   */
  protected String datasource = DATASOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdatedauditImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SparrowPackage.Literals.UPDATEDAUDIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLogsink()
  {
    return logsink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogsink(String newLogsink)
  {
    String oldLogsink = logsink;
    logsink = newLogsink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.UPDATEDAUDIT__LOGSINK, oldLogsink, logsink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatasource()
  {
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatasource(String newDatasource)
  {
    String oldDatasource = datasource;
    datasource = newDatasource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.UPDATEDAUDIT__DATASOURCE, oldDatasource, datasource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.UPDATEDAUDIT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SparrowPackage.UPDATEDAUDIT__LOGSINK:
        return getLogsink();
      case SparrowPackage.UPDATEDAUDIT__DATASOURCE:
        return getDatasource();
      case SparrowPackage.UPDATEDAUDIT__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparrowPackage.UPDATEDAUDIT__LOGSINK:
        setLogsink((String)newValue);
        return;
      case SparrowPackage.UPDATEDAUDIT__DATASOURCE:
        setDatasource((String)newValue);
        return;
      case SparrowPackage.UPDATEDAUDIT__VALUE:
        setValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SparrowPackage.UPDATEDAUDIT__LOGSINK:
        setLogsink(LOGSINK_EDEFAULT);
        return;
      case SparrowPackage.UPDATEDAUDIT__DATASOURCE:
        setDatasource(DATASOURCE_EDEFAULT);
        return;
      case SparrowPackage.UPDATEDAUDIT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SparrowPackage.UPDATEDAUDIT__LOGSINK:
        return LOGSINK_EDEFAULT == null ? logsink != null : !LOGSINK_EDEFAULT.equals(logsink);
      case SparrowPackage.UPDATEDAUDIT__DATASOURCE:
        return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
      case SparrowPackage.UPDATEDAUDIT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (logsink: ");
    result.append(logsink);
    result.append(", datasource: ");
    result.append(datasource);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //UpdatedauditImpl
