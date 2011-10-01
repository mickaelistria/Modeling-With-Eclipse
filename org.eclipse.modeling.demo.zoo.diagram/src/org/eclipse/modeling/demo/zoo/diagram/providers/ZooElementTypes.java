package org.eclipse.modeling.demo.zoo.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.modeling.demo.zoo.ZooPackage;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.SavannahEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.TigerEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.VisitorEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WalkwayEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WaterEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.ZooEditPart;
import org.eclipse.modeling.demo.zoo.diagram.part.ZooDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ZooElementTypes {

	/**
	 * @generated
	 */
	private ZooElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Zoo_1000 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Zoo_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Savannah_2001 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Savannah_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Walkway_2002 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Walkway_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Water_2003 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Water_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tiger_3001 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Tiger_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Visitor_3002 = getElementType("org.eclipse.modeling.demo.zoo.diagram.Visitor_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ZooDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Zoo_1000, ZooPackage.eINSTANCE.getZoo());

			elements.put(Savannah_2001, ZooPackage.eINSTANCE.getSavannah());

			elements.put(Walkway_2002, ZooPackage.eINSTANCE.getWalkway());

			elements.put(Water_2003, ZooPackage.eINSTANCE.getWater());

			elements.put(Tiger_3001, ZooPackage.eINSTANCE.getTiger());

			elements.put(Visitor_3002, ZooPackage.eINSTANCE.getVisitor());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Zoo_1000);
			KNOWN_ELEMENT_TYPES.add(Savannah_2001);
			KNOWN_ELEMENT_TYPES.add(Walkway_2002);
			KNOWN_ELEMENT_TYPES.add(Water_2003);
			KNOWN_ELEMENT_TYPES.add(Tiger_3001);
			KNOWN_ELEMENT_TYPES.add(Visitor_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ZooEditPart.VISUAL_ID:
			return Zoo_1000;
		case SavannahEditPart.VISUAL_ID:
			return Savannah_2001;
		case WalkwayEditPart.VISUAL_ID:
			return Walkway_2002;
		case WaterEditPart.VISUAL_ID:
			return Water_2003;
		case TigerEditPart.VISUAL_ID:
			return Tiger_3001;
		case VisitorEditPart.VISUAL_ID:
			return Visitor_3002;
		}
		return null;
	}

}
