/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.Zoo#getPlots <em>Plots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getZoo()
 * @model
 * @generated
 */
public interface Zoo extends EObject {
	/**
	 * Returns the value of the '<em><b>Plots</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modeling.demo.zoo.Ground}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plots</em>' containment reference list.
	 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getZoo_Plots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ground> getPlots();

} // Zoo
