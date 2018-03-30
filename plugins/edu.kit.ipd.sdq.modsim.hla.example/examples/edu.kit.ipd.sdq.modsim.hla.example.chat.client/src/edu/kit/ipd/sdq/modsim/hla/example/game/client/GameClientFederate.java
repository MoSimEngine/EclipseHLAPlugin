/*
 *   Copyright 2012 The Portico Project
 *
 *   This file is part of portico.
 *
 *   portico is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *   
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package edu.kit.ipd.sdq.modsim.hla.example.game.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import hla.rti1516e.AttributeHandle;
import hla.rti1516e.CallbackModel;
import hla.rti1516e.InteractionClassHandle;
import hla.rti1516e.ObjectClassHandle;
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
	// ----------------------------------------------------------
	// STATIC VARIABLES
	// ----------------------------------------------------------

	/** The sync point all federates will sync up on before starting */
	public static final String READY_TO_RUN = "ReadyToRun";

	// ----------------------------------------------------------
	// INSTANCE VARIABLES
	// ----------------------------------------------------------
	private RTIambassador rtiamb;
	private GameClientFederateAmbassador fedamb; // created when we connect
	private HLAfloat64TimeFactory timeFactory; // set when we join
	protected EncoderFactory encoderFactory; // set when we join
	private String username;

	// caches of handle types - set once we join a federation
	protected InteractionClassHandle numberEnteredHandle;

	// ----------------------------------------------------------
	// CONSTRUCTORS
	// ----------------------------------------------------------

	// ----------------------------------------------------------
	// INSTANCE METHODS
	// ----------------------------------------------------------
	/**
	 * This is just a helper method to make sure all logging it output in the same
	 * form
	 */
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

	///////////////////////////////////////////////////////////////////////////
	////////////////////////// Main Simulation Method /////////////////////////
	///////////////////////////////////////////////////////////////////////////
	/**
	 * This is the main simulation loop. It can be thought of as the main method of
	 * the federate. For a description of the basic flow of this federate, see the
	 * class level comments
	 */
	public void runFederate(String username) throws Exception {
		this.username = username;
		String federateName = "chat-client-" + username;
		/////////////////////////////////////////////////
		// 1 & 2. create the RTIambassador and Connect //
		/////////////////////////////////////////////////
		log("Creating RTIambassador");
		rtiamb = RtiFactoryFactory.getRtiFactory().getRtiAmbassador();
		encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();

		// connect
		log("Connecting...");
		fedamb = new GameClientFederateAmbassador(this);
		rtiamb.connect(fedamb, CallbackModel.HLA_EVOKED);

		//////////////////////////////
		// 3. create the federation //
		//////////////////////////////
		log("Creating Federation...");
		// We attempt to create a new federation with the first three of the
		// restaurant FOM modules covering processes, food and drink
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

		////////////////////////////
		// 4. join the federation //
		////////////////////////////
		URL[] joinModules = new URL[] { (new File("model/tmp/Game.xml")).toURI().toURL() };

		rtiamb.joinFederationExecution(federateName, // name for the federate
				"GameFederation", // federate type
				"GameFederation", // name of federation
				joinModules); // modules we want to add

		log("Joined Federation as " + federateName);

		// cache the time factory for easy access
		this.timeFactory = (HLAfloat64TimeFactory) rtiamb.getTimeFactory();

		////////////////////////////////
		// 5. announce the sync point //
		////////////////////////////////
		// announce a sync point to get everyone on the same page. if the point
		// has already been registered, we'll get a callback saying it failed,
		// but we don't care about that, as long as someone registered it
		rtiamb.registerFederationSynchronizationPoint(READY_TO_RUN, null);
		// wait until the point is announced
		while (fedamb.isAnnounced == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		waitForUser();

		///////////////////////////////////////////////////////
		// 6. achieve the point and wait for synchronization //
		///////////////////////////////////////////////////////
		// tell the RTI we are ready to move past the sync point and then wait
		// until the federation has synchronized on
		rtiamb.synchronizationPointAchieved(READY_TO_RUN);
		log("Achieved sync point: " + READY_TO_RUN + ", waiting for federation...");
		while (fedamb.isReadyToRun == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		/////////////////////////////
		// 7. enable time policies //
		/////////////////////////////
		// in this section we enable/disable all time policies
		// note that this step is optional!
		enableTimePolicy();
		log("Time Policy Enabled");

		//////////////////////////////
		// 8. publish and subscribe //
		//////////////////////////////
		// in this section we tell the RTI of all the data we are going to
		// produce, and all the data we want to know about
		publishAndSubscribe();
		log("Published and Subscribed");

		/////////////////////////////////////
		// 10. do the main simulation loop //
		/////////////////////////////////////
		// here is where we do the meat of our work. in each iteration, we will
		// update the attribute values of the object we registered, and will
		// send an interaction.

		startGame();

		////////////////////////////////////
		// 12. resign from the federation //
		////////////////////////////////////
		rtiamb.resignFederationExecution(ResignAction.DELETE_OBJECTS);
		log("Resigned from Federation");

		////////////////////////////////////////
		// 13. try and destroy the federation //
		////////////////////////////////////////
		// NOTE: we won't die if we can't do this because other federates
		// remain. in that case we'll leave it for them to clean up
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

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("Nummer eingeben: ");
			String message = scanner.next();

			sendNumber(message); // 9.3 request a time advance and wait until we get it
			advanceTime(1.0);
			// 9.2 send an interaction
			log("Time Advanced to " + fedamb.federateTime);
		}

		scanner.close();
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////// Helper Methods //////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	/**
	 * This method will attempt to enable the various time related properties for
	 * the federate
	 */
	private void enableTimePolicy() throws Exception {
		// NOTE: Unfortunately, the LogicalTime/LogicalTimeInterval create code is
		// Portico specific. You will have to alter this if you move to a
		// different RTI implementation. As such, we've isolated it into a
		// method so that any change only needs to happen in a couple of spots
		HLAfloat64Interval lookahead = timeFactory.makeInterval(fedamb.federateLookahead);

		////////////////////////////
		// enable time regulation //
		////////////////////////////
		this.rtiamb.enableTimeRegulation(lookahead);

		// tick until we get the callback
		while (fedamb.isRegulating == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}

		/////////////////////////////
		// enable time constrained //
		/////////////////////////////
		this.rtiamb.enableTimeConstrained();

		// tick until we get the callback
		while (fedamb.isConstrained == false) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}
	}

	/**
	 * This method will inform the RTI about the types of data that the federate
	 * will be creating, and the types of data we are interested in hearing about as
	 * other federates produce it.
	 */
	private void publishAndSubscribe() throws RTIexception {
		String iname = "HLAinteractionRoot.Game.Client.NumberEntered";
		numberEnteredHandle = rtiamb.getInteractionClassHandle(iname);

		// do the publication
		rtiamb.publishInteractionClass(numberEnteredHandle);
	}

	/**
	 * This method will send out an interaction of the type FoodServed.DrinkServed.
	 * Any federates which are subscribed to it will receive a notification the next
	 * time they tick(). This particular interaction has no parameters, so you pass
	 * an empty map, but the process of encoding them is the same as for attributes.
	 */
	private void sendNumber(String number) throws RTIexception {
		//////////////////////////
		// send the interaction //
		//////////////////////////

		ParameterHandleValueMap parameters = rtiamb.getParameterHandleValueMapFactory().create(0);
		ParameterHandle numberHandle = rtiamb.getParameterHandle(numberEnteredHandle, "number");
		ParameterHandle gameridHandle = rtiamb.getParameterHandle(numberEnteredHandle, "gamerid");
		parameters.put(numberHandle, number.getBytes());
		parameters.put(gameridHandle, username.getBytes());
		// rtiamb.sendInteraction(messageHandle, parameters, generateTag());

		// if you want to associate a particular timestamp with the
		// interaction, you will have to supply it to the RTI. Here
		// we send another interaction, this time with a timestamp:
		HLAfloat64Time time = timeFactory.makeTime(fedamb.federateTime + fedamb.federateLookahead);
		rtiamb.sendInteraction(numberEnteredHandle, parameters, generateTag(), time);
	}

	/**
	 * This method will request a time advance to the current time, plus the given
	 * timestep. It will then wait until a notification of the time advance grant
	 * has been received.
	 */
	private void advanceTime(double timestep) throws RTIexception {
		// request the advance
		fedamb.isAdvancing = true;
		HLAfloat64Time time = timeFactory.makeTime(fedamb.federateTime + timestep);
		rtiamb.timeAdvanceRequest(time);

		// wait for the time advance to be granted. ticking will tell the
		// LRC to start delivering callbacks to the federate
		while (fedamb.isAdvancing) {
			rtiamb.evokeMultipleCallbacks(0.1, 0.2);
		}
	}

	private byte[] generateTag() {
		return ("(timestamp) " + System.currentTimeMillis()).getBytes();
	}

}