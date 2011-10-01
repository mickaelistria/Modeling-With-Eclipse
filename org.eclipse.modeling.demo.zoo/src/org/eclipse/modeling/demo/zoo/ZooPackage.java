/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modeling.demo.zoo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modeling.demo.zoo.ZooFactory
 * @model kind="package"
 * @generated
 */
public interface ZooPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zoo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modeling.eclipse.org/demo/zoo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zoo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZooPackage eINSTANCE = org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.ZooImpl <em>Zoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getZoo()
	 * @generated
	 */
	int ZOO = 0;

	/**
	 * The feature id for the '<em><b>Plots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__PLOTS = 0;

	/**
	 * The number of structural features of the '<em>Zoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.Ground <em>Ground</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.Ground
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getGround()
	 * @generated
	 */
	int GROUND = 1;

	/**
	 * The number of structural features of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.SavannahImpl <em>Savannah</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.SavannahImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getSavannah()
	 * @generated
	 */
	int SAVANNAH = 2;

	/**
	 * The feature id for the '<em><b>Tigers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVANNAH__TIGERS = GROUND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Savannah</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVANNAH_FEATURE_COUNT = GROUND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.WaterImpl <em>Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.WaterImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getWater()
	 * @generated
	 */
	int WATER = 3;

	/**
	 * The feature id for the '<em><b>Fishes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER__FISHES = GROUND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_FEATURE_COUNT = GROUND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.WalkwayImpl <em>Walkway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.WalkwayImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getWalkway()
	 * @generated
	 */
	int WALKWAY = 4;

	/**
	 * The feature id for the '<em><b>Visitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALKWAY__VISITORS = GROUND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Walkway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALKWAY_FEATURE_COUNT = GROUND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.AnimalImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.VisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.VisitorImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.TigerImpl <em>Tiger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.TigerImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getTiger()
	 * @generated
	 */
	int TIGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIGER__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Tiger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIGER_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modeling.demo.zoo.impl.FishImpl <em>Fish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modeling.demo.zoo.impl.FishImpl
	 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getFish()
	 * @generated
	 */
	int FISH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Fish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Zoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoo</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Zoo
	 * @generated
	 */
	EClass getZoo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modeling.demo.zoo.Zoo#getPlots <em>Plots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plots</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Zoo#getPlots()
	 * @see #getZoo()
	 * @generated
	 */
	EReference getZoo_Plots();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Ground <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Ground
	 * @generated
	 */
	EClass getGround();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Savannah <em>Savannah</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Savannah</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Savannah
	 * @generated
	 */
	EClass getSavannah();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modeling.demo.zoo.Savannah#getTigers <em>Tigers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tigers</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Savannah#getTigers()
	 * @see #getSavannah()
	 * @generated
	 */
	EReference getSavannah_Tigers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Water <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Water
	 * @generated
	 */
	EClass getWater();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modeling.demo.zoo.Water#getFishes <em>Fishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fishes</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Water#getFishes()
	 * @see #getWater()
	 * @generated
	 */
	EReference getWater_Fishes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Walkway <em>Walkway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Walkway</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Walkway
	 * @generated
	 */
	EClass getWalkway();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modeling.demo.zoo.Walkway#getVisitors <em>Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visitors</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Walkway#getVisitors()
	 * @see #getWalkway()
	 * @generated
	 */
	EReference getWalkway_Visitors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modeling.demo.zoo.Animal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Animal#getName()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Tiger <em>Tiger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiger</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Tiger
	 * @generated
	 */
	EClass getTiger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modeling.demo.zoo.Fish <em>Fish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fish</em>'.
	 * @see org.eclipse.modeling.demo.zoo.Fish
	 * @generated
	 */
	EClass getFish();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZooFactory getZooFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.ZooImpl <em>Zoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getZoo()
		 * @generated
		 */
		EClass ZOO = eINSTANCE.getZoo();

		/**
		 * The meta object literal for the '<em><b>Plots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZOO__PLOTS = eINSTANCE.getZoo_Plots();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.Ground <em>Ground</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.Ground
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getGround()
		 * @generated
		 */
		EClass GROUND = eINSTANCE.getGround();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.SavannahImpl <em>Savannah</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.SavannahImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getSavannah()
		 * @generated
		 */
		EClass SAVANNAH = eINSTANCE.getSavannah();

		/**
		 * The meta object literal for the '<em><b>Tigers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVANNAH__TIGERS = eINSTANCE.getSavannah_Tigers();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.WaterImpl <em>Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.WaterImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getWater()
		 * @generated
		 */
		EClass WATER = eINSTANCE.getWater();

		/**
		 * The meta object literal for the '<em><b>Fishes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER__FISHES = eINSTANCE.getWater_Fishes();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.WalkwayImpl <em>Walkway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.WalkwayImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getWalkway()
		 * @generated
		 */
		EClass WALKWAY = eINSTANCE.getWalkway();

		/**
		 * The meta object literal for the '<em><b>Visitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALKWAY__VISITORS = eINSTANCE.getWalkway_Visitors();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.AnimalImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NAME = eINSTANCE.getAnimal_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.VisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.VisitorImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.TigerImpl <em>Tiger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.TigerImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getTiger()
		 * @generated
		 */
		EClass TIGER = eINSTANCE.getTiger();

		/**
		 * The meta object literal for the '{@link org.eclipse.modeling.demo.zoo.impl.FishImpl <em>Fish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modeling.demo.zoo.impl.FishImpl
		 * @see org.eclipse.modeling.demo.zoo.impl.ZooPackageImpl#getFish()
		 * @generated
		 */
		EClass FISH = eINSTANCE.getFish();

	}

} //ZooPackage
