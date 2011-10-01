/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Savannah</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.Savannah#getTigers <em>Tigers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getSavannah()
 * @model
 * @generated
 */
public interface Savannah extends Ground {
	/**
	 * Returns the value of the '<em><b>Tigers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modeling.demo.zoo.Tiger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tigers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tigers</em>' containment reference list.
	 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getSavannah_Tigers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tiger> getTigers();

} // Savannah
