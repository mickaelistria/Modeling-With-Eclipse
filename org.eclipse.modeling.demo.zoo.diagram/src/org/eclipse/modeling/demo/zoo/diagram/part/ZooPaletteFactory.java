package org.eclipse.modeling.demo.zoo.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.modeling.demo.zoo.diagram.providers.ZooElementTypes;

/**
 * @generated
 */
public class ZooPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createZoo1Group());
	}

	/**
	 * Creates "Zoo" palette tool group
	 * @generated
	 */
	private PaletteContainer createZoo1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Zoo1Group_title);
		paletteContainer.setId("createZoo1Group"); //$NON-NLS-1$
		paletteContainer.add(createSavannah1CreationTool());
		paletteContainer.add(createWater2CreationTool());
		paletteContainer.add(createWalkway3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createVisitor5CreationTool());
		paletteContainer.add(createTiger6CreationTool());
		paletteContainer.add(createFish7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSavannah1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Savannah1CreationTool_title,
				Messages.Savannah1CreationTool_desc,
				Collections.singletonList(ZooElementTypes.Savannah_2001));
		entry.setId("createSavannah1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ZooElementTypes
				.getImageDescriptor(ZooElementTypes.Savannah_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWater2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Water2CreationTool_title,
				Messages.Water2CreationTool_desc,
				Collections.singletonList(ZooElementTypes.Water_2003));
		entry.setId("createWater2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ZooElementTypes
				.getImageDescriptor(ZooElementTypes.Water_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWalkway3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Walkway3CreationTool_title,
				Messages.Walkway3CreationTool_desc,
				Collections.singletonList(ZooElementTypes.Walkway_2002));
		entry.setId("createWalkway3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ZooElementTypes
				.getImageDescriptor(ZooElementTypes.Walkway_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVisitor5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Visitor5CreationTool_title,
				Messages.Visitor5CreationTool_desc,
				Collections.singletonList(ZooElementTypes.Visitor_3002));
		entry.setId("createVisitor5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ZooElementTypes
				.getImageDescriptor(ZooElementTypes.Visitor_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTiger6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tiger6CreationTool_title,
				Messages.Tiger6CreationTool_desc,
				Collections.singletonList(ZooElementTypes.Tiger_3001));
		entry.setId("createTiger6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ZooElementTypes
				.getImageDescriptor(ZooElementTypes.Tiger_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFish7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Fish7CreationTool_title,
				Messages.Fish7CreationTool_desc, null, null) {
		};
		entry.setId("createFish7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
