/**
 */
package PIM.impl;

import PIM.Microservice;
import PIM.MicroserviceArchitecture;
import PIM.PIMPackage;

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
 * An implementation of the model object '<em><b>Microservice Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.MicroserviceArchitectureImpl#getArchitectureName <em>Architecture Name</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceArchitectureImpl#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceArchitectureImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceArchitectureImpl extends MinimalEObjectImpl.Container implements MicroserviceArchitecture {
	/**
	 * The default value of the '{@link #getArchitectureName() <em>Architecture Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitectureName() <em>Architecture Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureName()
	 * @generated
	 * @ordered
	 */
	protected String architectureName = ARCHITECTURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMicroservices() <em>Microservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> microservices;

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
	protected MicroserviceArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.MICROSERVICE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitectureName() {
		return architectureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitectureName(String newArchitectureName) {
		String oldArchitectureName = architectureName;
		architectureName = newArchitectureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME, oldArchitectureName, architectureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getMicroservices() {
		if (microservices == null) {
			microservices = new EObjectContainmentEList<Microservice>(Microservice.class, this, PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES);
		}
		return microservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.MICROSERVICE_ARCHITECTURE__GENERATING_PSM);
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
			case PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES:
				return ((InternalEList<?>)getMicroservices()).basicRemove(otherEnd, msgs);
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
			case PIMPackage.MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME:
				return getArchitectureName();
			case PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES:
				return getMicroservices();
			case PIMPackage.MICROSERVICE_ARCHITECTURE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME:
				setArchitectureName((String)newValue);
				return;
			case PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES:
				getMicroservices().clear();
				getMicroservices().addAll((Collection<? extends Microservice>)newValue);
				return;
			case PIMPackage.MICROSERVICE_ARCHITECTURE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME:
				setArchitectureName(ARCHITECTURE_NAME_EDEFAULT);
				return;
			case PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES:
				getMicroservices().clear();
				return;
			case PIMPackage.MICROSERVICE_ARCHITECTURE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME:
				return ARCHITECTURE_NAME_EDEFAULT == null ? architectureName != null : !ARCHITECTURE_NAME_EDEFAULT.equals(architectureName);
			case PIMPackage.MICROSERVICE_ARCHITECTURE__MICROSERVICES:
				return microservices != null && !microservices.isEmpty();
			case PIMPackage.MICROSERVICE_ARCHITECTURE__GENERATING_PSM:
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
		result.append(" (ArchitectureName: ");
		result.append(architectureName);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //MicroserviceArchitectureImpl
