
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
	public RootPIM load() {
		// Initialise the model
		PIMPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("PIM", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("PIM", new
		// XMLResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI("./TrainTicket.PIM"), true);

		RootPIM pimRoot = (RootPIM) resource.getContents().get(0);
		// return pimRoot;
		return pimRoot;

	}

}