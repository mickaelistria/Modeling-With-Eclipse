/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modeling.demo.zoo.ZooPackage
 * @generated
 */
public interface ZooFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZooFactory eINSTANCE = org.eclipse.modeling.demo.zoo.impl.ZooFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zoo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoo</em>'.
	 * @generated
	 */
	Zoo createZoo();

	/**
	 * Returns a new object of class '<em>Savannah</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Savannah</em>'.
	 * @generated
	 */
	Savannah createSavannah();

	/**
	 * Returns a new object of class '<em>Water</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water</em>'.
	 * @generated
	 */
	Water createWater();

	/**
	 * Returns a new object of class '<em>Walkway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Walkway</em>'.
	 * @generated
	 */
	Walkway createWalkway();

	/**
	 * Returns a new object of class '<em>Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visitor</em>'.
	 * @generated
	 */
	Visitor createVisitor();

	/**
	 * Returns a new object of class '<em>Tiger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiger</em>'.
	 * @generated
	 */
	Tiger createTiger();

	/**
	 * Returns a new object of class '<em>Fish</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fish</em>'.
	 * @generated
	 */
	Fish createFish();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ZooPackage getZooPackage();

} //ZooFactory
