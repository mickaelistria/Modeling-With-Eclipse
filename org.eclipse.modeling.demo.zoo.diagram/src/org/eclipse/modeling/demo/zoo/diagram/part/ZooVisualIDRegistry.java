package org.eclipse.modeling.demo.zoo.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.modeling.demo.zoo.Zoo;
import org.eclipse.modeling.demo.zoo.ZooPackage;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.SavannahEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.TigerEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.VisitorEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WalkwayEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WaterEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.ZooEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ZooVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.modeling.demo.zoo.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ZooEditPart.MODEL_ID.equals(view.getType())) {
				return ZooEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ZooDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ZooPackage.eINSTANCE.getZoo().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Zoo) domainElement)) {
			return ZooEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry
				.getModelID(containerView);
		if (!ZooEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ZooEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ZooEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ZooEditPart.VISUAL_ID:
			if (ZooPackage.eINSTANCE.getSavannah().isSuperTypeOf(
					domainElement.eClass())) {
				return SavannahEditPart.VISUAL_ID;
			}
			if (ZooPackage.eINSTANCE.getWalkway().isSuperTypeOf(
					domainElement.eClass())) {
				return WalkwayEditPart.VISUAL_ID;
			}
			if (ZooPackage.eINSTANCE.getWater().isSuperTypeOf(
					domainElement.eClass())) {
				return WaterEditPart.VISUAL_ID;
			}
			break;
		case SavannahEditPart.VISUAL_ID:
			if (ZooPackage.eINSTANCE.getTiger().isSuperTypeOf(
					domainElement.eClass())) {
				return TigerEditPart.VISUAL_ID;
			}
			break;
		case WalkwayEditPart.VISUAL_ID:
			if (ZooPackage.eINSTANCE.getVisitor().isSuperTypeOf(
					domainElement.eClass())) {
				return VisitorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry
				.getModelID(containerView);
		if (!ZooEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ZooEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ZooEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ZooEditPart.VISUAL_ID:
			if (SavannahEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WalkwayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SavannahEditPart.VISUAL_ID:
			if (TigerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WalkwayEditPart.VISUAL_ID:
			if (VisitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Zoo element) {
		return true;
	}

}
