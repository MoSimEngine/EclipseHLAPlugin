/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchesTypeItemProvider 
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
	public SwitchesTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SwitchesType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchesType_idtag_feature", "_UI_SwitchesType_type"),
				 OmtPackage.eINSTANCE.getSwitchesType_Idtag(),
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
				 getString("_UI_SwitchesType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchesType_notes_feature", "_UI_SwitchesType_type"),
				 OmtPackage.eINSTANCE.getSwitchesType_Notes(),
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
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_AutoProvide());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_ConveyProducingFederate());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_AttributeScopeAdvisory());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_ServiceReporting());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_ExceptionReporting());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_AutomaticResignAction());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_Any());
			childrenFeatures.add(OmtPackage.eINSTANCE.getSwitchesType_AnyAttribute());
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
	 * This returns SwitchesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwitchesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SwitchesType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_SwitchesType_type") :
			getString("_UI_SwitchesType_type") + " " + label;
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

		switch (notification.getFeatureID(SwitchesType.class)) {
			case OmtPackage.SWITCHES_TYPE__IDTAG:
			case OmtPackage.SWITCHES_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.SWITCHES_TYPE__AUTO_PROVIDE:
			case OmtPackage.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
			case OmtPackage.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
			case OmtPackage.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
			case OmtPackage.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
			case OmtPackage.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
			case OmtPackage.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
			case OmtPackage.SWITCHES_TYPE__SERVICE_REPORTING:
			case OmtPackage.SWITCHES_TYPE__EXCEPTION_REPORTING:
			case OmtPackage.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
			case OmtPackage.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
			case OmtPackage.SWITCHES_TYPE__ANY:
			case OmtPackage.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
				(OmtPackage.eINSTANCE.getSwitchesType_AutoProvide(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_ConveyProducingFederate(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_AttributeScopeAdvisory(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_ServiceReporting(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_ExceptionReporting(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation(),
				 OmtFactory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getSwitchesType_AutomaticResignAction(),
				 OmtFactory.eINSTANCE.createResignSwitchType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_AutoProvide() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_ConveyProducingFederate() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_AttributeScopeAdvisory() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_ServiceReporting() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_ExceptionReporting() ||
			childFeature == OmtPackage.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
