package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ruletypesmm.Rule;
import ruletypesmm.RuletypesmmPackage;
import ruletypesmm.Trafo;

public class FootprintReader {

	String modelPath;

	public static void main(String[] argv){
		FootprintReader f = new FootprintReader("model/out.xmi");
		System.out.println(f.getFootprints());
	}
	
	public FootprintReader(String modelPath) {
		this.modelPath = modelPath;
	}

	public List<List<String>> getFootprints() {

		RuletypesmmPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modelPath), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Trafo trafo = (Trafo) resource.getContents().get(0);

		List<List<String>> list = new LinkedList<List<String>>();

		for (Rule r : trafo.getRules()) {
			List<String> l = new LinkedList<String>();
			for (String f : r.getAllFootPrints()) {
				l.add(f);
			}
			list.add(l);
		}

		return list;

	}

}
