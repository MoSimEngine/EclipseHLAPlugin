/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.util;

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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage
 * @generated
 */
public class OmtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OmtValidator INSTANCE = new OmtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.modsim.hla.ieee1516.omt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmtValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OmtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OmtPackage.UPDATE_RATES_TYPE:
				return validateUpdateRatesType((UpdateRatesType)value, diagnostics, context);
			case OmtPackage.UPDATE_RATE_TYPE:
				return validateUpdateRateType((UpdateRateType)value, diagnostics, context);
			case OmtPackage.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case OmtPackage.UPPER_BOUND_TYPE:
				return validateUpperBoundType((UpperBoundType)value, diagnostics, context);
			case OmtPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_DATA_TYPE:
				return validateVariantRecordDataType((VariantRecordDataType)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_DATA_TYPE1:
				return validateVariantRecordDataType1((VariantRecordDataType1)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_DATA_TYPES_TYPE:
				return validateVariantRecordDataTypesType((VariantRecordDataTypesType)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_ENCODING_TYPE:
				return validateVariantRecordEncodingType((VariantRecordEncodingType)value, diagnostics, context);
			case OmtPackage.UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE:
				return validateUnconditionalAttributeOwnershipDivestitureType((UnconditionalAttributeOwnershipDivestitureType)value, diagnostics, context);
			case OmtPackage.UNPUBLISH_INTERACTION_CLASS_TYPE:
				return validateUnpublishInteractionClassType((UnpublishInteractionClassType)value, diagnostics, context);
			case OmtPackage.UNPUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE:
				return validateUnpublishObjectClassAttributesType((UnpublishObjectClassAttributesType)value, diagnostics, context);
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_TYPE:
				return validateUnsubscribeInteractionClassType((UnsubscribeInteractionClassType)value, diagnostics, context);
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE:
				return validateUnsubscribeInteractionClassWithRegionsType((UnsubscribeInteractionClassWithRegionsType)value, diagnostics, context);
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE:
				return validateUnsubscribeObjectClassAttributesType((UnsubscribeObjectClassAttributesType)value, diagnostics, context);
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE:
				return validateUnsubscribeObjectClassAttributesWithRegionsType((UnsubscribeObjectClassAttributesWithRegionsType)value, diagnostics, context);
			case OmtPackage.UPDATE_ATTRIBUTE_VALUES_TYPE:
				return validateUpdateAttributeValuesType((UpdateAttributeValuesType)value, diagnostics, context);
			case OmtPackage.TIME_STAMP_TYPE:
				return validateTimeStampType((TimeStampType)value, diagnostics, context);
			case OmtPackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case OmtPackage.TRANSPORTATIONS_TYPE:
				return validateTransportationsType((TransportationsType)value, diagnostics, context);
			case OmtPackage.TRANSPORTATION_TYPE:
				return validateTransportationType((TransportationType)value, diagnostics, context);
			case OmtPackage.TRANSPORTATION_TYPE1:
				return validateTransportationType1((TransportationType1)value, diagnostics, context);
			case OmtPackage.TURN_INTERACTIONS_OFF_TYPE:
				return validateTurnInteractionsOffType((TurnInteractionsOffType)value, diagnostics, context);
			case OmtPackage.TURN_INTERACTIONS_ON_TYPE:
				return validateTurnInteractionsOnType((TurnInteractionsOnType)value, diagnostics, context);
			case OmtPackage.TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE_TYPE:
				return validateTurnUpdatesOffForObjectInstanceType((TurnUpdatesOffForObjectInstanceType)value, diagnostics, context);
			case OmtPackage.TURN_UPDATES_ON_FOR_OBJECT_INSTANCE_TYPE:
				return validateTurnUpdatesOnForObjectInstanceType((TurnUpdatesOnForObjectInstanceType)value, diagnostics, context);
			case OmtPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case OmtPackage.UNASSOCIATE_REGIONS_FOR_UPDATES_TYPE:
				return validateUnassociateRegionsForUpdatesType((UnassociateRegionsForUpdatesType)value, diagnostics, context);
			case OmtPackage.SWITCH_TYPE:
				return validateSwitchType((SwitchType)value, diagnostics, context);
			case OmtPackage.SYNCHRONIZATION_POINT_ACHIEVED_TYPE:
				return validateSynchronizationPointAchievedType((SynchronizationPointAchievedType)value, diagnostics, context);
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE:
				return validateSynchronizationPointType((SynchronizationPointType)value, diagnostics, context);
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE1:
				return validateSynchronizationPointType1((SynchronizationPointType1)value, diagnostics, context);
			case OmtPackage.SYNCHRONIZATIONS_TYPE:
				return validateSynchronizationsType((SynchronizationsType)value, diagnostics, context);
			case OmtPackage.TAGS_TYPE:
				return validateTagsType((TagsType)value, diagnostics, context);
			case OmtPackage.TAG_TYPE:
				return validateTagType((TagType)value, diagnostics, context);
			case OmtPackage.TIME_ADVANCE_GRANT_TYPE:
				return validateTimeAdvanceGrantType((TimeAdvanceGrantType)value, diagnostics, context);
			case OmtPackage.TIME_ADVANCE_REQUEST_AVAILABLE_TYPE:
				return validateTimeAdvanceRequestAvailableType((TimeAdvanceRequestAvailableType)value, diagnostics, context);
			case OmtPackage.TIME_ADVANCE_REQUEST_TYPE:
				return validateTimeAdvanceRequestType((TimeAdvanceRequestType)value, diagnostics, context);
			case OmtPackage.TIME_CONSTRAINED_ENABLED_TYPE:
				return validateTimeConstrainedEnabledType((TimeConstrainedEnabledType)value, diagnostics, context);
			case OmtPackage.TIME_REGULATION_ENABLED_TYPE:
				return validateTimeRegulationEnabledType((TimeRegulationEnabledType)value, diagnostics, context);
			case OmtPackage.SHARING_TYPE:
				return validateSharingType((SharingType)value, diagnostics, context);
			case OmtPackage.SIMPLE_DATA_TYPE:
				return validateSimpleDataType((SimpleDataType)value, diagnostics, context);
			case OmtPackage.SIMPLE_DATA_TYPE1:
				return validateSimpleDataType1((SimpleDataType1)value, diagnostics, context);
			case OmtPackage.SIMPLE_DATA_TYPES_TYPE:
				return validateSimpleDataTypesType((SimpleDataTypesType)value, diagnostics, context);
			case OmtPackage.SIZE:
				return validateSize((Size)value, diagnostics, context);
			case OmtPackage.START_REGISTRATION_FOR_OBJECT_CLASS_TYPE:
				return validateStartRegistrationForObjectClassType((StartRegistrationForObjectClassType)value, diagnostics, context);
			case OmtPackage.STOP_REGISTRATION_FOR_OBJECT_CLASS_TYPE:
				return validateStopRegistrationForObjectClassType((StopRegistrationForObjectClassType)value, diagnostics, context);
			case OmtPackage.STRING:
				return validateString((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)value, diagnostics, context);
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_TYPE:
				return validateSubscribeInteractionClassType((SubscribeInteractionClassType)value, diagnostics, context);
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE:
				return validateSubscribeInteractionClassWithRegionsType((SubscribeInteractionClassWithRegionsType)value, diagnostics, context);
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE:
				return validateSubscribeObjectClassAttributesType((SubscribeObjectClassAttributesType)value, diagnostics, context);
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE:
				return validateSubscribeObjectClassAttributesWithRegionsType((SubscribeObjectClassAttributesWithRegionsType)value, diagnostics, context);
			case OmtPackage.SWITCHES_TYPE:
				return validateSwitchesType((SwitchesType)value, diagnostics, context);
			case OmtPackage.RESERVE_OBJECT_INSTANCE_NAME_TYPE:
				return validateReserveObjectInstanceNameType((ReserveObjectInstanceNameType)value, diagnostics, context);
			case OmtPackage.RESIGN_FEDERATION_EXECUTION_TYPE:
				return validateResignFederationExecutionType((ResignFederationExecutionType)value, diagnostics, context);
			case OmtPackage.RESIGN_SWITCH_TYPE:
				return validateResignSwitchType((ResignSwitchType)value, diagnostics, context);
			case OmtPackage.RETRACT_TYPE:
				return validateRetractType((RetractType)value, diagnostics, context);
			case OmtPackage.SECURITY_CLASSIFICATION_TYPE:
				return validateSecurityClassificationType((SecurityClassificationType)value, diagnostics, context);
			case OmtPackage.SEND_INTERACTION_TYPE:
				return validateSendInteractionType((SendInteractionType)value, diagnostics, context);
			case OmtPackage.SEND_INTERACTION_WITH_REGIONS_TYPE:
				return validateSendInteractionWithRegionsType((SendInteractionWithRegionsType)value, diagnostics, context);
			case OmtPackage.SERVICE_UTILIZATION_TYPE:
				return validateServiceUtilizationType((ServiceUtilizationType)value, diagnostics, context);
			case OmtPackage.SET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE:
				return validateSetAutomaticResignDirectiveType((SetAutomaticResignDirectiveType)value, diagnostics, context);
			case OmtPackage.SET_RANGE_BOUNDS_TYPE:
				return validateSetRangeBoundsType((SetRangeBoundsType)value, diagnostics, context);
			case OmtPackage.RELIABLE_TYPE:
				return validateReliableType((ReliableType)value, diagnostics, context);
			case OmtPackage.REMOVEOBJECTINSTANCE_TYPE:
				return validateRemoveobjectinstanceType((RemoveobjectinstanceType)value, diagnostics, context);
			case OmtPackage.REPORT_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE:
				return validateReportAttributeTransportationTypeType((ReportAttributeTransportationTypeType)value, diagnostics, context);
			case OmtPackage.REPORT_FEDERATION_EXECUTIONS_TYPE:
				return validateReportFederationExecutionsType((ReportFederationExecutionsType)value, diagnostics, context);
			case OmtPackage.REPORT_INTERACTION_TRANSPORTATION_TYPE_TYPE:
				return validateReportInteractionTransportationTypeType((ReportInteractionTransportationTypeType)value, diagnostics, context);
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION_TYPE:
				return validateRequestAttributeOwnershipAssumptionType((RequestAttributeOwnershipAssumptionType)value, diagnostics, context);
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE_TYPE:
				return validateRequestAttributeOwnershipReleaseType((RequestAttributeOwnershipReleaseType)value, diagnostics, context);
			case OmtPackage.REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE:
				return validateRequestAttributeTransportationTypeChangeType((RequestAttributeTransportationTypeChangeType)value, diagnostics, context);
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_TYPE:
				return validateRequestAttributeValueUpdateType((RequestAttributeValueUpdateType)value, diagnostics, context);
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS_TYPE:
				return validateRequestAttributeValueUpdateWithRegionsType((RequestAttributeValueUpdateWithRegionsType)value, diagnostics, context);
			case OmtPackage.REQUEST_DIVESTITURE_CONFIRMATION_TYPE:
				return validateRequestDivestitureConfirmationType((RequestDivestitureConfirmationType)value, diagnostics, context);
			case OmtPackage.REQUEST_FEDERATION_RESTORE_TYPE:
				return validateRequestFederationRestoreType((RequestFederationRestoreType)value, diagnostics, context);
			case OmtPackage.REQUEST_FEDERATION_SAVE_TYPE:
				return validateRequestFederationSaveType((RequestFederationSaveType)value, diagnostics, context);
			case OmtPackage.REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE:
				return validateRequestInteractionTransportationTypeChangeType((RequestInteractionTransportationTypeChangeType)value, diagnostics, context);
			case OmtPackage.REQUEST_RETRACTION_TYPE:
				return validateRequestRetractionType((RequestRetractionType)value, diagnostics, context);
			case OmtPackage.RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE:
				return validateReserveMultipleObjectInstanceNamesType((ReserveMultipleObjectInstanceNamesType)value, diagnostics, context);
			case OmtPackage.POC_TYPE_TYPE:
				return validatePocTypeType((PocTypeType)value, diagnostics, context);
			case OmtPackage.PROVIDE_ATTRIBUTE_VALUE_UPDATE_TYPE:
				return validateProvideAttributeValueUpdateType((ProvideAttributeValueUpdateType)value, diagnostics, context);
			case OmtPackage.PUBLISH_INTERACTION_CLASS_TYPE:
				return validatePublishInteractionClassType((PublishInteractionClassType)value, diagnostics, context);
			case OmtPackage.PUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE:
				return validatePublishObjectClassAttributesType((PublishObjectClassAttributesType)value, diagnostics, context);
			case OmtPackage.QUERY_ATTRIBUTE_OWNERSHIP_TYPE:
				return validateQueryAttributeOwnershipType((QueryAttributeOwnershipType)value, diagnostics, context);
			case OmtPackage.QUERY_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE:
				return validateQueryAttributeTransportationTypeType((QueryAttributeTransportationTypeType)value, diagnostics, context);
			case OmtPackage.QUERY_FEDERATION_RESTORE_STATUS_TYPE:
				return validateQueryFederationRestoreStatusType((QueryFederationRestoreStatusType)value, diagnostics, context);
			case OmtPackage.QUERY_FEDERATION_SAVE_STATUS_TYPE:
				return validateQueryFederationSaveStatusType((QueryFederationSaveStatusType)value, diagnostics, context);
			case OmtPackage.QUERY_GALT_TYPE:
				return validateQueryGALTType((QueryGALTType)value, diagnostics, context);
			case OmtPackage.QUERY_INTERACTION_TRANSPORTATION_TYPE_TYPE:
				return validateQueryInteractionTransportationTypeType((QueryInteractionTransportationTypeType)value, diagnostics, context);
			case OmtPackage.QUERY_LITS_TYPE:
				return validateQueryLITSType((QueryLITSType)value, diagnostics, context);
			case OmtPackage.QUERY_LOGICAL_TIME_TYPE:
				return validateQueryLogicalTimeType((QueryLogicalTimeType)value, diagnostics, context);
			case OmtPackage.QUERY_LOOKAHEAD_TYPE:
				return validateQueryLookaheadType((QueryLookaheadType)value, diagnostics, context);
			case OmtPackage.RATE_TYPE:
				return validateRateType((RateType)value, diagnostics, context);
			case OmtPackage.RECEIVE_INTERACTION_TYPE:
				return validateReceiveInteractionType((ReceiveInteractionType)value, diagnostics, context);
			case OmtPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case OmtPackage.REFLECT_ATTRIBUTE_VALUES_TYPE:
				return validateReflectAttributeValuesType((ReflectAttributeValuesType)value, diagnostics, context);
			case OmtPackage.REGISTER_FEDERATION_SYNCHRONIZATION_POINT_TYPE:
				return validateRegisterFederationSynchronizationPointType((RegisterFederationSynchronizationPointType)value, diagnostics, context);
			case OmtPackage.REGISTER_OBJECT_INSTANCE_TYPE:
				return validateRegisterObjectInstanceType((RegisterObjectInstanceType)value, diagnostics, context);
			case OmtPackage.REGISTER_OBJECT_INSTANCE_WITH_REGIONS_TYPE:
				return validateRegisterObjectInstanceWithRegionsType((RegisterObjectInstanceWithRegionsType)value, diagnostics, context);
			case OmtPackage.RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE:
				return validateReleaseMultipleObjectInstanceNamesType((ReleaseMultipleObjectInstanceNamesType)value, diagnostics, context);
			case OmtPackage.RELEASE_OBJECT_INSTANCE_NAME_TYPE:
				return validateReleaseObjectInstanceNameType((ReleaseObjectInstanceNameType)value, diagnostics, context);
			case OmtPackage.NEXT_MESSAGE_REQUEST_TYPE:
				return validateNextMessageRequestType((NextMessageRequestType)value, diagnostics, context);
			case OmtPackage.NON_EMPTY_STRING1:
				return validateNonEmptyString1((NonEmptyString1)value, diagnostics, context);
			case OmtPackage.NORMALIZE_FEDERATE_HANDLE_TYPE:
				return validateNormalizeFederateHandleType((NormalizeFederateHandleType)value, diagnostics, context);
			case OmtPackage.NORMALIZE_SERVICE_GROUP_TYPE:
				return validateNormalizeServiceGroupType((NormalizeServiceGroupType)value, diagnostics, context);
			case OmtPackage.NOTES_TYPE:
				return validateNotesType((NotesType)value, diagnostics, context);
			case OmtPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case OmtPackage.OBJECT_CLASS_TYPE:
				return validateObjectClassType((ObjectClassType)value, diagnostics, context);
			case OmtPackage.OBJECT_CLASS_TYPE1:
				return validateObjectClassType1((ObjectClassType1)value, diagnostics, context);
			case OmtPackage.OBJECT_INSTANCE_NAME_RESERVED_TYPE:
				return validateObjectInstanceNameReservedType((ObjectInstanceNameReservedType)value, diagnostics, context);
			case OmtPackage.OBJECT_MODEL_TYPE:
				return validateObjectModelType((ObjectModelType)value, diagnostics, context);
			case OmtPackage.OBJECTS_TYPE:
				return validateObjectsType((ObjectsType)value, diagnostics, context);
			case OmtPackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case OmtPackage.OWNERSHIP_TYPE:
				return validateOwnershipType((OwnershipType)value, diagnostics, context);
			case OmtPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case OmtPackage.PARAMETER_TYPE1:
				return validateParameterType1((ParameterType1)value, diagnostics, context);
			case OmtPackage.POC_TYPE:
				return validatePocType((PocType)value, diagnostics, context);
			case OmtPackage.POC_TYPE1:
				return validatePocType1((PocType1)value, diagnostics, context);
			case OmtPackage.GET_OBJECT_INSTANCE_HANDLE_TYPE:
				return validateGetObjectInstanceHandleType((GetObjectInstanceHandleType)value, diagnostics, context);
			case OmtPackage.GET_OBJECT_INSTANCE_NAME_TYPE:
				return validateGetObjectInstanceNameType((GetObjectInstanceNameType)value, diagnostics, context);
			case OmtPackage.GET_ORDER_NAME_TYPE:
				return validateGetOrderNameType((GetOrderNameType)value, diagnostics, context);
			case OmtPackage.GET_ORDER_TYPE_TYPE:
				return validateGetOrderTypeType((GetOrderTypeType)value, diagnostics, context);
			case OmtPackage.GET_PARAMETER_HANDLE_TYPE:
				return validateGetParameterHandleType((GetParameterHandleType)value, diagnostics, context);
			case OmtPackage.GET_PARAMETER_NAME_TYPE:
				return validateGetParameterNameType((GetParameterNameType)value, diagnostics, context);
			case OmtPackage.GET_RANGE_BOUNDS_TYPE:
				return validateGetRangeBoundsType((GetRangeBoundsType)value, diagnostics, context);
			case OmtPackage.GET_TRANSPORTATION_TYPE_HANDLE_TYPE:
				return validateGetTransportationTypeHandleType((GetTransportationTypeHandleType)value, diagnostics, context);
			case OmtPackage.GET_TRANSPORTATION_TYPE_NAME_TYPE:
				return validateGetTransportationTypeNameType((GetTransportationTypeNameType)value, diagnostics, context);
			case OmtPackage.GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE_TYPE:
				return validateGetUpdateRateValueForAttributeType((GetUpdateRateValueForAttributeType)value, diagnostics, context);
			case OmtPackage.GET_UPDATE_RATE_VALUE_TYPE:
				return validateGetUpdateRateValueType((GetUpdateRateValueType)value, diagnostics, context);
			case OmtPackage.GLYPH_TYPE:
				return validateGlyphType((GlyphType)value, diagnostics, context);
			case OmtPackage.GLYPH_TYPE1:
				return validateGlyphType1((GlyphType1)value, diagnostics, context);
			case OmtPackage.IDENTIFICATION_TYPE:
				return validateIdentificationType((IdentificationType)value, diagnostics, context);
			case OmtPackage.IDENTIFIER_TYPE:
				return validateIdentifierType((IdentifierType)value, diagnostics, context);
			case OmtPackage.ID_REFERENCE_TYPE:
				return validateIdReferenceType((IdReferenceType)value, diagnostics, context);
			case OmtPackage.INFORM_ATTRIBUTE_OWNERSHIP_TYPE:
				return validateInformAttributeOwnershipType((InformAttributeOwnershipType)value, diagnostics, context);
			case OmtPackage.INITIATE_FEDERATE_RESTORE_TYPE:
				return validateInitiateFederateRestoreType((InitiateFederateRestoreType)value, diagnostics, context);
			case OmtPackage.INITIATE_FEDERATE_SAVE_TYPE:
				return validateInitiateFederateSaveType((InitiateFederateSaveType)value, diagnostics, context);
			case OmtPackage.INTERACTION_CLASS_TYPE:
				return validateInteractionClassType((InteractionClassType)value, diagnostics, context);
			case OmtPackage.INTERACTION_CLASS_TYPE1:
				return validateInteractionClassType1((InteractionClassType1)value, diagnostics, context);
			case OmtPackage.INTERACTIONS_TYPE:
				return validateInteractionsType((InteractionsType)value, diagnostics, context);
			case OmtPackage.IS_ATTRIBUTE_OWNED_BY_FEDERATE_TYPE:
				return validateIsAttributeOwnedByFederateType((IsAttributeOwnedByFederateType)value, diagnostics, context);
			case OmtPackage.JOIN_FEDERATION_EXECUTION_TYPE:
				return validateJoinFederationExecutionType((JoinFederationExecutionType)value, diagnostics, context);
			case OmtPackage.KEYWORD_TYPE:
				return validateKeywordType((KeywordType)value, diagnostics, context);
			case OmtPackage.LIST_FEDERATION_EXECUTIONS_TYPE:
				return validateListFederationExecutionsType((ListFederationExecutionsType)value, diagnostics, context);
			case OmtPackage.LOCAL_DELETE_OBJECT_INSTANCE_TYPE:
				return validateLocalDeleteObjectInstanceType((LocalDeleteObjectInstanceType)value, diagnostics, context);
			case OmtPackage.LOOKAHEAD_TYPE:
				return validateLookaheadType((LookaheadType)value, diagnostics, context);
			case OmtPackage.MODEL_IDENTIFICATION_TYPE:
				return validateModelIdentificationType((ModelIdentificationType)value, diagnostics, context);
			case OmtPackage.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case OmtPackage.MODIFICATION_DATE_TYPE:
				return validateModificationDateType((ModificationDateType)value, diagnostics, context);
			case OmtPackage.MODIFY_LOOKAHEAD_TYPE:
				return validateModifyLookaheadType((ModifyLookaheadType)value, diagnostics, context);
			case OmtPackage.MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED_TYPE:
				return validateMultipleObjectInstanceNamesReservedType((MultipleObjectInstanceNamesReservedType)value, diagnostics, context);
			case OmtPackage.NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE:
				return validateNegotiatedAttributeOwnershipDivestitureType((NegotiatedAttributeOwnershipDivestitureType)value, diagnostics, context);
			case OmtPackage.NEXT_MESSAGE_REQUEST_AVAILABLE_TYPE:
				return validateNextMessageRequestAvailableType((NextMessageRequestAvailableType)value, diagnostics, context);
			case OmtPackage.CONFIRM_DIVESTITURE_TYPE:
				return validateConfirmDivestitureType((ConfirmDivestitureType)value, diagnostics, context);
			case OmtPackage.CONFIRM_FEDERATION_RESTORATION_REQUEST_TYPE:
				return validateConfirmFederationRestorationRequestType((ConfirmFederationRestorationRequestType)value, diagnostics, context);
			case OmtPackage.CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE:
				return validateConfirmInteractionTransportationTypeChangeType((ConfirmInteractionTransportationTypeChangeType)value, diagnostics, context);
			case OmtPackage.CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION_TYPE:
				return validateConfirmSynchronizationPointRegistrationType((ConfirmSynchronizationPointRegistrationType)value, diagnostics, context);
			case OmtPackage.CONNECTION_LOST_TYPE:
				return validateConnectionLostType((ConnectionLostType)value, diagnostics, context);
			case OmtPackage.CONNECT_TYPE:
				return validateConnectType((ConnectType)value, diagnostics, context);
			case OmtPackage.CREATE_FEDERATION_EXECUTION_TYPE:
				return validateCreateFederationExecutionType((CreateFederationExecutionType)value, diagnostics, context);
			case OmtPackage.CREATE_REGION_TYPE:
				return validateCreateRegionType((CreateRegionType)value, diagnostics, context);
			case OmtPackage.DATA_TYPES_TYPE:
				return validateDataTypesType((DataTypesType)value, diagnostics, context);
			case OmtPackage.DELETE_OBJECT_INSTANCE_TYPE:
				return validateDeleteObjectInstanceType((DeleteObjectInstanceType)value, diagnostics, context);
			case OmtPackage.DELETE_REGION_TYPE:
				return validateDeleteRegionType((DeleteRegionType)value, diagnostics, context);
			case OmtPackage.DESTROY_FEDERATION_EXECUTION_TYPE:
				return validateDestroyFederationExecutionType((DestroyFederationExecutionType)value, diagnostics, context);
			case OmtPackage.DIMENSIONS_TYPE:
				return validateDimensionsType((DimensionsType)value, diagnostics, context);
			case OmtPackage.DIMENSIONS_TYPE1:
				return validateDimensionsType1((DimensionsType1)value, diagnostics, context);
			case OmtPackage.DIMENSIONS_TYPE2:
				return validateDimensionsType2((DimensionsType2)value, diagnostics, context);
			case OmtPackage.DIMENSION_TYPE:
				return validateDimensionType((DimensionType)value, diagnostics, context);
			case OmtPackage.DIMENSION_TYPE1:
				return validateDimensionType1((DimensionType1)value, diagnostics, context);
			case OmtPackage.DISABLE_ASYNCHRONOUS_DELIVERY_TYPE:
				return validateDisableAsynchronousDeliveryType((DisableAsynchronousDeliveryType)value, diagnostics, context);
			case OmtPackage.DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateDisableAttributeRelevanceAdvisorySwitchType((DisableAttributeRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE:
				return validateDisableAttributeScopeAdvisorySwitchType((DisableAttributeScopeAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.DISABLE_CALLBACKS_TYPE:
				return validateDisableCallbacksType((DisableCallbacksType)value, diagnostics, context);
			case OmtPackage.DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateDisableInteractionRelevanceAdvisorySwitchType((DisableInteractionRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateDisableObjectClassRelevanceAdvisorySwitchType((DisableObjectClassRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.DISABLE_TIME_CONSTRAINED_TYPE:
				return validateDisableTimeConstrainedType((DisableTimeConstrainedType)value, diagnostics, context);
			case OmtPackage.DISABLE_TIME_REGULATION_TYPE:
				return validateDisableTimeRegulationType((DisableTimeRegulationType)value, diagnostics, context);
			case OmtPackage.DISCONNECT_TYPE:
				return validateDisconnectType((DisconnectType)value, diagnostics, context);
			case OmtPackage.DISCOVER_OBJECT_INSTANCE_TYPE:
				return validateDiscoverObjectInstanceType((DiscoverObjectInstanceType)value, diagnostics, context);
			case OmtPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OmtPackage.ENABLE_ASYNCHRONOUS_DELIVERY_TYPE:
				return validateEnableAsynchronousDeliveryType((EnableAsynchronousDeliveryType)value, diagnostics, context);
			case OmtPackage.ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateEnableAttributeRelevanceAdvisorySwitchType((EnableAttributeRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE:
				return validateEnableAttributeScopeAdvisorySwitchType((EnableAttributeScopeAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.ENABLE_CALLBACKS_TYPE:
				return validateEnableCallbacksType((EnableCallbacksType)value, diagnostics, context);
			case OmtPackage.ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateEnableInteractionRelevanceAdvisorySwitchType((EnableInteractionRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE:
				return validateEnableObjectClassRelevanceAdvisorySwitchType((EnableObjectClassRelevanceAdvisorySwitchType)value, diagnostics, context);
			case OmtPackage.ENABLE_TIME_CONSTRAINED_TYPE:
				return validateEnableTimeConstrainedType((EnableTimeConstrainedType)value, diagnostics, context);
			case OmtPackage.ENABLE_TIME_REGULATION_TYPE:
				return validateEnableTimeRegulationType((EnableTimeRegulationType)value, diagnostics, context);
			case OmtPackage.ENDIAN_TYPE:
				return validateEndianType((EndianType)value, diagnostics, context);
			case OmtPackage.ENUMERATED_DATA_TYPE:
				return validateEnumeratedDataType((EnumeratedDataType)value, diagnostics, context);
			case OmtPackage.ENUMERATED_DATA_TYPE1:
				return validateEnumeratedDataType1((EnumeratedDataType1)value, diagnostics, context);
			case OmtPackage.ENUMERATED_DATA_TYPES_TYPE:
				return validateEnumeratedDataTypesType((EnumeratedDataTypesType)value, diagnostics, context);
			case OmtPackage.ENUMERATOR_TYPE:
				return validateEnumeratorType((EnumeratorType)value, diagnostics, context);
			case OmtPackage.EVOKE_CALLBACK_TYPE:
				return validateEvokeCallbackType((EvokeCallbackType)value, diagnostics, context);
			case OmtPackage.EVOKE_MULTIPLE_CALLBACKS_TYPE:
				return validateEvokeMultipleCallbacksType((EvokeMultipleCallbacksType)value, diagnostics, context);
			case OmtPackage.FEDERATE_RESTORE_COMPLETE_TYPE:
				return validateFederateRestoreCompleteType((FederateRestoreCompleteType)value, diagnostics, context);
			case OmtPackage.FEDERATE_SAVE_BEGUN_TYPE:
				return validateFederateSaveBegunType((FederateSaveBegunType)value, diagnostics, context);
			case OmtPackage.FEDERATE_SAVE_COMPLETE_TYPE:
				return validateFederateSaveCompleteType((FederateSaveCompleteType)value, diagnostics, context);
			case OmtPackage.FEDERATION_RESTORE_BEGUN_TYPE:
				return validateFederationRestoreBegunType((FederationRestoreBegunType)value, diagnostics, context);
			case OmtPackage.FEDERATION_RESTORED_TYPE:
				return validateFederationRestoredType((FederationRestoredType)value, diagnostics, context);
			case OmtPackage.FEDERATION_RESTORE_STATUS_RESPONSE_TYPE:
				return validateFederationRestoreStatusResponseType((FederationRestoreStatusResponseType)value, diagnostics, context);
			case OmtPackage.FEDERATION_SAVED_TYPE:
				return validateFederationSavedType((FederationSavedType)value, diagnostics, context);
			case OmtPackage.FEDERATION_SAVE_STATUS_RESPONSE_TYPE:
				return validateFederationSaveStatusResponseType((FederationSaveStatusResponseType)value, diagnostics, context);
			case OmtPackage.FEDERATION_SYNCHRONIZED_TYPE:
				return validateFederationSynchronizedType((FederationSynchronizedType)value, diagnostics, context);
			case OmtPackage.FIELD_TYPE:
				return validateFieldType((FieldType)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_DATA_TYPE:
				return validateFixedRecordDataType((FixedRecordDataType)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_DATA_TYPE1:
				return validateFixedRecordDataType1((FixedRecordDataType1)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_DATA_TYPES_TYPE:
				return validateFixedRecordDataTypesType((FixedRecordDataTypesType)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_ENCODING_TYPE:
				return validateFixedRecordEncodingType((FixedRecordEncodingType)value, diagnostics, context);
			case OmtPackage.FLUSH_QUEUE_REQUEST_TYPE:
				return validateFlushQueueRequestType((FlushQueueRequestType)value, diagnostics, context);
			case OmtPackage.GET_ATTRIBUTE_HANDLE_TYPE:
				return validateGetAttributeHandleType((GetAttributeHandleType)value, diagnostics, context);
			case OmtPackage.GET_ATTRIBUTE_NAME_TYPE:
				return validateGetAttributeNameType((GetAttributeNameType)value, diagnostics, context);
			case OmtPackage.GET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE:
				return validateGetAutomaticResignDirectiveType((GetAutomaticResignDirectiveType)value, diagnostics, context);
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE_TYPE:
				return validateGetAvailableDimensionsForClassAttributeType((GetAvailableDimensionsForClassAttributeType)value, diagnostics, context);
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS_TYPE:
				return validateGetAvailableDimensionsForInteractionClassType((GetAvailableDimensionsForInteractionClassType)value, diagnostics, context);
			case OmtPackage.GET_DIMENSION_HANDLE_SET_TYPE:
				return validateGetDimensionHandleSetType((GetDimensionHandleSetType)value, diagnostics, context);
			case OmtPackage.GET_DIMENSION_HANDLE_TYPE:
				return validateGetDimensionHandleType((GetDimensionHandleType)value, diagnostics, context);
			case OmtPackage.GET_DIMENSION_NAME_TYPE:
				return validateGetDimensionNameType((GetDimensionNameType)value, diagnostics, context);
			case OmtPackage.GET_DIMENSION_UPPER_BOUND_TYPE:
				return validateGetDimensionUpperBoundType((GetDimensionUpperBoundType)value, diagnostics, context);
			case OmtPackage.GET_FEDERATE_HANDLE_TYPE:
				return validateGetFederateHandleType((GetFederateHandleType)value, diagnostics, context);
			case OmtPackage.GET_FEDERATE_NAME_TYPE:
				return validateGetFederateNameType((GetFederateNameType)value, diagnostics, context);
			case OmtPackage.GET_INTERACTION_CLASS_HANDLE_TYPE:
				return validateGetInteractionClassHandleType((GetInteractionClassHandleType)value, diagnostics, context);
			case OmtPackage.GET_INTERACTION_CLASS_NAME_TYPE:
				return validateGetInteractionClassNameType((GetInteractionClassNameType)value, diagnostics, context);
			case OmtPackage.GET_KNOWN_OBJECT_CLASS_HANDLE_TYPE:
				return validateGetKnownObjectClassHandleType((GetKnownObjectClassHandleType)value, diagnostics, context);
			case OmtPackage.GET_OBJECT_CLASS_HANDLE_TYPE:
				return validateGetObjectClassHandleType((GetObjectClassHandleType)value, diagnostics, context);
			case OmtPackage.GET_OBJECT_CLASS_NAME_TYPE:
				return validateGetObjectClassNameType((GetObjectClassNameType)value, diagnostics, context);
			case OmtPackage.ABORT_FEDERATION_RESTORE_TYPE:
				return validateAbortFederationRestoreType((AbortFederationRestoreType)value, diagnostics, context);
			case OmtPackage.ABORT_FEDERATION_SAVE_TYPE:
				return validateAbortFederationSaveType((AbortFederationSaveType)value, diagnostics, context);
			case OmtPackage.ALTERNATIVE_TYPE:
				return validateAlternativeType((AlternativeType)value, diagnostics, context);
			case OmtPackage.ANNOUNCE_SYNCHRONIZATION_POINT_TYPE:
				return validateAnnounceSynchronizationPointType((AnnounceSynchronizationPointType)value, diagnostics, context);
			case OmtPackage.APPLICATION_DOMAIN_TYPE:
				return validateApplicationDomainType((ApplicationDomainType)value, diagnostics, context);
			case OmtPackage.ARRAY_DATA_TYPE:
				return validateArrayDataType((ArrayDataType)value, diagnostics, context);
			case OmtPackage.ARRAY_DATA_TYPE1:
				return validateArrayDataType1((ArrayDataType1)value, diagnostics, context);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_TYPE:
				return validateArrayDatatypeEncodingType((ArrayDatatypeEncodingType)value, diagnostics, context);
			case OmtPackage.ARRAY_DATA_TYPES_TYPE:
				return validateArrayDataTypesType((ArrayDataTypesType)value, diagnostics, context);
			case OmtPackage.ARRAY_DATA_TYPES_TYPE1:
				return validateArrayDataTypesType1((ArrayDataTypesType1)value, diagnostics, context);
			case OmtPackage.ASSOCIATE_REGIONS_FOR_UPDATES_TYPE:
				return validateAssociateRegionsForUpdatesType((AssociateRegionsForUpdatesType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE_TYPE:
				return validateAttributeOwnershipAcquisitionIfAvailableType((AttributeOwnershipAcquisitionIfAvailableType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION_TYPE:
				return validateAttributeOwnershipAcquisitionNotificationType((AttributeOwnershipAcquisitionNotificationType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE:
				return validateAttributeOwnershipAcquisitionType((AttributeOwnershipAcquisitionType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED_TYPE:
				return validateAttributeOwnershipDivestitureIfWantedType((AttributeOwnershipDivestitureIfWantedType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_RELEASE_DENIED_TYPE:
				return validateAttributeOwnershipReleaseDeniedType((AttributeOwnershipReleaseDeniedType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_OWNERSHIP_UNAVAILABLE_TYPE:
				return validateAttributeOwnershipUnavailableType((AttributeOwnershipUnavailableType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTES_IN_SCOPE_TYPE:
				return validateAttributesInScopeType((AttributesInScopeType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTES_OUT_OF_SCOPE_TYPE:
				return validateAttributesOutOfScopeType((AttributesOutOfScopeType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case OmtPackage.ATTRIBUTE_TYPE1:
				return validateAttributeType1((AttributeType1)value, diagnostics, context);
			case OmtPackage.BASIC_DATA_REPRESENTATIONS_TYPE:
				return validateBasicDataRepresentationsType((BasicDataRepresentationsType)value, diagnostics, context);
			case OmtPackage.BASIC_DATA_TYPE:
				return validateBasicDataType((BasicDataType)value, diagnostics, context);
			case OmtPackage.BASIC_DATA_TYPE1:
				return validateBasicDataType1((BasicDataType1)value, diagnostics, context);
			case OmtPackage.CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE:
				return validateCancelAttributeOwnershipAcquisitionType((CancelAttributeOwnershipAcquisitionType)value, diagnostics, context);
			case OmtPackage.CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE:
				return validateCancelNegotiatedAttributeOwnershipDivestitureType((CancelNegotiatedAttributeOwnershipDivestitureType)value, diagnostics, context);
			case OmtPackage.CAPABILITY_TYPE:
				return validateCapabilityType((CapabilityType)value, diagnostics, context);
			case OmtPackage.CARDINALITY_TYPE:
				return validateCardinalityType((CardinalityType)value, diagnostics, context);
			case OmtPackage.CHANGE_ATTRIBUTE_ORDER_TYPE_TYPE:
				return validateChangeAttributeOrderTypeType((ChangeAttributeOrderTypeType)value, diagnostics, context);
			case OmtPackage.CHANGE_INTERACTION_ORDER_TYPE_TYPE:
				return validateChangeInteractionOrderTypeType((ChangeInteractionOrderTypeType)value, diagnostics, context);
			case OmtPackage.COMMIT_REGION_MODIFICATIONS_TYPE:
				return validateCommitRegionModificationsType((CommitRegionModificationsType)value, diagnostics, context);
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE:
				return validateConfirmAttributeOwnershipAcquisitionCancellationType((ConfirmAttributeOwnershipAcquisitionCancellationType)value, diagnostics, context);
			case OmtPackage.CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE:
				return validateConfirmAttributeTransportationTypeChangeType((ConfirmAttributeTransportationTypeChangeType)value, diagnostics, context);
			case OmtPackage.UPDATE_ENUMERATIONS:
				return validateUpdateEnumerations((UpdateEnumerations)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR:
				return validateVariantRecordEncodingEnumerator((VariantRecordEncodingEnumerator)value, diagnostics, context);
			case OmtPackage.RESIGN_ACTION_TYPE:
				return validateResignActionType((ResignActionType)value, diagnostics, context);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION:
				return validateSecurityClassificationEnumeration((SecurityClassificationEnumeration)value, diagnostics, context);
			case OmtPackage.SHARING_ENUMERATIONS:
				return validateSharingEnumerations((SharingEnumerations)value, diagnostics, context);
			case OmtPackage.RELIABLE_ENUMERATIONS:
				return validateReliableEnumerations((ReliableEnumerations)value, diagnostics, context);
			case OmtPackage.OM_TYPE_ENUMERATIONS:
				return validateOMTypeEnumerations((OMTypeEnumerations)value, diagnostics, context);
			case OmtPackage.ORDER_ENUMERATIONS:
				return validateOrderEnumerations((OrderEnumerations)value, diagnostics, context);
			case OmtPackage.OWNERSHIP_ENUMERATIONS:
				return validateOwnershipEnumerations((OwnershipEnumerations)value, diagnostics, context);
			case OmtPackage.POC_TYPE_ENUMERATION:
				return validatePOCTypeEnumeration((POCTypeEnumeration)value, diagnostics, context);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS:
				return validateGlyphTypeEnumerations((GlyphTypeEnumerations)value, diagnostics, context);
			case OmtPackage.ENDIAN_ENUMERATIONS:
				return validateEndianEnumerations((EndianEnumerations)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION:
				return validateFixedRecordEncodingEnumeration((FixedRecordEncodingEnumeration)value, diagnostics, context);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS:
				return validateApplicationDomainEnumerations((ApplicationDomainEnumerations)value, diagnostics, context);
			case OmtPackage.CAPABILITY_ENUMERATIONS:
				return validateCapabilityEnumerations((CapabilityEnumerations)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_ENUMERATOR_PATTERN:
				return validateVariantRecordEnumeratorPattern((String)value, diagnostics, context);
			case OmtPackage.UPDATE_ENUMERATIONS_OBJECT:
				return validateUpdateEnumerationsObject((UpdateEnumerations)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_ENCODING_ENUMERATOR_OBJECT:
				return validateVariantRecordEncodingEnumeratorObject((VariantRecordEncodingEnumerator)value, diagnostics, context);
			case OmtPackage.VARIANT_RECORD_ENCODING_UNION:
				return validateVariantRecordEncodingUnion(value, diagnostics, context);
			case OmtPackage.RESIGN_ACTION_TYPE_OBJECT:
				return validateResignActionTypeObject((ResignActionType)value, diagnostics, context);
			case OmtPackage.SECURITY_CLASSIFICATION_ENUMERATION_OBJECT:
				return validateSecurityClassificationEnumerationObject((SecurityClassificationEnumeration)value, diagnostics, context);
			case OmtPackage.SECURITY_CLASSIFICATION_UNION:
				return validateSecurityClassificationUnion(value, diagnostics, context);
			case OmtPackage.SHARING_ENUMERATIONS_OBJECT:
				return validateSharingEnumerationsObject((SharingEnumerations)value, diagnostics, context);
			case OmtPackage.POC_TYPE_UNION:
				return validatePOCTypeUnion(value, diagnostics, context);
			case OmtPackage.RELIABLE_ENUMERATIONS_OBJECT:
				return validateReliableEnumerationsObject((ReliableEnumerations)value, diagnostics, context);
			case OmtPackage.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			case OmtPackage.OM_TYPE_ENUMERATIONS_OBJECT:
				return validateOMTypeEnumerationsObject((OMTypeEnumerations)value, diagnostics, context);
			case OmtPackage.OM_TYPE_UNION:
				return validateOMTypeUnion(value, diagnostics, context);
			case OmtPackage.ORDER_ENUMERATIONS_OBJECT:
				return validateOrderEnumerationsObject((OrderEnumerations)value, diagnostics, context);
			case OmtPackage.OWNERSHIP_ENUMERATIONS_OBJECT:
				return validateOwnershipEnumerationsObject((OwnershipEnumerations)value, diagnostics, context);
			case OmtPackage.POC_TYPE_ENUMERATION_OBJECT:
				return validatePOCTypeEnumerationObject((POCTypeEnumeration)value, diagnostics, context);
			case OmtPackage.GLYPH_TYPE_ENUMERATIONS_OBJECT:
				return validateGlyphTypeEnumerationsObject((GlyphTypeEnumerations)value, diagnostics, context);
			case OmtPackage.GLYPH_TYPE_UNION:
				return validateGlyphTypeUnion(value, diagnostics, context);
			case OmtPackage.DIMENSION_VALUE_PATTERN:
				return validateDimensionValuePattern((String)value, diagnostics, context);
			case OmtPackage.ENDIAN_ENUMERATIONS_OBJECT:
				return validateEndianEnumerationsObject((EndianEnumerations)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_ENCODING_ENUMERATION_OBJECT:
				return validateFixedRecordEncodingEnumerationObject((FixedRecordEncodingEnumeration)value, diagnostics, context);
			case OmtPackage.FIXED_RECORD_ENCODING_UNION:
				return validateFixedRecordEncodingUnion(value, diagnostics, context);
			case OmtPackage.APPLICATION_DOMAIN_ENUMERATIONS_OBJECT:
				return validateApplicationDomainEnumerationsObject((ApplicationDomainEnumerations)value, diagnostics, context);
			case OmtPackage.APPLICATION_DOMAIN_UNION:
				return validateApplicationDomainUnion(value, diagnostics, context);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_ENUM:
				return validateArrayDatatypeEncodingEnum((String)value, diagnostics, context);
			case OmtPackage.ARRAY_DATATYPE_ENCODING_UNION:
				return validateArrayDatatypeEncodingUnion((String)value, diagnostics, context);
			case OmtPackage.CAPABILITY_ENUMERATIONS_OBJECT:
				return validateCapabilityEnumerationsObject((CapabilityEnumerations)value, diagnostics, context);
			case OmtPackage.CARDINALITY_PATTERN:
				return validateCardinalityPattern((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateRatesType(UpdateRatesType updateRatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateRatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateRateType(UpdateRateType updateRateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateRateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundType(UpperBoundType upperBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(upperBoundType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordDataType(VariantRecordDataType variantRecordDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantRecordDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordDataType1(VariantRecordDataType1 variantRecordDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantRecordDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordDataTypesType(VariantRecordDataTypesType variantRecordDataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantRecordDataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEncodingType(VariantRecordEncodingType variantRecordEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantRecordEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType unconditionalAttributeOwnershipDivestitureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unconditionalAttributeOwnershipDivestitureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnpublishInteractionClassType(UnpublishInteractionClassType unpublishInteractionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unpublishInteractionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType unpublishObjectClassAttributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unpublishObjectClassAttributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsubscribeInteractionClassType(UnsubscribeInteractionClassType unsubscribeInteractionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsubscribeInteractionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType unsubscribeInteractionClassWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsubscribeInteractionClassWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType unsubscribeObjectClassAttributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsubscribeObjectClassAttributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType unsubscribeObjectClassAttributesWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsubscribeObjectClassAttributesWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateAttributeValuesType(UpdateAttributeValuesType updateAttributeValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateAttributeValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStampType(TimeStampType timeStampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationsType(TransportationsType transportationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationType(TransportationType transportationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationType1(TransportationType1 transportationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnInteractionsOffType(TurnInteractionsOffType turnInteractionsOffType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnInteractionsOffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnInteractionsOnType(TurnInteractionsOnType turnInteractionsOnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnInteractionsOnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType turnUpdatesOffForObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnUpdatesOffForObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType turnUpdatesOnForObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnUpdatesOnForObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType unassociateRegionsForUpdatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unassociateRegionsForUpdatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchType(SwitchType switchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationPointAchievedType(SynchronizationPointAchievedType synchronizationPointAchievedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationPointAchievedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationPointType(SynchronizationPointType synchronizationPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationPointType1(SynchronizationPointType1 synchronizationPointType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationPointType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationsType(SynchronizationsType synchronizationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagsType(TagsType tagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagType(TagType tagType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAdvanceGrantType(TimeAdvanceGrantType timeAdvanceGrantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAdvanceGrantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType timeAdvanceRequestAvailableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAdvanceRequestAvailableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAdvanceRequestType(TimeAdvanceRequestType timeAdvanceRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAdvanceRequestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstrainedEnabledType(TimeConstrainedEnabledType timeConstrainedEnabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeConstrainedEnabledType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRegulationEnabledType(TimeRegulationEnabledType timeRegulationEnabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeRegulationEnabledType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharingType(SharingType sharingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataType(SimpleDataType simpleDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataType1(SimpleDataType1 simpleDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataTypesType(SimpleDataTypesType simpleDataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(size, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartRegistrationForObjectClassType(StartRegistrationForObjectClassType startRegistrationForObjectClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startRegistrationForObjectClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopRegistrationForObjectClassType(StopRegistrationForObjectClassType stopRegistrationForObjectClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopRegistrationForObjectClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribeInteractionClassType(SubscribeInteractionClassType subscribeInteractionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribeInteractionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType subscribeInteractionClassWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribeInteractionClassWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType subscribeObjectClassAttributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribeObjectClassAttributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType subscribeObjectClassAttributesWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribeObjectClassAttributesWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchesType(SwitchesType switchesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switchesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveObjectInstanceNameType(ReserveObjectInstanceNameType reserveObjectInstanceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reserveObjectInstanceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResignFederationExecutionType(ResignFederationExecutionType resignFederationExecutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resignFederationExecutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResignSwitchType(ResignSwitchType resignSwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resignSwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetractType(RetractType retractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(retractType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassificationType(SecurityClassificationType securityClassificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityClassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendInteractionType(SendInteractionType sendInteractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendInteractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendInteractionWithRegionsType(SendInteractionWithRegionsType sendInteractionWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendInteractionWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceUtilizationType(ServiceUtilizationType serviceUtilizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceUtilizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType setAutomaticResignDirectiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setAutomaticResignDirectiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetRangeBoundsType(SetRangeBoundsType setRangeBoundsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setRangeBoundsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReliableType(ReliableType reliableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reliableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveobjectinstanceType(RemoveobjectinstanceType removeobjectinstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeobjectinstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType reportAttributeTransportationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportAttributeTransportationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportFederationExecutionsType(ReportFederationExecutionsType reportFederationExecutionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportFederationExecutionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType reportInteractionTransportationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportInteractionTransportationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType requestAttributeOwnershipAssumptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestAttributeOwnershipAssumptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType requestAttributeOwnershipReleaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestAttributeOwnershipReleaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType requestAttributeTransportationTypeChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestAttributeTransportationTypeChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestAttributeValueUpdateType(RequestAttributeValueUpdateType requestAttributeValueUpdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestAttributeValueUpdateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType requestAttributeValueUpdateWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestAttributeValueUpdateWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestDivestitureConfirmationType(RequestDivestitureConfirmationType requestDivestitureConfirmationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestDivestitureConfirmationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestFederationRestoreType(RequestFederationRestoreType requestFederationRestoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestFederationRestoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestFederationSaveType(RequestFederationSaveType requestFederationSaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestFederationSaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType requestInteractionTransportationTypeChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestInteractionTransportationTypeChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestRetractionType(RequestRetractionType requestRetractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestRetractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType reserveMultipleObjectInstanceNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reserveMultipleObjectInstanceNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePocTypeType(PocTypeType pocTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pocTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType provideAttributeValueUpdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provideAttributeValueUpdateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublishInteractionClassType(PublishInteractionClassType publishInteractionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publishInteractionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublishObjectClassAttributesType(PublishObjectClassAttributesType publishObjectClassAttributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publishObjectClassAttributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryAttributeOwnershipType(QueryAttributeOwnershipType queryAttributeOwnershipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryAttributeOwnershipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType queryAttributeTransportationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryAttributeTransportationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryFederationRestoreStatusType(QueryFederationRestoreStatusType queryFederationRestoreStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryFederationRestoreStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryFederationSaveStatusType(QueryFederationSaveStatusType queryFederationSaveStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryFederationSaveStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryGALTType(QueryGALTType queryGALTType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryGALTType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType queryInteractionTransportationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryInteractionTransportationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryLITSType(QueryLITSType queryLITSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryLITSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryLogicalTimeType(QueryLogicalTimeType queryLogicalTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryLogicalTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryLookaheadType(QueryLookaheadType queryLookaheadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryLookaheadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateType(RateType rateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveInteractionType(ReceiveInteractionType receiveInteractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receiveInteractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflectAttributeValuesType(ReflectAttributeValuesType reflectAttributeValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflectAttributeValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType registerFederationSynchronizationPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerFederationSynchronizationPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterObjectInstanceType(RegisterObjectInstanceType registerObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType registerObjectInstanceWithRegionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerObjectInstanceWithRegionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType releaseMultipleObjectInstanceNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releaseMultipleObjectInstanceNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType releaseObjectInstanceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releaseObjectInstanceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextMessageRequestType(NextMessageRequestType nextMessageRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nextMessageRequestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString1(NonEmptyString1 nonEmptyString1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonEmptyString1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizeFederateHandleType(NormalizeFederateHandleType normalizeFederateHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalizeFederateHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizeServiceGroupType(NormalizeServiceGroupType normalizeServiceGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalizeServiceGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotesType(NotesType notesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectClassType(ObjectClassType objectClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectClassType1(ObjectClassType1 objectClassType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectClassType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectInstanceNameReservedType(ObjectInstanceNameReservedType objectInstanceNameReservedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectInstanceNameReservedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectModelType(ObjectModelType objectModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectsType(ObjectsType objectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnershipType(OwnershipType ownershipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ownershipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType1(ParameterType1 parameterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePocType(PocType pocType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pocType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePocType1(PocType1 pocType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pocType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetObjectInstanceHandleType(GetObjectInstanceHandleType getObjectInstanceHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getObjectInstanceHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetObjectInstanceNameType(GetObjectInstanceNameType getObjectInstanceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getObjectInstanceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetOrderNameType(GetOrderNameType getOrderNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getOrderNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetOrderTypeType(GetOrderTypeType getOrderTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getOrderTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetParameterHandleType(GetParameterHandleType getParameterHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getParameterHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetParameterNameType(GetParameterNameType getParameterNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getParameterNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetRangeBoundsType(GetRangeBoundsType getRangeBoundsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getRangeBoundsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetTransportationTypeHandleType(GetTransportationTypeHandleType getTransportationTypeHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getTransportationTypeHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetTransportationTypeNameType(GetTransportationTypeNameType getTransportationTypeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getTransportationTypeNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType getUpdateRateValueForAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getUpdateRateValueForAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetUpdateRateValueType(GetUpdateRateValueType getUpdateRateValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getUpdateRateValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphType(GlyphType glyphType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(glyphType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphType1(GlyphType1 glyphType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(glyphType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentificationType(IdentificationType identificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierType(IdentifierType identifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdReferenceType(IdReferenceType idReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformAttributeOwnershipType(InformAttributeOwnershipType informAttributeOwnershipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informAttributeOwnershipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiateFederateRestoreType(InitiateFederateRestoreType initiateFederateRestoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initiateFederateRestoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiateFederateSaveType(InitiateFederateSaveType initiateFederateSaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initiateFederateSaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionClassType(InteractionClassType interactionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionClassType1(InteractionClassType1 interactionClassType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionClassType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionsType(InteractionsType interactionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType isAttributeOwnedByFederateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isAttributeOwnedByFederateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinFederationExecutionType(JoinFederationExecutionType joinFederationExecutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(joinFederationExecutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeywordType(KeywordType keywordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListFederationExecutionsType(ListFederationExecutionsType listFederationExecutionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listFederationExecutionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType localDeleteObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localDeleteObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLookaheadType(LookaheadType lookaheadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lookaheadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelIdentificationType(ModelIdentificationType modelIdentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelIdentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModificationDateType(ModificationDateType modificationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modificationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifyLookaheadType(ModifyLookaheadType modifyLookaheadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modifyLookaheadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType multipleObjectInstanceNamesReservedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multipleObjectInstanceNamesReservedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType negotiatedAttributeOwnershipDivestitureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negotiatedAttributeOwnershipDivestitureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextMessageRequestAvailableType(NextMessageRequestAvailableType nextMessageRequestAvailableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nextMessageRequestAvailableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmDivestitureType(ConfirmDivestitureType confirmDivestitureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmDivestitureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType confirmFederationRestorationRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmFederationRestorationRequestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType confirmInteractionTransportationTypeChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmInteractionTransportationTypeChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType confirmSynchronizationPointRegistrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmSynchronizationPointRegistrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionLostType(ConnectionLostType connectionLostType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionLostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectType(ConnectType connectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateFederationExecutionType(CreateFederationExecutionType createFederationExecutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createFederationExecutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateRegionType(CreateRegionType createRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypesType(DataTypesType dataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteObjectInstanceType(DeleteObjectInstanceType deleteObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteRegionType(DeleteRegionType deleteRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyFederationExecutionType(DestroyFederationExecutionType destroyFederationExecutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(destroyFederationExecutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionsType(DimensionsType dimensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionsType1(DimensionsType1 dimensionsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionsType2(DimensionsType2 dimensionsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionType(DimensionType dimensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionType1(DimensionType1 dimensionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType disableAsynchronousDeliveryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableAsynchronousDeliveryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType disableAttributeRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableAttributeRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType disableAttributeScopeAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableAttributeScopeAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableCallbacksType(DisableCallbacksType disableCallbacksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableCallbacksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType disableInteractionRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableInteractionRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType disableObjectClassRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableObjectClassRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableTimeConstrainedType(DisableTimeConstrainedType disableTimeConstrainedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableTimeConstrainedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableTimeRegulationType(DisableTimeRegulationType disableTimeRegulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableTimeRegulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisconnectType(DisconnectType disconnectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disconnectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscoverObjectInstanceType(DiscoverObjectInstanceType discoverObjectInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discoverObjectInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType enableAsynchronousDeliveryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableAsynchronousDeliveryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType enableAttributeRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableAttributeRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType enableAttributeScopeAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableAttributeScopeAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableCallbacksType(EnableCallbacksType enableCallbacksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableCallbacksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType enableInteractionRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableInteractionRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType enableObjectClassRelevanceAdvisorySwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableObjectClassRelevanceAdvisorySwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableTimeConstrainedType(EnableTimeConstrainedType enableTimeConstrainedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableTimeConstrainedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableTimeRegulationType(EnableTimeRegulationType enableTimeRegulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableTimeRegulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianType(EndianType endianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endianType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedDataType(EnumeratedDataType enumeratedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedDataType1(EnumeratedDataType1 enumeratedDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedDataTypesType(EnumeratedDataTypesType enumeratedDataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedDataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratorType(EnumeratorType enumeratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvokeCallbackType(EvokeCallbackType evokeCallbackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evokeCallbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvokeMultipleCallbacksType(EvokeMultipleCallbacksType evokeMultipleCallbacksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evokeMultipleCallbacksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederateRestoreCompleteType(FederateRestoreCompleteType federateRestoreCompleteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federateRestoreCompleteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederateSaveBegunType(FederateSaveBegunType federateSaveBegunType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federateSaveBegunType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederateSaveCompleteType(FederateSaveCompleteType federateSaveCompleteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federateSaveCompleteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationRestoreBegunType(FederationRestoreBegunType federationRestoreBegunType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationRestoreBegunType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationRestoredType(FederationRestoredType federationRestoredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationRestoredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationRestoreStatusResponseType(FederationRestoreStatusResponseType federationRestoreStatusResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationRestoreStatusResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationSavedType(FederationSavedType federationSavedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationSavedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationSaveStatusResponseType(FederationSaveStatusResponseType federationSaveStatusResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationSaveStatusResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationSynchronizedType(FederationSynchronizedType federationSynchronizedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(federationSynchronizedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordDataType(FixedRecordDataType fixedRecordDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedRecordDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordDataType1(FixedRecordDataType1 fixedRecordDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedRecordDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordDataTypesType(FixedRecordDataTypesType fixedRecordDataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedRecordDataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordEncodingType(FixedRecordEncodingType fixedRecordEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedRecordEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlushQueueRequestType(FlushQueueRequestType flushQueueRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flushQueueRequestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetAttributeHandleType(GetAttributeHandleType getAttributeHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getAttributeHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetAttributeNameType(GetAttributeNameType getAttributeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getAttributeNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType getAutomaticResignDirectiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getAutomaticResignDirectiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType getAvailableDimensionsForClassAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getAvailableDimensionsForClassAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType getAvailableDimensionsForInteractionClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getAvailableDimensionsForInteractionClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDimensionHandleSetType(GetDimensionHandleSetType getDimensionHandleSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDimensionHandleSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDimensionHandleType(GetDimensionHandleType getDimensionHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDimensionHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDimensionNameType(GetDimensionNameType getDimensionNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDimensionNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDimensionUpperBoundType(GetDimensionUpperBoundType getDimensionUpperBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDimensionUpperBoundType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetFederateHandleType(GetFederateHandleType getFederateHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getFederateHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetFederateNameType(GetFederateNameType getFederateNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getFederateNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetInteractionClassHandleType(GetInteractionClassHandleType getInteractionClassHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getInteractionClassHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetInteractionClassNameType(GetInteractionClassNameType getInteractionClassNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getInteractionClassNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetKnownObjectClassHandleType(GetKnownObjectClassHandleType getKnownObjectClassHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getKnownObjectClassHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetObjectClassHandleType(GetObjectClassHandleType getObjectClassHandleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getObjectClassHandleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetObjectClassNameType(GetObjectClassNameType getObjectClassNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getObjectClassNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbortFederationRestoreType(AbortFederationRestoreType abortFederationRestoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abortFederationRestoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbortFederationSaveType(AbortFederationSaveType abortFederationSaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abortFederationSaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeType(AlternativeType alternativeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternativeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnounceSynchronizationPointType(AnnounceSynchronizationPointType announceSynchronizationPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(announceSynchronizationPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDomainType(ApplicationDomainType applicationDomainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationDomainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDataType(ArrayDataType arrayDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDataType1(ArrayDataType1 arrayDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatypeEncodingType(ArrayDatatypeEncodingType arrayDatatypeEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDatatypeEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDataTypesType(ArrayDataTypesType arrayDataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDataTypesType1(ArrayDataTypesType1 arrayDataTypesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDataTypesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType associateRegionsForUpdatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associateRegionsForUpdatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType attributeOwnershipAcquisitionIfAvailableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipAcquisitionIfAvailableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType attributeOwnershipAcquisitionNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipAcquisitionNotificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType attributeOwnershipAcquisitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipAcquisitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType attributeOwnershipDivestitureIfWantedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipDivestitureIfWantedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType attributeOwnershipReleaseDeniedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipReleaseDeniedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType attributeOwnershipUnavailableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeOwnershipUnavailableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesInScopeType(AttributesInScopeType attributesInScopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesInScopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesOutOfScopeType(AttributesOutOfScopeType attributesOutOfScopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesOutOfScopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType1(AttributeType1 attributeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataRepresentationsType(BasicDataRepresentationsType basicDataRepresentationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicDataRepresentationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataType(BasicDataType basicDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataType1(BasicDataType1 basicDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicDataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType cancelAttributeOwnershipAcquisitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelAttributeOwnershipAcquisitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType cancelNegotiatedAttributeOwnershipDivestitureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelNegotiatedAttributeOwnershipDivestitureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityType(CapabilityType capabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType(CardinalityType cardinalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cardinalityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType changeAttributeOrderTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeAttributeOrderTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType changeInteractionOrderTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeInteractionOrderTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitRegionModificationsType(CommitRegionModificationsType commitRegionModificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commitRegionModificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType confirmAttributeOwnershipAcquisitionCancellationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmAttributeOwnershipAcquisitionCancellationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType confirmAttributeTransportationTypeChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confirmAttributeTransportationTypeChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateEnumerations(UpdateEnumerations updateEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEncodingEnumerator(VariantRecordEncodingEnumerator variantRecordEncodingEnumerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResignActionType(ResignActionType resignActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassificationEnumeration(SecurityClassificationEnumeration securityClassificationEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharingEnumerations(SharingEnumerations sharingEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReliableEnumerations(ReliableEnumerations reliableEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMTypeEnumerations(OMTypeEnumerations omTypeEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderEnumerations(OrderEnumerations orderEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnershipEnumerations(OwnershipEnumerations ownershipEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOCTypeEnumeration(POCTypeEnumeration pocTypeEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphTypeEnumerations(GlyphTypeEnumerations glyphTypeEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianEnumerations(EndianEnumerations endianEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordEncodingEnumeration(FixedRecordEncodingEnumeration fixedRecordEncodingEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDomainEnumerations(ApplicationDomainEnumerations applicationDomainEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityEnumerations(CapabilityEnumerations capabilityEnumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEnumeratorPattern(String variantRecordEnumeratorPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVariantRecordEnumeratorPattern_Pattern(variantRecordEnumeratorPattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVariantRecordEnumeratorPattern_Pattern
	 */
	public static final  PatternMatcher [][] VARIANT_RECORD_ENUMERATOR_PATTERN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("HLAother|(\\S)+|([(\\S)+..(\\S)+])")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Variant Record Enumerator Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEnumeratorPattern_Pattern(String variantRecordEnumeratorPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OmtPackage.eINSTANCE.getVariantRecordEnumeratorPattern(), variantRecordEnumeratorPattern, VARIANT_RECORD_ENUMERATOR_PATTERN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateEnumerationsObject(UpdateEnumerations updateEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEncodingEnumeratorObject(VariantRecordEncodingEnumerator variantRecordEncodingEnumeratorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEncodingUnion(Object variantRecordEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVariantRecordEncodingUnion_MemberTypes(variantRecordEncodingUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Variant Record Encoding Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantRecordEncodingUnion_MemberTypes(Object variantRecordEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator().isInstance(variantRecordEncodingUnion)) {
				if (validateVariantRecordEncodingEnumerator((VariantRecordEncodingEnumerator)variantRecordEncodingUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(variantRecordEncodingUnion)) {
				if (validateNonEmptyString((String)variantRecordEncodingUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getVariantRecordEncodingEnumerator().isInstance(variantRecordEncodingUnion)) {
				if (validateVariantRecordEncodingEnumerator((VariantRecordEncodingEnumerator)variantRecordEncodingUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(variantRecordEncodingUnion)) {
				if (validateNonEmptyString((String)variantRecordEncodingUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResignActionTypeObject(ResignActionType resignActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassificationEnumerationObject(SecurityClassificationEnumeration securityClassificationEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassificationUnion(Object securityClassificationUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSecurityClassificationUnion_MemberTypes(securityClassificationUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Security Classification Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassificationUnion_MemberTypes(Object securityClassificationUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getSecurityClassificationEnumeration().isInstance(securityClassificationUnion)) {
				if (validateSecurityClassificationEnumeration((SecurityClassificationEnumeration)securityClassificationUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(securityClassificationUnion)) {
				if (validateNonEmptyString((String)securityClassificationUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getSecurityClassificationEnumeration().isInstance(securityClassificationUnion)) {
				if (validateSecurityClassificationEnumeration((SecurityClassificationEnumeration)securityClassificationUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(securityClassificationUnion)) {
				if (validateNonEmptyString((String)securityClassificationUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharingEnumerationsObject(SharingEnumerations sharingEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOCTypeUnion(Object pocTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePOCTypeUnion_MemberTypes(pocTypeUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>POC Type Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOCTypeUnion_MemberTypes(Object pocTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getPOCTypeEnumeration().isInstance(pocTypeUnion)) {
				if (validatePOCTypeEnumeration((POCTypeEnumeration)pocTypeUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(pocTypeUnion)) {
				if (validateNonEmptyString((String)pocTypeUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getPOCTypeEnumeration().isInstance(pocTypeUnion)) {
				if (validatePOCTypeEnumeration((POCTypeEnumeration)pocTypeUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(pocTypeUnion)) {
				if (validateNonEmptyString((String)pocTypeUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReliableEnumerationsObject(ReliableEnumerations reliableEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OmtPackage.eINSTANCE.getNonEmptyString(), nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMTypeEnumerationsObject(OMTypeEnumerations omTypeEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMTypeUnion(Object omTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOMTypeUnion_MemberTypes(omTypeUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>OM Type Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMTypeUnion_MemberTypes(Object omTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getOMTypeEnumerations().isInstance(omTypeUnion)) {
				if (validateOMTypeEnumerations((OMTypeEnumerations)omTypeUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(omTypeUnion)) {
				if (validateNonEmptyString((String)omTypeUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getOMTypeEnumerations().isInstance(omTypeUnion)) {
				if (validateOMTypeEnumerations((OMTypeEnumerations)omTypeUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(omTypeUnion)) {
				if (validateNonEmptyString((String)omTypeUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderEnumerationsObject(OrderEnumerations orderEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnershipEnumerationsObject(OwnershipEnumerations ownershipEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOCTypeEnumerationObject(POCTypeEnumeration pocTypeEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphTypeEnumerationsObject(GlyphTypeEnumerations glyphTypeEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphTypeUnion(Object glyphTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGlyphTypeUnion_MemberTypes(glyphTypeUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Glyph Type Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphTypeUnion_MemberTypes(Object glyphTypeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getGlyphTypeEnumerations().isInstance(glyphTypeUnion)) {
				if (validateGlyphTypeEnumerations((GlyphTypeEnumerations)glyphTypeUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(glyphTypeUnion)) {
				if (xmlTypeValidator.validateString((String)glyphTypeUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getGlyphTypeEnumerations().isInstance(glyphTypeUnion)) {
				if (validateGlyphTypeEnumerations((GlyphTypeEnumerations)glyphTypeUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(glyphTypeUnion)) {
				if (xmlTypeValidator.validateString((String)glyphTypeUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionValuePattern(String dimensionValuePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDimensionValuePattern_Pattern(dimensionValuePattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDimensionValuePattern_Pattern
	 */
	public static final  PatternMatcher [][] DIMENSION_VALUE_PATTERN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d+|\\[\\d+\\.\\.\\d+\\)|\\[\\d+\\)|Excluded")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dimension Value Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionValuePattern_Pattern(String dimensionValuePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OmtPackage.eINSTANCE.getDimensionValuePattern(), dimensionValuePattern, DIMENSION_VALUE_PATTERN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianEnumerationsObject(EndianEnumerations endianEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordEncodingEnumerationObject(FixedRecordEncodingEnumeration fixedRecordEncodingEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordEncodingUnion(Object fixedRecordEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFixedRecordEncodingUnion_MemberTypes(fixedRecordEncodingUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fixed Record Encoding Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedRecordEncodingUnion_MemberTypes(Object fixedRecordEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration().isInstance(fixedRecordEncodingUnion)) {
				if (validateFixedRecordEncodingEnumeration((FixedRecordEncodingEnumeration)fixedRecordEncodingUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(fixedRecordEncodingUnion)) {
				if (validateNonEmptyString((String)fixedRecordEncodingUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getFixedRecordEncodingEnumeration().isInstance(fixedRecordEncodingUnion)) {
				if (validateFixedRecordEncodingEnumeration((FixedRecordEncodingEnumeration)fixedRecordEncodingUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(fixedRecordEncodingUnion)) {
				if (validateNonEmptyString((String)fixedRecordEncodingUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDomainEnumerationsObject(ApplicationDomainEnumerations applicationDomainEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDomainUnion(Object applicationDomainUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateApplicationDomainUnion_MemberTypes(applicationDomainUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Application Domain Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDomainUnion_MemberTypes(Object applicationDomainUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getApplicationDomainEnumerations().isInstance(applicationDomainUnion)) {
				if (validateApplicationDomainEnumerations((ApplicationDomainEnumerations)applicationDomainUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(applicationDomainUnion)) {
				if (xmlTypeValidator.validateString((String)applicationDomainUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getApplicationDomainEnumerations().isInstance(applicationDomainUnion)) {
				if (validateApplicationDomainEnumerations((ApplicationDomainEnumerations)applicationDomainUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(applicationDomainUnion)) {
				if (xmlTypeValidator.validateString((String)applicationDomainUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatypeEncodingEnum(String arrayDatatypeEncodingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArrayDatatypeEncodingEnum_Pattern(arrayDatatypeEncodingEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateArrayDatatypeEncodingEnum_Pattern
	 */
	public static final  PatternMatcher [][] ARRAY_DATATYPE_ENCODING_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("HLAfixedArray"),
				XMLTypeUtil.createPatternMatcher("HLAvariableArray")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Array Datatype Encoding Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatypeEncodingEnum_Pattern(String arrayDatatypeEncodingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum(), arrayDatatypeEncodingEnum, ARRAY_DATATYPE_ENCODING_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatypeEncodingUnion(String arrayDatatypeEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArrayDatatypeEncodingUnion_MemberTypes(arrayDatatypeEncodingUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Array Datatype Encoding Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatypeEncodingUnion_MemberTypes(String arrayDatatypeEncodingUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum().isInstance(arrayDatatypeEncodingUnion)) {
				if (validateArrayDatatypeEncodingEnum(arrayDatatypeEncodingUnion, tempDiagnostics, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(arrayDatatypeEncodingUnion)) {
				if (validateNonEmptyString(arrayDatatypeEncodingUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (OmtPackage.eINSTANCE.getArrayDatatypeEncodingEnum().isInstance(arrayDatatypeEncodingUnion)) {
				if (validateArrayDatatypeEncodingEnum(arrayDatatypeEncodingUnion, null, context)) return true;
			}
			if (OmtPackage.eINSTANCE.getNonEmptyString().isInstance(arrayDatatypeEncodingUnion)) {
				if (validateNonEmptyString(arrayDatatypeEncodingUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityEnumerationsObject(CapabilityEnumerations capabilityEnumerationsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityPattern(String cardinalityPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCardinalityPattern_Pattern(cardinalityPattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCardinalityPattern_Pattern
	 */
	public static final  PatternMatcher [][] CARDINALITY_PATTERN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(Dynamic|(\\d)+|(\\[(\\d)+..(\\d)+\\]))(,(Dynamic|(\\d)+|(\\[(\\d)+..(\\d)+\\])))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cardinality Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityPattern_Pattern(String cardinalityPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OmtPackage.eINSTANCE.getCardinalityPattern(), cardinalityPattern, CARDINALITY_PATTERN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OmtValidator
