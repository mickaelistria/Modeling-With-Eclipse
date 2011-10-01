package org.eclipse.modeling.demo.zoo.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.modeling.demo.zoo.diagram.part.ZooVisualIDRegistry;

/**
 * @generated
 */
public class ZooNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 3004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ZooNavigatorItem) {
			ZooNavigatorItem item = (ZooNavigatorItem) element;
			return ZooVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
