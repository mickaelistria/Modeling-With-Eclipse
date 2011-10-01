package org.eclipse.modeling.demo.zoo.diagram.providers;

import org.eclipse.modeling.demo.zoo.diagram.part.ZooDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ZooDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ZooDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
