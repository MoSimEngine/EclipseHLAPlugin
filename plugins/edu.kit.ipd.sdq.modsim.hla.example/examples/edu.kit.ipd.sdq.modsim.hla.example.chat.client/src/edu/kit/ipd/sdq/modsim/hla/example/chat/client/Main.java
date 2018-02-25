package edu.kit.ipd.sdq.modsim.hla.example.chat.client;

import java.io.File;
import java.util.Scanner;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {

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
		scanner.close();

		ChatClientFederate chatClientFederate = new ChatClientFederate();
		try {
			chatClientFederate.runFederate("chat-client-" + username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void transform() throws TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(new File("model/transform_omt_to_fomxml.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new File("model/Chat.omt"));
		transformer.transform(text, new StreamResult(new File("model/tmp/Chat.xml")));
	}
}
