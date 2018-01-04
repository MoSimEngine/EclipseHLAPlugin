/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType;

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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsTypeItemProvider 
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
	public TagsTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_TagsType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TagsType_idtag_feature", "_UI_TagsType_type"),
				 OmtPackage.eINSTANCE.getTagsType_Idtag(),
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
				 getString("_UI_TagsType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TagsType_notes_feature", "_UI_TagsType_type"),
				 OmtPackage.eINSTANCE.getTagsType_Notes(),
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
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_UpdateReflectTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_SendReceiveTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_DeleteRemoveTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_DivestitureRequestTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_DivestitureCompletionTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_AcquisitionRequestTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_RequestUpdateTag());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_Any());
			childrenFeatures.add(OmtPackage.eINSTANCE.getTagsType_AnyAttribute());
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
	 * This returns TagsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TagsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TagsType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_TagsType_type") :
			getString("_UI_TagsType_type") + " " + label;
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

		switch (notification.getFeatureID(TagsType.class)) {
			case OmtPackage.TAGS_TYPE__IDTAG:
			case OmtPackage.TAGS_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
			case OmtPackage.TAGS_TYPE__ANY:
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
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
				(OmtPackage.eINSTANCE.getTagsType_UpdateReflectTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_SendReceiveTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_DeleteRemoveTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_DivestitureRequestTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_DivestitureCompletionTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_AcquisitionRequestTag(),
				 OmtFactory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getTagsType_RequestUpdateTag(),
				 OmtFactory.eINSTANCE.createTagType()));
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
			childFeature == OmtPackage.eINSTANCE.getTagsType_UpdateReflectTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_SendReceiveTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_DeleteRemoveTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_DivestitureRequestTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_DivestitureCompletionTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_AcquisitionRequestTag() ||
			childFeature == OmtPackage.eINSTANCE.getTagsType_RequestUpdateTag();

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
