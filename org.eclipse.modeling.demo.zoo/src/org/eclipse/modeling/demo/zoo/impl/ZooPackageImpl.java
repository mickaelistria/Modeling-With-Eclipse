/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modeling.demo.zoo.Animal;
import org.eclipse.modeling.demo.zoo.Fish;
import org.eclipse.modeling.demo.zoo.Ground;
import org.eclipse.modeling.demo.zoo.Savannah;
import org.eclipse.modeling.demo.zoo.Tiger;
import org.eclipse.modeling.demo.zoo.Visitor;
import org.eclipse.modeling.demo.zoo.Walkway;
import org.eclipse.modeling.demo.zoo.Water;
import org.eclipse.modeling.demo.zoo.Zoo;
import org.eclipse.modeling.demo.zoo.ZooFactory;
import org.eclipse.modeling.demo.zoo.ZooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZooPackageImpl extends EPackageImpl implements ZooPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass savannahEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walkwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tigerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fishEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modeling.demo.zoo.ZooPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZooPackageImpl() {
		super(eNS_URI, ZooFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ZooPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZooPackage init() {
		if (isInited) return (ZooPackage)EPackage.Registry.INSTANCE.getEPackage(ZooPackage.eNS_URI);

		// Obtain or create and register package
		ZooPackageImpl theZooPackage = (ZooPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ZooPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ZooPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theZooPackage.createPackageContents();

		// Initialize created meta-data
		theZooPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theZooPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZooPackage.eNS_URI, theZooPackage);
		return theZooPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoo() {
		return zooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoo_Plots() {
		return (EReference)zooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGround() {
		return groundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSavannah() {
		return savannahEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSavannah_Tigers() {
		return (EReference)savannahEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWater() {
		return waterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWater_Fishes() {
		return (EReference)waterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWalkway() {
		return walkwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWalkway_Visitors() {
		return (EReference)walkwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimal() {
		return animalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimal_Name() {
		return (EAttribute)animalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitor() {
		return visitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiger() {
		return tigerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFish() {
		return fishEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZooFactory getZooFactory() {
		return (ZooFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		zooEClass = createEClass(ZOO);
		createEReference(zooEClass, ZOO__PLOTS);

		groundEClass = createEClass(GROUND);

		savannahEClass = createEClass(SAVANNAH);
		createEReference(savannahEClass, SAVANNAH__TIGERS);

		waterEClass = createEClass(WATER);
		createEReference(waterEClass, WATER__FISHES);

		walkwayEClass = createEClass(WALKWAY);
		createEReference(walkwayEClass, WALKWAY__VISITORS);

		animalEClass = createEClass(ANIMAL);
		createEAttribute(animalEClass, ANIMAL__NAME);

		visitorEClass = createEClass(VISITOR);

		tigerEClass = createEClass(TIGER);

		fishEClass = createEClass(FISH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		savannahEClass.getESuperTypes().add(this.getGround());
		waterEClass.getESuperTypes().add(this.getGround());
		walkwayEClass.getESuperTypes().add(this.getGround());
		visitorEClass.getESuperTypes().add(this.getAnimal());
		tigerEClass.getESuperTypes().add(this.getAnimal());
		fishEClass.getESuperTypes().add(this.getAnimal());

		// Initialize classes and features; add operations and parameters
		initEClass(zooEClass, Zoo.class, "Zoo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoo_Plots(), this.getGround(), null, "plots", null, 0, -1, Zoo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundEClass, Ground.class, "Ground", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(savannahEClass, Savannah.class, "Savannah", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSavannah_Tigers(), this.getTiger(), null, "tigers", null, 0, -1, Savannah.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterEClass, Water.class, "Water", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWater_Fishes(), this.getFish(), null, "fishes", null, 0, -1, Water.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walkwayEClass, Walkway.class, "Walkway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWalkway_Visitors(), this.getVisitor(), null, "visitors", null, 0, -1, Walkway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animalEClass, Animal.class, "Animal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visitorEClass, Visitor.class, "Visitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tigerEClass, Tiger.class, "Tiger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fishEClass, Fish.class, "Fish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ZooPackageImpl
