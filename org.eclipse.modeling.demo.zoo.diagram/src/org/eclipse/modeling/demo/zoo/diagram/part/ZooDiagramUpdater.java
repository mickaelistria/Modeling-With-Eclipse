package org.eclipse.modeling.demo.zoo.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.modeling.demo.zoo.Ground;
import org.eclipse.modeling.demo.zoo.Savannah;
import org.eclipse.modeling.demo.zoo.Tiger;
import org.eclipse.modeling.demo.zoo.Visitor;
import org.eclipse.modeling.demo.zoo.Walkway;
import org.eclipse.modeling.demo.zoo.Zoo;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.SavannahEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.TigerEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.VisitorEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WalkwayEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WaterEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.ZooEditPart;

/**
 * @generated
 */
public class ZooDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ZooNodeDescriptor> getSemanticChildren(View view) {
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case ZooEditPart.VISUAL_ID:
			return getZoo_1000SemanticChildren(view);
		case SavannahEditPart.VISUAL_ID:
			return getSavannah_2001SemanticChildren(view);
		case WalkwayEditPart.VISUAL_ID:
			return getWalkway_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooNodeDescriptor> getZoo_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Zoo modelElement = (Zoo) view.getElement();
		LinkedList<ZooNodeDescriptor> result = new LinkedList<ZooNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlots().iterator(); it.hasNext();) {
			Ground childElement = (Ground) it.next();
			int visualID = ZooVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SavannahEditPart.VISUAL_ID) {
				result.add(new ZooNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WalkwayEditPart.VISUAL_ID) {
				result.add(new ZooNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WaterEditPart.VISUAL_ID) {
				result.add(new ZooNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ZooNodeDescriptor> getSavannah_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Savannah modelElement = (Savannah) view.getElement();
		LinkedList<ZooNodeDescriptor> result = new LinkedList<ZooNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTigers().iterator(); it.hasNext();) {
			Tiger childElement = (Tiger) it.next();
			int visualID = ZooVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TigerEditPart.VISUAL_ID) {
				result.add(new ZooNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ZooNodeDescriptor> getWalkway_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Walkway modelElement = (Walkway) view.getElement();
		LinkedList<ZooNodeDescriptor> result = new LinkedList<ZooNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVisitors().iterator(); it
				.hasNext();) {
			Visitor childElement = (Visitor) it.next();
			int visualID = ZooVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VisitorEditPart.VISUAL_ID) {
				result.add(new ZooNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getContainedLinks(View view) {
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case ZooEditPart.VISUAL_ID:
			return getZoo_1000ContainedLinks(view);
		case SavannahEditPart.VISUAL_ID:
			return getSavannah_2001ContainedLinks(view);
		case WalkwayEditPart.VISUAL_ID:
			return getWalkway_2002ContainedLinks(view);
		case WaterEditPart.VISUAL_ID:
			return getWater_2003ContainedLinks(view);
		case TigerEditPart.VISUAL_ID:
			return getTiger_3001ContainedLinks(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getIncomingLinks(View view) {
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case SavannahEditPart.VISUAL_ID:
			return getSavannah_2001IncomingLinks(view);
		case WalkwayEditPart.VISUAL_ID:
			return getWalkway_2002IncomingLinks(view);
		case WaterEditPart.VISUAL_ID:
			return getWater_2003IncomingLinks(view);
		case TigerEditPart.VISUAL_ID:
			return getTiger_3001IncomingLinks(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getOutgoingLinks(View view) {
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case SavannahEditPart.VISUAL_ID:
			return getSavannah_2001OutgoingLinks(view);
		case WalkwayEditPart.VISUAL_ID:
			return getWalkway_2002OutgoingLinks(view);
		case WaterEditPart.VISUAL_ID:
			return getWater_2003OutgoingLinks(view);
		case TigerEditPart.VISUAL_ID:
			return getTiger_3001OutgoingLinks(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getZoo_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getSavannah_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWalkway_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWater_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getTiger_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getVisitor_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getSavannah_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWalkway_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWater_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getTiger_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getVisitor_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getSavannah_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWalkway_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getWater_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getTiger_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ZooLinkDescriptor> getVisitor_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

}
