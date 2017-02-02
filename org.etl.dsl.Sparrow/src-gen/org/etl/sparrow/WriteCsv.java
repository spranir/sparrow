/**
 */
package org.etl.sparrow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Csv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.etl.sparrow.WriteCsv#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.etl.sparrow.SparrowPackage#getWriteCsv()
 * @model
 * @generated
 */
public interface WriteCsv extends Action
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.etl.sparrow.SparrowPackage#getWriteCsv_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.etl.sparrow.WriteCsv#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // WriteCsv
