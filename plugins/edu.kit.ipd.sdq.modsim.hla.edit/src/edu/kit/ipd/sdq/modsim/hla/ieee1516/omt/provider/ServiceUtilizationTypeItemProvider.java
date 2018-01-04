/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceUtilizationTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUtilizationTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdtagPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Idtag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdtagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceUtilizationType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceUtilizationType_idtag_feature", "_UI_ServiceUtilizationType_type"),
				 OmtPackage.eINSTANCE.getServiceUtilizationType_Idtag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceUtilizationType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceUtilizationType_notes_feature", "_UI_ServiceUtilizationType_type"),
				 OmtPackage.eINSTANCE.getServiceUtilizationType_Notes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_Connect());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_Disconnect());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConnectionLost());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_CreateFederationExecution());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DestroyFederationExecution());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ListFederationExecutions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportFederationExecutions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_JoinFederationExecution());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ResignFederationExecution());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterFederationSynchronizationPoint());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmSynchronizationPointRegistration());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AnnounceSynchronizationPoint());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SynchronizationPointAchieved());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSynchronized());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestFederationSave());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_InitiateFederateSave());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateSaveBegun());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateSaveComplete());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSaved());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AbortFederationSave());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryFederationSaveStatus());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSaveStatusResponse());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestFederationRestore());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmFederationRestorationRequest());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestoreBegun());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_InitiateFederateRestore());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateRestoreComplete());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestored());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AbortFederationRestore());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryFederationRestoreStatus());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestoreStatusResponse());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_PublishObjectClassAttributes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnpublishObjectClassAttributes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_PublishInteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnpublishInteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_StartRegistrationForObjectClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_StopRegistrationForObjectClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnInteractionsOn());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnInteractionsOff());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReserveObjectInstanceName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ObjectInstanceNameReserved());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReleaseObjectInstanceName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReserveMultipleObjectInstanceNames());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_MultipleObjectInstanceNamesReserved());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReleaseMultipleObjectInstanceNames());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DiscoverObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UpdateAttributeValues());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReflectAttributeValues());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SendInteraction());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReceiveInteraction());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DeleteObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_Removeobjectinstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_LocalDeleteObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributesInScope());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributesOutOfScope());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdate());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ProvideAttributeValueUpdate());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnUpdatesOnForObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnUpdatesOffForObjectInstance());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeTransportationTypeChange());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmAttributeTransportationTypeChange());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryAttributeTransportationType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportAttributeTransportationType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestInteractionTransportationTypeChange());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmInteractionTransportationTypeChange());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryInteractionTransportationType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportInteractionTransportationType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipAssumption());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestDivestitureConfirmation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmDivestiture());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionNotification());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisition());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipUnavailable());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipRelease());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipReleaseDenied());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_CancelAttributeOwnershipAcquisition());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryAttributeOwnership());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_InformAttributeOwnership());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_IsAttributeOwnedByFederate());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableTimeRegulation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeRegulationEnabled());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableTimeRegulation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableTimeConstrained());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeConstrainedEnabled());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableTimeConstrained());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequest());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequestAvailable());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_NextMessageRequest());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_NextMessageRequestAvailable());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_FlushQueueRequest());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceGrant());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAsynchronousDelivery());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAsynchronousDelivery());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryGALT());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLogicalTime());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLITS());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ModifyLookahead());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLookahead());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_Retract());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestRetraction());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ChangeAttributeOrderType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_ChangeInteractionOrderType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_CreateRegion());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_CommitRegionModifications());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DeleteRegion());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterObjectInstanceWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AssociateRegionsForUpdates());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnassociateRegionsForUpdates());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClassWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClassWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SendInteractionWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdateWithRegions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAutomaticResignDirective());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SetAutomaticResignDirective());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetFederateHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetFederateName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectClassHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectClassName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetKnownObjectClassHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectInstanceHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectInstanceName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAttributeHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAttributeName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetUpdateRateValue());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetUpdateRateValueForAttribute());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetInteractionClassHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetInteractionClassName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetParameterHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetParameterName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetOrderType());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetOrderName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetTransportationTypeHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetTransportationTypeName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForClassAttribute());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForInteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionName());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionUpperBound());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionHandleSet());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_GetRangeBounds());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_SetRangeBounds());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_NormalizeFederateHandle());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_NormalizeServiceGroup());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EvokeCallback());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EvokeMultipleCallbacks());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableCallbacks());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableCallbacks());
			childrenFeatures.add(OmtPackage.eINSTANCE.getServiceUtilizationType_AnyAttribute());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceUtilizationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceUtilizationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceUtilizationType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceUtilizationType_type") :
			getString("_UI_ServiceUtilizationType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServiceUtilizationType.class)) {
			case OmtPackage.SERVICE_UTILIZATION_TYPE__IDTAG:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONNECT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISCONNECT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__RETRACT:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
			case OmtPackage.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_Connect(),
				 OmtFactory.eINSTANCE.createConnectType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_Disconnect(),
				 OmtFactory.eINSTANCE.createDisconnectType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConnectionLost(),
				 OmtFactory.eINSTANCE.createConnectionLostType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_CreateFederationExecution(),
				 OmtFactory.eINSTANCE.createCreateFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DestroyFederationExecution(),
				 OmtFactory.eINSTANCE.createDestroyFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ListFederationExecutions(),
				 OmtFactory.eINSTANCE.createListFederationExecutionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportFederationExecutions(),
				 OmtFactory.eINSTANCE.createReportFederationExecutionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_JoinFederationExecution(),
				 OmtFactory.eINSTANCE.createJoinFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ResignFederationExecution(),
				 OmtFactory.eINSTANCE.createResignFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterFederationSynchronizationPoint(),
				 OmtFactory.eINSTANCE.createRegisterFederationSynchronizationPointType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmSynchronizationPointRegistration(),
				 OmtFactory.eINSTANCE.createConfirmSynchronizationPointRegistrationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AnnounceSynchronizationPoint(),
				 OmtFactory.eINSTANCE.createAnnounceSynchronizationPointType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SynchronizationPointAchieved(),
				 OmtFactory.eINSTANCE.createSynchronizationPointAchievedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSynchronized(),
				 OmtFactory.eINSTANCE.createFederationSynchronizedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestFederationSave(),
				 OmtFactory.eINSTANCE.createRequestFederationSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_InitiateFederateSave(),
				 OmtFactory.eINSTANCE.createInitiateFederateSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateSaveBegun(),
				 OmtFactory.eINSTANCE.createFederateSaveBegunType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateSaveComplete(),
				 OmtFactory.eINSTANCE.createFederateSaveCompleteType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSaved(),
				 OmtFactory.eINSTANCE.createFederationSavedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AbortFederationSave(),
				 OmtFactory.eINSTANCE.createAbortFederationSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryFederationSaveStatus(),
				 OmtFactory.eINSTANCE.createQueryFederationSaveStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationSaveStatusResponse(),
				 OmtFactory.eINSTANCE.createFederationSaveStatusResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestFederationRestore(),
				 OmtFactory.eINSTANCE.createRequestFederationRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmFederationRestorationRequest(),
				 OmtFactory.eINSTANCE.createConfirmFederationRestorationRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestoreBegun(),
				 OmtFactory.eINSTANCE.createFederationRestoreBegunType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_InitiateFederateRestore(),
				 OmtFactory.eINSTANCE.createInitiateFederateRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederateRestoreComplete(),
				 OmtFactory.eINSTANCE.createFederateRestoreCompleteType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestored(),
				 OmtFactory.eINSTANCE.createFederationRestoredType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AbortFederationRestore(),
				 OmtFactory.eINSTANCE.createAbortFederationRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryFederationRestoreStatus(),
				 OmtFactory.eINSTANCE.createQueryFederationRestoreStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FederationRestoreStatusResponse(),
				 OmtFactory.eINSTANCE.createFederationRestoreStatusResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_PublishObjectClassAttributes(),
				 OmtFactory.eINSTANCE.createPublishObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnpublishObjectClassAttributes(),
				 OmtFactory.eINSTANCE.createUnpublishObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_PublishInteractionClass(),
				 OmtFactory.eINSTANCE.createPublishInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnpublishInteractionClass(),
				 OmtFactory.eINSTANCE.createUnpublishInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributes(),
				 OmtFactory.eINSTANCE.createSubscribeObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributes(),
				 OmtFactory.eINSTANCE.createUnsubscribeObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClass(),
				 OmtFactory.eINSTANCE.createSubscribeInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClass(),
				 OmtFactory.eINSTANCE.createUnsubscribeInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_StartRegistrationForObjectClass(),
				 OmtFactory.eINSTANCE.createStartRegistrationForObjectClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_StopRegistrationForObjectClass(),
				 OmtFactory.eINSTANCE.createStopRegistrationForObjectClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnInteractionsOn(),
				 OmtFactory.eINSTANCE.createTurnInteractionsOnType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnInteractionsOff(),
				 OmtFactory.eINSTANCE.createTurnInteractionsOffType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReserveObjectInstanceName(),
				 OmtFactory.eINSTANCE.createReserveObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ObjectInstanceNameReserved(),
				 OmtFactory.eINSTANCE.createObjectInstanceNameReservedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReleaseObjectInstanceName(),
				 OmtFactory.eINSTANCE.createReleaseObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReserveMultipleObjectInstanceNames(),
				 OmtFactory.eINSTANCE.createReserveMultipleObjectInstanceNamesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_MultipleObjectInstanceNamesReserved(),
				 OmtFactory.eINSTANCE.createMultipleObjectInstanceNamesReservedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReleaseMultipleObjectInstanceNames(),
				 OmtFactory.eINSTANCE.createReleaseMultipleObjectInstanceNamesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterObjectInstance(),
				 OmtFactory.eINSTANCE.createRegisterObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DiscoverObjectInstance(),
				 OmtFactory.eINSTANCE.createDiscoverObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UpdateAttributeValues(),
				 OmtFactory.eINSTANCE.createUpdateAttributeValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReflectAttributeValues(),
				 OmtFactory.eINSTANCE.createReflectAttributeValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SendInteraction(),
				 OmtFactory.eINSTANCE.createSendInteractionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReceiveInteraction(),
				 OmtFactory.eINSTANCE.createReceiveInteractionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DeleteObjectInstance(),
				 OmtFactory.eINSTANCE.createDeleteObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_Removeobjectinstance(),
				 OmtFactory.eINSTANCE.createRemoveobjectinstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_LocalDeleteObjectInstance(),
				 OmtFactory.eINSTANCE.createLocalDeleteObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributesInScope(),
				 OmtFactory.eINSTANCE.createAttributesInScopeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributesOutOfScope(),
				 OmtFactory.eINSTANCE.createAttributesOutOfScopeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdate(),
				 OmtFactory.eINSTANCE.createRequestAttributeValueUpdateType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ProvideAttributeValueUpdate(),
				 OmtFactory.eINSTANCE.createProvideAttributeValueUpdateType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnUpdatesOnForObjectInstance(),
				 OmtFactory.eINSTANCE.createTurnUpdatesOnForObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TurnUpdatesOffForObjectInstance(),
				 OmtFactory.eINSTANCE.createTurnUpdatesOffForObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeTransportationTypeChange(),
				 OmtFactory.eINSTANCE.createRequestAttributeTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmAttributeTransportationTypeChange(),
				 OmtFactory.eINSTANCE.createConfirmAttributeTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryAttributeTransportationType(),
				 OmtFactory.eINSTANCE.createQueryAttributeTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportAttributeTransportationType(),
				 OmtFactory.eINSTANCE.createReportAttributeTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestInteractionTransportationTypeChange(),
				 OmtFactory.eINSTANCE.createRequestInteractionTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmInteractionTransportationTypeChange(),
				 OmtFactory.eINSTANCE.createConfirmInteractionTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryInteractionTransportationType(),
				 OmtFactory.eINSTANCE.createQueryInteractionTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ReportInteractionTransportationType(),
				 OmtFactory.eINSTANCE.createReportInteractionTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture(),
				 OmtFactory.eINSTANCE.createUnconditionalAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture(),
				 OmtFactory.eINSTANCE.createNegotiatedAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipAssumption(),
				 OmtFactory.eINSTANCE.createRequestAttributeOwnershipAssumptionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestDivestitureConfirmation(),
				 OmtFactory.eINSTANCE.createRequestDivestitureConfirmationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmDivestiture(),
				 OmtFactory.eINSTANCE.createConfirmDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionNotification(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipAcquisitionNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisition(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipAcquisitionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipAcquisitionIfAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipUnavailable(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipUnavailableType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipRelease(),
				 OmtFactory.eINSTANCE.createRequestAttributeOwnershipReleaseType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipReleaseDenied(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipReleaseDeniedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted(),
				 OmtFactory.eINSTANCE.createAttributeOwnershipDivestitureIfWantedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture(),
				 OmtFactory.eINSTANCE.createCancelNegotiatedAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_CancelAttributeOwnershipAcquisition(),
				 OmtFactory.eINSTANCE.createCancelAttributeOwnershipAcquisitionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation(),
				 OmtFactory.eINSTANCE.createConfirmAttributeOwnershipAcquisitionCancellationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryAttributeOwnership(),
				 OmtFactory.eINSTANCE.createQueryAttributeOwnershipType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_InformAttributeOwnership(),
				 OmtFactory.eINSTANCE.createInformAttributeOwnershipType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_IsAttributeOwnedByFederate(),
				 OmtFactory.eINSTANCE.createIsAttributeOwnedByFederateType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableTimeRegulation(),
				 OmtFactory.eINSTANCE.createEnableTimeRegulationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeRegulationEnabled(),
				 OmtFactory.eINSTANCE.createTimeRegulationEnabledType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableTimeRegulation(),
				 OmtFactory.eINSTANCE.createDisableTimeRegulationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableTimeConstrained(),
				 OmtFactory.eINSTANCE.createEnableTimeConstrainedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeConstrainedEnabled(),
				 OmtFactory.eINSTANCE.createTimeConstrainedEnabledType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableTimeConstrained(),
				 OmtFactory.eINSTANCE.createDisableTimeConstrainedType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequest(),
				 OmtFactory.eINSTANCE.createTimeAdvanceRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequestAvailable(),
				 OmtFactory.eINSTANCE.createTimeAdvanceRequestAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_NextMessageRequest(),
				 OmtFactory.eINSTANCE.createNextMessageRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_NextMessageRequestAvailable(),
				 OmtFactory.eINSTANCE.createNextMessageRequestAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_FlushQueueRequest(),
				 OmtFactory.eINSTANCE.createFlushQueueRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_TimeAdvanceGrant(),
				 OmtFactory.eINSTANCE.createTimeAdvanceGrantType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAsynchronousDelivery(),
				 OmtFactory.eINSTANCE.createEnableAsynchronousDeliveryType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAsynchronousDelivery(),
				 OmtFactory.eINSTANCE.createDisableAsynchronousDeliveryType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryGALT(),
				 OmtFactory.eINSTANCE.createQueryGALTType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLogicalTime(),
				 OmtFactory.eINSTANCE.createQueryLogicalTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLITS(),
				 OmtFactory.eINSTANCE.createQueryLITSType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ModifyLookahead(),
				 OmtFactory.eINSTANCE.createModifyLookaheadType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_QueryLookahead(),
				 OmtFactory.eINSTANCE.createQueryLookaheadType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_Retract(),
				 OmtFactory.eINSTANCE.createRetractType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestRetraction(),
				 OmtFactory.eINSTANCE.createRequestRetractionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ChangeAttributeOrderType(),
				 OmtFactory.eINSTANCE.createChangeAttributeOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_ChangeInteractionOrderType(),
				 OmtFactory.eINSTANCE.createChangeInteractionOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_CreateRegion(),
				 OmtFactory.eINSTANCE.createCreateRegionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_CommitRegionModifications(),
				 OmtFactory.eINSTANCE.createCommitRegionModificationsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DeleteRegion(),
				 OmtFactory.eINSTANCE.createDeleteRegionType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RegisterObjectInstanceWithRegions(),
				 OmtFactory.eINSTANCE.createRegisterObjectInstanceWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_AssociateRegionsForUpdates(),
				 OmtFactory.eINSTANCE.createAssociateRegionsForUpdatesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnassociateRegionsForUpdates(),
				 OmtFactory.eINSTANCE.createUnassociateRegionsForUpdatesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions(),
				 OmtFactory.eINSTANCE.createSubscribeObjectClassAttributesWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions(),
				 OmtFactory.eINSTANCE.createUnsubscribeObjectClassAttributesWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClassWithRegions(),
				 OmtFactory.eINSTANCE.createSubscribeInteractionClassWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClassWithRegions(),
				 OmtFactory.eINSTANCE.createUnsubscribeInteractionClassWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SendInteractionWithRegions(),
				 OmtFactory.eINSTANCE.createSendInteractionWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdateWithRegions(),
				 OmtFactory.eINSTANCE.createRequestAttributeValueUpdateWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAutomaticResignDirective(),
				 OmtFactory.eINSTANCE.createGetAutomaticResignDirectiveType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SetAutomaticResignDirective(),
				 OmtFactory.eINSTANCE.createSetAutomaticResignDirectiveType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetFederateHandle(),
				 OmtFactory.eINSTANCE.createGetFederateHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetFederateName(),
				 OmtFactory.eINSTANCE.createGetFederateNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectClassHandle(),
				 OmtFactory.eINSTANCE.createGetObjectClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectClassName(),
				 OmtFactory.eINSTANCE.createGetObjectClassNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetKnownObjectClassHandle(),
				 OmtFactory.eINSTANCE.createGetKnownObjectClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectInstanceHandle(),
				 OmtFactory.eINSTANCE.createGetObjectInstanceHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetObjectInstanceName(),
				 OmtFactory.eINSTANCE.createGetObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAttributeHandle(),
				 OmtFactory.eINSTANCE.createGetAttributeHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAttributeName(),
				 OmtFactory.eINSTANCE.createGetAttributeNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetUpdateRateValue(),
				 OmtFactory.eINSTANCE.createGetUpdateRateValueType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetUpdateRateValueForAttribute(),
				 OmtFactory.eINSTANCE.createGetUpdateRateValueForAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetInteractionClassHandle(),
				 OmtFactory.eINSTANCE.createGetInteractionClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetInteractionClassName(),
				 OmtFactory.eINSTANCE.createGetInteractionClassNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetParameterHandle(),
				 OmtFactory.eINSTANCE.createGetParameterHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetParameterName(),
				 OmtFactory.eINSTANCE.createGetParameterNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetOrderType(),
				 OmtFactory.eINSTANCE.createGetOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetOrderName(),
				 OmtFactory.eINSTANCE.createGetOrderNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetTransportationTypeHandle(),
				 OmtFactory.eINSTANCE.createGetTransportationTypeHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetTransportationTypeName(),
				 OmtFactory.eINSTANCE.createGetTransportationTypeNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForClassAttribute(),
				 OmtFactory.eINSTANCE.createGetAvailableDimensionsForClassAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForInteractionClass(),
				 OmtFactory.eINSTANCE.createGetAvailableDimensionsForInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionHandle(),
				 OmtFactory.eINSTANCE.createGetDimensionHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionName(),
				 OmtFactory.eINSTANCE.createGetDimensionNameType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionUpperBound(),
				 OmtFactory.eINSTANCE.createGetDimensionUpperBoundType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetDimensionHandleSet(),
				 OmtFactory.eINSTANCE.createGetDimensionHandleSetType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_GetRangeBounds(),
				 OmtFactory.eINSTANCE.createGetRangeBoundsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_SetRangeBounds(),
				 OmtFactory.eINSTANCE.createSetRangeBoundsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_NormalizeFederateHandle(),
				 OmtFactory.eINSTANCE.createNormalizeFederateHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_NormalizeServiceGroup(),
				 OmtFactory.eINSTANCE.createNormalizeServiceGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createEnableObjectClassRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createDisableObjectClassRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createEnableAttributeRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createDisableAttributeRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createEnableAttributeScopeAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createDisableAttributeScopeAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createEnableInteractionRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch(),
				 OmtFactory.eINSTANCE.createDisableInteractionRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EvokeCallback(),
				 OmtFactory.eINSTANCE.createEvokeCallbackType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EvokeMultipleCallbacks(),
				 OmtFactory.eINSTANCE.createEvokeMultipleCallbacksType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_EnableCallbacks(),
				 OmtFactory.eINSTANCE.createEnableCallbacksType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getServiceUtilizationType_DisableCallbacks(),
				 OmtFactory.eINSTANCE.createDisableCallbacksType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Hla_metamodelEditPlugin.INSTANCE;
	}

}
