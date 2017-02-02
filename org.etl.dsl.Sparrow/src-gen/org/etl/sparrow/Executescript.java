/**
 */
package org.etl.sparrow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executescript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.etl.sparrow.Executescript#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.etl.sparrow.SparrowPackage#getExecutescript()
 * @model
 * @generated
 */
public interface Executescript extends Action
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute list.
   * @see org.etl.sparrow.SparrowPackage#getExecutescript_Value()
   * @model unique="false"
   * @generated
   */
  EList<String> getValue();

} // Executescript
