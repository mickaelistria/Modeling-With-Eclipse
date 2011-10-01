/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modeling.demo.zoo.Visitor;
import org.eclipse.modeling.demo.zoo.ZooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VisitorImpl extends AnimalImpl implements Visitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZooPackage.Literals.VISITOR;
	}

} //VisitorImpl
