/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.etl.sparrow.Expression;
import org.etl.sparrow.GoogleSendMail;
import org.etl.sparrow.SparrowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Google Send Mail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getPtwelveFile <em>Ptwelve File</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getImpersonatedUser <em>Impersonated User</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getDbSrc <em>Db Src</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.GoogleSendMailImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoogleSendMailImpl extends MinimalEObjectImpl.Container implements GoogleSendMail
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
   * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected static final String ACCOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected String account = ACCOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateKey()
   * @generated
   * @ordered
   */
  protected static final String PRIVATE_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateKey()
   * @generated
   * @ordered
   */
  protected String privateKey = PRIVATE_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getPtwelveFile() <em>Ptwelve File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtwelveFile()
   * @generated
   * @ordered
   */
  protected static final String PTWELVE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPtwelveFile() <em>Ptwelve File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtwelveFile()
   * @generated
   * @ordered
   */
  protected String ptwelveFile = PTWELVE_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected String project = PROJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getImpersonatedUser() <em>Impersonated User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpersonatedUser()
   * @generated
   * @ordered
   */
  protected static final String IMPERSONATED_USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImpersonatedUser() <em>Impersonated User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpersonatedUser()
   * @generated
   * @ordered
   */
  protected String impersonatedUser = IMPERSONATED_USER_EDEFAULT;

  /**
   * The default value of the '{@link #getDbSrc() <em>Db Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSrc()
   * @generated
   * @ordered
   */
  protected static final String DB_SRC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbSrc() <em>Db Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSrc()
   * @generated
   * @ordered
   */
  protected String dbSrc = DB_SRC_EDEFAULT;

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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoogleSendMailImpl()
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
    return SparrowPackage.Literals.GOOGLE_SEND_MAIL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(String newAccount)
  {
    String oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrivateKey()
  {
    return privateKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivateKey(String newPrivateKey)
  {
    String oldPrivateKey = privateKey;
    privateKey = newPrivateKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__PRIVATE_KEY, oldPrivateKey, privateKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPtwelveFile()
  {
    return ptwelveFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtwelveFile(String newPtwelveFile)
  {
    String oldPtwelveFile = ptwelveFile;
    ptwelveFile = newPtwelveFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__PTWELVE_FILE, oldPtwelveFile, ptwelveFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(String newProject)
  {
    String oldProject = project;
    project = newProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__PROJECT, oldProject, project));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImpersonatedUser()
  {
    return impersonatedUser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpersonatedUser(String newImpersonatedUser)
  {
    String oldImpersonatedUser = impersonatedUser;
    impersonatedUser = newImpersonatedUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__IMPERSONATED_USER, oldImpersonatedUser, impersonatedUser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbSrc()
  {
    return dbSrc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSrc(String newDbSrc)
  {
    String oldDbSrc = dbSrc;
    dbSrc = newDbSrc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__DB_SRC, oldDbSrc, dbSrc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.GOOGLE_SEND_MAIL__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparrowPackage.GOOGLE_SEND_MAIL__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.GOOGLE_SEND_MAIL__CONDITION, newCondition, newCondition));
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
      case SparrowPackage.GOOGLE_SEND_MAIL__CONDITION:
        return basicSetCondition(null, msgs);
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
      case SparrowPackage.GOOGLE_SEND_MAIL__NAME:
        return getName();
      case SparrowPackage.GOOGLE_SEND_MAIL__ACCOUNT:
        return getAccount();
      case SparrowPackage.GOOGLE_SEND_MAIL__PRIVATE_KEY:
        return getPrivateKey();
      case SparrowPackage.GOOGLE_SEND_MAIL__PTWELVE_FILE:
        return getPtwelveFile();
      case SparrowPackage.GOOGLE_SEND_MAIL__PROJECT:
        return getProject();
      case SparrowPackage.GOOGLE_SEND_MAIL__IMPERSONATED_USER:
        return getImpersonatedUser();
      case SparrowPackage.GOOGLE_SEND_MAIL__DB_SRC:
        return getDbSrc();
      case SparrowPackage.GOOGLE_SEND_MAIL__VALUE:
        return getValue();
      case SparrowPackage.GOOGLE_SEND_MAIL__CONDITION:
        return getCondition();
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
      case SparrowPackage.GOOGLE_SEND_MAIL__NAME:
        setName((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__ACCOUNT:
        setAccount((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PRIVATE_KEY:
        setPrivateKey((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PTWELVE_FILE:
        setPtwelveFile((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PROJECT:
        setProject((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__IMPERSONATED_USER:
        setImpersonatedUser((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__DB_SRC:
        setDbSrc((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__VALUE:
        setValue((String)newValue);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__CONDITION:
        setCondition((Expression)newValue);
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
      case SparrowPackage.GOOGLE_SEND_MAIL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__ACCOUNT:
        setAccount(ACCOUNT_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PRIVATE_KEY:
        setPrivateKey(PRIVATE_KEY_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PTWELVE_FILE:
        setPtwelveFile(PTWELVE_FILE_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__PROJECT:
        setProject(PROJECT_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__IMPERSONATED_USER:
        setImpersonatedUser(IMPERSONATED_USER_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__DB_SRC:
        setDbSrc(DB_SRC_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SparrowPackage.GOOGLE_SEND_MAIL__CONDITION:
        setCondition((Expression)null);
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
      case SparrowPackage.GOOGLE_SEND_MAIL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SparrowPackage.GOOGLE_SEND_MAIL__ACCOUNT:
        return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
      case SparrowPackage.GOOGLE_SEND_MAIL__PRIVATE_KEY:
        return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
      case SparrowPackage.GOOGLE_SEND_MAIL__PTWELVE_FILE:
        return PTWELVE_FILE_EDEFAULT == null ? ptwelveFile != null : !PTWELVE_FILE_EDEFAULT.equals(ptwelveFile);
      case SparrowPackage.GOOGLE_SEND_MAIL__PROJECT:
        return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
      case SparrowPackage.GOOGLE_SEND_MAIL__IMPERSONATED_USER:
        return IMPERSONATED_USER_EDEFAULT == null ? impersonatedUser != null : !IMPERSONATED_USER_EDEFAULT.equals(impersonatedUser);
      case SparrowPackage.GOOGLE_SEND_MAIL__DB_SRC:
        return DB_SRC_EDEFAULT == null ? dbSrc != null : !DB_SRC_EDEFAULT.equals(dbSrc);
      case SparrowPackage.GOOGLE_SEND_MAIL__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SparrowPackage.GOOGLE_SEND_MAIL__CONDITION:
        return condition != null;
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
    result.append(", account: ");
    result.append(account);
    result.append(", privateKey: ");
    result.append(privateKey);
    result.append(", ptwelveFile: ");
    result.append(ptwelveFile);
    result.append(", project: ");
    result.append(project);
    result.append(", impersonatedUser: ");
    result.append(impersonatedUser);
    result.append(", dbSrc: ");
    result.append(dbSrc);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //GoogleSendMailImpl