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
package edu.kit.ipd.sdq.modsim.hla.example.chat.server;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import hla.rti1516e.AttributeHandle;
import hla.rti1516e.AttributeHandleSet;
import hla.rti1516e.CallbackModel;
import hla.rti1516e.InteractionClassHandle;
import hla.rti1516e.ObjectClassHandle;
import hla.rti1516e.ObjectInstanceHandle;
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

public class ChatServerFederate {
	// ----------------------------------------------------------
	// STATIC VARIABLES
	// ----------------------------------------------------------

	/** The sync point all federates will sync up on before starting */
	public static final String READY_TO_RUN = "ReadyToRun";

	// ----------------------------------------------------------
	// INSTANCE VARIABLES
	// ----------------------------------------------------------
	private RTIambassador rtiamb;
	private ChatServerFederateAmbassador fedamb; // created when we connect
	private HLAfloat64TimeFactory timeFactory; // set when we join
	protected EncoderFactory encoderFactory; // set when we join

	// caches of handle types - set once we join a federation
	protected ObjectClassHandle chatHandle;
	protected AttributeHandle userHandle;
	protected InteractionClassHandle messageHandle;

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
		System.out.println("ChatFederate   : " + message);
	}

	///////////////////////////////////////////////////////////////////////////
	////////////////////////// Main Simulation Method /////////////////////////
	///////////////////////////////////////////////////////////////////////////
	/**
	 * This is the main simulation loop. It can be thought of as the main method of
	 * the federate. For a description of the basic flow of this federate, see the
	 * class level comments
	 */
	public void runFederate(String federateName) throws Exception {
		/////////////////////////////////////////////////
		// 1 & 2. create the RTIambassador and Connect //
		/////////////////////////////////////////////////
		log("Creating RTIambassador");
		rtiamb = RtiFactoryFactory.getRtiFactory().getRtiAmbassador();
		encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();

		// connect
		log("Connecting...");
		fedamb = new ChatServerFederateAmbassador(this);
		rtiamb.connect(fedamb, CallbackModel.HLA_EVOKED);

		//////////////////////////////
		// 3. create the federation //
		//////////////////////////////
		log("Creating Federation...");
		// We attempt to create a new federation with the first three of the
		// restaurant FOM modules covering processes, food and drink
		try {
			URL[] modules = new URL[] { (new File("model/tmp/Chat.xml")).toURI().toURL() };

			rtiamb.createFederationExecution("ChatFederation", modules);
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
		URL[] joinModules = new URL[] { (new File("model/tmp/Chat.xml")).toURI().toURL() };

		rtiamb.joinFederationExecution(federateName, // name for the federate
				"ChatFederation", // federate type
				"ChatFederation", // name of federation
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
		// 9. register an object to update //
		/////////////////////////////////////
		ObjectInstanceHandle objectHandle = registerObject();
		log("Registered Object, handle=" + objectHandle);

		/////////////////////////////////////
		// 10. do the main simulation loop //
		/////////////////////////////////////
		// here is where we do the meat of our work. in each iteration, we will
		// update the attribute values of the object we registered, and will
		// send an interaction.

		chat();

		//////////////////////////////////////
		// 11. delete the object we created //
		//////////////////////////////////////
		deleteObject(objectHandle);
		log("Deleted Object, handle=" + objectHandle);

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
			rtiamb.destroyFederationExecution("ChatFederation");
			log("Destroyed Federation");
		} catch (FederationExecutionDoesNotExist dne) {
			log("No need to destroy federation, it doesn't exist");
		} catch (FederatesCurrentlyJoined fcj) {
			log("Didn't destroy federation, federates still joined");
		}
	}

	// Chat Logik
	private void chat() throws RTIexception {
		// 9.2 send an interaction
		advanceTime(1.0);
		log("Time Advanced to " + fedamb.federateTime);

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
		// get all the handle information for the attributes of Food.Drink.Soda
		this.chatHandle = rtiamb.getObjectClassHandle("HLAobjectRoot.Chat.Client.User");
		this.userHandle = rtiamb.getAttributeHandle(chatHandle, "NumberOfUsers");
		// package the information into a handle set
		AttributeHandleSet attributes = rtiamb.getAttributeHandleSetFactory().create();
		attributes.add(userHandle);

		// do the actual publication
		rtiamb.publishObjectClassAttributes(chatHandle, attributes);

		////////////////////////////////////////////////////
		// subscribe to all attributes of Food.Drink.Soda //
		////////////////////////////////////////////////////
		// we also want to hear about the same sort of information as it is
		// created and altered in other federates, so we need to subscribe to it
		rtiamb.subscribeObjectClassAttributes(chatHandle, attributes);

		//////////////////////////////////////////////////////////
		// publish the interaction class FoodServed.DrinkServed //
		//////////////////////////////////////////////////////////
		// we want to send interactions of type FoodServed.DrinkServed, so we need
		// to tell the RTI that we're publishing it first. We don't need to
		// inform it of the parameters, only the class, making it much simpler
		String iname = "HLAinteractionRoot.Chat.Client.MessageSent";
		messageHandle = rtiamb.getInteractionClassHandle(iname);

		// do the publication
		rtiamb.publishInteractionClass(messageHandle);

		/////////////////////////////////////////////////////////
		// subscribe to the FoodServed.DrinkServed interaction //
		/////////////////////////////////////////////////////////
		// we also want to receive other interaction of the same type that are
		// sent out by other federates, so we have to subscribe to it first
		rtiamb.subscribeInteractionClass(messageHandle);
	}

	/**
	 * This method will register an instance of the Soda class and will return the
	 * federation-wide unique handle for that instance. Later in the simulation, we
	 * will update the attribute values for this instance
	 */
	private ObjectInstanceHandle registerObject() throws RTIexception {
		return rtiamb.registerObjectInstance(chatHandle);
	}

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

	/**
	 * This method will attempt to delete the object instance of the given handle.
	 * We can only delete objects we created, or for which we own the
	 * privilegeToDelete attribute.
	 */
	private void deleteObject(ObjectInstanceHandle handle) throws RTIexception {
		rtiamb.deleteObjectInstance(handle, generateTag());
	}

	private short getTimeAsShort() {
		return (short) fedamb.federateTime;
	}

	private byte[] generateTag() {
		return ("(timestamp) " + System.currentTimeMillis()).getBytes();
	}

}