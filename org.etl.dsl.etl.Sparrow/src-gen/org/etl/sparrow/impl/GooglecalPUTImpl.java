/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.etl.sparrow.GooglecalPUT;
import org.etl.sparrow.SparrowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Googlecal PUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.GooglecalPUTImpl#getAuthstore <em>Authstore</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GooglecalPUTImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GooglecalPUTImpl#getUseraccount <em>Useraccount</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GooglecalPUTImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GooglecalPUTImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GooglecalPUTImpl extends ActionImpl implements GooglecalPUT
{
  /**
   * The default value of the '{@link #getAuthstore() <em>Authstore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthstore()
   * @generated
   * @ordered
   */
  protected static final String AUTHSTORE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthstore() <em>Authstore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthstore()
   * @generated
   * @ordered
   */
  protected String authstore = AUTHSTORE_EDEFAULT;

  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getUseraccount() <em>Useraccount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseraccount()
   * @generated
   * @ordered
   */
  protected static final String USERACCOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUseraccount() <em>Useraccount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseraccount()
   * @generated
   * @ordered
   */
  protected String useraccount = USERACCOUNT_EDEFAULT;

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
  protected GooglecalPUTImpl()
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
    return SparrowPackage.Literals.GOOGLECAL_PUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthstore()
  {
    return authstore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthstore(String newAuthstore)
  {
    String oldAuthstore = authstore;
    authstore = newAuthstore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLECAL_PUT__AUTHSTORE, oldAuthstore, authstore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLECAL_PUT__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUseraccount()
  {
    return useraccount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseraccount(String newUseraccount)
  {
    String oldUseraccount = useraccount;
    useraccount = newUseraccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLECAL_PUT__USERACCOUNT, oldUseraccount, useraccount));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLECAL_PUT__SOURCE, oldSource, source));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLECAL_PUT__VALUE, oldValue, value));
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
      case SparrowPackage.GOOGLECAL_PUT__AUTHSTORE:
        return getAuthstore();
      case SparrowPackage.GOOGLECAL_PUT__KEY:
        return getKey();
      case SparrowPackage.GOOGLECAL_PUT__USERACCOUNT:
        return getUseraccount();
      case SparrowPackage.GOOGLECAL_PUT__SOURCE:
        return getSource();
      case SparrowPackage.GOOGLECAL_PUT__VALUE:
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
      case SparrowPackage.GOOGLECAL_PUT__AUTHSTORE:
        setAuthstore((String)newValue);
        return;
      case SparrowPackage.GOOGLECAL_PUT__KEY:
        setKey((String)newValue);
        return;
      case SparrowPackage.GOOGLECAL_PUT__USERACCOUNT:
        setUseraccount((String)newValue);
        return;
      case SparrowPackage.GOOGLECAL_PUT__SOURCE:
        setSource((String)newValue);
        return;
      case SparrowPackage.GOOGLECAL_PUT__VALUE:
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
      case SparrowPackage.GOOGLECAL_PUT__AUTHSTORE:
        setAuthstore(AUTHSTORE_EDEFAULT);
        return;
      case SparrowPackage.GOOGLECAL_PUT__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case SparrowPackage.GOOGLECAL_PUT__USERACCOUNT:
        setUseraccount(USERACCOUNT_EDEFAULT);
        return;
      case SparrowPackage.GOOGLECAL_PUT__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case SparrowPackage.GOOGLECAL_PUT__VALUE:
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
      case SparrowPackage.GOOGLECAL_PUT__AUTHSTORE:
        return AUTHSTORE_EDEFAULT == null ? authstore != null : !AUTHSTORE_EDEFAULT.equals(authstore);
      case SparrowPackage.GOOGLECAL_PUT__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case SparrowPackage.GOOGLECAL_PUT__USERACCOUNT:
        return USERACCOUNT_EDEFAULT == null ? useraccount != null : !USERACCOUNT_EDEFAULT.equals(useraccount);
      case SparrowPackage.GOOGLECAL_PUT__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case SparrowPackage.GOOGLECAL_PUT__VALUE:
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
    result.append(" (authstore: ");
    result.append(authstore);
    result.append(", key: ");
    result.append(key);
    result.append(", useraccount: ");
    result.append(useraccount);
    result.append(", source: ");
    result.append(source);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //GooglecalPUTImpl
