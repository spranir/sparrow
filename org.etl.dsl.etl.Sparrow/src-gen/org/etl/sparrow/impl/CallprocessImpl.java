/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.etl.sparrow.Callprocess;
import org.etl.sparrow.SparrowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.CallprocessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.CallprocessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.CallprocessImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.CallprocessImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallprocessImpl extends ActionImpl implements Callprocess
{
  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

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
  protected CallprocessImpl()
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
    return SparrowPackage.Literals.CALLPROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.CALLPROCESS__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.CALLPROCESS__SOURCE, oldSource, source));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.CALLPROCESS__DATASOURCE, oldDatasource, datasource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.CALLPROCESS__VALUE, oldValue, value));
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
      case SparrowPackage.CALLPROCESS__TARGET:
        return getTarget();
      case SparrowPackage.CALLPROCESS__SOURCE:
        return getSource();
      case SparrowPackage.CALLPROCESS__DATASOURCE:
        return getDatasource();
      case SparrowPackage.CALLPROCESS__VALUE:
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
      case SparrowPackage.CALLPROCESS__TARGET:
        setTarget((String)newValue);
        return;
      case SparrowPackage.CALLPROCESS__SOURCE:
        setSource((String)newValue);
        return;
      case SparrowPackage.CALLPROCESS__DATASOURCE:
        setDatasource((String)newValue);
        return;
      case SparrowPackage.CALLPROCESS__VALUE:
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
      case SparrowPackage.CALLPROCESS__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case SparrowPackage.CALLPROCESS__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case SparrowPackage.CALLPROCESS__DATASOURCE:
        setDatasource(DATASOURCE_EDEFAULT);
        return;
      case SparrowPackage.CALLPROCESS__VALUE:
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
      case SparrowPackage.CALLPROCESS__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case SparrowPackage.CALLPROCESS__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case SparrowPackage.CALLPROCESS__DATASOURCE:
        return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
      case SparrowPackage.CALLPROCESS__VALUE:
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
    result.append(" (target: ");
    result.append(target);
    result.append(", source: ");
    result.append(source);
    result.append(", datasource: ");
    result.append(datasource);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //CallprocessImpl
