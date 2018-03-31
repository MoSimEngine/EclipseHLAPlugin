package hla.test;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {

	private static void transform() throws TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(new File("model/transform_omt_to_fomxml.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new File("model/RestaurantDrinks.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/RestaurantDrinks.xml")));
		
		text = new StreamSource(new File("model/RestaurantFood.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/RestaurantFood.xml")));
				
		text = new StreamSource(new File("model/RestaurantProcesses.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/RestaurantProcesses.xml")));
		
		text = new StreamSource(new File("model/RestaurantSoup.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/RestaurantSoup.xml")));
	}

	public static void main(String[] args) {

		try {
			transform();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String federateName = "exampleFederate";
		if (args.length != 0) {
			federateName = args[0];
		}

		try {
			// run the example federate
			new ExampleFederate().runFederate(federateName);
		} catch (Exception rtie) {
			// an exception occurred, just log the information and exit
			rtie.printStackTrace();
		}
	}
}
