/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.etl.sparrow.Action;
import org.etl.sparrow.Finally;
import org.etl.sparrow.OnError;
import org.etl.sparrow.SparrowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.ProcessImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.ProcessImpl#getOnError <em>On Error</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.ProcessImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements org.etl.sparrow.Process
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * The cached value of the '{@link #getOnError() <em>On Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnError()
   * @generated
   * @ordered
   */
  protected OnError onError;

  /**
   * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally()
   * @generated
   * @ordered
   */
  protected Finally finally_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessImpl()
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
    return SparrowPackage.Literals.PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.PROCESS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, SparrowPackage.PROCESS__ACTION);
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnError getOnError()
  {
    return onError;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnError(OnError newOnError, NotificationChain msgs)
  {
    OnError oldOnError = onError;
    onError = newOnError;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparrowPackage.PROCESS__ON_ERROR, oldOnError, newOnError);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnError(OnError newOnError)
  {
    if (newOnError != onError)
    {
      NotificationChain msgs = null;
      if (onError != null)
        msgs = ((InternalEObject)onError).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.PROCESS__ON_ERROR, null, msgs);
      if (newOnError != null)
        msgs = ((InternalEObject)newOnError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.PROCESS__ON_ERROR, null, msgs);
      msgs = basicSetOnError(newOnError, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.PROCESS__ON_ERROR, newOnError, newOnError));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Finally getFinally()
  {
    return finally_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinally(Finally newFinally, NotificationChain msgs)
  {
    Finally oldFinally = finally_;
    finally_ = newFinally;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparrowPackage.PROCESS__FINALLY, oldFinally, newFinally);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinally(Finally newFinally)
  {
    if (newFinally != finally_)
    {
      NotificationChain msgs = null;
      if (finally_ != null)
        msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.PROCESS__FINALLY, null, msgs);
      if (newFinally != null)
        msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.PROCESS__FINALLY, null, msgs);
      msgs = basicSetFinally(newFinally, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.PROCESS__FINALLY, newFinally, newFinally));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SparrowPackage.PROCESS__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
      case SparrowPackage.PROCESS__ON_ERROR:
        return basicSetOnError(null, msgs);
      case SparrowPackage.PROCESS__FINALLY:
        return basicSetFinally(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SparrowPackage.PROCESS__NAME:
        return getName();
      case SparrowPackage.PROCESS__ACTION:
        return getAction();
      case SparrowPackage.PROCESS__ON_ERROR:
        return getOnError();
      case SparrowPackage.PROCESS__FINALLY:
        return getFinally();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparrowPackage.PROCESS__NAME:
        setName((String)newValue);
        return;
      case SparrowPackage.PROCESS__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
        return;
      case SparrowPackage.PROCESS__ON_ERROR:
        setOnError((OnError)newValue);
        return;
      case SparrowPackage.PROCESS__FINALLY:
        setFinally((Finally)newValue);
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
      case SparrowPackage.PROCESS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SparrowPackage.PROCESS__ACTION:
        getAction().clear();
        return;
      case SparrowPackage.PROCESS__ON_ERROR:
        setOnError((OnError)null);
        return;
      case SparrowPackage.PROCESS__FINALLY:
        setFinally((Finally)null);
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
      case SparrowPackage.PROCESS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SparrowPackage.PROCESS__ACTION:
        return action != null && !action.isEmpty();
      case SparrowPackage.PROCESS__ON_ERROR:
        return onError != null;
      case SparrowPackage.PROCESS__FINALLY:
        return finally_ != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProcessImpl
