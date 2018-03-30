package edu.kit.ipd.sdq.modsim.hla.example.game.client;

import java.io.File;
import java.util.Scanner;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class GameClientMain {

	public static void main(String[] args) {

		System.out.println("Genererie FOM-XML");
		try {
			transform();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte Username eingeben: ");
		String username = scanner.next();
		

		GameClientFederate chatClientFederate = new GameClientFederate();
		try {
			chatClientFederate.runFederate(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

	public static void transform() throws TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(new File("model/transform_omt_to_fomxml.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new File("model/Game.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/Game.xml")));
	}
}
