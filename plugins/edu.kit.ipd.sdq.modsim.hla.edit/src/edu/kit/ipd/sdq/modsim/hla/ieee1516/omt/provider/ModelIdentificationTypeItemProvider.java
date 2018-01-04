/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;

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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelIdentificationTypeItemProvider 
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
	public ModelIdentificationTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ModelIdentificationType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelIdentificationType_idtag_feature", "_UI_ModelIdentificationType_type"),
				 OmtPackage.eINSTANCE.getModelIdentificationType_Idtag(),
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
				 getString("_UI_ModelIdentificationType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelIdentificationType_notes_feature", "_UI_ModelIdentificationType_type"),
				 OmtPackage.eINSTANCE.getModelIdentificationType_Notes(),
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
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Name());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Type());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Version());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_ModificationDate());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_SecurityClassification());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_ReleaseRestriction());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Purpose());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_ApplicationDomain());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Description());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_UseLimitation());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_UseHistory());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Keyword());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Poc());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Reference());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Other());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Glyph());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_Any());
			childrenFeatures.add(OmtPackage.eINSTANCE.getModelIdentificationType_AnyAttribute());
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
	 * This returns ModelIdentificationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelIdentificationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelIdentificationType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelIdentificationType_type") :
			getString("_UI_ModelIdentificationType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelIdentificationType.class)) {
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__IDTAG:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__NAME:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__TYPE:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__VERSION:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__PURPOSE:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__KEYWORD:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__POC:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__REFERENCE:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__OTHER:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__GLYPH:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__ANY:
			case OmtPackage.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
				(OmtPackage.eINSTANCE.getModelIdentificationType_Name(),
				 OmtFactory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Type(),
				 OmtFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Version(),
				 OmtFactory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_ModificationDate(),
				 OmtFactory.eINSTANCE.createModificationDateType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_SecurityClassification(),
				 OmtFactory.eINSTANCE.createSecurityClassificationType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_ReleaseRestriction(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Purpose(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_ApplicationDomain(),
				 OmtFactory.eINSTANCE.createApplicationDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Description(),
				 OmtFactory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_UseLimitation(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_UseHistory(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Keyword(),
				 OmtFactory.eINSTANCE.createKeywordType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Poc(),
				 OmtFactory.eINSTANCE.createPocType1()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Reference(),
				 OmtFactory.eINSTANCE.createIdReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Other(),
				 OmtFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(OmtPackage.eINSTANCE.getModelIdentificationType_Glyph(),
				 OmtFactory.eINSTANCE.createGlyphType1()));
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
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_Name() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_Version() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_Description() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_ReleaseRestriction() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_Purpose() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_UseLimitation() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_UseHistory() ||
			childFeature == OmtPackage.eINSTANCE.getModelIdentificationType_Other();

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
