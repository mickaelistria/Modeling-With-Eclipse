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

import org.eclipse.modeling.demo.zoo.Savannah;
import org.eclipse.modeling.demo.zoo.Tiger;
import org.eclipse.modeling.demo.zoo.ZooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Savannah</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modeling.demo.zoo.impl.SavannahImpl#getTigers <em>Tigers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SavannahImpl extends EObjectImpl implements Savannah {
	/**
	 * The cached value of the '{@link #getTigers() <em>Tigers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTigers()
	 * @generated
	 * @ordered
	 */
	protected EList<Tiger> tigers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SavannahImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZooPackage.Literals.SAVANNAH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tiger> getTigers() {
		if (tigers == null) {
			tigers = new EObjectContainmentEList<Tiger>(Tiger.class, this, ZooPackage.SAVANNAH__TIGERS);
		}
		return tigers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZooPackage.SAVANNAH__TIGERS:
				return ((InternalEList<?>)getTigers()).basicRemove(otherEnd, msgs);
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
			case ZooPackage.SAVANNAH__TIGERS:
				return getTigers();
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
			case ZooPackage.SAVANNAH__TIGERS:
				getTigers().clear();
				getTigers().addAll((Collection<? extends Tiger>)newValue);
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
			case ZooPackage.SAVANNAH__TIGERS:
				getTigers().clear();
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
			case ZooPackage.SAVANNAH__TIGERS:
				return tigers != null && !tigers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SavannahImpl
