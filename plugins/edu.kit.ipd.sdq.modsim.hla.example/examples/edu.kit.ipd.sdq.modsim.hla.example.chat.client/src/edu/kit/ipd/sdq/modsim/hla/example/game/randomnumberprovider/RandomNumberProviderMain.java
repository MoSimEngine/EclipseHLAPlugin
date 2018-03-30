package edu.kit.ipd.sdq.modsim.hla.example.game.randomnumberprovider;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class RandomNumberProviderMain {

	public static void main(String[] args) {

		System.out.println("Genererie FOM-XML");
		try {
			transform();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RandomNumberProviderFederate randomNumberProviderFederate = new RandomNumberProviderFederate();
		try {
			randomNumberProviderFederate.runFederate("RandomNumberProvider");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transform() throws TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(new File("model/transform_omt_to_fomxml.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new File("model/Game.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/Game.xml")));
	}
}
