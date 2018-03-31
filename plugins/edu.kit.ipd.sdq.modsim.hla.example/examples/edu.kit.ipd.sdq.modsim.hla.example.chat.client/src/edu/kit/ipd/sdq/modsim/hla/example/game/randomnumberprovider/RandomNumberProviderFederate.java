/*
 *   Die Implementierung basiert auf dem Restaurant Beipsiel von The Portico Project
 *
 */
package edu.kit.ipd.sdq.modsim.hla.example.game.randomnumberprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

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

public class RandomNumberProviderFederate {
	public static final String READY_TO_RUN = "ReadyToRun";

	private RTIambassador rtiamb;
	private RandomNumberProviderFederateAmbassador fedamb;
	private HLAfloat64TimeFactory timeFactory;
	protected EncoderFactory encoderFactory;

	protected InteractionClassHandle randomNumberProviderHandle;

	private void log(String message) {
		System.out.println("ChatFederate   : " + message);
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

	public void runFederate(String federateName) throws Exception {
		log("Creating RTIambassador");
		rtiamb = RtiFactoryFactory.getRtiFactory().getRtiAmbassador();
		encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();

		log("Connecting...");
		fedamb = new RandomNumberProviderFederateAmbassador();
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

		while (fedamb.isAnnounced == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

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

	// Chat Logik
	private void startGame() throws RTIexception {

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int number = random.nextInt(100);

			System.out.println("Runde " + i + ": Zufällige Zahl:" + number);

			// Sende die zufällige Zahl
			sendRandomNumber(String.valueOf(number));
			advanceTime(1.0);
			log("Time Advanced to " + fedamb.federateTime);
		}

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

	// Die RandomNumberProviderFederate muss nur Events vom Typ RandomNumber
	// veröffentlichen
	private void publishAndSubscribe() throws RTIexception {
		String iname = "HLAinteractionRoot.Game.Client.RandomNumber";
		randomNumberProviderHandle = rtiamb.getInteractionClassHandle(iname);

		rtiamb.publishInteractionClass(randomNumberProviderHandle);
	}

	// Das Event/Interaktion RandomNumber hat nur einen Parameter (number)
	private void sendRandomNumber(String number) throws RTIexception {
		ParameterHandleValueMap parameters = rtiamb.getParameterHandleValueMapFactory().create(0);
		ParameterHandle parameterHandle = rtiamb.getParameterHandle(randomNumberProviderHandle, "number");
		parameters.put(parameterHandle, number.getBytes());

		HLAfloat64Time time = timeFactory.makeTime(fedamb.federateTime + fedamb.federateLookahead);
		rtiamb.sendInteraction(randomNumberProviderHandle, parameters, generateTag(), time);
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