/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.util;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AlternativeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AnnounceSynchronizationPointType;
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
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectInstanceNameReservedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipType;
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
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignSwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RetractType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetAutomaticResignDirectiveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetRangeBoundsType;
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
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpperBoundType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ValueType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage
 * @generated
 */
public class OmtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OmtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OmtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OmtSwitch<Adapter> modelSwitch =
		new OmtSwitch<Adapter>() {
			@Override
			public Adapter caseUpdateRatesType(UpdateRatesType object) {
				return createUpdateRatesTypeAdapter();
			}
			@Override
			public Adapter caseUpdateRateType(UpdateRateType object) {
				return createUpdateRateTypeAdapter();
			}
			@Override
			public Adapter caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			@Override
			public Adapter caseUpperBoundType(UpperBoundType object) {
				return createUpperBoundTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordDataType(VariantRecordDataType object) {
				return createVariantRecordDataTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordDataType1(VariantRecordDataType1 object) {
				return createVariantRecordDataType1Adapter();
			}
			@Override
			public Adapter caseVariantRecordDataTypesType(VariantRecordDataTypesType object) {
				return createVariantRecordDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordEncodingType(VariantRecordEncodingType object) {
				return createVariantRecordEncodingTypeAdapter();
			}
			@Override
			public Adapter caseUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType object) {
				return createUnconditionalAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseUnpublishInteractionClassType(UnpublishInteractionClassType object) {
				return createUnpublishInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType object) {
				return createUnpublishObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeInteractionClassType(UnsubscribeInteractionClassType object) {
				return createUnsubscribeInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType object) {
				return createUnsubscribeInteractionClassWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType object) {
				return createUnsubscribeObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType object) {
				return createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseUpdateAttributeValuesType(UpdateAttributeValuesType object) {
				return createUpdateAttributeValuesTypeAdapter();
			}
			@Override
			public Adapter caseTimeStampType(TimeStampType object) {
				return createTimeStampTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTransportationsType(TransportationsType object) {
				return createTransportationsTypeAdapter();
			}
			@Override
			public Adapter caseTransportationType(TransportationType object) {
				return createTransportationTypeAdapter();
			}
			@Override
			public Adapter caseTransportationType1(TransportationType1 object) {
				return createTransportationType1Adapter();
			}
			@Override
			public Adapter caseTurnInteractionsOffType(TurnInteractionsOffType object) {
				return createTurnInteractionsOffTypeAdapter();
			}
			@Override
			public Adapter caseTurnInteractionsOnType(TurnInteractionsOnType object) {
				return createTurnInteractionsOnTypeAdapter();
			}
			@Override
			public Adapter caseTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType object) {
				return createTurnUpdatesOffForObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType object) {
				return createTurnUpdatesOnForObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTypeType(TypeType object) {
				return createTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType object) {
				return createUnassociateRegionsForUpdatesTypeAdapter();
			}
			@Override
			public Adapter caseSwitchType(SwitchType object) {
				return createSwitchTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointAchievedType(SynchronizationPointAchievedType object) {
				return createSynchronizationPointAchievedTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointType(SynchronizationPointType object) {
				return createSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointType1(SynchronizationPointType1 object) {
				return createSynchronizationPointType1Adapter();
			}
			@Override
			public Adapter caseSynchronizationsType(SynchronizationsType object) {
				return createSynchronizationsTypeAdapter();
			}
			@Override
			public Adapter caseTagsType(TagsType object) {
				return createTagsTypeAdapter();
			}
			@Override
			public Adapter caseTagType(TagType object) {
				return createTagTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceGrantType(TimeAdvanceGrantType object) {
				return createTimeAdvanceGrantTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType object) {
				return createTimeAdvanceRequestAvailableTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceRequestType(TimeAdvanceRequestType object) {
				return createTimeAdvanceRequestTypeAdapter();
			}
			@Override
			public Adapter caseTimeConstrainedEnabledType(TimeConstrainedEnabledType object) {
				return createTimeConstrainedEnabledTypeAdapter();
			}
			@Override
			public Adapter caseTimeRegulationEnabledType(TimeRegulationEnabledType object) {
				return createTimeRegulationEnabledTypeAdapter();
			}
			@Override
			public Adapter caseSharingType(SharingType object) {
				return createSharingTypeAdapter();
			}
			@Override
			public Adapter caseSimpleDataType(SimpleDataType object) {
				return createSimpleDataTypeAdapter();
			}
			@Override
			public Adapter caseSimpleDataType1(SimpleDataType1 object) {
				return createSimpleDataType1Adapter();
			}
			@Override
			public Adapter caseSimpleDataTypesType(SimpleDataTypesType object) {
				return createSimpleDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseStartRegistrationForObjectClassType(StartRegistrationForObjectClassType object) {
				return createStartRegistrationForObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseStopRegistrationForObjectClassType(StopRegistrationForObjectClassType object) {
				return createStopRegistrationForObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseString(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseSubscribeInteractionClassType(SubscribeInteractionClassType object) {
				return createSubscribeInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType object) {
				return createSubscribeInteractionClassWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType object) {
				return createSubscribeObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType object) {
				return createSubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseSwitchesType(SwitchesType object) {
				return createSwitchesTypeAdapter();
			}
			@Override
			public Adapter caseReserveObjectInstanceNameType(ReserveObjectInstanceNameType object) {
				return createReserveObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseResignFederationExecutionType(ResignFederationExecutionType object) {
				return createResignFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseResignSwitchType(ResignSwitchType object) {
				return createResignSwitchTypeAdapter();
			}
			@Override
			public Adapter caseRetractType(RetractType object) {
				return createRetractTypeAdapter();
			}
			@Override
			public Adapter caseSecurityClassificationType(SecurityClassificationType object) {
				return createSecurityClassificationTypeAdapter();
			}
			@Override
			public Adapter caseSendInteractionType(SendInteractionType object) {
				return createSendInteractionTypeAdapter();
			}
			@Override
			public Adapter caseSendInteractionWithRegionsType(SendInteractionWithRegionsType object) {
				return createSendInteractionWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseServiceUtilizationType(ServiceUtilizationType object) {
				return createServiceUtilizationTypeAdapter();
			}
			@Override
			public Adapter caseSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType object) {
				return createSetAutomaticResignDirectiveTypeAdapter();
			}
			@Override
			public Adapter caseSetRangeBoundsType(SetRangeBoundsType object) {
				return createSetRangeBoundsTypeAdapter();
			}
			@Override
			public Adapter caseReliableType(ReliableType object) {
				return createReliableTypeAdapter();
			}
			@Override
			public Adapter caseRemoveobjectinstanceType(RemoveobjectinstanceType object) {
				return createRemoveobjectinstanceTypeAdapter();
			}
			@Override
			public Adapter caseReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType object) {
				return createReportAttributeTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseReportFederationExecutionsType(ReportFederationExecutionsType object) {
				return createReportFederationExecutionsTypeAdapter();
			}
			@Override
			public Adapter caseReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType object) {
				return createReportInteractionTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType object) {
				return createRequestAttributeOwnershipAssumptionTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType object) {
				return createRequestAttributeOwnershipReleaseTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType object) {
				return createRequestAttributeTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeValueUpdateType(RequestAttributeValueUpdateType object) {
				return createRequestAttributeValueUpdateTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType object) {
				return createRequestAttributeValueUpdateWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseRequestDivestitureConfirmationType(RequestDivestitureConfirmationType object) {
				return createRequestDivestitureConfirmationTypeAdapter();
			}
			@Override
			public Adapter caseRequestFederationRestoreType(RequestFederationRestoreType object) {
				return createRequestFederationRestoreTypeAdapter();
			}
			@Override
			public Adapter caseRequestFederationSaveType(RequestFederationSaveType object) {
				return createRequestFederationSaveTypeAdapter();
			}
			@Override
			public Adapter caseRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType object) {
				return createRequestInteractionTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseRequestRetractionType(RequestRetractionType object) {
				return createRequestRetractionTypeAdapter();
			}
			@Override
			public Adapter caseReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType object) {
				return createReserveMultipleObjectInstanceNamesTypeAdapter();
			}
			@Override
			public Adapter casePocTypeType(PocTypeType object) {
				return createPocTypeTypeAdapter();
			}
			@Override
			public Adapter caseProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType object) {
				return createProvideAttributeValueUpdateTypeAdapter();
			}
			@Override
			public Adapter casePublishInteractionClassType(PublishInteractionClassType object) {
				return createPublishInteractionClassTypeAdapter();
			}
			@Override
			public Adapter casePublishObjectClassAttributesType(PublishObjectClassAttributesType object) {
				return createPublishObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseQueryAttributeOwnershipType(QueryAttributeOwnershipType object) {
				return createQueryAttributeOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType object) {
				return createQueryAttributeTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseQueryFederationRestoreStatusType(QueryFederationRestoreStatusType object) {
				return createQueryFederationRestoreStatusTypeAdapter();
			}
			@Override
			public Adapter caseQueryFederationSaveStatusType(QueryFederationSaveStatusType object) {
				return createQueryFederationSaveStatusTypeAdapter();
			}
			@Override
			public Adapter caseQueryGALTType(QueryGALTType object) {
				return createQueryGALTTypeAdapter();
			}
			@Override
			public Adapter caseQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType object) {
				return createQueryInteractionTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseQueryLITSType(QueryLITSType object) {
				return createQueryLITSTypeAdapter();
			}
			@Override
			public Adapter caseQueryLogicalTimeType(QueryLogicalTimeType object) {
				return createQueryLogicalTimeTypeAdapter();
			}
			@Override
			public Adapter caseQueryLookaheadType(QueryLookaheadType object) {
				return createQueryLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseRateType(RateType object) {
				return createRateTypeAdapter();
			}
			@Override
			public Adapter caseReceiveInteractionType(ReceiveInteractionType object) {
				return createReceiveInteractionTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseReflectAttributeValuesType(ReflectAttributeValuesType object) {
				return createReflectAttributeValuesTypeAdapter();
			}
			@Override
			public Adapter caseRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType object) {
				return createRegisterFederationSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseRegisterObjectInstanceType(RegisterObjectInstanceType object) {
				return createRegisterObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType object) {
				return createRegisterObjectInstanceWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType object) {
				return createReleaseMultipleObjectInstanceNamesTypeAdapter();
			}
			@Override
			public Adapter caseReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType object) {
				return createReleaseObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseNextMessageRequestType(NextMessageRequestType object) {
				return createNextMessageRequestTypeAdapter();
			}
			@Override
			public Adapter caseNonEmptyString1(NonEmptyString1 object) {
				return createNonEmptyString1Adapter();
			}
			@Override
			public Adapter caseNormalizeFederateHandleType(NormalizeFederateHandleType object) {
				return createNormalizeFederateHandleTypeAdapter();
			}
			@Override
			public Adapter caseNormalizeServiceGroupType(NormalizeServiceGroupType object) {
				return createNormalizeServiceGroupTypeAdapter();
			}
			@Override
			public Adapter caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseObjectClassType(ObjectClassType object) {
				return createObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseObjectClassType1(ObjectClassType1 object) {
				return createObjectClassType1Adapter();
			}
			@Override
			public Adapter caseObjectInstanceNameReservedType(ObjectInstanceNameReservedType object) {
				return createObjectInstanceNameReservedTypeAdapter();
			}
			@Override
			public Adapter caseObjectModelType(ObjectModelType object) {
				return createObjectModelTypeAdapter();
			}
			@Override
			public Adapter caseObjectsType(ObjectsType object) {
				return createObjectsTypeAdapter();
			}
			@Override
			public Adapter caseOrderType(OrderType object) {
				return createOrderTypeAdapter();
			}
			@Override
			public Adapter caseOwnershipType(OwnershipType object) {
				return createOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParameterType1(ParameterType1 object) {
				return createParameterType1Adapter();
			}
			@Override
			public Adapter casePocType(PocType object) {
				return createPocTypeAdapter();
			}
			@Override
			public Adapter casePocType1(PocType1 object) {
				return createPocType1Adapter();
			}
			@Override
			public Adapter caseGetObjectInstanceHandleType(GetObjectInstanceHandleType object) {
				return createGetObjectInstanceHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectInstanceNameType(GetObjectInstanceNameType object) {
				return createGetObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseGetOrderNameType(GetOrderNameType object) {
				return createGetOrderNameTypeAdapter();
			}
			@Override
			public Adapter caseGetOrderTypeType(GetOrderTypeType object) {
				return createGetOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseGetParameterHandleType(GetParameterHandleType object) {
				return createGetParameterHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetParameterNameType(GetParameterNameType object) {
				return createGetParameterNameTypeAdapter();
			}
			@Override
			public Adapter caseGetRangeBoundsType(GetRangeBoundsType object) {
				return createGetRangeBoundsTypeAdapter();
			}
			@Override
			public Adapter caseGetTransportationTypeHandleType(GetTransportationTypeHandleType object) {
				return createGetTransportationTypeHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetTransportationTypeNameType(GetTransportationTypeNameType object) {
				return createGetTransportationTypeNameTypeAdapter();
			}
			@Override
			public Adapter caseGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType object) {
				return createGetUpdateRateValueForAttributeTypeAdapter();
			}
			@Override
			public Adapter caseGetUpdateRateValueType(GetUpdateRateValueType object) {
				return createGetUpdateRateValueTypeAdapter();
			}
			@Override
			public Adapter caseGlyphType(GlyphType object) {
				return createGlyphTypeAdapter();
			}
			@Override
			public Adapter caseGlyphType1(GlyphType1 object) {
				return createGlyphType1Adapter();
			}
			@Override
			public Adapter caseIdentificationType(IdentificationType object) {
				return createIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseIdentifierType(IdentifierType object) {
				return createIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseIdReferenceType(IdReferenceType object) {
				return createIdReferenceTypeAdapter();
			}
			@Override
			public Adapter caseInformAttributeOwnershipType(InformAttributeOwnershipType object) {
				return createInformAttributeOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseInitiateFederateRestoreType(InitiateFederateRestoreType object) {
				return createInitiateFederateRestoreTypeAdapter();
			}
			@Override
			public Adapter caseInitiateFederateSaveType(InitiateFederateSaveType object) {
				return createInitiateFederateSaveTypeAdapter();
			}
			@Override
			public Adapter caseInteractionClassType(InteractionClassType object) {
				return createInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseInteractionClassType1(InteractionClassType1 object) {
				return createInteractionClassType1Adapter();
			}
			@Override
			public Adapter caseInteractionsType(InteractionsType object) {
				return createInteractionsTypeAdapter();
			}
			@Override
			public Adapter caseIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType object) {
				return createIsAttributeOwnedByFederateTypeAdapter();
			}
			@Override
			public Adapter caseJoinFederationExecutionType(JoinFederationExecutionType object) {
				return createJoinFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseKeywordType(KeywordType object) {
				return createKeywordTypeAdapter();
			}
			@Override
			public Adapter caseListFederationExecutionsType(ListFederationExecutionsType object) {
				return createListFederationExecutionsTypeAdapter();
			}
			@Override
			public Adapter caseLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType object) {
				return createLocalDeleteObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseLookaheadType(LookaheadType object) {
				return createLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseModelIdentificationType(ModelIdentificationType object) {
				return createModelIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseModificationDateType(ModificationDateType object) {
				return createModificationDateTypeAdapter();
			}
			@Override
			public Adapter caseModifyLookaheadType(ModifyLookaheadType object) {
				return createModifyLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType object) {
				return createMultipleObjectInstanceNamesReservedTypeAdapter();
			}
			@Override
			public Adapter caseNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType object) {
				return createNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseNextMessageRequestAvailableType(NextMessageRequestAvailableType object) {
				return createNextMessageRequestAvailableTypeAdapter();
			}
			@Override
			public Adapter caseConfirmDivestitureType(ConfirmDivestitureType object) {
				return createConfirmDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType object) {
				return createConfirmFederationRestorationRequestTypeAdapter();
			}
			@Override
			public Adapter caseConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType object) {
				return createConfirmInteractionTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType object) {
				return createConfirmSynchronizationPointRegistrationTypeAdapter();
			}
			@Override
			public Adapter caseConnectionLostType(ConnectionLostType object) {
				return createConnectionLostTypeAdapter();
			}
			@Override
			public Adapter caseConnectType(ConnectType object) {
				return createConnectTypeAdapter();
			}
			@Override
			public Adapter caseCreateFederationExecutionType(CreateFederationExecutionType object) {
				return createCreateFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseCreateRegionType(CreateRegionType object) {
				return createCreateRegionTypeAdapter();
			}
			@Override
			public Adapter caseDataTypesType(DataTypesType object) {
				return createDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseDeleteObjectInstanceType(DeleteObjectInstanceType object) {
				return createDeleteObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDeleteRegionType(DeleteRegionType object) {
				return createDeleteRegionTypeAdapter();
			}
			@Override
			public Adapter caseDestroyFederationExecutionType(DestroyFederationExecutionType object) {
				return createDestroyFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseDimensionsType(DimensionsType object) {
				return createDimensionsTypeAdapter();
			}
			@Override
			public Adapter caseDimensionsType1(DimensionsType1 object) {
				return createDimensionsType1Adapter();
			}
			@Override
			public Adapter caseDimensionsType2(DimensionsType2 object) {
				return createDimensionsType2Adapter();
			}
			@Override
			public Adapter caseDimensionType(DimensionType object) {
				return createDimensionTypeAdapter();
			}
			@Override
			public Adapter caseDimensionType1(DimensionType1 object) {
				return createDimensionType1Adapter();
			}
			@Override
			public Adapter caseDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType object) {
				return createDisableAsynchronousDeliveryTypeAdapter();
			}
			@Override
			public Adapter caseDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType object) {
				return createDisableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType object) {
				return createDisableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableCallbacksType(DisableCallbacksType object) {
				return createDisableCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType object) {
				return createDisableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType object) {
				return createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableTimeConstrainedType(DisableTimeConstrainedType object) {
				return createDisableTimeConstrainedTypeAdapter();
			}
			@Override
			public Adapter caseDisableTimeRegulationType(DisableTimeRegulationType object) {
				return createDisableTimeRegulationTypeAdapter();
			}
			@Override
			public Adapter caseDisconnectType(DisconnectType object) {
				return createDisconnectTypeAdapter();
			}
			@Override
			public Adapter caseDiscoverObjectInstanceType(DiscoverObjectInstanceType object) {
				return createDiscoverObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType object) {
				return createEnableAsynchronousDeliveryTypeAdapter();
			}
			@Override
			public Adapter caseEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType object) {
				return createEnableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType object) {
				return createEnableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableCallbacksType(EnableCallbacksType object) {
				return createEnableCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType object) {
				return createEnableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType object) {
				return createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableTimeConstrainedType(EnableTimeConstrainedType object) {
				return createEnableTimeConstrainedTypeAdapter();
			}
			@Override
			public Adapter caseEnableTimeRegulationType(EnableTimeRegulationType object) {
				return createEnableTimeRegulationTypeAdapter();
			}
			@Override
			public Adapter caseEndianType(EndianType object) {
				return createEndianTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedDataType(EnumeratedDataType object) {
				return createEnumeratedDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedDataType1(EnumeratedDataType1 object) {
				return createEnumeratedDataType1Adapter();
			}
			@Override
			public Adapter caseEnumeratedDataTypesType(EnumeratedDataTypesType object) {
				return createEnumeratedDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratorType(EnumeratorType object) {
				return createEnumeratorTypeAdapter();
			}
			@Override
			public Adapter caseEvokeCallbackType(EvokeCallbackType object) {
				return createEvokeCallbackTypeAdapter();
			}
			@Override
			public Adapter caseEvokeMultipleCallbacksType(EvokeMultipleCallbacksType object) {
				return createEvokeMultipleCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseFederateRestoreCompleteType(FederateRestoreCompleteType object) {
				return createFederateRestoreCompleteTypeAdapter();
			}
			@Override
			public Adapter caseFederateSaveBegunType(FederateSaveBegunType object) {
				return createFederateSaveBegunTypeAdapter();
			}
			@Override
			public Adapter caseFederateSaveCompleteType(FederateSaveCompleteType object) {
				return createFederateSaveCompleteTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoreBegunType(FederationRestoreBegunType object) {
				return createFederationRestoreBegunTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoredType(FederationRestoredType object) {
				return createFederationRestoredTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoreStatusResponseType(FederationRestoreStatusResponseType object) {
				return createFederationRestoreStatusResponseTypeAdapter();
			}
			@Override
			public Adapter caseFederationSavedType(FederationSavedType object) {
				return createFederationSavedTypeAdapter();
			}
			@Override
			public Adapter caseFederationSaveStatusResponseType(FederationSaveStatusResponseType object) {
				return createFederationSaveStatusResponseTypeAdapter();
			}
			@Override
			public Adapter caseFederationSynchronizedType(FederationSynchronizedType object) {
				return createFederationSynchronizedTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordDataType(FixedRecordDataType object) {
				return createFixedRecordDataTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordDataType1(FixedRecordDataType1 object) {
				return createFixedRecordDataType1Adapter();
			}
			@Override
			public Adapter caseFixedRecordDataTypesType(FixedRecordDataTypesType object) {
				return createFixedRecordDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordEncodingType(FixedRecordEncodingType object) {
				return createFixedRecordEncodingTypeAdapter();
			}
			@Override
			public Adapter caseFlushQueueRequestType(FlushQueueRequestType object) {
				return createFlushQueueRequestTypeAdapter();
			}
			@Override
			public Adapter caseGetAttributeHandleType(GetAttributeHandleType object) {
				return createGetAttributeHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetAttributeNameType(GetAttributeNameType object) {
				return createGetAttributeNameTypeAdapter();
			}
			@Override
			public Adapter caseGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType object) {
				return createGetAutomaticResignDirectiveTypeAdapter();
			}
			@Override
			public Adapter caseGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType object) {
				return createGetAvailableDimensionsForClassAttributeTypeAdapter();
			}
			@Override
			public Adapter caseGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType object) {
				return createGetAvailableDimensionsForInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionHandleSetType(GetDimensionHandleSetType object) {
				return createGetDimensionHandleSetTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionHandleType(GetDimensionHandleType object) {
				return createGetDimensionHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionNameType(GetDimensionNameType object) {
				return createGetDimensionNameTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionUpperBoundType(GetDimensionUpperBoundType object) {
				return createGetDimensionUpperBoundTypeAdapter();
			}
			@Override
			public Adapter caseGetFederateHandleType(GetFederateHandleType object) {
				return createGetFederateHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetFederateNameType(GetFederateNameType object) {
				return createGetFederateNameTypeAdapter();
			}
			@Override
			public Adapter caseGetInteractionClassHandleType(GetInteractionClassHandleType object) {
				return createGetInteractionClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetInteractionClassNameType(GetInteractionClassNameType object) {
				return createGetInteractionClassNameTypeAdapter();
			}
			@Override
			public Adapter caseGetKnownObjectClassHandleType(GetKnownObjectClassHandleType object) {
				return createGetKnownObjectClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectClassHandleType(GetObjectClassHandleType object) {
				return createGetObjectClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectClassNameType(GetObjectClassNameType object) {
				return createGetObjectClassNameTypeAdapter();
			}
			@Override
			public Adapter caseAbortFederationRestoreType(AbortFederationRestoreType object) {
				return createAbortFederationRestoreTypeAdapter();
			}
			@Override
			public Adapter caseAbortFederationSaveType(AbortFederationSaveType object) {
				return createAbortFederationSaveTypeAdapter();
			}
			@Override
			public Adapter caseAlternativeType(AlternativeType object) {
				return createAlternativeTypeAdapter();
			}
			@Override
			public Adapter caseAnnounceSynchronizationPointType(AnnounceSynchronizationPointType object) {
				return createAnnounceSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseApplicationDomainType(ApplicationDomainType object) {
				return createApplicationDomainTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataType(ArrayDataType object) {
				return createArrayDataTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataType1(ArrayDataType1 object) {
				return createArrayDataType1Adapter();
			}
			@Override
			public Adapter caseArrayDatatypeEncodingType(ArrayDatatypeEncodingType object) {
				return createArrayDatatypeEncodingTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataTypesType(ArrayDataTypesType object) {
				return createArrayDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataTypesType1(ArrayDataTypesType1 object) {
				return createArrayDataTypesType1Adapter();
			}
			@Override
			public Adapter caseAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType object) {
				return createAssociateRegionsForUpdatesTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType object) {
				return createAttributeOwnershipAcquisitionIfAvailableTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType object) {
				return createAttributeOwnershipAcquisitionNotificationTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType object) {
				return createAttributeOwnershipAcquisitionTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType object) {
				return createAttributeOwnershipDivestitureIfWantedTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType object) {
				return createAttributeOwnershipReleaseDeniedTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType object) {
				return createAttributeOwnershipUnavailableTypeAdapter();
			}
			@Override
			public Adapter caseAttributesInScopeType(AttributesInScopeType object) {
				return createAttributesInScopeTypeAdapter();
			}
			@Override
			public Adapter caseAttributesOutOfScopeType(AttributesOutOfScopeType object) {
				return createAttributesOutOfScopeTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType1(AttributeType1 object) {
				return createAttributeType1Adapter();
			}
			@Override
			public Adapter caseBasicDataRepresentationsType(BasicDataRepresentationsType object) {
				return createBasicDataRepresentationsTypeAdapter();
			}
			@Override
			public Adapter caseBasicDataType(BasicDataType object) {
				return createBasicDataTypeAdapter();
			}
			@Override
			public Adapter caseBasicDataType1(BasicDataType1 object) {
				return createBasicDataType1Adapter();
			}
			@Override
			public Adapter caseCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType object) {
				return createCancelAttributeOwnershipAcquisitionTypeAdapter();
			}
			@Override
			public Adapter caseCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType object) {
				return createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseCapabilityType(CapabilityType object) {
				return createCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityType(CardinalityType object) {
				return createCardinalityTypeAdapter();
			}
			@Override
			public Adapter caseChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType object) {
				return createChangeAttributeOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType object) {
				return createChangeInteractionOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseCommitRegionModificationsType(CommitRegionModificationsType object) {
				return createCommitRegionModificationsTypeAdapter();
			}
			@Override
			public Adapter caseConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType object) {
				return createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter();
			}
			@Override
			public Adapter caseConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType object) {
				return createConfirmAttributeTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRatesType <em>Update Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRatesType
	 * @generated
	 */
	public Adapter createUpdateRatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRateType <em>Update Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRateType
	 * @generated
	 */
	public Adapter createUpdateRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpperBoundType <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpperBoundType
	 * @generated
	 */
	public Adapter createUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType <em>Variant Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType1 <em>Variant Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType1
	 * @generated
	 */
	public Adapter createVariantRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataTypesType <em>Variant Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataTypesType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingType <em>Variant Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingType
	 * @generated
	 */
	public Adapter createVariantRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnconditionalAttributeOwnershipDivestitureType <em>Unconditional Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnconditionalAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createUnconditionalAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishInteractionClassType <em>Unpublish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishInteractionClassType
	 * @generated
	 */
	public Adapter createUnpublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishObjectClassAttributesType <em>Unpublish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnpublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassType <em>Unsubscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassWithRegionsType <em>Unsubscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesType <em>Unsubscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesWithRegionsType <em>Unsubscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateAttributeValuesType <em>Update Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateAttributeValuesType
	 * @generated
	 */
	public Adapter createUpdateAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeStampType
	 * @generated
	 */
	public Adapter createTimeStampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationsType <em>Transportations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationsType
	 * @generated
	 */
	public Adapter createTransportationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType <em>Transportation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType
	 * @generated
	 */
	public Adapter createTransportationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType1 <em>Transportation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType1
	 * @generated
	 */
	public Adapter createTransportationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOffType <em>Turn Interactions Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOffType
	 * @generated
	 */
	public Adapter createTurnInteractionsOffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOnType <em>Turn Interactions On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOnType
	 * @generated
	 */
	public Adapter createTurnInteractionsOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOffForObjectInstanceType <em>Turn Updates Off For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOffForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOffForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOnForObjectInstanceType <em>Turn Updates On For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOnForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOnForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnassociateRegionsForUpdatesType <em>Unassociate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnassociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createUnassociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchType <em>Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchType
	 * @generated
	 */
	public Adapter createSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointAchievedType <em>Synchronization Point Achieved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointAchievedType
	 * @generated
	 */
	public Adapter createSynchronizationPointAchievedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType <em>Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType
	 * @generated
	 */
	public Adapter createSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType1 <em>Synchronization Point Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType1
	 * @generated
	 */
	public Adapter createSynchronizationPointType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationsType <em>Synchronizations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationsType
	 * @generated
	 */
	public Adapter createSynchronizationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType <em>Tags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType
	 * @generated
	 */
	public Adapter createTagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagType
	 * @generated
	 */
	public Adapter createTagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceGrantType <em>Time Advance Grant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceGrantType
	 * @generated
	 */
	public Adapter createTimeAdvanceGrantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestAvailableType <em>Time Advance Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestAvailableType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestType <em>Time Advance Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeConstrainedEnabledType <em>Time Constrained Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeConstrainedEnabledType
	 * @generated
	 */
	public Adapter createTimeConstrainedEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeRegulationEnabledType <em>Time Regulation Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeRegulationEnabledType
	 * @generated
	 */
	public Adapter createTimeRegulationEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SharingType <em>Sharing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SharingType
	 * @generated
	 */
	public Adapter createSharingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType1 <em>Simple Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType1
	 * @generated
	 */
	public Adapter createSimpleDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataTypesType <em>Simple Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataTypesType
	 * @generated
	 */
	public Adapter createSimpleDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StartRegistrationForObjectClassType <em>Start Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StartRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStartRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StopRegistrationForObjectClassType <em>Stop Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StopRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStopRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassType <em>Subscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassWithRegionsType <em>Subscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesType <em>Subscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesWithRegionsType <em>Subscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType <em>Switches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType
	 * @generated
	 */
	public Adapter createSwitchesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveObjectInstanceNameType <em>Reserve Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReserveObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignFederationExecutionType <em>Resign Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignFederationExecutionType
	 * @generated
	 */
	public Adapter createResignFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignSwitchType <em>Resign Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignSwitchType
	 * @generated
	 */
	public Adapter createResignSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RetractType <em>Retract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RetractType
	 * @generated
	 */
	public Adapter createRetractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationType <em>Security Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationType
	 * @generated
	 */
	public Adapter createSecurityClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionType <em>Send Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionType
	 * @generated
	 */
	public Adapter createSendInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionWithRegionsType <em>Send Interaction With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionWithRegionsType
	 * @generated
	 */
	public Adapter createSendInteractionWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType <em>Service Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType
	 * @generated
	 */
	public Adapter createServiceUtilizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetAutomaticResignDirectiveType <em>Set Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createSetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetRangeBoundsType <em>Set Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetRangeBoundsType
	 * @generated
	 */
	public Adapter createSetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReliableType <em>Reliable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReliableType
	 * @generated
	 */
	public Adapter createReliableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RemoveobjectinstanceType <em>Removeobjectinstance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RemoveobjectinstanceType
	 * @generated
	 */
	public Adapter createRemoveobjectinstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportAttributeTransportationTypeType <em>Report Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createReportAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportFederationExecutionsType <em>Report Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportFederationExecutionsType
	 * @generated
	 */
	public Adapter createReportFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportInteractionTransportationTypeType <em>Report Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createReportInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipAssumptionType <em>Request Attribute Ownership Assumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipAssumptionType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipAssumptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipReleaseType <em>Request Attribute Ownership Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipReleaseType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipReleaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeTransportationTypeChangeType <em>Request Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateType <em>Request Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateWithRegionsType <em>Request Attribute Value Update With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateWithRegionsType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestDivestitureConfirmationType <em>Request Divestiture Confirmation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestDivestitureConfirmationType
	 * @generated
	 */
	public Adapter createRequestDivestitureConfirmationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationRestoreType <em>Request Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationRestoreType
	 * @generated
	 */
	public Adapter createRequestFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationSaveType <em>Request Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationSaveType
	 * @generated
	 */
	public Adapter createRequestFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestInteractionTransportationTypeChangeType <em>Request Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestRetractionType <em>Request Retraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestRetractionType
	 * @generated
	 */
	public Adapter createRequestRetractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveMultipleObjectInstanceNamesType <em>Reserve Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReserveMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocTypeType <em>Poc Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocTypeType
	 * @generated
	 */
	public Adapter createPocTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ProvideAttributeValueUpdateType <em>Provide Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ProvideAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createProvideAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishInteractionClassType <em>Publish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishInteractionClassType
	 * @generated
	 */
	public Adapter createPublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishObjectClassAttributesType <em>Publish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createPublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeOwnershipType <em>Query Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeOwnershipType
	 * @generated
	 */
	public Adapter createQueryAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeTransportationTypeType <em>Query Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationRestoreStatusType <em>Query Federation Restore Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationRestoreStatusType
	 * @generated
	 */
	public Adapter createQueryFederationRestoreStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationSaveStatusType <em>Query Federation Save Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationSaveStatusType
	 * @generated
	 */
	public Adapter createQueryFederationSaveStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryGALTType <em>Query GALT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryGALTType
	 * @generated
	 */
	public Adapter createQueryGALTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryInteractionTransportationTypeType <em>Query Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLITSType <em>Query LITS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLITSType
	 * @generated
	 */
	public Adapter createQueryLITSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLogicalTimeType <em>Query Logical Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLogicalTimeType
	 * @generated
	 */
	public Adapter createQueryLogicalTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLookaheadType <em>Query Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLookaheadType
	 * @generated
	 */
	public Adapter createQueryLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RateType
	 * @generated
	 */
	public Adapter createRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReceiveInteractionType <em>Receive Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReceiveInteractionType
	 * @generated
	 */
	public Adapter createReceiveInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReflectAttributeValuesType <em>Reflect Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReflectAttributeValuesType
	 * @generated
	 */
	public Adapter createReflectAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterFederationSynchronizationPointType <em>Register Federation Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterFederationSynchronizationPointType
	 * @generated
	 */
	public Adapter createRegisterFederationSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceType <em>Register Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceWithRegionsType <em>Register Object Instance With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceWithRegionsType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseMultipleObjectInstanceNamesType <em>Release Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReleaseMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseObjectInstanceNameType <em>Release Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReleaseObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestType <em>Next Message Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestType
	 * @generated
	 */
	public Adapter createNextMessageRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NonEmptyString1 <em>Non Empty String1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NonEmptyString1
	 * @generated
	 */
	public Adapter createNonEmptyString1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeFederateHandleType <em>Normalize Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeFederateHandleType
	 * @generated
	 */
	public Adapter createNormalizeFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeServiceGroupType <em>Normalize Service Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeServiceGroupType
	 * @generated
	 */
	public Adapter createNormalizeServiceGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType <em>Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType
	 * @generated
	 */
	public Adapter createObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType1 <em>Object Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType1
	 * @generated
	 */
	public Adapter createObjectClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectInstanceNameReservedType <em>Object Instance Name Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectInstanceNameReservedType
	 * @generated
	 */
	public Adapter createObjectInstanceNameReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType <em>Object Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType
	 * @generated
	 */
	public Adapter createObjectModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectsType <em>Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectsType
	 * @generated
	 */
	public Adapter createObjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderType
	 * @generated
	 */
	public Adapter createOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipType <em>Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipType
	 * @generated
	 */
	public Adapter createOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType1 <em>Parameter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType1
	 * @generated
	 */
	public Adapter createParameterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType <em>Poc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType
	 * @generated
	 */
	public Adapter createPocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType1 <em>Poc Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType1
	 * @generated
	 */
	public Adapter createPocType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceHandleType <em>Get Object Instance Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceHandleType
	 * @generated
	 */
	public Adapter createGetObjectInstanceHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceNameType <em>Get Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceNameType
	 * @generated
	 */
	public Adapter createGetObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderNameType <em>Get Order Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderNameType
	 * @generated
	 */
	public Adapter createGetOrderNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderTypeType <em>Get Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderTypeType
	 * @generated
	 */
	public Adapter createGetOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterHandleType <em>Get Parameter Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterHandleType
	 * @generated
	 */
	public Adapter createGetParameterHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterNameType <em>Get Parameter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterNameType
	 * @generated
	 */
	public Adapter createGetParameterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetRangeBoundsType <em>Get Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetRangeBoundsType
	 * @generated
	 */
	public Adapter createGetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeHandleType <em>Get Transportation Type Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeHandleType
	 * @generated
	 */
	public Adapter createGetTransportationTypeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeNameType <em>Get Transportation Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeNameType
	 * @generated
	 */
	public Adapter createGetTransportationTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueForAttributeType <em>Get Update Rate Value For Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueForAttributeType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueForAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueType <em>Get Update Rate Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType <em>Glyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType
	 * @generated
	 */
	public Adapter createGlyphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType1 <em>Glyph Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType1
	 * @generated
	 */
	public Adapter createGlyphType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentificationType
	 * @generated
	 */
	public Adapter createIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdReferenceType <em>Id Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdReferenceType
	 * @generated
	 */
	public Adapter createIdReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InformAttributeOwnershipType <em>Inform Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InformAttributeOwnershipType
	 * @generated
	 */
	public Adapter createInformAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateRestoreType <em>Initiate Federate Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateRestoreType
	 * @generated
	 */
	public Adapter createInitiateFederateRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateSaveType <em>Initiate Federate Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateSaveType
	 * @generated
	 */
	public Adapter createInitiateFederateSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType <em>Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType
	 * @generated
	 */
	public Adapter createInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType1 <em>Interaction Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType1
	 * @generated
	 */
	public Adapter createInteractionClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionsType <em>Interactions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionsType
	 * @generated
	 */
	public Adapter createInteractionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IsAttributeOwnedByFederateType <em>Is Attribute Owned By Federate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IsAttributeOwnedByFederateType
	 * @generated
	 */
	public Adapter createIsAttributeOwnedByFederateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.JoinFederationExecutionType <em>Join Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.JoinFederationExecutionType
	 * @generated
	 */
	public Adapter createJoinFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType <em>Keyword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType
	 * @generated
	 */
	public Adapter createKeywordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ListFederationExecutionsType <em>List Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ListFederationExecutionsType
	 * @generated
	 */
	public Adapter createListFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LocalDeleteObjectInstanceType <em>Local Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LocalDeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createLocalDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LookaheadType <em>Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LookaheadType
	 * @generated
	 */
	public Adapter createLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType <em>Model Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType
	 * @generated
	 */
	public Adapter createModelIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModificationDateType <em>Modification Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModificationDateType
	 * @generated
	 */
	public Adapter createModificationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModifyLookaheadType <em>Modify Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModifyLookaheadType
	 * @generated
	 */
	public Adapter createModifyLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.MultipleObjectInstanceNamesReservedType <em>Multiple Object Instance Names Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.MultipleObjectInstanceNamesReservedType
	 * @generated
	 */
	public Adapter createMultipleObjectInstanceNamesReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NegotiatedAttributeOwnershipDivestitureType <em>Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestAvailableType <em>Next Message Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestAvailableType
	 * @generated
	 */
	public Adapter createNextMessageRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmDivestitureType <em>Confirm Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmDivestitureType
	 * @generated
	 */
	public Adapter createConfirmDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmFederationRestorationRequestType <em>Confirm Federation Restoration Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmFederationRestorationRequestType
	 * @generated
	 */
	public Adapter createConfirmFederationRestorationRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmInteractionTransportationTypeChangeType <em>Confirm Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmSynchronizationPointRegistrationType <em>Confirm Synchronization Point Registration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmSynchronizationPointRegistrationType
	 * @generated
	 */
	public Adapter createConfirmSynchronizationPointRegistrationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectionLostType <em>Connection Lost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectionLostType
	 * @generated
	 */
	public Adapter createConnectionLostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectType <em>Connect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectType
	 * @generated
	 */
	public Adapter createConnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateFederationExecutionType <em>Create Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateFederationExecutionType
	 * @generated
	 */
	public Adapter createCreateFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateRegionType <em>Create Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateRegionType
	 * @generated
	 */
	public Adapter createCreateRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DataTypesType
	 * @generated
	 */
	public Adapter createDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteObjectInstanceType <em>Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteRegionType <em>Delete Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteRegionType
	 * @generated
	 */
	public Adapter createDeleteRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DestroyFederationExecutionType <em>Destroy Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DestroyFederationExecutionType
	 * @generated
	 */
	public Adapter createDestroyFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType <em>Dimensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType
	 * @generated
	 */
	public Adapter createDimensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType1 <em>Dimensions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType1
	 * @generated
	 */
	public Adapter createDimensionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType2 <em>Dimensions Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType2
	 * @generated
	 */
	public Adapter createDimensionsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType
	 * @generated
	 */
	public Adapter createDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType1 <em>Dimension Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType1
	 * @generated
	 */
	public Adapter createDimensionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAsynchronousDeliveryType <em>Disable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createDisableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeRelevanceAdvisorySwitchType <em>Disable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeScopeAdvisorySwitchType <em>Disable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableCallbacksType <em>Disable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableCallbacksType
	 * @generated
	 */
	public Adapter createDisableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableInteractionRelevanceAdvisorySwitchType <em>Disable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableObjectClassRelevanceAdvisorySwitchType <em>Disable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeConstrainedType <em>Disable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeConstrainedType
	 * @generated
	 */
	public Adapter createDisableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeRegulationType <em>Disable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeRegulationType
	 * @generated
	 */
	public Adapter createDisableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisconnectType <em>Disconnect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisconnectType
	 * @generated
	 */
	public Adapter createDisconnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DiscoverObjectInstanceType <em>Discover Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DiscoverObjectInstanceType
	 * @generated
	 */
	public Adapter createDiscoverObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAsynchronousDeliveryType <em>Enable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createEnableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeRelevanceAdvisorySwitchType <em>Enable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeScopeAdvisorySwitchType <em>Enable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableCallbacksType <em>Enable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableCallbacksType
	 * @generated
	 */
	public Adapter createEnableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableInteractionRelevanceAdvisorySwitchType <em>Enable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableObjectClassRelevanceAdvisorySwitchType <em>Enable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeConstrainedType <em>Enable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeConstrainedType
	 * @generated
	 */
	public Adapter createEnableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeRegulationType <em>Enable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeRegulationType
	 * @generated
	 */
	public Adapter createEnableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianType
	 * @generated
	 */
	public Adapter createEndianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType <em>Enumerated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType1 <em>Enumerated Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType1
	 * @generated
	 */
	public Adapter createEnumeratedDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataTypesType <em>Enumerated Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataTypesType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratorType <em>Enumerator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratorType
	 * @generated
	 */
	public Adapter createEnumeratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeCallbackType <em>Evoke Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeCallbackType
	 * @generated
	 */
	public Adapter createEvokeCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeMultipleCallbacksType <em>Evoke Multiple Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeMultipleCallbacksType
	 * @generated
	 */
	public Adapter createEvokeMultipleCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateRestoreCompleteType <em>Federate Restore Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateRestoreCompleteType
	 * @generated
	 */
	public Adapter createFederateRestoreCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveBegunType <em>Federate Save Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveBegunType
	 * @generated
	 */
	public Adapter createFederateSaveBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveCompleteType <em>Federate Save Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveCompleteType
	 * @generated
	 */
	public Adapter createFederateSaveCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreBegunType <em>Federation Restore Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreBegunType
	 * @generated
	 */
	public Adapter createFederationRestoreBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoredType <em>Federation Restored Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoredType
	 * @generated
	 */
	public Adapter createFederationRestoredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreStatusResponseType <em>Federation Restore Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreStatusResponseType
	 * @generated
	 */
	public Adapter createFederationRestoreStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSavedType <em>Federation Saved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSavedType
	 * @generated
	 */
	public Adapter createFederationSavedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSaveStatusResponseType <em>Federation Save Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSaveStatusResponseType
	 * @generated
	 */
	public Adapter createFederationSaveStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSynchronizedType <em>Federation Synchronized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSynchronizedType
	 * @generated
	 */
	public Adapter createFederationSynchronizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType <em>Fixed Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType1 <em>Fixed Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType1
	 * @generated
	 */
	public Adapter createFixedRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataTypesType <em>Fixed Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataTypesType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordEncodingType <em>Fixed Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordEncodingType
	 * @generated
	 */
	public Adapter createFixedRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FlushQueueRequestType <em>Flush Queue Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FlushQueueRequestType
	 * @generated
	 */
	public Adapter createFlushQueueRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeHandleType <em>Get Attribute Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeHandleType
	 * @generated
	 */
	public Adapter createGetAttributeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeNameType <em>Get Attribute Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeNameType
	 * @generated
	 */
	public Adapter createGetAttributeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAutomaticResignDirectiveType <em>Get Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createGetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForClassAttributeType <em>Get Available Dimensions For Class Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForClassAttributeType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForClassAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForInteractionClassType <em>Get Available Dimensions For Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForInteractionClassType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleSetType <em>Get Dimension Handle Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleSetType
	 * @generated
	 */
	public Adapter createGetDimensionHandleSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleType <em>Get Dimension Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleType
	 * @generated
	 */
	public Adapter createGetDimensionHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionNameType <em>Get Dimension Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionNameType
	 * @generated
	 */
	public Adapter createGetDimensionNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionUpperBoundType <em>Get Dimension Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionUpperBoundType
	 * @generated
	 */
	public Adapter createGetDimensionUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateHandleType <em>Get Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateHandleType
	 * @generated
	 */
	public Adapter createGetFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateNameType <em>Get Federate Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateNameType
	 * @generated
	 */
	public Adapter createGetFederateNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassHandleType <em>Get Interaction Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassHandleType
	 * @generated
	 */
	public Adapter createGetInteractionClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType <em>Get Interaction Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType
	 * @generated
	 */
	public Adapter createGetInteractionClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetKnownObjectClassHandleType <em>Get Known Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetKnownObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetKnownObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassHandleType <em>Get Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassNameType <em>Get Object Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassNameType
	 * @generated
	 */
	public Adapter createGetObjectClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationRestoreType <em>Abort Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationRestoreType
	 * @generated
	 */
	public Adapter createAbortFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationSaveType <em>Abort Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationSaveType
	 * @generated
	 */
	public Adapter createAbortFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AlternativeType <em>Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AlternativeType
	 * @generated
	 */
	public Adapter createAlternativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AnnounceSynchronizationPointType <em>Announce Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AnnounceSynchronizationPointType
	 * @generated
	 */
	public Adapter createAnnounceSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ApplicationDomainType <em>Application Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ApplicationDomainType
	 * @generated
	 */
	public Adapter createApplicationDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType <em>Array Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType
	 * @generated
	 */
	public Adapter createArrayDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType1 <em>Array Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType1
	 * @generated
	 */
	public Adapter createArrayDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDatatypeEncodingType <em>Array Datatype Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDatatypeEncodingType
	 * @generated
	 */
	public Adapter createArrayDatatypeEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType <em>Array Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType
	 * @generated
	 */
	public Adapter createArrayDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType1 <em>Array Data Types Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType1
	 * @generated
	 */
	public Adapter createArrayDataTypesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AssociateRegionsForUpdatesType <em>Associate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AssociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createAssociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionIfAvailableType <em>Attribute Ownership Acquisition If Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionIfAvailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionIfAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionNotificationType <em>Attribute Ownership Acquisition Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionNotificationType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionType <em>Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipDivestitureIfWantedType <em>Attribute Ownership Divestiture If Wanted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipDivestitureIfWantedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipDivestitureIfWantedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipReleaseDeniedType <em>Attribute Ownership Release Denied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipReleaseDeniedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipReleaseDeniedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipUnavailableType <em>Attribute Ownership Unavailable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipUnavailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipUnavailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesInScopeType <em>Attributes In Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesInScopeType
	 * @generated
	 */
	public Adapter createAttributesInScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesOutOfScopeType <em>Attributes Out Of Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesOutOfScopeType
	 * @generated
	 */
	public Adapter createAttributesOutOfScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType1 <em>Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType1
	 * @generated
	 */
	public Adapter createAttributeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataRepresentationsType <em>Basic Data Representations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataRepresentationsType
	 * @generated
	 */
	public Adapter createBasicDataRepresentationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType
	 * @generated
	 */
	public Adapter createBasicDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType1 <em>Basic Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType1
	 * @generated
	 */
	public Adapter createBasicDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelAttributeOwnershipAcquisitionType <em>Cancel Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelAttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createCancelAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelNegotiatedAttributeOwnershipDivestitureType <em>Cancel Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelNegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CapabilityType
	 * @generated
	 */
	public Adapter createCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CardinalityType
	 * @generated
	 */
	public Adapter createCardinalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeAttributeOrderTypeType <em>Change Attribute Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeAttributeOrderTypeType
	 * @generated
	 */
	public Adapter createChangeAttributeOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeInteractionOrderTypeType <em>Change Interaction Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeInteractionOrderTypeType
	 * @generated
	 */
	public Adapter createChangeInteractionOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CommitRegionModificationsType <em>Commit Region Modifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CommitRegionModificationsType
	 * @generated
	 */
	public Adapter createCommitRegionModificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType <em>Confirm Attribute Ownership Acquisition Cancellation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType
	 * @generated
	 */
	public Adapter createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeTransportationTypeChangeType <em>Confirm Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OmtAdapterFactory
