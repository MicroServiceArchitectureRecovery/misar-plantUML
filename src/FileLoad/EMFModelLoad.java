package FileLoad;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import PIM.PIMPackage;
import PIM.RootPIM;
//import PIM.util.PIMAdapterFactory;

public class EMFModelLoad {
	public RootPIM load(String file) {
		// Initialise the model
		PIMPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();	
		
		
		// Register xmi and pim as valid file extensions
		m.put("PIM", new XMIResourceFactoryImpl());
		m.put("pim", new XMIResourceFactoryImpl());
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("XMI", new XMIResourceFactoryImpl());
		
		

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(reg);
		// resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("PIM", new
		// XMLResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createFileURI(file), true);

		RootPIM pimRoot = (RootPIM) resource.getContents().get(0);
		// return pimRoot;
		return pimRoot;

	}

}