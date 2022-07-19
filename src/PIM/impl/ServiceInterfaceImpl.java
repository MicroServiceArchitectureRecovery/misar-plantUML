/**
 */
package PIM.impl;

import PIM.MessageDestination;
import PIM.PIMPackage;
import PIM.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.ServiceInterfaceImpl#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link PIM.impl.ServiceInterfaceImpl#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link PIM.impl.ServiceInterfaceImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInterfaceImpl extends MinimalEObjectImpl.Container implements ServiceInterface {
	/**
	 * The default value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected String serverURL = SERVER_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDestination> destinations;

	/**
	 * The cached value of the '{@link #getGeneratingPSM() <em>Generating PSM</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingPSM()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generatingPSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerURL() {
		return serverURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerURL(String newServerURL) {
		String oldServerURL = serverURL;
		serverURL = newServerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_INTERFACE__SERVER_URL, oldServerURL, serverURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestination> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectContainmentEList<MessageDestination>(MessageDestination.class, this, PIMPackage.SERVICE_INTERFACE__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.SERVICE_INTERFACE__GENERATING_PSM);
		}
		return generatingPSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PIMPackage.SERVICE_INTERFACE__DESTINATIONS:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PIMPackage.SERVICE_INTERFACE__SERVER_URL:
				return getServerURL();
			case PIMPackage.SERVICE_INTERFACE__DESTINATIONS:
				return getDestinations();
			case PIMPackage.SERVICE_INTERFACE__GENERATING_PSM:
				return getGeneratingPSM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PIMPackage.SERVICE_INTERFACE__SERVER_URL:
				setServerURL((String)newValue);
				return;
			case PIMPackage.SERVICE_INTERFACE__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends MessageDestination>)newValue);
				return;
			case PIMPackage.SERVICE_INTERFACE__GENERATING_PSM:
				getGeneratingPSM().clear();
				getGeneratingPSM().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PIMPackage.SERVICE_INTERFACE__SERVER_URL:
				setServerURL(SERVER_URL_EDEFAULT);
				return;
			case PIMPackage.SERVICE_INTERFACE__DESTINATIONS:
				getDestinations().clear();
				return;
			case PIMPackage.SERVICE_INTERFACE__GENERATING_PSM:
				getGeneratingPSM().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PIMPackage.SERVICE_INTERFACE__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverURL != null : !SERVER_URL_EDEFAULT.equals(serverURL);
			case PIMPackage.SERVICE_INTERFACE__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
			case PIMPackage.SERVICE_INTERFACE__GENERATING_PSM:
				return generatingPSM != null && !generatingPSM.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ServerURL: ");
		result.append(serverURL);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //ServiceInterfaceImpl
