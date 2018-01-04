/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;

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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectModelTypeItemProvider 
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
	public ObjectModelTypeItemProvider(AdapterFactory adapterFactory) {
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
			addNotes1PropertyDescriptor(object);
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
				 getString("_UI_ObjectModelType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectModelType_idtag_feature", "_UI_ObjectModelType_type"),
				 OmtPackage.eINSTANCE.getObjectModelType_Idtag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotes1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectModelType_notes1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectModelType_notes1_feature", "_UI_ObjectModelType_type"),
				 OmtPackage.eINSTANCE.getObjectModelType_Notes1(),
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
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_ModelIdentification());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_ServiceUtilization());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Objects());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Interactions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Dimensions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Time());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Tags());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Synchronizations());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Transportations());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Switches());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_UpdateRates());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_DataTypes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Notes());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_Any());
			childrenFeatures.add(OmtPackage.eINSTANCE.getObjectModelType_AnyAttribute());
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
	 * This returns ObjectModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectModelType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectModelType_type") :
			getString("_UI_ObjectModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectModelType.class)) {
			case OmtPackage.OBJECT_MODEL_TYPE__IDTAG:
			case OmtPackage.OBJECT_MODEL_TYPE__NOTES1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
			case OmtPackage.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
			case OmtPackage.OBJECT_MODEL_TYPE__OBJECTS:
			case OmtPackage.OBJECT_MODEL_TYPE__INTERACTIONS:
			case OmtPackage.OBJECT_MODEL_TYPE__DIMENSIONS:
			case OmtPackage.OBJECT_MODEL_TYPE__TIME:
			case OmtPackage.OBJECT_MODEL_TYPE__TAGS:
			case OmtPackage.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
			case OmtPackage.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
			case OmtPackage.OBJECT_MODEL_TYPE__SWITCHES:
			case OmtPackage.OBJECT_MODEL_TYPE__UPDATE_RATES:
			case OmtPackage.OBJECT_MODEL_TYPE__DATA_TYPES:
			case OmtPackage.OBJECT_MODEL_TYPE__NOTES:
			case OmtPackage.OBJECT_MODEL_TYPE__ANY:
			case OmtPackage.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
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
				(OmtPackage.eINSTANCE.getObjectModelType_ModelIdentification(),
				 OmtFactory.eINSTANCE.createModelIdentificationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_ServiceUtilization(),
				 OmtFactory.eINSTANCE.createServiceUtilizationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Objects(),
				 OmtFactory.eINSTANCE.createObjectsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Interactions(),
				 OmtFactory.eINSTANCE.createInteractionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Dimensions(),
				 OmtFactory.eINSTANCE.createDimensionsType1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Time(),
				 OmtFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Tags(),
				 OmtFactory.eINSTANCE.createTagsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Synchronizations(),
				 OmtFactory.eINSTANCE.createSynchronizationsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Transportations(),
				 OmtFactory.eINSTANCE.createTransportationsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Switches(),
				 OmtFactory.eINSTANCE.createSwitchesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_UpdateRates(),
				 OmtFactory.eINSTANCE.createUpdateRatesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_DataTypes(),
				 OmtFactory.eINSTANCE.createDataTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getObjectModelType_Notes(),
				 OmtFactory.eINSTANCE.createNotesType()));
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
