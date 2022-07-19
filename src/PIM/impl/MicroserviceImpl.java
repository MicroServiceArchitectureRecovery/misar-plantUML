/**
 */
package PIM.impl;

import PIM.InfrastructurePatternComponent;
import PIM.Microservice;
import PIM.PIMPackage;
import PIM.ServiceDependency;
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
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.MicroserviceImpl#getMicroserviceName <em>Microservice Name</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link PIM.impl.MicroserviceImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getMicroserviceName() <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String MICROSERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMicroserviceName() <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceName()
	 * @generated
	 * @ordered
	 */
	protected String microserviceName = MICROSERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected PIM.Container container;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructurePatternComponent> components;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface interface_;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDependency> dependencies;

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
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMicroserviceName() {
		return microserviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroserviceName(String newMicroserviceName) {
		String oldMicroserviceName = microserviceName;
		microserviceName = newMicroserviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE__MICROSERVICE_NAME, oldMicroserviceName, microserviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIM.Container getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(PIM.Container newContainer, NotificationChain msgs) {
		PIM.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(PIM.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MICROSERVICE__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MICROSERVICE__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructurePatternComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<InfrastructurePatternComponent>(InfrastructurePatternComponent.class, this, PIMPackage.MICROSERVICE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(ServiceInterface newInterface, NotificationChain msgs) {
		ServiceInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(ServiceInterface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MICROSERVICE__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MICROSERVICE__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MICROSERVICE__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<ServiceDependency>(ServiceDependency.class, this, PIMPackage.MICROSERVICE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.MICROSERVICE__GENERATING_PSM);
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
			case PIMPackage.MICROSERVICE__CONTAINER:
				return basicSetContainer(null, msgs);
			case PIMPackage.MICROSERVICE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case PIMPackage.MICROSERVICE__INTERFACE:
				return basicSetInterface(null, msgs);
			case PIMPackage.MICROSERVICE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case PIMPackage.MICROSERVICE__MICROSERVICE_NAME:
				return getMicroserviceName();
			case PIMPackage.MICROSERVICE__CONTAINER:
				return getContainer();
			case PIMPackage.MICROSERVICE__COMPONENTS:
				return getComponents();
			case PIMPackage.MICROSERVICE__INTERFACE:
				return getInterface();
			case PIMPackage.MICROSERVICE__DEPENDENCIES:
				return getDependencies();
			case PIMPackage.MICROSERVICE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE__MICROSERVICE_NAME:
				setMicroserviceName((String)newValue);
				return;
			case PIMPackage.MICROSERVICE__CONTAINER:
				setContainer((PIM.Container)newValue);
				return;
			case PIMPackage.MICROSERVICE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends InfrastructurePatternComponent>)newValue);
				return;
			case PIMPackage.MICROSERVICE__INTERFACE:
				setInterface((ServiceInterface)newValue);
				return;
			case PIMPackage.MICROSERVICE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ServiceDependency>)newValue);
				return;
			case PIMPackage.MICROSERVICE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE__MICROSERVICE_NAME:
				setMicroserviceName(MICROSERVICE_NAME_EDEFAULT);
				return;
			case PIMPackage.MICROSERVICE__CONTAINER:
				setContainer((PIM.Container)null);
				return;
			case PIMPackage.MICROSERVICE__COMPONENTS:
				getComponents().clear();
				return;
			case PIMPackage.MICROSERVICE__INTERFACE:
				setInterface((ServiceInterface)null);
				return;
			case PIMPackage.MICROSERVICE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case PIMPackage.MICROSERVICE__GENERATING_PSM:
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
			case PIMPackage.MICROSERVICE__MICROSERVICE_NAME:
				return MICROSERVICE_NAME_EDEFAULT == null ? microserviceName != null : !MICROSERVICE_NAME_EDEFAULT.equals(microserviceName);
			case PIMPackage.MICROSERVICE__CONTAINER:
				return container != null;
			case PIMPackage.MICROSERVICE__COMPONENTS:
				return components != null && !components.isEmpty();
			case PIMPackage.MICROSERVICE__INTERFACE:
				return interface_ != null;
			case PIMPackage.MICROSERVICE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case PIMPackage.MICROSERVICE__GENERATING_PSM:
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
		result.append(" (MicroserviceName: ");
		result.append(microserviceName);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
