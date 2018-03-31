/*
 *   Die Implementierung basiert auf dem Restaurant Beipsiel von The Portico Project
 *
 */
package edu.kit.ipd.sdq.modsim.hla.example.game.client;

import hla.rti1516e.AttributeHandleValueMap;
import hla.rti1516e.FederateHandleSet;
import hla.rti1516e.InteractionClassHandle;
import hla.rti1516e.LogicalTime;
import hla.rti1516e.NullFederateAmbassador;
import hla.rti1516e.ObjectClassHandle;
import hla.rti1516e.ObjectInstanceHandle;
import hla.rti1516e.OrderType;
import hla.rti1516e.ParameterHandleValueMap;
import hla.rti1516e.SynchronizationPointFailureReason;
import hla.rti1516e.TransportationTypeHandle;
import hla.rti1516e.exceptions.FederateInternalError;
import hla.rti1516e.time.HLAfloat64Time;

public class GameClientFederateAmbassador extends NullFederateAmbassador {

	protected double federateTime = 0.0;
	protected double federateLookahead = 1.0;

	protected boolean isRegulating = false;
	protected boolean isConstrained = false;
	protected boolean isAdvancing = false;

	protected boolean isAnnounced = false;
	protected boolean isReadyToRun = false;


	private void log(String message) {
		System.out.println("FederateAmbassador: " + message);
	}

	@Override
	public void synchronizationPointRegistrationFailed(String label, SynchronizationPointFailureReason reason) {
		log("Failed to register sync point: " + label + ", reason=" + reason);
	}

	@Override
	public void synchronizationPointRegistrationSucceeded(String label) {
		log("Successfully registered sync point: " + label);
	}

	@Override
	public void announceSynchronizationPoint(String label, byte[] tag) {
		log("Synchronization point announced: " + label);
		if (label.equals(GameClientFederate.READY_TO_RUN))
			this.isAnnounced = true;
	}

	@Override
	public void federationSynchronized(String label, FederateHandleSet failed) {
		log("Federation Synchronized: " + label);
		if (label.equals(GameClientFederate.READY_TO_RUN))
			this.isReadyToRun = true;
	}

	@Override
	public void timeRegulationEnabled(LogicalTime time) {
		this.federateTime = ((HLAfloat64Time) time).getValue();
		this.isRegulating = true;
	}

	@Override
	public void timeConstrainedEnabled(LogicalTime time) {
		this.federateTime = ((HLAfloat64Time) time).getValue();
		this.isConstrained = true;
	}

	@Override
	public void timeAdvanceGrant(LogicalTime time) {
		this.federateTime = ((HLAfloat64Time) time).getValue();
		this.isAdvancing = false;
	}

	@Override
	public void discoverObjectInstance(ObjectInstanceHandle theObject, ObjectClassHandle theObjectClass,
			String objectName) throws FederateInternalError {
		log("Discoverd Object: handle=" + theObject + ", classHandle=" + theObjectClass + ", name=" + objectName);
	}

	@Override
	public void reflectAttributeValues(ObjectInstanceHandle theObject, AttributeHandleValueMap theAttributes,
			byte[] tag, OrderType sentOrder, TransportationTypeHandle transport, SupplementalReflectInfo reflectInfo)
			throws FederateInternalError {
		reflectAttributeValues(theObject, theAttributes, tag, sentOrder, transport, null, sentOrder, reflectInfo);
	}

	@Override
	public void reflectAttributeValues(ObjectInstanceHandle theObject, AttributeHandleValueMap theAttributes,
			byte[] tag, OrderType sentOrdering, TransportationTypeHandle theTransport, LogicalTime time,
			OrderType receivedOrdering, SupplementalReflectInfo reflectInfo) throws FederateInternalError {
		log("Diese Federate unterstützt keine Objekte bzw. Attribute.");

	}

	@Override
	public void receiveInteraction(InteractionClassHandle interactionClass, ParameterHandleValueMap theParameters,
			byte[] tag, OrderType sentOrdering, TransportationTypeHandle theTransport,
			SupplementalReceiveInfo receiveInfo) throws FederateInternalError {
		this.receiveInteraction(interactionClass, theParameters, tag, sentOrdering, theTransport, null, sentOrdering,
				receiveInfo);
	}

	@Override
	public void receiveInteraction(InteractionClassHandle interactionClass, ParameterHandleValueMap theParameters,
			byte[] tag, OrderType sentOrdering, TransportationTypeHandle theTransport, LogicalTime time,
			OrderType receivedOrdering, SupplementalReceiveInfo receiveInfo) throws FederateInternalError {

		log("Diese Federate muss keine Interaktion empfangen.");
	}

	@Override
	public void removeObjectInstance(ObjectInstanceHandle theObject, byte[] tag, OrderType sentOrdering,
			SupplementalRemoveInfo removeInfo) throws FederateInternalError {
		log("Object Removed: handle=" + theObject);
	}

}
