package org.eclipse.modeling.demo.zoo.clientSample;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modeling.demo.zoo.Savannah;
import org.eclipse.modeling.demo.zoo.Tiger;
import org.eclipse.modeling.demo.zoo.Zoo;
import org.eclipse.modeling.demo.zoo.ZooFactory;
import org.eclipse.modeling.demo.zoo.ZooPackage;

public class ClientSample {

	public static void main(String[] args) throws Exception {
		// Direct API
		Zoo myZoo = ZooFactory.eINSTANCE.createZoo();
		Tiger mrTiget = ZooFactory.eINSTANCE.createTiger();
		mrTiget.setName("Mister Tiger");
		
		EObject mrsTiger = ZooFactory.eINSTANCE.createTiger();
		// Reflective API (meta)
		mrsTiger.eSet(ZooPackage.Literals.ANIMAL__NAME, "Mistress Tiger");
		
		Savannah tigerCouplePlot = ZooFactory.eINSTANCE.createSavannah();
		tigerCouplePlot.getTigers().add(mrTiget);
		tigerCouplePlot.getTigers().add((Tiger)mrsTiger);
		myZoo.getPlots().add(tigerCouplePlot);

		
		// Save my Zoo
		// Tell that my "zoo" files use XMI for serialization - Not necessary in Eclipse plugins
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("zoo", new XMIResourceFactoryImpl()); 
		
		File destFile = new File("/home/istria/Bureau/myzoo.zoo");
		destFile.createNewFile();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(destFile.getAbsolutePath()));
		resource.getContents().add(myZoo);
		resource.save(Collections.EMPTY_MAP);
	}
}
