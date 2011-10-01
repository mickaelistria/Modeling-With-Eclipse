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
 * A representation of the model object '<em><b>Water</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.Water#getFishes <em>Fishes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getWater()
 * @model
 * @generated
 */
public interface Water extends Ground {
	/**
	 * Returns the value of the '<em><b>Fishes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modeling.demo.zoo.Fish}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fishes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fishes</em>' containment reference list.
	 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getWater_Fishes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fish> getFishes();

} // Water
