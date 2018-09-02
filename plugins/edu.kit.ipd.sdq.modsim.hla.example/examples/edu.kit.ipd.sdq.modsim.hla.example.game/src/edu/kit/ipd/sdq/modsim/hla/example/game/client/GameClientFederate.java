/*
 *   Die Implementierung basiert auf dem Restaurant Beipsiel von The Portico Project
 *
 */
package edu.kit.ipd.sdq.modsim.hla.example.game.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import hla.rti1516e.CallbackModel;
import hla.rti1516e.InteractionClassHandle;
import hla.rti1516e.ParameterHandle;
import hla.rti1516e.ParameterHandleValueMap;
import hla.rti1516e.RTIambassador;
import hla.rti1516e.ResignAction;
import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.exceptions.FederatesCurrentlyJoined;
import hla.rti1516e.exceptions.FederationExecutionAlreadyExists;
import hla.rti1516e.exceptions.FederationExecutionDoesNotExist;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.time.HLAfloat64Interval;
import hla.rti1516e.time.HLAfloat64Time;
import hla.rti1516e.time.HLAfloat64TimeFactory;

public class GameClientFederate {

	public static final String READY_TO_RUN = "ReadyToRun";

	private RTIambassador rtiamb;
	private GameClientFederateAmbassador fedamb;
	private HLAfloat64TimeFactory timeFactory;
	protected EncoderFactory encoderFactory;

	// Name des Spielers
	private String username;

	// Handle fuer die InteraktionEvent numberEnteredHandle
	protected InteractionClassHandle numberEnteredHandle;

	private void log(String message) {
		System.out.println("GameFederate   : " + message);
	}

	private void waitForUser() {
		log(" >>>>>>>>>> Press Enter to Continue <<<<<<<<<<");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			reader.readLine();
		} catch (Exception e) {
			log("Error while waiting for user input: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void runFederate(String username) throws Exception {
		this.username = username;
		String federateName = "chat-client-" + username;

		log("Creating RTIambassador");
		rtiamb = RtiFactoryFactory.getRtiFactory().getRtiAmbassador();
		encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();

		// connect
		log("Connecting...");
		fedamb = new GameClientFederateAmbassador();
		rtiamb.connect(fedamb, CallbackModel.HLA_EVOKED);

		log("Creating Federation...");
		try {
			URL[] modules = new URL[] { (new File("model/tmp/Game.xml")).toURI().toURL() };

			rtiamb.createFederationExecution("GameFederation", modules);
			log("Created Federation");
		} catch (FederationExecutionAlreadyExists exists) {
			log("Didn't create federation, it already existed");
		} catch (MalformedURLException urle) {
			log("Exception loading one of the FOM modules from disk: " + urle.getMessage());
			urle.printStackTrace();
			return;
		}

		URL[] joinModules = new URL[] { (new File("model/tmp/Game.xml")).toURI().toURL() };

		rtiamb.joinFederationExecution(federateName, "GameFederation", "GameFederation", joinModules);

		log("Joined Federation as " + federateName);

		this.timeFactory = (HLAfloat64TimeFactory) rtiamb.getTimeFactory();

		rtiamb.registerFederationSynchronizationPoint(READY_TO_RUN, null);
		// wait until the point is announced
		while (fedamb.isAnnounced == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		// Warte auf Eingabe von User, dies ermöglicht das starten von weiteren
		// Federates
		waitForUser();

		rtiamb.synchronizationPointAchieved(READY_TO_RUN);
		log("Achieved sync point: " + READY_TO_RUN + ", waiting for federation...");
		while (fedamb.isReadyToRun == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		enableTimePolicy();
		log("Time Policy Enabled");

		publishAndSubscribe();
		log("Published and Subscribed");

		startGame();

		rtiamb.resignFederationExecution(ResignAction.DELETE_OBJECTS);
		log("Resigned from Federation");

		try {
			rtiamb.destroyFederationExecution("GameFederation");
			log("Destroyed Federation");
		} catch (FederationExecutionDoesNotExist dne) {
			log("No need to destroy federation, it doesn't exist");
		} catch (FederatesCurrentlyJoined fcj) {
			log("Didn't destroy federation, federates still joined");
		}
	}

	// Spiel Logik
	private void startGame() throws RTIexception {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("Nummer eingeben: ");
			String message = scanner.next();

			// Sende das Event NumberEntered
			sendNumber(message);
			advanceTime(1.0);

			log("Time Advanced to " + fedamb.federateTime);
		}

		scanner.close();
	}

	private void enableTimePolicy() throws Exception {
		HLAfloat64Interval lookahead = timeFactory.makeInterval(fedamb.federateLookahead);

		this.rtiamb.enableTimeRegulation(lookahead);

		while (fedamb.isRegulating == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		this.rtiamb.enableTimeConstrained();

		while (fedamb.isConstrained == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}
	}

	// Die Client Federate veroeffentlicht nur NumberEntered Events
	private void publishAndSubscribe() throws RTIexception {
		String iname = "HLAinteractionRoot.Game.Client.NumberEntered";
		numberEnteredHandle = rtiamb.getInteractionClassHandle(iname);

		rtiamb.publishInteractionClass(numberEnteredHandle);
	}

	// Für das NumberEntered Event werden zwei Parameter benötigt. (Getippte Nummer
	// und Spielername)
	private void sendNumber(String number) throws RTIexception {

		ParameterHandleValueMap parameters = rtiamb.getParameterHandleValueMapFactory().create(0);
		ParameterHandle numberHandle = rtiamb.getParameterHandle(numberEnteredHandle, "number");
		ParameterHandle gameridHandle = rtiamb.getParameterHandle(numberEnteredHandle, "gamerid");
		parameters.put(numberHandle, number.getBytes());
		parameters.put(gameridHandle, username.getBytes());

		HLAfloat64Time time = timeFactory.makeTime(fedamb.federateTime + fedamb.federateLookahead);
		rtiamb.sendInteraction(numberEnteredHandle, parameters, generateTag(), time);
	}

	private void advanceTime(double timestep) throws RTIexception {
		fedamb.isAdvancing = true;
		HLAfloat64Time time = timeFactory.makeTime(fedamb.federateTime + timestep);
		rtiamb.timeAdvanceRequest(time);

		while (fedamb.isAdvancing) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}
	}

	private byte[] generateTag() {
		return ("(timestamp) " + System.currentTimeMillis()).getBytes();
	}

}