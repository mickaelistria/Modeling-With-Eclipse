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
 * A representation of the model object '<em><b>Walkway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.Walkway#getVisitors <em>Visitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getWalkway()
 * @model
 * @generated
 */
public interface Walkway extends Ground {
	/**
	 * Returns the value of the '<em><b>Visitors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modeling.demo.zoo.Visitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitors</em>' containment reference list.
	 * @see org.eclipse.modeling.demo.zoo.ZooPackage#getWalkway_Visitors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visitor> getVisitors();

} // Walkway
