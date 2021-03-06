/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.Catch#getName <em>Name</em>}</li>
 *   <li>{@link org.etl.sparrow.Catch#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.etl.sparrow.SparrowPackage#getCatch()
 * @model
 * @generated
 */
public interface Catch extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.etl.sparrow.SparrowPackage#getCatch_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.etl.sparrow.Catch#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.etl.sparrow.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see org.etl.sparrow.SparrowPackage#getCatch_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

} // Catch
