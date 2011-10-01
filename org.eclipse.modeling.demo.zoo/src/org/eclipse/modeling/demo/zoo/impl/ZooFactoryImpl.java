/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modeling.demo.zoo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZooFactoryImpl extends EFactoryImpl implements ZooFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZooFactory init() {
		try {
			ZooFactory theZooFactory = (ZooFactory)EPackage.Registry.INSTANCE.getEFactory("http://modeling.eclipse.org/demo/zoo"); 
			if (theZooFactory != null) {
				return theZooFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZooFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZooFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ZooPackage.ZOO: return createZoo();
			case ZooPackage.SAVANNAH: return createSavannah();
			case ZooPackage.WATER: return createWater();
			case ZooPackage.WALKWAY: return createWalkway();
			case ZooPackage.VISITOR: return createVisitor();
			case ZooPackage.TIGER: return createTiger();
			case ZooPackage.FISH: return createFish();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zoo createZoo() {
		ZooImpl zoo = new ZooImpl();
		return zoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Savannah createSavannah() {
		SavannahImpl savannah = new SavannahImpl();
		return savannah;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Water createWater() {
		WaterImpl water = new WaterImpl();
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Walkway createWalkway() {
		WalkwayImpl walkway = new WalkwayImpl();
		return walkway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visitor createVisitor() {
		VisitorImpl visitor = new VisitorImpl();
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tiger createTiger() {
		TigerImpl tiger = new TigerImpl();
		return tiger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fish createFish() {
		FishImpl fish = new FishImpl();
		return fish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZooPackage getZooPackage() {
		return (ZooPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZooPackage getPackage() {
		return ZooPackage.eINSTANCE;
	}

} //ZooFactoryImpl
