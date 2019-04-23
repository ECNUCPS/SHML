/**
 */
package shml.provider;


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

import shml.ShmlFactory;
import shml.ShmlPackage;
import shml.TSHS;

/**
 * This is the item provider adapter for a {@link shml.TSHS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TSHSItemProvider 
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
	public TSHSItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addInitialstatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TSHS_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TSHS_name_feature", "_UI_TSHS_type"),
				 ShmlPackage.Literals.TSHS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TSHS_initialstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TSHS_initialstate_feature", "_UI_TSHS_type"),
				 ShmlPackage.Literals.TSHS__INITIALSTATE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDODES);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDSTATES);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDTRANSITIONS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__LOCALVARIABLES);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__LOCALCLOCKS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__LOCALEVENTS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDEXPOS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDACTIONS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDGUARDS);
			childrenFeatures.add(ShmlPackage.Literals.TSHS__OWNEDUNIFS);
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
	 * This returns TSHS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TSHS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TSHS)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TSHS_type") :
			getString("_UI_TSHS_type") + " " + label;
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

		switch (notification.getFeatureID(TSHS.class)) {
			case ShmlPackage.TSHS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ShmlPackage.TSHS__OWNEDODES:
			case ShmlPackage.TSHS__OWNEDSTATES:
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
			case ShmlPackage.TSHS__LOCALVARIABLES:
			case ShmlPackage.TSHS__LOCALCLOCKS:
			case ShmlPackage.TSHS__LOCALEVENTS:
			case ShmlPackage.TSHS__OWNEDEXPOS:
			case ShmlPackage.TSHS__OWNEDACTIONS:
			case ShmlPackage.TSHS__OWNEDGUARDS:
			case ShmlPackage.TSHS__OWNEDUNIFS:
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
				(ShmlPackage.Literals.TSHS__OWNEDODES,
				 ShmlFactory.eINSTANCE.createODE()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDSTATES,
				 ShmlFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDTRANSITIONS,
				 ShmlFactory.eINSTANCE.createComTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDTRANSITIONS,
				 ShmlFactory.eINSTANCE.createProbTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__LOCALVARIABLES,
				 ShmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__LOCALCLOCKS,
				 ShmlFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__LOCALEVENTS,
				 ShmlFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDEXPOS,
				 ShmlFactory.eINSTANCE.createExpoDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDACTIONS,
				 ShmlFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDGUARDS,
				 ShmlFactory.eINSTANCE.createTemporalGuard()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDGUARDS,
				 ShmlFactory.eINSTANCE.createEvaluateGuard()));

		newChildDescriptors.add
			(createChildParameter
				(ShmlPackage.Literals.TSHS__OWNEDUNIFS,
				 ShmlFactory.eINSTANCE.createUnifDistribution()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ShmlEditPlugin.INSTANCE;
	}

}
