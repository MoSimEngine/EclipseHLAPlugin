/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AlternativeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AnnounceSynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ApplicationDomainEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ApplicationDomainType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDatatypeEncodingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AssociateRegionsForUpdatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionIfAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionNotificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipDivestitureIfWantedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipReleaseDeniedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipUnavailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesInScopeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesOutOfScopeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataRepresentationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelAttributeOwnershipAcquisitionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelNegotiatedAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CapabilityEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CapabilityType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CardinalityType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeAttributeOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeInteractionOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CommitRegionModificationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmFederationRestorationRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmInteractionTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmSynchronizationPointRegistrationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectionLostType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateRegionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteRegionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DestroyFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType2;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAsynchronousDeliveryType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeScopeAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableInteractionRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableObjectClassRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeConstrainedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeRegulationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisconnectType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DiscoverObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DocumentRoot;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAsynchronousDeliveryType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeScopeAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableInteractionRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableObjectClassRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeConstrainedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeRegulationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratorType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeCallbackType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeMultipleCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateRestoreCompleteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveBegunType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveCompleteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreBegunType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreStatusResponseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoredType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSaveStatusResponseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSavedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSynchronizedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FieldType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordEncodingEnumeration;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordEncodingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FlushQueueRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAutomaticResignDirectiveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForClassAttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleSetType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionUpperBoundType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetKnownObjectClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetRangeBoundsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueForAttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphTypeEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdReferenceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentifierType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InformAttributeOwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IsAttributeOwnedByFederateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.JoinFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ListFederationExecutionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LocalDeleteObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModificationDateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModifyLookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.MultipleObjectInstanceNamesReservedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NegotiatedAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NonEmptyString1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeFederateHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeServiceGroupType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NoteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NotesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OMTypeEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectInstanceNameReservedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.POCTypeEnumeration;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ProvideAttributeValueUpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeOwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationRestoreStatusType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationSaveStatusType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryGALTType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryInteractionTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLITSType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLogicalTimeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReceiveInteractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReferenceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReflectAttributeValuesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterFederationSynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseMultipleObjectInstanceNamesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReliableEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReliableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RemoveobjectinstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportAttributeTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportFederationExecutionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportInteractionTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipAssumptionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipReleaseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestDivestitureConfirmationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestInteractionTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestRetractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveMultipleObjectInstanceNamesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignActionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignSwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RetractType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationEnumeration;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetAutomaticResignDirectiveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetRangeBoundsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SharingEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SharingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.Size;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StartRegistrationForObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StopRegistrationForObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointAchievedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceGrantType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeConstrainedEnabledType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeRegulationEnabledType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeStampType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOffType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOnType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOffForObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOnForObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnassociateRegionsForUpdatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnconditionalAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateAttributeValuesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateEnumerations;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpperBoundType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ValueType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingEnumerator;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmtFactoryImpl extends EFactoryImpl implements OmtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OmtFactory init() {
		try {
			OmtFactory theOmtFactory = (OmtFactory)EPackage.Registry.INSTANCE.getEFactory(OmtPackage.eNS_URI);
			if (theOmtFactory != null) {
				return theOmtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OmtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OmtPackage.UPDATE_RATES_TYPE: return createUpdateRatesType();
			case OmtPackage.UPDATE_RATE_TYPE: return createUpdateRateType();
			case OmtPackage.UPDATE_TYPE: return createUpdateType();
			case OmtPackage.UPPER_BOUND_TYPE: return createUpperBoundType();
			case OmtPackage.VALUE_TYPE: return createValueType();
			case OmtPackage.VARIANT_RECORD_DATA_TYPE: return createVariantRecordDataType();
			case OmtPackage.VARIANT_RECORD_DATA_TYPE1: return createVariantRecordDataType1();
			case OmtPackage.VARIANT_RECORD_DATA_TYPES_TYPE: return createVariantRecordDataTypesType();
			case OmtPackage.VARIANT_RECORD_ENCODING_TYPE: return createVariantRecordEncodingType();
			case OmtPackage.UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createUnconditionalAttributeOwnershipDivestitureType();
			case OmtPackage.UNPUBLISH_INTERACTION_CLASS_TYPE: return createUnpublishInteractionClassType();
			case OmtPackage.UNPUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: return createUnpublishObjectClassAttributesType();
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_TYPE: return createUnsubscribeInteractionClassType();
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: return createUnsubscribeInteractionClassWithRegionsType();
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: return createUnsubscribeObjectClassAttributesType();
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: return createUnsubscribeObjectClassAttributesWithRegionsType();
			case OmtPackage.UPDATE_ATTRIBUTE_VALUES_TYPE: return createUpdateAttributeValuesType();
			case OmtPackage.TIME_STAMP_TYPE: return createTimeStampType();
			case OmtPackage.TIME_TYPE: return createTimeType();
			case OmtPackage.TRANSPORTATIONS_TYPE: return createTransportationsType();
			case OmtPackage.TRANSPORTATION_TYPE: return createTransportationType();
			case OmtPackage.TRANSPORTATION_TYPE1: return createTransportationType1();
			case OmtPackage.TURN_INTERACTIONS_OFF_TYPE: return createTurnInteractionsOffType();
			case OmtPackage.TURN_INTERACTIONS_ON_TYPE: return createTurnInteractionsOnType();
			case OmtPackage.TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE_TYPE: return createTurnUpdatesOffForObjectInstanceType();
			case OmtPackage.TURN_UPDATES_ON_FOR_OBJECT_INSTANCE_TYPE: return createTurnUpdatesOnForObjectInstanceType();
			case OmtPackage.TYPE_TYPE: return createTypeType();
			case OmtPackage.UNASSOCIATE_REGIONS_FOR_UPDATES_TYPE: return createUnassociateRegionsForUpdatesType();
			case OmtPackage.SWITCH_TYPE: return createSwitchType();
			case OmtPackage.SYNCHRONIZATION_POINT_ACHIEVED_TYPE: return createSynchronizationPointAchievedType();
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE: return createSynchronizationPointType();
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE1: return createSynchronizationPointType1();
			case OmtPackage.SYNCHRONIZATIONS_TYPE: return createSynchronizationsType();
			case OmtPackage.TAGS_TYPE: return createTagsType();
			case OmtPackage.TAG_TYPE: return createTagType();
			case OmtPackage.TIME_ADVANCE_GRANT_TYPE: return createTimeAdvanceGrantType();
			case OmtPackage.TIME_ADVANCE_REQUEST_AVAILABLE_TYPE: return createTimeAdvanceRequestAvailableType();
			case OmtPackage.TIME_ADVANCE_REQUEST_TYPE: return createTimeAdvanceRequestType();
			case OmtPackage.TIME_CONSTRAINED_ENABLED_TYPE: return createTimeConstrainedEnabledType();
			case OmtPackage.TIME_REGULATION_ENABLED_TYPE: return createTimeRegulationEnabledType();
			case OmtPackage.SHARING_TYPE: return createSharingType();
			case OmtPackage.SIMPLE_DATA_TYPE: return createSimpleDataType();
			case OmtPackage.SIMPLE_DATA_TYPE1: return createSimpleDataType1();
			case OmtPackage.SIMPLE_DATA_TYPES_TYPE: return createSimpleDataTypesType();
			case OmtPackage.SIZE: return createSize();
			case OmtPackage.START_REGISTRATION_FOR_OBJECT_CLASS_TYPE: return createStartRegistrationForObjectClassType();
			case OmtPackage.STOP_REGISTRATION_FOR_OBJECT_CLASS_TYPE: return createStopRegistrationForObjectClassType();
			case OmtPackage.STRING: return createString();
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_TYPE: return createSubscribeInteractionClassType();
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: return createSubscribeInteractionClassWithRegionsType();
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: return createSubscribeObjectClassAttributesType();
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: return createSubscribeObjectClassAttributesWithRegionsType();
			case OmtPackage.SWITCHES_TYPE: return createSwitchesType();
			case OmtPackage.RESERVE_OBJECT_INSTANCE_NAME_TYPE: return createReserveObjectInstanceNameType();
			case OmtPackage.RESIGN_FEDERATION_EXECUTION_TYPE: return createResignFederationExecutionType();
			case OmtPackage.RESIGN_SWITCH_TYPE: return createResignSwitchType();
			case OmtPackage.RETRACT_TYPE: return createRetractType();
			case OmtPackage.SECURITY_CLASSIFICATION_TYPE: return createSecurityClassificationType();
			case OmtPackage.SEND_INTERACTION_TYPE: return createSendInteractionType();
			case OmtPackage.SEND_INTERACTION_WITH_REGIONS_TYPE: return createSendInteractionWithRegionsType();
			case OmtPackage.SERVICE_UTILIZATION_TYPE: return createServiceUtilizationType();
			case OmtPackage.SET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: return createSetAutomaticResignDirectiveType();
			case OmtPackage.SET_RANGE_BOUNDS_TYPE: return createSetRangeBoundsType();
			case OmtPackage.RELIABLE_TYPE: return createReliableType();
			case OmtPackage.REMOVEOBJECTINSTANCE_TYPE: return createRemoveobjectinstanceType();
			case OmtPackage.REPORT_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: return createReportAttributeTransportationTypeType();
			case OmtPackage.REPORT_FEDERATION_EXECUTIONS_TYPE: return createReportFederationExecutionsType();
			case OmtPackage.REPORT_INTERACTION_TRANSPORTATION_TYPE_TYPE: return createReportInteractionTransportationTypeType();
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION_TYPE: return createRequestAttributeOwnershipAssumptionType();
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE_TYPE: return createRequestAttributeOwnershipReleaseType();
			case OmtPackage.REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: return createRequestAttributeTransportationTypeChangeType();
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_TYPE: return createRequestAttributeValueUpdateType();
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS_TYPE: return createRequestAttributeValueUpdateWithRegionsType();
			case OmtPackage.REQUEST_DIVESTITURE_CONFIRMATION_TYPE: return createRequestDivestitureConfirmationType();
			case OmtPackage.REQUEST_FEDERATION_RESTORE_TYPE: return createRequestFederationRestoreType();
			case OmtPackage.REQUEST_FEDERATION_SAVE_TYPE: return createRequestFederationSaveType();
			case OmtPackage.REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: return createRequestInteractionTransportationTypeChangeType();
			case OmtPackage.REQUEST_RETRACTION_TYPE: return createRequestRetractionType();
			case OmtPackage.RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: return createReserveMultipleObjectInstanceNamesType();
			case OmtPackage.POC_TYPE_TYPE: return createPocTypeType();
			case OmtPackage.PROVIDE_ATTRIBUTE_VALUE_UPDATE_TYPE: return createProvideAttributeValueUpdateType();
			case OmtPackage.PUBLISH_INTERACTION_CLASS_TYPE: return createPublishInteractionClassType();
			case OmtPackage.PUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: return createPublishObjectClassAttributesType();
			case OmtPackage.QUERY_ATTRIBUTE_OWNERSHIP_TYPE: return createQueryAttributeOwnershipType();
			case OmtPackage.QUERY_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: return createQueryAttributeTransportationTypeType();
			case OmtPackage.QUERY_FEDERATION_RESTORE_STATUS_TYPE: return createQueryFederationRestoreStatusType();
			case OmtPackage.QUERY_FEDERATION_SAVE_STATUS_TYPE: return createQueryFederationSaveStatusType();
			case OmtPackage.QUERY_GALT_TYPE: return createQueryGALTType();
			case OmtPackage.QUERY_INTERACTION_TRANSPORTATION_TYPE_TYPE: return createQueryInteractionTransportationTypeType();
			case OmtPackage.QUERY_LITS_TYPE: return createQueryLITSType();
			case OmtPackage.QUERY_LOGICAL_TIME_TYPE: return createQueryLogicalTimeType();
			case OmtPackage.QUERY_LOOKAHEAD_TYPE: return createQueryLookaheadType();
			case OmtPackage.RATE_TYPE: return createRateType();
			case OmtPackage.RECEIVE_INTERACTION_TYPE: return createReceiveInteractionType();
			case OmtPackage.REFERENCE_TYPE: return createReferenceType();
			case OmtPackage.REFLECT_ATTRIBUTE_VALUES_TYPE: return createReflectAttributeValuesType();
			case OmtPackage.REGISTER_FEDERATION_SYNCHRONIZATION_POINT_TYPE: return createRegisterFederationSynchronizationPointType();
			case OmtPackage.REGISTER_OBJECT_INSTANCE_TYPE: return createRegisterObjectInstanceType();
			case OmtPackage.REGISTER_OBJECT_INSTANCE_WITH_REGIONS_TYPE: return createRegisterObjectInstanceWithRegionsType();
			case OmtPackage.RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: return createReleaseMultipleObjectInstanceNamesType();
			case OmtPackage.RELEASE_OBJECT_INSTANCE_NAME_TYPE: return createReleaseObjectInstanceNameType();
			case OmtPackage.NEXT_MESSAGE_REQUEST_TYPE: return createNextMessageRequestType();
			case OmtPackage.NON_EMPTY_STRING1: return createNonEmptyString1();
			case OmtPackage.NORMALIZE_FEDERATE_HANDLE_TYPE: return createNormalizeFederateHandleType();
			case OmtPackage.NORMALIZE_SERVICE_GROUP_TYPE: return createNormalizeServiceGroupType();
			case OmtPackage.NOTES_TYPE: return createNotesType();
			case OmtPackage.NOTE_TYPE: return createNoteType();
			case OmtPackage.OBJECT_CLASS_TYPE: return createObjectClassType();
			case OmtPackage.OBJECT_CLASS_TYPE1: return createObjectClassType1();
			case OmtPackage.OBJECT_INSTANCE_NAME_RESERVED_TYPE: return createObjectInstanceNameReservedType();
			case OmtPackage.OBJECT_MODEL_TYPE: return createObjectModelType();
			case OmtPackage.OBJECTS_TYPE: return createObjectsType();
			case OmtPackage.ORDER_TYPE: return createOrderType();
			case OmtPackage.OWNERSHIP_TYPE: return createOwnershipType();
			case OmtPackage.PARAMETER_TYPE: return createParameterType();
			case OmtPackage.PARAMETER_TYPE1: return createParameterType1();
			case OmtPackage.POC_TYPE: return createPocType();
			case OmtPackage.POC_TYPE1: return createPocType1();
			case OmtPackage.GET_OBJECT_INSTANCE_HANDLE_TYPE: return createGetObjectInstanceHandleType();
			case OmtPackage.GET_OBJECT_INSTANCE_NAME_TYPE: return createGetObjectInstanceNameType();
			case OmtPackage.GET_ORDER_NAME_TYPE: return createGetOrderNameType();
			case OmtPackage.GET_ORDER_TYPE_TYPE: return createGetOrderTypeType();
			case OmtPackage.GET_PARAMETER_HANDLE_TYPE: return createGetParameterHandleType();
			case OmtPackage.GET_PARAMETER_NAME_TYPE: return createGetParameterNameType();
			case OmtPackage.GET_RANGE_BOUNDS_TYPE: return createGetRangeBoundsType();
			case OmtPackage.GET_TRANSPORTATION_TYPE_HANDLE_TYPE: return createGetTransportationTypeHandleType();
			case OmtPackage.GET_TRANSPORTATION_TYPE_NAME_TYPE: return createGetTransportationTypeNameType();
			case OmtPackage.GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE_TYPE: return createGetUpdateRateValueForAttributeType();
			case OmtPackage.GET_UPDATE_RATE_VALUE_TYPE: return createGetUpdateRateValueType();
			case OmtPackage.GLYPH_TYPE: return createGlyphType();
			case OmtPackage.GLYPH_TYPE1: return createGlyphType1();
			case OmtPackage.IDENTIFICATION_TYPE: return createIdentificationType();
			case OmtPackage.IDENTIFIER_TYPE: return createIdentifierType();
			case OmtPackage.ID_REFERENCE_TYPE: return createIdReferenceType();
			case OmtPackage.INFORM_ATTRIBUTE_OWNERSHIP_TYPE: return createInformAttributeOwnershipType();
			case OmtPackage.INITIATE_FEDERATE_RESTORE_TYPE: return createInitiateFederateRestoreType();
			case OmtPackage.INITIATE_FEDERATE_SAVE_TYPE: return createInitiateFederateSaveType();
			case OmtPackage.INTERACTION_CLASS_TYPE: return createInteractionClassType();
			case OmtPackage.INTERACTION_CLASS_TYPE1: return createInteractionClassType1();
			case OmtPackage.INTERACTIONS_TYPE: return createInteractionsType();
			case OmtPackage.IS_ATTRIBUTE_OWNED_BY_FEDERATE_TYPE: return createIsAttributeOwnedByFederateType();
			case OmtPackage.JOIN_FEDERATION_EXECUTION_TYPE: return createJoinFederationExecutionType();
			case OmtPackage.KEYWORD_TYPE: return createKeywordType();
			case OmtPackage.LIST_FEDERATION_EXECUTIONS_TYPE: return createListFederationExecutionsType();
			case OmtPackage.LOCAL_DELETE_OBJECT_INSTANCE_TYPE: return createLocalDeleteObjectInstanceType();
			case OmtPackage.LOOKAHEAD_TYPE: return createLookaheadType();
			case OmtPackage.MODEL_IDENTIFICATION_TYPE: return createModelIdentificationType();
			case OmtPackage.MODEL_TYPE: return createModelType();
			case OmtPackage.MODIFICATION_DATE_TYPE: return createModificationDateType();
			case OmtPackage.MODIFY_LOOKAHEAD_TYPE: return createModifyLookaheadType();
			case OmtPackage.MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED_TYPE: return createMultipleObjectInstanceNamesReservedType();
			case OmtPackage.NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createNegotiatedAttributeOwnershipDivestitureType();
			case OmtPackage.NEXT_MESSAGE_REQUEST_AVAILABLE_TYPE: return createNextMessageRequestAvailableType();
			case OmtPackage.CONFIRM_DIVESTITURE_TYPE: return createConfirmDivestitureType();
			case OmtPackage.CONFIRM_FEDERATION_RESTORATION_REQUEST_TYPE: return createConfirmFederationRestorationRequestType();
			case OmtPackage.CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: return createConfirmInteractionTransportationTypeChangeType();
			case OmtPackage.CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION_TYPE: return createConfirmSynchronizationPointRegistrationType();
			case OmtPackage.CONNECTION_LOST_TYPE: return createConnectionLostType();
			case OmtPackage.CONNECT_TYPE: return createConnectType();
			case OmtPackage.CREATE_FEDERATION_EXECUTION_TYPE: return createCreateFederationExecutionType();
			case OmtPackage.CREATE_REGION_TYPE: return createCreateRegionType();
			case OmtPackage.DATA_TYPES_TYPE: return createDataTypesType();
			case OmtPackage.DELETE_OBJECT_INSTANCE_TYPE: return createDeleteObjectInstanceType();
			case OmtPackage.DELETE_REGION_TYPE: return createDeleteRegionType();
			case OmtPackage.DESTROY_FEDERATION_EXECUTION_TYPE: return createDestroyFederationExecutionType();
			case OmtPackage.DIMENSIONS_TYPE: return createDimensionsType();
			case OmtPackage.DIMENSIONS_TYPE1: return createDimensionsType1();
			case OmtPackage.DIMENSIONS_TYPE2: return createDimensionsType2();
			case OmtPackage.DIMENSION_TYPE: return createDimensionType();
			case OmtPackage.DIMENSION_TYPE1: return createDimensionType1();
			case OmtPackage.DISABLE_ASYNCHRONOUS_DELIVERY_TYPE: return createDisableAsynchronousDeliveryType();
			case OmtPackage.DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableAttributeRelevanceAdvisorySwitchType();
			case OmtPackage.DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: return createDisableAttributeScopeAdvisorySwitchType();
			case OmtPackage.DISABLE_CALLBACKS_TYPE: return createDisableCallbacksType();
			case OmtPackage.DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableInteractionRelevanceAdvisorySwitchType();
			case OmtPackage.DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableObjectClassRelevanceAdvisorySwitchType();
			case OmtPackage.DISABLE_TIME_CONSTRAINED_TYPE: return createDisableTimeConstrainedType();
			case OmtPackage.DISABLE_TIME_REGULATION_TYPE: return createDisableTimeRegulationType();
			case OmtPackage.DISCONNECT_TYPE: return createDisconnectType();
			case OmtPackage.DISCOVER_OBJECT_INSTANCE_TYPE: return createDiscoverObjectInstanceType();
			case OmtPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OmtPackage.ENABLE_ASYNCHRONOUS_DELIVERY_TYPE: return createEnableAsynchronousDeliveryType();
			case OmtPackage.ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableAttributeRelevanceAdvisorySwitchType();
			case OmtPackage.ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: return createEnableAttributeScopeAdvisorySwitchType();
			case OmtPackage.ENABLE_CALLBACKS_TYPE: return createEnableCallbacksType();
			case OmtPackage.ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableInteractionRelevanceAdvisorySwitchType();
			case OmtPackage.ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableObjectClassRelevanceAdvisorySwitchType();
			case OmtPackage.ENABLE_TIME_CONSTRAINED_TYPE: return createEnableTimeConstrainedType();
			case OmtPackage.ENABLE_TIME_REGULATION_TYPE: return createEnableTimeRegulationType();
			case OmtPackage.ENDIAN_TYPE: return createEndianType();
			case OmtPackage.ENUMERATED_DATA_TYPE: return createEnumeratedDataType();
			case OmtPackage.ENUMERATED_DATA_TYPE1: return createEnumeratedDataType1();
			case OmtPackage.ENUMERATED_DATA_TYPES_TYPE: return createEnumeratedDataTypesType();
			case OmtPackage.ENUMERATOR_TYPE: return createEnumeratorType();
			case OmtPackage.EVOKE_CALLBACK_TYPE: return createEvokeCallbackType();
			case OmtPackage.EVOKE_MULTIPLE_CALLBACKS_TYPE: return createEvokeMultipleCallbacksType();
			case OmtPackage.FEDERATE_RESTORE_COMPLETE_TYPE: return createFederateRestoreCompleteType();
			case OmtPackage.FEDERATE_SAVE_BEGUN_TYPE: return createFederateSaveBegunType();
			case OmtPackage.FEDERATE_SAVE_COMPLETE_TYPE: return createFederateSaveCompleteType();
			case OmtPackage.FEDERATION_RESTORE_BEGUN_TYPE: return createFederationRestoreBegunType();
			case OmtPackage.FEDERATION_RESTORED_TYPE: return createFederationRestoredType();
			case OmtPackage.FEDERATION_RESTORE_STATUS_RESPONSE_TYPE: return createFederationRestoreStatusResponseType();
			case OmtPackage.FEDERATION_SAVED_TYPE: return createFederationSavedType();
			case OmtPackage.FEDERATION_SAVE_STATUS_RESPONSE_TYPE: return createFederationSaveStatusResponseType();
			case OmtPackage.FEDERATION_SYNCHRONIZED_TYPE: return createFederationSynchronizedType();
			case OmtPackage.FIELD_TYPE: return createFieldType();
			case OmtPackage.FIXED_RECORD_DATA_TYPE: return createFixedRecordDataType();
			case OmtPackage.FIXED_RECORD_DATA_TYPE1: return createFixedRecordDataType1();
			case OmtPackage.FIXED_RECORD_DATA_TYPES_TYPE: return createFixedRecordDataTypesType();
			case OmtPackage.FIXED_RECORD_ENCODING_TYPE: return createFixedRecordEncodingType();
			case OmtPackage.FLUSH_QUEUE_REQUEST_TYPE: return createFlushQueueRequestType();
			case OmtPackage.GET_ATTRIBUTE_HANDLE_TYPE: return createGetAttributeHandleType();
			case OmtPackage.GET_ATTRIBUTE_NAME_TYPE: return createGetAttributeNameType();
			case OmtPackage.GET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: return createGetAutomaticResignDirectiveType();
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE_TYPE: return createGetAvailableDimensionsForClassAttributeType();
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS_TYPE: return createGetAvailableDimensionsForInteractionClassType();
			case OmtPackage.GET_DIMENSION_HANDLE_SET_TYPE: return createGetDimensionHandleSetType();
			case OmtPackage.GET_DIMENSION_HANDLE_TYPE: return createGetDimensionHandleType();
			case OmtPackage.GET_DIMENSION_NAME_TYPE: return createGetDimensionNameType();
			case OmtPackage.GET_DIMENSION_UPPER_BOUND_TYPE: return createGetDimensionUpperBoundType();
			case OmtPackage.GET_FEDERATE_HANDLE_TYPE: return createGetFederateHandleType();
			case OmtPackage.GET_FEDERATE_NAME_TYPE: return createGetFederateNameType();
			case OmtPackage.GET_INTERACTION_CLASS_HANDLE_TYPE: return createGetInteractionClassHandleType();
			case OmtPackage.GET_INTERACTION_CLASS_NAME_TYPE: return createGetInteractionClassNameType();
			case OmtPackage.GET_KNOWN_OBJECT_CLASS_HANDLE_TYPE: return createGetKnownObjectClassHandleType();
			case OmtPackage.GET_OBJECT_CLASS_HANDLE_TYPE: return createGetObjectClassHandleType();
			case OmtPackage.GET_OBJECT_CLASS_NAME_TYPE: return createGetObjectClassNameType();
			case OmtPackage.ABORT_FEDERATION_RESTORE_TYPE: return createAbortFederationRestoreType();
			case OmtPackage.ABORT_FEDERATION_SAVE_TYPE: return createAbortFederationSaveType();
			case OmtPackage.ALTERNATIVE_TYPE: return createAlternativeType();
			case OmtPackage.ANNOUNCE_SYNCHRONIZATION_POINT_TYPE: return createAnnounceSynchronizationPointType();
			case OmtPackage.APPLICATION_DOMAIN_TYPE: return createApplicationDomainType();
			case OmtPackage.ARRAY_DATA_TYPE: return createArrayDataType();
			case OmtPackage.ARRAY_DATA_TYPE1: return createArrayDataType1();
			case OmtPackage.ARRAY_DATATYPE_ENCODING_TYPE: return createArrayDatatypeEncodingType();
			case OmtPackage.ARRAY_DATA_TYPES_TYPE: return createArrayDataTypesType();
			case OmtPackage.ARRAY_DATA_TYPES_TYPE1: return createArrayDataTypesType1();
			case OmtPackage.ASSOCIATE_REGIONS_FOR_UPDATES_TYPE: return createAssociateRegionsForUpdatesType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE_TYPE: return createAttributeOwnershipAcquisitionIfAvailableType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION_TYPE: return createAttributeOwnershipAcquisitionNotificationType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: return createAttributeOwnershipAcquisitionType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED_TYPE: return createAttributeOwnershipDivestitureIfWantedType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_RELEASE_DENIED_TYPE: return createAttributeOwnershipReleaseDeniedType();
			case OmtPackage.ATTRIBUTE_OWNERSHIP_UNAVAILABLE_TYPE: return createAttributeOwnershipUnavailableType();
			case OmtPackage.ATTRIBUTES_IN_SCOPE_TYPE: return createAttributesInScopeType();
			case OmtPackage.ATTRIBUTES_OUT_OF_SCOPE_TYPE: return createAttributesOutOfScopeType();
			case OmtPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case OmtPackage.ATTRIBUTE_TYPE1: return createAttributeType1();
			case OmtPackage.BASIC_DATA_REPRESENTATIONS_TYPE: return createBasicDataRepresentationsType();
			case OmtPackage.BASIC_DATA_TYPE: return createBasicDataType();
			case OmtPackage.BASIC_DATA_TYPE1: return createBasicDataType1();
			case OmtPackage.CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: return createCancelAttributeOwnershipAcquisitionType();
			case OmtPackage.CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createCancelNegotiatedAttributeOwnershipDivestitureType();
			case OmtPackage.CAPABILITY_TYPE: return createCapabilityType();
			case OmtPackage.CARDINALITY_TYPE: return createCardinalityType();
			case OmtPackage.CHANGE_ATTRIBUTE_ORDER_TYPE_TYPE: return createChangeAttributeOrderTypeType();
			case OmtPackage.CHANGE_INTERACTION_ORDER_TYPE_TYPE: return createChangeInteractionOrderTypeType();
			case OmtPackage.COMMIT_REGION_MODIFICATIONS_TYPE: return createCommitRegionModificationsType();
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE: return createConfirmAttributeOwnershipAcquisitionCancellationType();
			case OmtPackage.CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: return createConfirmAttributeTransportationTypeChangeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OmtPackage.UPDATE_ENUMERATIONS:
				return createUpdateEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR:
				return createVariantRecordEncodingEnumeratorFromString(eDataType, initialValue);
			case OmtPackage.RESIGN_ACTION_TYPE:
				return createResignActionTypeFromString(eDataType, initialValue);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION:
				return createSecurityClassificationEnumerationFromString(eDataType, initialValue);
			case OmtPackage.SHARING_ENUMERATIONS:
				return createSharingEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.RELIABLE_ENUMERATIONS:
				return createReliableEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.OM_TYPE_ENUMERATIONS:
				return createOMTypeEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.ORDER_ENUMERATIONS:
				return createOrderEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.OWNERSHIP_ENUMERATIONS:
				return createOwnershipEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.POC_TYPE_ENUMERATION:
				return createPOCTypeEnumerationFromString(eDataType, initialValue);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS:
				return createGlyphTypeEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.ENDIAN_ENUMERATIONS:
				return createEndianEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION:
				return createFixedRecordEncodingEnumerationFromString(eDataType, initialValue);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS:
				return createApplicationDomainEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.CAPABILITY_ENUMERATIONS:
				return createCapabilityEnumerationsFromString(eDataType, initialValue);
			case OmtPackage.VARIANT_RECORD_ENUMERATOR_PATTERN:
				return createVariantRecordEnumeratorPatternFromString(eDataType, initialValue);
			case OmtPackage.UPDATE_ENUMERATIONS_OBJECT:
				return createUpdateEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR_OBJECT:
				return createVariantRecordEncodingEnumeratorObjectFromString(eDataType, initialValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_UNION:
				return createVariantRecordEncodingUnionFromString(eDataType, initialValue);
			case OmtPackage.RESIGN_ACTION_TYPE_OBJECT:
				return createResignActionTypeObjectFromString(eDataType, initialValue);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION_OBJECT:
				return createSecurityClassificationEnumerationObjectFromString(eDataType, initialValue);
			case OmtPackage.SECURITY_CLASSIFICATION_UNION:
				return createSecurityClassificationUnionFromString(eDataType, initialValue);
			case OmtPackage.SHARING_ENUMERATIONS_OBJECT:
				return createSharingEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.POC_TYPE_UNION:
				return createPOCTypeUnionFromString(eDataType, initialValue);
			case OmtPackage.RELIABLE_ENUMERATIONS_OBJECT:
				return createReliableEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case OmtPackage.OM_TYPE_ENUMERATIONS_OBJECT:
				return createOMTypeEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.OM_TYPE_UNION:
				return createOMTypeUnionFromString(eDataType, initialValue);
			case OmtPackage.ORDER_ENUMERATIONS_OBJECT:
				return createOrderEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.OWNERSHIP_ENUMERATIONS_OBJECT:
				return createOwnershipEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.POC_TYPE_ENUMERATION_OBJECT:
				return createPOCTypeEnumerationObjectFromString(eDataType, initialValue);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS_OBJECT:
				return createGlyphTypeEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.GLYPH_TYPE_UNION:
				return createGlyphTypeUnionFromString(eDataType, initialValue);
			case OmtPackage.DIMENSION_VALUE_PATTERN:
				return createDimensionValuePatternFromString(eDataType, initialValue);
			case OmtPackage.ENDIAN_ENUMERATIONS_OBJECT:
				return createEndianEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION_OBJECT:
				return createFixedRecordEncodingEnumerationObjectFromString(eDataType, initialValue);
			case OmtPackage.FIXED_RECORD_ENCODING_UNION:
				return createFixedRecordEncodingUnionFromString(eDataType, initialValue);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS_OBJECT:
				return createApplicationDomainEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.APPLICATION_DOMAIN_UNION:
				return createApplicationDomainUnionFromString(eDataType, initialValue);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_ENUM:
				return createArrayDatatypeEncodingEnumFromString(eDataType, initialValue);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_UNION:
				return createArrayDatatypeEncodingUnionFromString(eDataType, initialValue);
			case OmtPackage.CAPABILITY_ENUMERATIONS_OBJECT:
				return createCapabilityEnumerationsObjectFromString(eDataType, initialValue);
			case OmtPackage.CARDINALITY_PATTERN:
				return createCardinalityPatternFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OmtPackage.UPDATE_ENUMERATIONS:
				return convertUpdateEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR:
				return convertVariantRecordEncodingEnumeratorToString(eDataType, instanceValue);
			case OmtPackage.RESIGN_ACTION_TYPE:
				return convertResignActionTypeToString(eDataType, instanceValue);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION:
				return convertSecurityClassificationEnumerationToString(eDataType, instanceValue);
			case OmtPackage.SHARING_ENUMERATIONS:
				return convertSharingEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.RELIABLE_ENUMERATIONS:
				return convertReliableEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.OM_TYPE_ENUMERATIONS:
				return convertOMTypeEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.ORDER_ENUMERATIONS:
				return convertOrderEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.OWNERSHIP_ENUMERATIONS:
				return convertOwnershipEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.POC_TYPE_ENUMERATION:
				return convertPOCTypeEnumerationToString(eDataType, instanceValue);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS:
				return convertGlyphTypeEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.ENDIAN_ENUMERATIONS:
				return convertEndianEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION:
				return convertFixedRecordEncodingEnumerationToString(eDataType, instanceValue);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS:
				return convertApplicationDomainEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.CAPABILITY_ENUMERATIONS:
				return convertCapabilityEnumerationsToString(eDataType, instanceValue);
			case OmtPackage.VARIANT_RECORD_ENUMERATOR_PATTERN:
				return convertVariantRecordEnumeratorPatternToString(eDataType, instanceValue);
			case OmtPackage.UPDATE_ENUMERATIONS_OBJECT:
				return convertUpdateEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR_OBJECT:
				return convertVariantRecordEncodingEnumeratorObjectToString(eDataType, instanceValue);
			case OmtPackage.VARIANT_RECORD_ENCODING_UNION:
				return convertVariantRecordEncodingUnionToString(eDataType, instanceValue);
			case OmtPackage.RESIGN_ACTION_TYPE_OBJECT:
				return convertResignActionTypeObjectToString(eDataType, instanceValue);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION_OBJECT:
				return convertSecurityClassificationEnumerationObjectToString(eDataType, instanceValue);
			case OmtPackage.SECURITY_CLASSIFICATION_UNION:
				return convertSecurityClassificationUnionToString(eDataType, instanceValue);
			case OmtPackage.SHARING_ENUMERATIONS_OBJECT:
				return convertSharingEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.POC_TYPE_UNION:
				return convertPOCTypeUnionToString(eDataType, instanceValue);
			case OmtPackage.RELIABLE_ENUMERATIONS_OBJECT:
				return convertReliableEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case OmtPackage.OM_TYPE_ENUMERATIONS_OBJECT:
				return convertOMTypeEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.OM_TYPE_UNION:
				return convertOMTypeUnionToString(eDataType, instanceValue);
			case OmtPackage.ORDER_ENUMERATIONS_OBJECT:
				return convertOrderEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.OWNERSHIP_ENUMERATIONS_OBJECT:
				return convertOwnershipEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.POC_TYPE_ENUMERATION_OBJECT:
				return convertPOCTypeEnumerationObjectToString(eDataType, instanceValue);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS_OBJECT:
				return convertGlyphTypeEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.GLYPH_TYPE_UNION:
				return convertGlyphTypeUnionToString(eDataType, instanceValue);
			case OmtPackage.DIMENSION_VALUE_PATTERN:
				return convertDimensionValuePatternToString(eDataType, instanceValue);
			case OmtPackage.ENDIAN_ENUMERATIONS_OBJECT:
				return convertEndianEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION_OBJECT:
				return convertFixedRecordEncodingEnumerationObjectToString(eDataType, instanceValue);
			case OmtPackage.FIXED_RECORD_ENCODING_UNION:
				return convertFixedRecordEncodingUnionToString(eDataType, instanceValue);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS_OBJECT:
				return convertApplicationDomainEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.APPLICATION_DOMAIN_UNION:
				return convertApplicationDomainUnionToString(eDataType, instanceValue);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_ENUM:
				return convertArrayDatatypeEncodingEnumToString(eDataType, instanceValue);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_UNION:
				return convertArrayDatatypeEncodingUnionToString(eDataType, instanceValue);
			case OmtPackage.CAPABILITY_ENUMERATIONS_OBJECT:
				return convertCapabilityEnumerationsObjectToString(eDataType, instanceValue);
			case OmtPackage.CARDINALITY_PATTERN:
				return convertCardinalityPatternToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRatesType createUpdateRatesType() {
		UpdateRatesTypeImpl updateRatesType = new UpdateRatesTypeImpl();
		return updateRatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRateType createUpdateRateType() {
		UpdateRateTypeImpl updateRateType = new UpdateRateTypeImpl();
		return updateRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundType createUpperBoundType() {
		UpperBoundTypeImpl upperBoundType = new UpperBoundTypeImpl();
		return upperBoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataType createVariantRecordDataType() {
		VariantRecordDataTypeImpl variantRecordDataType = new VariantRecordDataTypeImpl();
		return variantRecordDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataType1 createVariantRecordDataType1() {
		VariantRecordDataType1Impl variantRecordDataType1 = new VariantRecordDataType1Impl();
		return variantRecordDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataTypesType createVariantRecordDataTypesType() {
		VariantRecordDataTypesTypeImpl variantRecordDataTypesType = new VariantRecordDataTypesTypeImpl();
		return variantRecordDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingType createVariantRecordEncodingType() {
		VariantRecordEncodingTypeImpl variantRecordEncodingType = new VariantRecordEncodingTypeImpl();
		return variantRecordEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalAttributeOwnershipDivestitureType createUnconditionalAttributeOwnershipDivestitureType() {
		UnconditionalAttributeOwnershipDivestitureTypeImpl unconditionalAttributeOwnershipDivestitureType = new UnconditionalAttributeOwnershipDivestitureTypeImpl();
		return unconditionalAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishInteractionClassType createUnpublishInteractionClassType() {
		UnpublishInteractionClassTypeImpl unpublishInteractionClassType = new UnpublishInteractionClassTypeImpl();
		return unpublishInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishObjectClassAttributesType createUnpublishObjectClassAttributesType() {
		UnpublishObjectClassAttributesTypeImpl unpublishObjectClassAttributesType = new UnpublishObjectClassAttributesTypeImpl();
		return unpublishObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassType createUnsubscribeInteractionClassType() {
		UnsubscribeInteractionClassTypeImpl unsubscribeInteractionClassType = new UnsubscribeInteractionClassTypeImpl();
		return unsubscribeInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassWithRegionsType createUnsubscribeInteractionClassWithRegionsType() {
		UnsubscribeInteractionClassWithRegionsTypeImpl unsubscribeInteractionClassWithRegionsType = new UnsubscribeInteractionClassWithRegionsTypeImpl();
		return unsubscribeInteractionClassWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesType createUnsubscribeObjectClassAttributesType() {
		UnsubscribeObjectClassAttributesTypeImpl unsubscribeObjectClassAttributesType = new UnsubscribeObjectClassAttributesTypeImpl();
		return unsubscribeObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesWithRegionsType createUnsubscribeObjectClassAttributesWithRegionsType() {
		UnsubscribeObjectClassAttributesWithRegionsTypeImpl unsubscribeObjectClassAttributesWithRegionsType = new UnsubscribeObjectClassAttributesWithRegionsTypeImpl();
		return unsubscribeObjectClassAttributesWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttributeValuesType createUpdateAttributeValuesType() {
		UpdateAttributeValuesTypeImpl updateAttributeValuesType = new UpdateAttributeValuesTypeImpl();
		return updateAttributeValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationsType createTransportationsType() {
		TransportationsTypeImpl transportationsType = new TransportationsTypeImpl();
		return transportationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationType createTransportationType() {
		TransportationTypeImpl transportationType = new TransportationTypeImpl();
		return transportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationType1 createTransportationType1() {
		TransportationType1Impl transportationType1 = new TransportationType1Impl();
		return transportationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOffType createTurnInteractionsOffType() {
		TurnInteractionsOffTypeImpl turnInteractionsOffType = new TurnInteractionsOffTypeImpl();
		return turnInteractionsOffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOnType createTurnInteractionsOnType() {
		TurnInteractionsOnTypeImpl turnInteractionsOnType = new TurnInteractionsOnTypeImpl();
		return turnInteractionsOnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOffForObjectInstanceType createTurnUpdatesOffForObjectInstanceType() {
		TurnUpdatesOffForObjectInstanceTypeImpl turnUpdatesOffForObjectInstanceType = new TurnUpdatesOffForObjectInstanceTypeImpl();
		return turnUpdatesOffForObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOnForObjectInstanceType createTurnUpdatesOnForObjectInstanceType() {
		TurnUpdatesOnForObjectInstanceTypeImpl turnUpdatesOnForObjectInstanceType = new TurnUpdatesOnForObjectInstanceTypeImpl();
		return turnUpdatesOnForObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeType() {
		TypeTypeImpl typeType = new TypeTypeImpl();
		return typeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnassociateRegionsForUpdatesType createUnassociateRegionsForUpdatesType() {
		UnassociateRegionsForUpdatesTypeImpl unassociateRegionsForUpdatesType = new UnassociateRegionsForUpdatesTypeImpl();
		return unassociateRegionsForUpdatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType createSwitchType() {
		SwitchTypeImpl switchType = new SwitchTypeImpl();
		return switchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointAchievedType createSynchronizationPointAchievedType() {
		SynchronizationPointAchievedTypeImpl synchronizationPointAchievedType = new SynchronizationPointAchievedTypeImpl();
		return synchronizationPointAchievedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointType createSynchronizationPointType() {
		SynchronizationPointTypeImpl synchronizationPointType = new SynchronizationPointTypeImpl();
		return synchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointType1 createSynchronizationPointType1() {
		SynchronizationPointType1Impl synchronizationPointType1 = new SynchronizationPointType1Impl();
		return synchronizationPointType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationsType createSynchronizationsType() {
		SynchronizationsTypeImpl synchronizationsType = new SynchronizationsTypeImpl();
		return synchronizationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsType createTagsType() {
		TagsTypeImpl tagsType = new TagsTypeImpl();
		return tagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType createTagType() {
		TagTypeImpl tagType = new TagTypeImpl();
		return tagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceGrantType createTimeAdvanceGrantType() {
		TimeAdvanceGrantTypeImpl timeAdvanceGrantType = new TimeAdvanceGrantTypeImpl();
		return timeAdvanceGrantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestAvailableType createTimeAdvanceRequestAvailableType() {
		TimeAdvanceRequestAvailableTypeImpl timeAdvanceRequestAvailableType = new TimeAdvanceRequestAvailableTypeImpl();
		return timeAdvanceRequestAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestType createTimeAdvanceRequestType() {
		TimeAdvanceRequestTypeImpl timeAdvanceRequestType = new TimeAdvanceRequestTypeImpl();
		return timeAdvanceRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstrainedEnabledType createTimeConstrainedEnabledType() {
		TimeConstrainedEnabledTypeImpl timeConstrainedEnabledType = new TimeConstrainedEnabledTypeImpl();
		return timeConstrainedEnabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRegulationEnabledType createTimeRegulationEnabledType() {
		TimeRegulationEnabledTypeImpl timeRegulationEnabledType = new TimeRegulationEnabledTypeImpl();
		return timeRegulationEnabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingType createSharingType() {
		SharingTypeImpl sharingType = new SharingTypeImpl();
		return sharingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType createSimpleDataType() {
		SimpleDataTypeImpl simpleDataType = new SimpleDataTypeImpl();
		return simpleDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType1 createSimpleDataType1() {
		SimpleDataType1Impl simpleDataType1 = new SimpleDataType1Impl();
		return simpleDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataTypesType createSimpleDataTypesType() {
		SimpleDataTypesTypeImpl simpleDataTypesType = new SimpleDataTypesTypeImpl();
		return simpleDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRegistrationForObjectClassType createStartRegistrationForObjectClassType() {
		StartRegistrationForObjectClassTypeImpl startRegistrationForObjectClassType = new StartRegistrationForObjectClassTypeImpl();
		return startRegistrationForObjectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopRegistrationForObjectClassType createStopRegistrationForObjectClassType() {
		StopRegistrationForObjectClassTypeImpl stopRegistrationForObjectClassType = new StopRegistrationForObjectClassTypeImpl();
		return stopRegistrationForObjectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassType createSubscribeInteractionClassType() {
		SubscribeInteractionClassTypeImpl subscribeInteractionClassType = new SubscribeInteractionClassTypeImpl();
		return subscribeInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassWithRegionsType createSubscribeInteractionClassWithRegionsType() {
		SubscribeInteractionClassWithRegionsTypeImpl subscribeInteractionClassWithRegionsType = new SubscribeInteractionClassWithRegionsTypeImpl();
		return subscribeInteractionClassWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesType createSubscribeObjectClassAttributesType() {
		SubscribeObjectClassAttributesTypeImpl subscribeObjectClassAttributesType = new SubscribeObjectClassAttributesTypeImpl();
		return subscribeObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesWithRegionsType createSubscribeObjectClassAttributesWithRegionsType() {
		SubscribeObjectClassAttributesWithRegionsTypeImpl subscribeObjectClassAttributesWithRegionsType = new SubscribeObjectClassAttributesWithRegionsTypeImpl();
		return subscribeObjectClassAttributesWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchesType createSwitchesType() {
		SwitchesTypeImpl switchesType = new SwitchesTypeImpl();
		return switchesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveObjectInstanceNameType createReserveObjectInstanceNameType() {
		ReserveObjectInstanceNameTypeImpl reserveObjectInstanceNameType = new ReserveObjectInstanceNameTypeImpl();
		return reserveObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignFederationExecutionType createResignFederationExecutionType() {
		ResignFederationExecutionTypeImpl resignFederationExecutionType = new ResignFederationExecutionTypeImpl();
		return resignFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignSwitchType createResignSwitchType() {
		ResignSwitchTypeImpl resignSwitchType = new ResignSwitchTypeImpl();
		return resignSwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetractType createRetractType() {
		RetractTypeImpl retractType = new RetractTypeImpl();
		return retractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationType createSecurityClassificationType() {
		SecurityClassificationTypeImpl securityClassificationType = new SecurityClassificationTypeImpl();
		return securityClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionType createSendInteractionType() {
		SendInteractionTypeImpl sendInteractionType = new SendInteractionTypeImpl();
		return sendInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionWithRegionsType createSendInteractionWithRegionsType() {
		SendInteractionWithRegionsTypeImpl sendInteractionWithRegionsType = new SendInteractionWithRegionsTypeImpl();
		return sendInteractionWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUtilizationType createServiceUtilizationType() {
		ServiceUtilizationTypeImpl serviceUtilizationType = new ServiceUtilizationTypeImpl();
		return serviceUtilizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAutomaticResignDirectiveType createSetAutomaticResignDirectiveType() {
		SetAutomaticResignDirectiveTypeImpl setAutomaticResignDirectiveType = new SetAutomaticResignDirectiveTypeImpl();
		return setAutomaticResignDirectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetRangeBoundsType createSetRangeBoundsType() {
		SetRangeBoundsTypeImpl setRangeBoundsType = new SetRangeBoundsTypeImpl();
		return setRangeBoundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableType createReliableType() {
		ReliableTypeImpl reliableType = new ReliableTypeImpl();
		return reliableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveobjectinstanceType createRemoveobjectinstanceType() {
		RemoveobjectinstanceTypeImpl removeobjectinstanceType = new RemoveobjectinstanceTypeImpl();
		return removeobjectinstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportAttributeTransportationTypeType createReportAttributeTransportationTypeType() {
		ReportAttributeTransportationTypeTypeImpl reportAttributeTransportationTypeType = new ReportAttributeTransportationTypeTypeImpl();
		return reportAttributeTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFederationExecutionsType createReportFederationExecutionsType() {
		ReportFederationExecutionsTypeImpl reportFederationExecutionsType = new ReportFederationExecutionsTypeImpl();
		return reportFederationExecutionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportInteractionTransportationTypeType createReportInteractionTransportationTypeType() {
		ReportInteractionTransportationTypeTypeImpl reportInteractionTransportationTypeType = new ReportInteractionTransportationTypeTypeImpl();
		return reportInteractionTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipAssumptionType createRequestAttributeOwnershipAssumptionType() {
		RequestAttributeOwnershipAssumptionTypeImpl requestAttributeOwnershipAssumptionType = new RequestAttributeOwnershipAssumptionTypeImpl();
		return requestAttributeOwnershipAssumptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipReleaseType createRequestAttributeOwnershipReleaseType() {
		RequestAttributeOwnershipReleaseTypeImpl requestAttributeOwnershipReleaseType = new RequestAttributeOwnershipReleaseTypeImpl();
		return requestAttributeOwnershipReleaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeTransportationTypeChangeType createRequestAttributeTransportationTypeChangeType() {
		RequestAttributeTransportationTypeChangeTypeImpl requestAttributeTransportationTypeChangeType = new RequestAttributeTransportationTypeChangeTypeImpl();
		return requestAttributeTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateType createRequestAttributeValueUpdateType() {
		RequestAttributeValueUpdateTypeImpl requestAttributeValueUpdateType = new RequestAttributeValueUpdateTypeImpl();
		return requestAttributeValueUpdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateWithRegionsType createRequestAttributeValueUpdateWithRegionsType() {
		RequestAttributeValueUpdateWithRegionsTypeImpl requestAttributeValueUpdateWithRegionsType = new RequestAttributeValueUpdateWithRegionsTypeImpl();
		return requestAttributeValueUpdateWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestDivestitureConfirmationType createRequestDivestitureConfirmationType() {
		RequestDivestitureConfirmationTypeImpl requestDivestitureConfirmationType = new RequestDivestitureConfirmationTypeImpl();
		return requestDivestitureConfirmationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationRestoreType createRequestFederationRestoreType() {
		RequestFederationRestoreTypeImpl requestFederationRestoreType = new RequestFederationRestoreTypeImpl();
		return requestFederationRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationSaveType createRequestFederationSaveType() {
		RequestFederationSaveTypeImpl requestFederationSaveType = new RequestFederationSaveTypeImpl();
		return requestFederationSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestInteractionTransportationTypeChangeType createRequestInteractionTransportationTypeChangeType() {
		RequestInteractionTransportationTypeChangeTypeImpl requestInteractionTransportationTypeChangeType = new RequestInteractionTransportationTypeChangeTypeImpl();
		return requestInteractionTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestRetractionType createRequestRetractionType() {
		RequestRetractionTypeImpl requestRetractionType = new RequestRetractionTypeImpl();
		return requestRetractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveMultipleObjectInstanceNamesType createReserveMultipleObjectInstanceNamesType() {
		ReserveMultipleObjectInstanceNamesTypeImpl reserveMultipleObjectInstanceNamesType = new ReserveMultipleObjectInstanceNamesTypeImpl();
		return reserveMultipleObjectInstanceNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocTypeType createPocTypeType() {
		PocTypeTypeImpl pocTypeType = new PocTypeTypeImpl();
		return pocTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvideAttributeValueUpdateType createProvideAttributeValueUpdateType() {
		ProvideAttributeValueUpdateTypeImpl provideAttributeValueUpdateType = new ProvideAttributeValueUpdateTypeImpl();
		return provideAttributeValueUpdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishInteractionClassType createPublishInteractionClassType() {
		PublishInteractionClassTypeImpl publishInteractionClassType = new PublishInteractionClassTypeImpl();
		return publishInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishObjectClassAttributesType createPublishObjectClassAttributesType() {
		PublishObjectClassAttributesTypeImpl publishObjectClassAttributesType = new PublishObjectClassAttributesTypeImpl();
		return publishObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeOwnershipType createQueryAttributeOwnershipType() {
		QueryAttributeOwnershipTypeImpl queryAttributeOwnershipType = new QueryAttributeOwnershipTypeImpl();
		return queryAttributeOwnershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeTransportationTypeType createQueryAttributeTransportationTypeType() {
		QueryAttributeTransportationTypeTypeImpl queryAttributeTransportationTypeType = new QueryAttributeTransportationTypeTypeImpl();
		return queryAttributeTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationRestoreStatusType createQueryFederationRestoreStatusType() {
		QueryFederationRestoreStatusTypeImpl queryFederationRestoreStatusType = new QueryFederationRestoreStatusTypeImpl();
		return queryFederationRestoreStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationSaveStatusType createQueryFederationSaveStatusType() {
		QueryFederationSaveStatusTypeImpl queryFederationSaveStatusType = new QueryFederationSaveStatusTypeImpl();
		return queryFederationSaveStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGALTType createQueryGALTType() {
		QueryGALTTypeImpl queryGALTType = new QueryGALTTypeImpl();
		return queryGALTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInteractionTransportationTypeType createQueryInteractionTransportationTypeType() {
		QueryInteractionTransportationTypeTypeImpl queryInteractionTransportationTypeType = new QueryInteractionTransportationTypeTypeImpl();
		return queryInteractionTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLITSType createQueryLITSType() {
		QueryLITSTypeImpl queryLITSType = new QueryLITSTypeImpl();
		return queryLITSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLogicalTimeType createQueryLogicalTimeType() {
		QueryLogicalTimeTypeImpl queryLogicalTimeType = new QueryLogicalTimeTypeImpl();
		return queryLogicalTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLookaheadType createQueryLookaheadType() {
		QueryLookaheadTypeImpl queryLookaheadType = new QueryLookaheadTypeImpl();
		return queryLookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateType createRateType() {
		RateTypeImpl rateType = new RateTypeImpl();
		return rateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteractionType createReceiveInteractionType() {
		ReceiveInteractionTypeImpl receiveInteractionType = new ReceiveInteractionTypeImpl();
		return receiveInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectAttributeValuesType createReflectAttributeValuesType() {
		ReflectAttributeValuesTypeImpl reflectAttributeValuesType = new ReflectAttributeValuesTypeImpl();
		return reflectAttributeValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFederationSynchronizationPointType createRegisterFederationSynchronizationPointType() {
		RegisterFederationSynchronizationPointTypeImpl registerFederationSynchronizationPointType = new RegisterFederationSynchronizationPointTypeImpl();
		return registerFederationSynchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceType createRegisterObjectInstanceType() {
		RegisterObjectInstanceTypeImpl registerObjectInstanceType = new RegisterObjectInstanceTypeImpl();
		return registerObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceWithRegionsType createRegisterObjectInstanceWithRegionsType() {
		RegisterObjectInstanceWithRegionsTypeImpl registerObjectInstanceWithRegionsType = new RegisterObjectInstanceWithRegionsTypeImpl();
		return registerObjectInstanceWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseMultipleObjectInstanceNamesType createReleaseMultipleObjectInstanceNamesType() {
		ReleaseMultipleObjectInstanceNamesTypeImpl releaseMultipleObjectInstanceNamesType = new ReleaseMultipleObjectInstanceNamesTypeImpl();
		return releaseMultipleObjectInstanceNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseObjectInstanceNameType createReleaseObjectInstanceNameType() {
		ReleaseObjectInstanceNameTypeImpl releaseObjectInstanceNameType = new ReleaseObjectInstanceNameTypeImpl();
		return releaseObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestType createNextMessageRequestType() {
		NextMessageRequestTypeImpl nextMessageRequestType = new NextMessageRequestTypeImpl();
		return nextMessageRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 createNonEmptyString1() {
		NonEmptyString1Impl nonEmptyString1 = new NonEmptyString1Impl();
		return nonEmptyString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeFederateHandleType createNormalizeFederateHandleType() {
		NormalizeFederateHandleTypeImpl normalizeFederateHandleType = new NormalizeFederateHandleTypeImpl();
		return normalizeFederateHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeServiceGroupType createNormalizeServiceGroupType() {
		NormalizeServiceGroupTypeImpl normalizeServiceGroupType = new NormalizeServiceGroupTypeImpl();
		return normalizeServiceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType createObjectClassType() {
		ObjectClassTypeImpl objectClassType = new ObjectClassTypeImpl();
		return objectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType1 createObjectClassType1() {
		ObjectClassType1Impl objectClassType1 = new ObjectClassType1Impl();
		return objectClassType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstanceNameReservedType createObjectInstanceNameReservedType() {
		ObjectInstanceNameReservedTypeImpl objectInstanceNameReservedType = new ObjectInstanceNameReservedTypeImpl();
		return objectInstanceNameReservedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelType createObjectModelType() {
		ObjectModelTypeImpl objectModelType = new ObjectModelTypeImpl();
		return objectModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectsType createObjectsType() {
		ObjectsTypeImpl objectsType = new ObjectsTypeImpl();
		return objectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderType() {
		OrderTypeImpl orderType = new OrderTypeImpl();
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipType createOwnershipType() {
		OwnershipTypeImpl ownershipType = new OwnershipTypeImpl();
		return ownershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType1 createParameterType1() {
		ParameterType1Impl parameterType1 = new ParameterType1Impl();
		return parameterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocType createPocType() {
		PocTypeImpl pocType = new PocTypeImpl();
		return pocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocType1 createPocType1() {
		PocType1Impl pocType1 = new PocType1Impl();
		return pocType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceHandleType createGetObjectInstanceHandleType() {
		GetObjectInstanceHandleTypeImpl getObjectInstanceHandleType = new GetObjectInstanceHandleTypeImpl();
		return getObjectInstanceHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceNameType createGetObjectInstanceNameType() {
		GetObjectInstanceNameTypeImpl getObjectInstanceNameType = new GetObjectInstanceNameTypeImpl();
		return getObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderNameType createGetOrderNameType() {
		GetOrderNameTypeImpl getOrderNameType = new GetOrderNameTypeImpl();
		return getOrderNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderTypeType createGetOrderTypeType() {
		GetOrderTypeTypeImpl getOrderTypeType = new GetOrderTypeTypeImpl();
		return getOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterHandleType createGetParameterHandleType() {
		GetParameterHandleTypeImpl getParameterHandleType = new GetParameterHandleTypeImpl();
		return getParameterHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterNameType createGetParameterNameType() {
		GetParameterNameTypeImpl getParameterNameType = new GetParameterNameTypeImpl();
		return getParameterNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRangeBoundsType createGetRangeBoundsType() {
		GetRangeBoundsTypeImpl getRangeBoundsType = new GetRangeBoundsTypeImpl();
		return getRangeBoundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeHandleType createGetTransportationTypeHandleType() {
		GetTransportationTypeHandleTypeImpl getTransportationTypeHandleType = new GetTransportationTypeHandleTypeImpl();
		return getTransportationTypeHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeNameType createGetTransportationTypeNameType() {
		GetTransportationTypeNameTypeImpl getTransportationTypeNameType = new GetTransportationTypeNameTypeImpl();
		return getTransportationTypeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueForAttributeType createGetUpdateRateValueForAttributeType() {
		GetUpdateRateValueForAttributeTypeImpl getUpdateRateValueForAttributeType = new GetUpdateRateValueForAttributeTypeImpl();
		return getUpdateRateValueForAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueType createGetUpdateRateValueType() {
		GetUpdateRateValueTypeImpl getUpdateRateValueType = new GetUpdateRateValueTypeImpl();
		return getUpdateRateValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphType createGlyphType() {
		GlyphTypeImpl glyphType = new GlyphTypeImpl();
		return glyphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphType1 createGlyphType1() {
		GlyphType1Impl glyphType1 = new GlyphType1Impl();
		return glyphType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationType createIdentificationType() {
		IdentificationTypeImpl identificationType = new IdentificationTypeImpl();
		return identificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdReferenceType createIdReferenceType() {
		IdReferenceTypeImpl idReferenceType = new IdReferenceTypeImpl();
		return idReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformAttributeOwnershipType createInformAttributeOwnershipType() {
		InformAttributeOwnershipTypeImpl informAttributeOwnershipType = new InformAttributeOwnershipTypeImpl();
		return informAttributeOwnershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateRestoreType createInitiateFederateRestoreType() {
		InitiateFederateRestoreTypeImpl initiateFederateRestoreType = new InitiateFederateRestoreTypeImpl();
		return initiateFederateRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateSaveType createInitiateFederateSaveType() {
		InitiateFederateSaveTypeImpl initiateFederateSaveType = new InitiateFederateSaveTypeImpl();
		return initiateFederateSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionClassType createInteractionClassType() {
		InteractionClassTypeImpl interactionClassType = new InteractionClassTypeImpl();
		return interactionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionClassType1 createInteractionClassType1() {
		InteractionClassType1Impl interactionClassType1 = new InteractionClassType1Impl();
		return interactionClassType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsType createInteractionsType() {
		InteractionsTypeImpl interactionsType = new InteractionsTypeImpl();
		return interactionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttributeOwnedByFederateType createIsAttributeOwnedByFederateType() {
		IsAttributeOwnedByFederateTypeImpl isAttributeOwnedByFederateType = new IsAttributeOwnedByFederateTypeImpl();
		return isAttributeOwnedByFederateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinFederationExecutionType createJoinFederationExecutionType() {
		JoinFederationExecutionTypeImpl joinFederationExecutionType = new JoinFederationExecutionTypeImpl();
		return joinFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordType createKeywordType() {
		KeywordTypeImpl keywordType = new KeywordTypeImpl();
		return keywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFederationExecutionsType createListFederationExecutionsType() {
		ListFederationExecutionsTypeImpl listFederationExecutionsType = new ListFederationExecutionsTypeImpl();
		return listFederationExecutionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeleteObjectInstanceType createLocalDeleteObjectInstanceType() {
		LocalDeleteObjectInstanceTypeImpl localDeleteObjectInstanceType = new LocalDeleteObjectInstanceTypeImpl();
		return localDeleteObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookaheadType createLookaheadType() {
		LookaheadTypeImpl lookaheadType = new LookaheadTypeImpl();
		return lookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelIdentificationType createModelIdentificationType() {
		ModelIdentificationTypeImpl modelIdentificationType = new ModelIdentificationTypeImpl();
		return modelIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType createModificationDateType() {
		ModificationDateTypeImpl modificationDateType = new ModificationDateTypeImpl();
		return modificationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyLookaheadType createModifyLookaheadType() {
		ModifyLookaheadTypeImpl modifyLookaheadType = new ModifyLookaheadTypeImpl();
		return modifyLookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleObjectInstanceNamesReservedType createMultipleObjectInstanceNamesReservedType() {
		MultipleObjectInstanceNamesReservedTypeImpl multipleObjectInstanceNamesReservedType = new MultipleObjectInstanceNamesReservedTypeImpl();
		return multipleObjectInstanceNamesReservedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiatedAttributeOwnershipDivestitureType createNegotiatedAttributeOwnershipDivestitureType() {
		NegotiatedAttributeOwnershipDivestitureTypeImpl negotiatedAttributeOwnershipDivestitureType = new NegotiatedAttributeOwnershipDivestitureTypeImpl();
		return negotiatedAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestAvailableType createNextMessageRequestAvailableType() {
		NextMessageRequestAvailableTypeImpl nextMessageRequestAvailableType = new NextMessageRequestAvailableTypeImpl();
		return nextMessageRequestAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmDivestitureType createConfirmDivestitureType() {
		ConfirmDivestitureTypeImpl confirmDivestitureType = new ConfirmDivestitureTypeImpl();
		return confirmDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmFederationRestorationRequestType createConfirmFederationRestorationRequestType() {
		ConfirmFederationRestorationRequestTypeImpl confirmFederationRestorationRequestType = new ConfirmFederationRestorationRequestTypeImpl();
		return confirmFederationRestorationRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmInteractionTransportationTypeChangeType createConfirmInteractionTransportationTypeChangeType() {
		ConfirmInteractionTransportationTypeChangeTypeImpl confirmInteractionTransportationTypeChangeType = new ConfirmInteractionTransportationTypeChangeTypeImpl();
		return confirmInteractionTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmSynchronizationPointRegistrationType createConfirmSynchronizationPointRegistrationType() {
		ConfirmSynchronizationPointRegistrationTypeImpl confirmSynchronizationPointRegistrationType = new ConfirmSynchronizationPointRegistrationTypeImpl();
		return confirmSynchronizationPointRegistrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLostType createConnectionLostType() {
		ConnectionLostTypeImpl connectionLostType = new ConnectionLostTypeImpl();
		return connectionLostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectType createConnectType() {
		ConnectTypeImpl connectType = new ConnectTypeImpl();
		return connectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateFederationExecutionType createCreateFederationExecutionType() {
		CreateFederationExecutionTypeImpl createFederationExecutionType = new CreateFederationExecutionTypeImpl();
		return createFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateRegionType createCreateRegionType() {
		CreateRegionTypeImpl createRegionType = new CreateRegionTypeImpl();
		return createRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType createDataTypesType() {
		DataTypesTypeImpl dataTypesType = new DataTypesTypeImpl();
		return dataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteObjectInstanceType createDeleteObjectInstanceType() {
		DeleteObjectInstanceTypeImpl deleteObjectInstanceType = new DeleteObjectInstanceTypeImpl();
		return deleteObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRegionType createDeleteRegionType() {
		DeleteRegionTypeImpl deleteRegionType = new DeleteRegionTypeImpl();
		return deleteRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyFederationExecutionType createDestroyFederationExecutionType() {
		DestroyFederationExecutionTypeImpl destroyFederationExecutionType = new DestroyFederationExecutionTypeImpl();
		return destroyFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType createDimensionsType() {
		DimensionsTypeImpl dimensionsType = new DimensionsTypeImpl();
		return dimensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType1 createDimensionsType1() {
		DimensionsType1Impl dimensionsType1 = new DimensionsType1Impl();
		return dimensionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType2 createDimensionsType2() {
		DimensionsType2Impl dimensionsType2 = new DimensionsType2Impl();
		return dimensionsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionType() {
		DimensionTypeImpl dimensionType = new DimensionTypeImpl();
		return dimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType1 createDimensionType1() {
		DimensionType1Impl dimensionType1 = new DimensionType1Impl();
		return dimensionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAsynchronousDeliveryType createDisableAsynchronousDeliveryType() {
		DisableAsynchronousDeliveryTypeImpl disableAsynchronousDeliveryType = new DisableAsynchronousDeliveryTypeImpl();
		return disableAsynchronousDeliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeRelevanceAdvisorySwitchType createDisableAttributeRelevanceAdvisorySwitchType() {
		DisableAttributeRelevanceAdvisorySwitchTypeImpl disableAttributeRelevanceAdvisorySwitchType = new DisableAttributeRelevanceAdvisorySwitchTypeImpl();
		return disableAttributeRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeScopeAdvisorySwitchType createDisableAttributeScopeAdvisorySwitchType() {
		DisableAttributeScopeAdvisorySwitchTypeImpl disableAttributeScopeAdvisorySwitchType = new DisableAttributeScopeAdvisorySwitchTypeImpl();
		return disableAttributeScopeAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableCallbacksType createDisableCallbacksType() {
		DisableCallbacksTypeImpl disableCallbacksType = new DisableCallbacksTypeImpl();
		return disableCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableInteractionRelevanceAdvisorySwitchType createDisableInteractionRelevanceAdvisorySwitchType() {
		DisableInteractionRelevanceAdvisorySwitchTypeImpl disableInteractionRelevanceAdvisorySwitchType = new DisableInteractionRelevanceAdvisorySwitchTypeImpl();
		return disableInteractionRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableObjectClassRelevanceAdvisorySwitchType createDisableObjectClassRelevanceAdvisorySwitchType() {
		DisableObjectClassRelevanceAdvisorySwitchTypeImpl disableObjectClassRelevanceAdvisorySwitchType = new DisableObjectClassRelevanceAdvisorySwitchTypeImpl();
		return disableObjectClassRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeConstrainedType createDisableTimeConstrainedType() {
		DisableTimeConstrainedTypeImpl disableTimeConstrainedType = new DisableTimeConstrainedTypeImpl();
		return disableTimeConstrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeRegulationType createDisableTimeRegulationType() {
		DisableTimeRegulationTypeImpl disableTimeRegulationType = new DisableTimeRegulationTypeImpl();
		return disableTimeRegulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectType createDisconnectType() {
		DisconnectTypeImpl disconnectType = new DisconnectTypeImpl();
		return disconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverObjectInstanceType createDiscoverObjectInstanceType() {
		DiscoverObjectInstanceTypeImpl discoverObjectInstanceType = new DiscoverObjectInstanceTypeImpl();
		return discoverObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAsynchronousDeliveryType createEnableAsynchronousDeliveryType() {
		EnableAsynchronousDeliveryTypeImpl enableAsynchronousDeliveryType = new EnableAsynchronousDeliveryTypeImpl();
		return enableAsynchronousDeliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeRelevanceAdvisorySwitchType createEnableAttributeRelevanceAdvisorySwitchType() {
		EnableAttributeRelevanceAdvisorySwitchTypeImpl enableAttributeRelevanceAdvisorySwitchType = new EnableAttributeRelevanceAdvisorySwitchTypeImpl();
		return enableAttributeRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeScopeAdvisorySwitchType createEnableAttributeScopeAdvisorySwitchType() {
		EnableAttributeScopeAdvisorySwitchTypeImpl enableAttributeScopeAdvisorySwitchType = new EnableAttributeScopeAdvisorySwitchTypeImpl();
		return enableAttributeScopeAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCallbacksType createEnableCallbacksType() {
		EnableCallbacksTypeImpl enableCallbacksType = new EnableCallbacksTypeImpl();
		return enableCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableInteractionRelevanceAdvisorySwitchType createEnableInteractionRelevanceAdvisorySwitchType() {
		EnableInteractionRelevanceAdvisorySwitchTypeImpl enableInteractionRelevanceAdvisorySwitchType = new EnableInteractionRelevanceAdvisorySwitchTypeImpl();
		return enableInteractionRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableObjectClassRelevanceAdvisorySwitchType createEnableObjectClassRelevanceAdvisorySwitchType() {
		EnableObjectClassRelevanceAdvisorySwitchTypeImpl enableObjectClassRelevanceAdvisorySwitchType = new EnableObjectClassRelevanceAdvisorySwitchTypeImpl();
		return enableObjectClassRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeConstrainedType createEnableTimeConstrainedType() {
		EnableTimeConstrainedTypeImpl enableTimeConstrainedType = new EnableTimeConstrainedTypeImpl();
		return enableTimeConstrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeRegulationType createEnableTimeRegulationType() {
		EnableTimeRegulationTypeImpl enableTimeRegulationType = new EnableTimeRegulationTypeImpl();
		return enableTimeRegulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianType() {
		EndianTypeImpl endianType = new EndianTypeImpl();
		return endianType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataType createEnumeratedDataType() {
		EnumeratedDataTypeImpl enumeratedDataType = new EnumeratedDataTypeImpl();
		return enumeratedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataType1 createEnumeratedDataType1() {
		EnumeratedDataType1Impl enumeratedDataType1 = new EnumeratedDataType1Impl();
		return enumeratedDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataTypesType createEnumeratedDataTypesType() {
		EnumeratedDataTypesTypeImpl enumeratedDataTypesType = new EnumeratedDataTypesTypeImpl();
		return enumeratedDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratorType createEnumeratorType() {
		EnumeratorTypeImpl enumeratorType = new EnumeratorTypeImpl();
		return enumeratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeCallbackType createEvokeCallbackType() {
		EvokeCallbackTypeImpl evokeCallbackType = new EvokeCallbackTypeImpl();
		return evokeCallbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeMultipleCallbacksType createEvokeMultipleCallbacksType() {
		EvokeMultipleCallbacksTypeImpl evokeMultipleCallbacksType = new EvokeMultipleCallbacksTypeImpl();
		return evokeMultipleCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateRestoreCompleteType createFederateRestoreCompleteType() {
		FederateRestoreCompleteTypeImpl federateRestoreCompleteType = new FederateRestoreCompleteTypeImpl();
		return federateRestoreCompleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveBegunType createFederateSaveBegunType() {
		FederateSaveBegunTypeImpl federateSaveBegunType = new FederateSaveBegunTypeImpl();
		return federateSaveBegunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveCompleteType createFederateSaveCompleteType() {
		FederateSaveCompleteTypeImpl federateSaveCompleteType = new FederateSaveCompleteTypeImpl();
		return federateSaveCompleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreBegunType createFederationRestoreBegunType() {
		FederationRestoreBegunTypeImpl federationRestoreBegunType = new FederationRestoreBegunTypeImpl();
		return federationRestoreBegunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoredType createFederationRestoredType() {
		FederationRestoredTypeImpl federationRestoredType = new FederationRestoredTypeImpl();
		return federationRestoredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreStatusResponseType createFederationRestoreStatusResponseType() {
		FederationRestoreStatusResponseTypeImpl federationRestoreStatusResponseType = new FederationRestoreStatusResponseTypeImpl();
		return federationRestoreStatusResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSavedType createFederationSavedType() {
		FederationSavedTypeImpl federationSavedType = new FederationSavedTypeImpl();
		return federationSavedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSaveStatusResponseType createFederationSaveStatusResponseType() {
		FederationSaveStatusResponseTypeImpl federationSaveStatusResponseType = new FederationSaveStatusResponseTypeImpl();
		return federationSaveStatusResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSynchronizedType createFederationSynchronizedType() {
		FederationSynchronizedTypeImpl federationSynchronizedType = new FederationSynchronizedTypeImpl();
		return federationSynchronizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataType createFixedRecordDataType() {
		FixedRecordDataTypeImpl fixedRecordDataType = new FixedRecordDataTypeImpl();
		return fixedRecordDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataType1 createFixedRecordDataType1() {
		FixedRecordDataType1Impl fixedRecordDataType1 = new FixedRecordDataType1Impl();
		return fixedRecordDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataTypesType createFixedRecordDataTypesType() {
		FixedRecordDataTypesTypeImpl fixedRecordDataTypesType = new FixedRecordDataTypesTypeImpl();
		return fixedRecordDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingType createFixedRecordEncodingType() {
		FixedRecordEncodingTypeImpl fixedRecordEncodingType = new FixedRecordEncodingTypeImpl();
		return fixedRecordEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushQueueRequestType createFlushQueueRequestType() {
		FlushQueueRequestTypeImpl flushQueueRequestType = new FlushQueueRequestTypeImpl();
		return flushQueueRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeHandleType createGetAttributeHandleType() {
		GetAttributeHandleTypeImpl getAttributeHandleType = new GetAttributeHandleTypeImpl();
		return getAttributeHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeNameType createGetAttributeNameType() {
		GetAttributeNameTypeImpl getAttributeNameType = new GetAttributeNameTypeImpl();
		return getAttributeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAutomaticResignDirectiveType createGetAutomaticResignDirectiveType() {
		GetAutomaticResignDirectiveTypeImpl getAutomaticResignDirectiveType = new GetAutomaticResignDirectiveTypeImpl();
		return getAutomaticResignDirectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForClassAttributeType createGetAvailableDimensionsForClassAttributeType() {
		GetAvailableDimensionsForClassAttributeTypeImpl getAvailableDimensionsForClassAttributeType = new GetAvailableDimensionsForClassAttributeTypeImpl();
		return getAvailableDimensionsForClassAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForInteractionClassType createGetAvailableDimensionsForInteractionClassType() {
		GetAvailableDimensionsForInteractionClassTypeImpl getAvailableDimensionsForInteractionClassType = new GetAvailableDimensionsForInteractionClassTypeImpl();
		return getAvailableDimensionsForInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleSetType createGetDimensionHandleSetType() {
		GetDimensionHandleSetTypeImpl getDimensionHandleSetType = new GetDimensionHandleSetTypeImpl();
		return getDimensionHandleSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleType createGetDimensionHandleType() {
		GetDimensionHandleTypeImpl getDimensionHandleType = new GetDimensionHandleTypeImpl();
		return getDimensionHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionNameType createGetDimensionNameType() {
		GetDimensionNameTypeImpl getDimensionNameType = new GetDimensionNameTypeImpl();
		return getDimensionNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionUpperBoundType createGetDimensionUpperBoundType() {
		GetDimensionUpperBoundTypeImpl getDimensionUpperBoundType = new GetDimensionUpperBoundTypeImpl();
		return getDimensionUpperBoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateHandleType createGetFederateHandleType() {
		GetFederateHandleTypeImpl getFederateHandleType = new GetFederateHandleTypeImpl();
		return getFederateHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateNameType createGetFederateNameType() {
		GetFederateNameTypeImpl getFederateNameType = new GetFederateNameTypeImpl();
		return getFederateNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassHandleType createGetInteractionClassHandleType() {
		GetInteractionClassHandleTypeImpl getInteractionClassHandleType = new GetInteractionClassHandleTypeImpl();
		return getInteractionClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassNameType createGetInteractionClassNameType() {
		GetInteractionClassNameTypeImpl getInteractionClassNameType = new GetInteractionClassNameTypeImpl();
		return getInteractionClassNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetKnownObjectClassHandleType createGetKnownObjectClassHandleType() {
		GetKnownObjectClassHandleTypeImpl getKnownObjectClassHandleType = new GetKnownObjectClassHandleTypeImpl();
		return getKnownObjectClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassHandleType createGetObjectClassHandleType() {
		GetObjectClassHandleTypeImpl getObjectClassHandleType = new GetObjectClassHandleTypeImpl();
		return getObjectClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassNameType createGetObjectClassNameType() {
		GetObjectClassNameTypeImpl getObjectClassNameType = new GetObjectClassNameTypeImpl();
		return getObjectClassNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationRestoreType createAbortFederationRestoreType() {
		AbortFederationRestoreTypeImpl abortFederationRestoreType = new AbortFederationRestoreTypeImpl();
		return abortFederationRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationSaveType createAbortFederationSaveType() {
		AbortFederationSaveTypeImpl abortFederationSaveType = new AbortFederationSaveTypeImpl();
		return abortFederationSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeType createAlternativeType() {
		AlternativeTypeImpl alternativeType = new AlternativeTypeImpl();
		return alternativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnounceSynchronizationPointType createAnnounceSynchronizationPointType() {
		AnnounceSynchronizationPointTypeImpl announceSynchronizationPointType = new AnnounceSynchronizationPointTypeImpl();
		return announceSynchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainType createApplicationDomainType() {
		ApplicationDomainTypeImpl applicationDomainType = new ApplicationDomainTypeImpl();
		return applicationDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataType createArrayDataType() {
		ArrayDataTypeImpl arrayDataType = new ArrayDataTypeImpl();
		return arrayDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataType1 createArrayDataType1() {
		ArrayDataType1Impl arrayDataType1 = new ArrayDataType1Impl();
		return arrayDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDatatypeEncodingType createArrayDatatypeEncodingType() {
		ArrayDatatypeEncodingTypeImpl arrayDatatypeEncodingType = new ArrayDatatypeEncodingTypeImpl();
		return arrayDatatypeEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataTypesType createArrayDataTypesType() {
		ArrayDataTypesTypeImpl arrayDataTypesType = new ArrayDataTypesTypeImpl();
		return arrayDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataTypesType1 createArrayDataTypesType1() {
		ArrayDataTypesType1Impl arrayDataTypesType1 = new ArrayDataTypesType1Impl();
		return arrayDataTypesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociateRegionsForUpdatesType createAssociateRegionsForUpdatesType() {
		AssociateRegionsForUpdatesTypeImpl associateRegionsForUpdatesType = new AssociateRegionsForUpdatesTypeImpl();
		return associateRegionsForUpdatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionIfAvailableType createAttributeOwnershipAcquisitionIfAvailableType() {
		AttributeOwnershipAcquisitionIfAvailableTypeImpl attributeOwnershipAcquisitionIfAvailableType = new AttributeOwnershipAcquisitionIfAvailableTypeImpl();
		return attributeOwnershipAcquisitionIfAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionNotificationType createAttributeOwnershipAcquisitionNotificationType() {
		AttributeOwnershipAcquisitionNotificationTypeImpl attributeOwnershipAcquisitionNotificationType = new AttributeOwnershipAcquisitionNotificationTypeImpl();
		return attributeOwnershipAcquisitionNotificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionType createAttributeOwnershipAcquisitionType() {
		AttributeOwnershipAcquisitionTypeImpl attributeOwnershipAcquisitionType = new AttributeOwnershipAcquisitionTypeImpl();
		return attributeOwnershipAcquisitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipDivestitureIfWantedType createAttributeOwnershipDivestitureIfWantedType() {
		AttributeOwnershipDivestitureIfWantedTypeImpl attributeOwnershipDivestitureIfWantedType = new AttributeOwnershipDivestitureIfWantedTypeImpl();
		return attributeOwnershipDivestitureIfWantedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipReleaseDeniedType createAttributeOwnershipReleaseDeniedType() {
		AttributeOwnershipReleaseDeniedTypeImpl attributeOwnershipReleaseDeniedType = new AttributeOwnershipReleaseDeniedTypeImpl();
		return attributeOwnershipReleaseDeniedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipUnavailableType createAttributeOwnershipUnavailableType() {
		AttributeOwnershipUnavailableTypeImpl attributeOwnershipUnavailableType = new AttributeOwnershipUnavailableTypeImpl();
		return attributeOwnershipUnavailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesInScopeType createAttributesInScopeType() {
		AttributesInScopeTypeImpl attributesInScopeType = new AttributesInScopeTypeImpl();
		return attributesInScopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesOutOfScopeType createAttributesOutOfScopeType() {
		AttributesOutOfScopeTypeImpl attributesOutOfScopeType = new AttributesOutOfScopeTypeImpl();
		return attributesOutOfScopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType1 createAttributeType1() {
		AttributeType1Impl attributeType1 = new AttributeType1Impl();
		return attributeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataRepresentationsType createBasicDataRepresentationsType() {
		BasicDataRepresentationsTypeImpl basicDataRepresentationsType = new BasicDataRepresentationsTypeImpl();
		return basicDataRepresentationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType createBasicDataType() {
		BasicDataTypeImpl basicDataType = new BasicDataTypeImpl();
		return basicDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType1 createBasicDataType1() {
		BasicDataType1Impl basicDataType1 = new BasicDataType1Impl();
		return basicDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelAttributeOwnershipAcquisitionType createCancelAttributeOwnershipAcquisitionType() {
		CancelAttributeOwnershipAcquisitionTypeImpl cancelAttributeOwnershipAcquisitionType = new CancelAttributeOwnershipAcquisitionTypeImpl();
		return cancelAttributeOwnershipAcquisitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelNegotiatedAttributeOwnershipDivestitureType createCancelNegotiatedAttributeOwnershipDivestitureType() {
		CancelNegotiatedAttributeOwnershipDivestitureTypeImpl cancelNegotiatedAttributeOwnershipDivestitureType = new CancelNegotiatedAttributeOwnershipDivestitureTypeImpl();
		return cancelNegotiatedAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType createCapabilityType() {
		CapabilityTypeImpl capabilityType = new CapabilityTypeImpl();
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType createCardinalityType() {
		CardinalityTypeImpl cardinalityType = new CardinalityTypeImpl();
		return cardinalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeOrderTypeType createChangeAttributeOrderTypeType() {
		ChangeAttributeOrderTypeTypeImpl changeAttributeOrderTypeType = new ChangeAttributeOrderTypeTypeImpl();
		return changeAttributeOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInteractionOrderTypeType createChangeInteractionOrderTypeType() {
		ChangeInteractionOrderTypeTypeImpl changeInteractionOrderTypeType = new ChangeInteractionOrderTypeTypeImpl();
		return changeInteractionOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitRegionModificationsType createCommitRegionModificationsType() {
		CommitRegionModificationsTypeImpl commitRegionModificationsType = new CommitRegionModificationsTypeImpl();
		return commitRegionModificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeOwnershipAcquisitionCancellationType createConfirmAttributeOwnershipAcquisitionCancellationType() {
		ConfirmAttributeOwnershipAcquisitionCancellationTypeImpl confirmAttributeOwnershipAcquisitionCancellationType = new ConfirmAttributeOwnershipAcquisitionCancellationTypeImpl();
		return confirmAttributeOwnershipAcquisitionCancellationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeTransportationTypeChangeType createConfirmAttributeTransportationTypeChangeType() {
		ConfirmAttributeTransportationTypeChangeTypeImpl confirmAttributeTransportationTypeChangeType = new ConfirmAttributeTransportationTypeChangeTypeImpl();
		return confirmAttributeTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEnumerations createUpdateEnumerationsFromString(EDataType eDataType, String initialValue) {
		UpdateEnumerations result = UpdateEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingEnumerator createVariantRecordEncodingEnumeratorFromString(EDataType eDataType, String initialValue) {
		VariantRecordEncodingEnumerator result = VariantRecordEncodingEnumerator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingEnumeratorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignActionType createResignActionTypeFromString(EDataType eDataType, String initialValue) {
		ResignActionType result = ResignActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResignActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationEnumeration createSecurityClassificationEnumerationFromString(EDataType eDataType, String initialValue) {
		SecurityClassificationEnumeration result = SecurityClassificationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingEnumerations createSharingEnumerationsFromString(EDataType eDataType, String initialValue) {
		SharingEnumerations result = SharingEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSharingEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableEnumerations createReliableEnumerationsFromString(EDataType eDataType, String initialValue) {
		ReliableEnumerations result = ReliableEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliableEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTypeEnumerations createOMTypeEnumerationsFromString(EDataType eDataType, String initialValue) {
		OMTypeEnumerations result = OMTypeEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEnumerations createOrderEnumerationsFromString(EDataType eDataType, String initialValue) {
		OrderEnumerations result = OrderEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipEnumerations createOwnershipEnumerationsFromString(EDataType eDataType, String initialValue) {
		OwnershipEnumerations result = OwnershipEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POCTypeEnumeration createPOCTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		POCTypeEnumeration result = POCTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphTypeEnumerations createGlyphTypeEnumerationsFromString(EDataType eDataType, String initialValue) {
		GlyphTypeEnumerations result = GlyphTypeEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianEnumerations createEndianEnumerationsFromString(EDataType eDataType, String initialValue) {
		EndianEnumerations result = EndianEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingEnumeration createFixedRecordEncodingEnumerationFromString(EDataType eDataType, String initialValue) {
		FixedRecordEncodingEnumeration result = FixedRecordEncodingEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainEnumerations createApplicationDomainEnumerationsFromString(EDataType eDataType, String initialValue) {
		ApplicationDomainEnumerations result = ApplicationDomainEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityEnumerations createCapabilityEnumerationsFromString(EDataType eDataType, String initialValue) {
		CapabilityEnumerations result = CapabilityEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVariantRecordEnumeratorPatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEnumeratorPatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEnumerations createUpdateEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateEnumerationsFromString(OmtPackage.eINSTANCE.getUpdateEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateEnumerationsToString(OmtPackage.eINSTANCE.getUpdateEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingEnumerator createVariantRecordEncodingEnumeratorObjectFromString(EDataType eDataType, String initialValue) {
		return createVariantRecordEncodingEnumeratorFromString(OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingEnumeratorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariantRecordEncodingEnumeratorToString(OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVariantRecordEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVariantRecordEncodingEnumeratorFromString(OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator().isInstance(instanceValue)) {
			try {
				String value = convertVariantRecordEncodingEnumeratorToString(OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignActionType createResignActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResignActionTypeFromString(OmtPackage.eINSTANCE.getResignActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResignActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResignActionTypeToString(OmtPackage.eINSTANCE.getResignActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationEnumeration createSecurityClassificationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSecurityClassificationEnumerationFromString(OmtPackage.eINSTANCE.getSecurityClassificationEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSecurityClassificationEnumerationToString(OmtPackage.eINSTANCE.getSecurityClassificationEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSecurityClassificationUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSecurityClassificationEnumerationFromString(OmtPackage.eINSTANCE.getSecurityClassificationEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getSecurityClassificationEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertSecurityClassificationEnumerationToString(OmtPackage.eINSTANCE.getSecurityClassificationEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingEnumerations createSharingEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createSharingEnumerationsFromString(OmtPackage.eINSTANCE.getSharingEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSharingEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSharingEnumerationsToString(OmtPackage.eINSTANCE.getSharingEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPOCTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPOCTypeEnumerationFromString(OmtPackage.eINSTANCE.getPOCTypeEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getPOCTypeEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertPOCTypeEnumerationToString(OmtPackage.eINSTANCE.getPOCTypeEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableEnumerations createReliableEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createReliableEnumerationsFromString(OmtPackage.eINSTANCE.getReliableEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliableEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReliableEnumerationsToString(OmtPackage.eINSTANCE.getReliableEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTypeEnumerations createOMTypeEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOMTypeEnumerationsFromString(OmtPackage.eINSTANCE.getOMTypeEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOMTypeEnumerationsToString(OmtPackage.eINSTANCE.getOMTypeEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOMTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createOMTypeEnumerationsFromString(OmtPackage.eINSTANCE.getOMTypeEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getOMTypeEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertOMTypeEnumerationsToString(OmtPackage.eINSTANCE.getOMTypeEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEnumerations createOrderEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderEnumerationsFromString(OmtPackage.eINSTANCE.getOrderEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderEnumerationsToString(OmtPackage.eINSTANCE.getOrderEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipEnumerations createOwnershipEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOwnershipEnumerationsFromString(OmtPackage.eINSTANCE.getOwnershipEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOwnershipEnumerationsToString(OmtPackage.eINSTANCE.getOwnershipEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POCTypeEnumeration createPOCTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createPOCTypeEnumerationFromString(OmtPackage.eINSTANCE.getPOCTypeEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPOCTypeEnumerationToString(OmtPackage.eINSTANCE.getPOCTypeEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphTypeEnumerations createGlyphTypeEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createGlyphTypeEnumerationsFromString(OmtPackage.eINSTANCE.getGlyphTypeEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGlyphTypeEnumerationsToString(OmtPackage.eINSTANCE.getGlyphTypeEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createGlyphTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createGlyphTypeEnumerationsFromString(OmtPackage.eINSTANCE.getGlyphTypeEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getGlyphTypeEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertGlyphTypeEnumerationsToString(OmtPackage.eINSTANCE.getGlyphTypeEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDimensionValuePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionValuePatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianEnumerations createEndianEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianEnumerationsFromString(OmtPackage.eINSTANCE.getEndianEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianEnumerationsToString(OmtPackage.eINSTANCE.getEndianEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingEnumeration createFixedRecordEncodingEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createFixedRecordEncodingEnumerationFromString(OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFixedRecordEncodingEnumerationToString(OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFixedRecordEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFixedRecordEncodingEnumerationFromString(OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertFixedRecordEncodingEnumerationToString(OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainEnumerations createApplicationDomainEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createApplicationDomainEnumerationsFromString(OmtPackage.eINSTANCE.getApplicationDomainEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApplicationDomainEnumerationsToString(OmtPackage.eINSTANCE.getApplicationDomainEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createApplicationDomainUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createApplicationDomainEnumerationsFromString(OmtPackage.eINSTANCE.getApplicationDomainEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getApplicationDomainEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertApplicationDomainEnumerationsToString(OmtPackage.eINSTANCE.getApplicationDomainEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArrayDatatypeEncodingEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayDatatypeEncodingEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArrayDatatypeEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createArrayDatatypeEncodingEnumFromString(OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(OmtPackage.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayDatatypeEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum().isInstance(instanceValue)) {
			try {
				String value = convertArrayDatatypeEncodingEnumToString(OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(OmtPackage.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityEnumerations createCapabilityEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityEnumerationsFromString(OmtPackage.eINSTANCE.getCapabilityEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityEnumerationsToString(OmtPackage.eINSTANCE.getCapabilityEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCardinalityPatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityPatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmtPackage getOmtPackage() {
		return (OmtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OmtPackage getPackage() {
		return OmtPackage.eINSTANCE;
	}

} //OmtFactoryImpl
