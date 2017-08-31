/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.etl.sparrow.Action;
import org.etl.sparrow.Callprocess;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Finally;
import org.etl.sparrow.Googlecal;
import org.etl.sparrow.LoadCsv;
import org.etl.sparrow.OnError;
import org.etl.sparrow.Slack;
import org.etl.sparrow.Sms;
import org.etl.sparrow.SparrowFactory;
import org.etl.sparrow.SparrowPackage;
import org.etl.sparrow.Transform;
import org.etl.sparrow.Updatedaudit;
import org.etl.sparrow.WriteCsv;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparrowPackageImpl extends EPackageImpl implements SparrowPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finallyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callprocessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updatedauditEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass googlecalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass copydataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeCsvEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadCsvEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.etl.sparrow.SparrowPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SparrowPackageImpl()
  {
    super(eNS_URI, SparrowFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SparrowPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SparrowPackage init()
  {
    if (isInited) return (SparrowPackage)EPackage.Registry.INSTANCE.getEPackage(SparrowPackage.eNS_URI);

    // Obtain or create and register package
    SparrowPackageImpl theSparrowPackage = (SparrowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SparrowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SparrowPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSparrowPackage.createPackageContents();

    // Initialize created meta-data
    theSparrowPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSparrowPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SparrowPackage.eNS_URI, theSparrowPackage);
    return theSparrowPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Action()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_OnError()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Finally()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinally()
  {
    return finallyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFinally_Action()
  {
    return (EReference)finallyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnError()
  {
    return onErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOnError_Action()
  {
    return (EReference)onErrorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallprocess()
  {
    return callprocessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallprocess_Target()
  {
    return (EAttribute)callprocessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallprocess_Value()
  {
    return (EAttribute)callprocessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdatedaudit()
  {
    return updatedauditEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdatedaudit_Logsink()
  {
    return (EAttribute)updatedauditEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdatedaudit_Value()
  {
    return (EAttribute)updatedauditEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSms()
  {
    return smsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSms_Target()
  {
    return (EAttribute)smsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSms_Value()
  {
    return (EAttribute)smsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlack()
  {
    return slackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlack_Team()
  {
    return (EAttribute)slackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlack_Channel()
  {
    return (EAttribute)slackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlack_Value()
  {
    return (EAttribute)slackEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGooglecal()
  {
    return googlecalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Calid()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Authstore()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Useraccount()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Title()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Start()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_End()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Notify()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGooglecal_Value()
  {
    return (EAttribute)googlecalEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCopydata()
  {
    return copydataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCopydata_Source()
  {
    return (EAttribute)copydataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCopydata_To()
  {
    return (EAttribute)copydataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCopydata_Value()
  {
    return (EAttribute)copydataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWriteCsv()
  {
    return writeCsvEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWriteCsv_Source()
  {
    return (EAttribute)writeCsvEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWriteCsv_To()
  {
    return (EAttribute)writeCsvEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWriteCsv_Delim()
  {
    return (EAttribute)writeCsvEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWriteCsv_Value()
  {
    return (EAttribute)writeCsvEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadCsv()
  {
    return loadCsvEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadCsv_Source()
  {
    return (EAttribute)loadCsvEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadCsv_To()
  {
    return (EAttribute)loadCsvEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadCsv_Delim()
  {
    return (EAttribute)loadCsvEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadCsv_Value()
  {
    return (EAttribute)loadCsvEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransform()
  {
    return transformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransform_Using()
  {
    return (EAttribute)transformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransform_Value()
  {
    return (EAttribute)transformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowFactory getSparrowFactory()
  {
    return (SparrowFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEReference(processEClass, PROCESS__ACTION);
    createEReference(processEClass, PROCESS__ON_ERROR);
    createEReference(processEClass, PROCESS__FINALLY);

    finallyEClass = createEClass(FINALLY);
    createEReference(finallyEClass, FINALLY__ACTION);

    onErrorEClass = createEClass(ON_ERROR);
    createEReference(onErrorEClass, ON_ERROR__ACTION);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);

    callprocessEClass = createEClass(CALLPROCESS);
    createEAttribute(callprocessEClass, CALLPROCESS__TARGET);
    createEAttribute(callprocessEClass, CALLPROCESS__VALUE);

    updatedauditEClass = createEClass(UPDATEDAUDIT);
    createEAttribute(updatedauditEClass, UPDATEDAUDIT__LOGSINK);
    createEAttribute(updatedauditEClass, UPDATEDAUDIT__VALUE);

    smsEClass = createEClass(SMS);
    createEAttribute(smsEClass, SMS__TARGET);
    createEAttribute(smsEClass, SMS__VALUE);

    slackEClass = createEClass(SLACK);
    createEAttribute(slackEClass, SLACK__TEAM);
    createEAttribute(slackEClass, SLACK__CHANNEL);
    createEAttribute(slackEClass, SLACK__VALUE);

    googlecalEClass = createEClass(GOOGLECAL);
    createEAttribute(googlecalEClass, GOOGLECAL__CALID);
    createEAttribute(googlecalEClass, GOOGLECAL__AUTHSTORE);
    createEAttribute(googlecalEClass, GOOGLECAL__USERACCOUNT);
    createEAttribute(googlecalEClass, GOOGLECAL__TITLE);
    createEAttribute(googlecalEClass, GOOGLECAL__START);
    createEAttribute(googlecalEClass, GOOGLECAL__END);
    createEAttribute(googlecalEClass, GOOGLECAL__NOTIFY);
    createEAttribute(googlecalEClass, GOOGLECAL__VALUE);

    copydataEClass = createEClass(COPYDATA);
    createEAttribute(copydataEClass, COPYDATA__SOURCE);
    createEAttribute(copydataEClass, COPYDATA__TO);
    createEAttribute(copydataEClass, COPYDATA__VALUE);

    writeCsvEClass = createEClass(WRITE_CSV);
    createEAttribute(writeCsvEClass, WRITE_CSV__SOURCE);
    createEAttribute(writeCsvEClass, WRITE_CSV__TO);
    createEAttribute(writeCsvEClass, WRITE_CSV__DELIM);
    createEAttribute(writeCsvEClass, WRITE_CSV__VALUE);

    loadCsvEClass = createEClass(LOAD_CSV);
    createEAttribute(loadCsvEClass, LOAD_CSV__SOURCE);
    createEAttribute(loadCsvEClass, LOAD_CSV__TO);
    createEAttribute(loadCsvEClass, LOAD_CSV__DELIM);
    createEAttribute(loadCsvEClass, LOAD_CSV__VALUE);

    transformEClass = createEClass(TRANSFORM);
    createEAttribute(transformEClass, TRANSFORM__USING);
    createEAttribute(transformEClass, TRANSFORM__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    callprocessEClass.getESuperTypes().add(this.getAction());
    updatedauditEClass.getESuperTypes().add(this.getAction());
    smsEClass.getESuperTypes().add(this.getAction());
    slackEClass.getESuperTypes().add(this.getAction());
    googlecalEClass.getESuperTypes().add(this.getAction());
    copydataEClass.getESuperTypes().add(this.getAction());
    writeCsvEClass.getESuperTypes().add(this.getAction());
    loadCsvEClass.getESuperTypes().add(this.getAction());
    transformEClass.getESuperTypes().add(this.getAction());

    // Initialize classes and features; add operations and parameters
    initEClass(processEClass, org.etl.sparrow.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.etl.sparrow.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Action(), this.getAction(), null, "action", null, 0, -1, org.etl.sparrow.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_OnError(), this.getOnError(), null, "onError", null, 0, 1, org.etl.sparrow.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Finally(), this.getFinally(), null, "finally", null, 0, 1, org.etl.sparrow.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(finallyEClass, Finally.class, "Finally", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFinally_Action(), this.getAction(), null, "action", null, 0, -1, Finally.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onErrorEClass, OnError.class, "OnError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnError_Action(), this.getAction(), null, "action", null, 0, -1, OnError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callprocessEClass, Callprocess.class, "Callprocess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCallprocess_Target(), ecorePackage.getEString(), "target", null, 0, 1, Callprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCallprocess_Value(), ecorePackage.getEString(), "value", null, 0, 1, Callprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updatedauditEClass, Updatedaudit.class, "Updatedaudit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdatedaudit_Logsink(), ecorePackage.getEString(), "logsink", null, 0, 1, Updatedaudit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdatedaudit_Value(), ecorePackage.getEString(), "value", null, 0, 1, Updatedaudit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smsEClass, Sms.class, "Sms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSms_Target(), ecorePackage.getEString(), "target", null, 0, 1, Sms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSms_Value(), ecorePackage.getEString(), "value", null, 0, 1, Sms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slackEClass, Slack.class, "Slack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlack_Team(), ecorePackage.getEString(), "team", null, 0, 1, Slack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlack_Channel(), ecorePackage.getEString(), "channel", null, 0, 1, Slack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlack_Value(), ecorePackage.getEString(), "value", null, 0, 1, Slack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(googlecalEClass, Googlecal.class, "Googlecal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGooglecal_Calid(), ecorePackage.getEString(), "calid", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Authstore(), ecorePackage.getEString(), "authstore", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Useraccount(), ecorePackage.getEString(), "useraccount", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Title(), ecorePackage.getEString(), "title", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Start(), ecorePackage.getEString(), "start", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_End(), ecorePackage.getEString(), "end", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Notify(), ecorePackage.getEString(), "notify", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGooglecal_Value(), ecorePackage.getEString(), "value", null, 0, 1, Googlecal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(copydataEClass, Copydata.class, "Copydata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCopydata_Source(), ecorePackage.getEString(), "source", null, 0, 1, Copydata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCopydata_To(), ecorePackage.getEString(), "to", null, 0, 1, Copydata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCopydata_Value(), ecorePackage.getEString(), "value", null, 0, 1, Copydata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(writeCsvEClass, WriteCsv.class, "WriteCsv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWriteCsv_Source(), ecorePackage.getEString(), "source", null, 0, 1, WriteCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWriteCsv_To(), ecorePackage.getEString(), "to", null, 0, 1, WriteCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWriteCsv_Delim(), ecorePackage.getEString(), "delim", null, 0, 1, WriteCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWriteCsv_Value(), ecorePackage.getEString(), "value", null, 0, 1, WriteCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadCsvEClass, LoadCsv.class, "LoadCsv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadCsv_Source(), ecorePackage.getEString(), "source", null, 0, 1, LoadCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadCsv_To(), ecorePackage.getEString(), "to", null, 0, 1, LoadCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadCsv_Delim(), ecorePackage.getEString(), "delim", null, 0, 1, LoadCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadCsv_Value(), ecorePackage.getEString(), "value", null, 0, 1, LoadCsv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transformEClass, Transform.class, "Transform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransform_Using(), ecorePackage.getEString(), "using", null, 0, 1, Transform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransform_Value(), ecorePackage.getEString(), "value", null, 0, -1, Transform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SparrowPackageImpl
