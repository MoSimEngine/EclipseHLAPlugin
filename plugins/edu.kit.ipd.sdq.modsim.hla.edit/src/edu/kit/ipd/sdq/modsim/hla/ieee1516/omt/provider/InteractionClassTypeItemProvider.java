/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType;
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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionClassTypeItemProvider 
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
	public InteractionClassTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_InteractionClassType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionClassType_idtag_feature", "_UI_InteractionClassType_type"),
				 OmtPackage.eINSTANCE.getInteractionClassType_Idtag(),
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
				 getString("_UI_InteractionClassType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionClassType_notes_feature", "_UI_InteractionClassType_type"),
				 OmtPackage.eINSTANCE.getInteractionClassType_Notes(),
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
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Name());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Sharing());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Dimensions());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Transportation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Order());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Semantics());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Parameter());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_InteractionClass());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_Any());
			childrenFeatures.add(OmtPackage.eINSTANCE.getInteractionClassType_AnyAttribute());
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
	 * This returns InteractionClassType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionClassType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InteractionClassType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_InteractionClassType_type") :
			getString("_UI_InteractionClassType_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionClassType.class)) {
			case OmtPackage.INTERACTION_CLASS_TYPE__IDTAG:
			case OmtPackage.INTERACTION_CLASS_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.INTERACTION_CLASS_TYPE__NAME:
			case OmtPackage.INTERACTION_CLASS_TYPE__SHARING:
			case OmtPackage.INTERACTION_CLASS_TYPE__DIMENSIONS:
			case OmtPackage.INTERACTION_CLASS_TYPE__TRANSPORTATION:
			case OmtPackage.INTERACTION_CLASS_TYPE__ORDER:
			case OmtPackage.INTERACTION_CLASS_TYPE__SEMANTICS:
			case OmtPackage.INTERACTION_CLASS_TYPE__PARAMETER:
			case OmtPackage.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
			case OmtPackage.INTERACTION_CLASS_TYPE__ANY:
			case OmtPackage.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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
				(OmtPackage.eINSTANCE.getInteractionClassType_Name(),
				 OmtFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Sharing(),
				 OmtFactory.eINSTANCE.createSharingType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Dimensions(),
				 OmtFactory.eINSTANCE.createDimensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Transportation(),
				 OmtFactory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Order(),
				 OmtFactory.eINSTANCE.createOrderType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Semantics(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_Parameter(),
				 OmtFactory.eINSTANCE.createParameterType1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getInteractionClassType_InteractionClass(),
				 OmtFactory.eINSTANCE.createInteractionClassType1()));
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
