//package hla.test;
//
//import java.util.Map;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//
//import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate;
//import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage;
//
//public class EMFModelLoad {
//	public Federate load() {
//		// Initialize the model
//		RtiapiPackage.eINSTANCE.eClass();
//
//		// Register the XMI resource factory for the .website extension
//
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("rtiapi", new XMIResourceFactoryImpl());
//
//		// Obtain a new resource set
//		ResourceSet resSet = new ResourceSetImpl();
//
//		// Get the resource
//		Resource resource = resSet.getResource(URI.createURI("model/My.rtiapi"), true);
//		// Get the first model element and cast it to the right type, in my
//		// example everything is hierarchical included in this first node
//		Federate myfederate = (Federate) resource.getContents().get(0);
//		
//		
//		myfederate.getHLAFederateAmbassador();
//		return myfederate;
//	}
//
//}