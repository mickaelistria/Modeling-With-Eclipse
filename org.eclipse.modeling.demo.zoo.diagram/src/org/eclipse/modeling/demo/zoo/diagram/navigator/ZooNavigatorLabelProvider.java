package org.eclipse.modeling.demo.zoo.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.modeling.demo.zoo.Tiger;
import org.eclipse.modeling.demo.zoo.Visitor;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.SavannahEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.TigerEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.VisitorEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WalkwayEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.WaterEditPart;
import org.eclipse.modeling.demo.zoo.diagram.edit.parts.ZooEditPart;
import org.eclipse.modeling.demo.zoo.diagram.part.ZooDiagramEditorPlugin;
import org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry;
import org.eclipse.modeling.demo.zoo.diagram.providers.ZooElementTypes;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ZooNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ZooDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ZooDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ZooNavigatorItem
				&& !isOwnView(((ZooNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ZooNavigatorGroup) {
			ZooNavigatorGroup group = (ZooNavigatorGroup) element;
			return ZooDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ZooNavigatorItem) {
			ZooNavigatorItem navigatorItem = (ZooNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case ZooEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://modeling.eclipse.org/demo/zoo?Zoo", ZooElementTypes.Zoo_1000); //$NON-NLS-1$
		case SavannahEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeling.eclipse.org/demo/zoo?Savannah", ZooElementTypes.Savannah_2001); //$NON-NLS-1$
		case WalkwayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeling.eclipse.org/demo/zoo?Walkway", ZooElementTypes.Walkway_2002); //$NON-NLS-1$
		case WaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeling.eclipse.org/demo/zoo?Water", ZooElementTypes.Water_2003); //$NON-NLS-1$
		case TigerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://modeling.eclipse.org/demo/zoo?Tiger", ZooElementTypes.Tiger_3001); //$NON-NLS-1$
		case VisitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://modeling.eclipse.org/demo/zoo?Visitor", ZooElementTypes.Visitor_3002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ZooDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ZooElementTypes.isKnownElementType(elementType)) {
			image = ZooElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ZooNavigatorGroup) {
			ZooNavigatorGroup group = (ZooNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ZooNavigatorItem) {
			ZooNavigatorItem navigatorItem = (ZooNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ZooVisualIDRegistry.getVisualID(view)) {
		case ZooEditPart.VISUAL_ID:
			return getZoo_1000Text(view);
		case SavannahEditPart.VISUAL_ID:
			return getSavannah_2001Text(view);
		case WalkwayEditPart.VISUAL_ID:
			return getWalkway_2002Text(view);
		case WaterEditPart.VISUAL_ID:
			return getWater_2003Text(view);
		case TigerEditPart.VISUAL_ID:
			return getTiger_3001Text(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getZoo_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSavannah_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWalkway_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWater_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTiger_3001Text(View view) {
		Tiger domainModelElement = (Tiger) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ZooDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVisitor_3002Text(View view) {
		Visitor domainModelElement = (Visitor) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ZooDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ZooEditPart.MODEL_ID
				.equals(ZooVisualIDRegistry.getModelID(view));
	}

}
