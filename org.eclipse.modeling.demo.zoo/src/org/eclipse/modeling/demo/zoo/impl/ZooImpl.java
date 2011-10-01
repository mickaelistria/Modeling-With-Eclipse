/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modeling.demo.zoo.Ground;
import org.eclipse.modeling.demo.zoo.Zoo;
import org.eclipse.modeling.demo.zoo.ZooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zoo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.impl.ZooImpl#getPlots <em>Plots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZooImpl extends EObjectImpl implements Zoo {
	/**
	 * The cached value of the '{@link #getPlots() <em>Plots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Ground> plots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZooPackage.Literals.ZOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ground> getPlots() {
		if (plots == null) {
			plots = new EObjectContainmentEList<Ground>(Ground.class, this, ZooPackage.ZOO__PLOTS);
		}
		return plots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZooPackage.ZOO__PLOTS:
				return ((InternalEList<?>)getPlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZooPackage.ZOO__PLOTS:
				return getPlots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZooPackage.ZOO__PLOTS:
				getPlots().clear();
				getPlots().addAll((Collection<? extends Ground>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ZooPackage.ZOO__PLOTS:
				getPlots().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ZooPackage.ZOO__PLOTS:
				return plots != null && !plots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZooImpl
