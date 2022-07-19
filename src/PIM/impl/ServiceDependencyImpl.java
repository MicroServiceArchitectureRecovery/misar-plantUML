/**
 */
package PIM.impl;

import PIM.PIMPackage;
import PIM.ServiceDependency;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#getConsumerOperation <em>Consumer Operation</em>}</li>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#isIsWrappedByCircuitBreaker <em>Is Wrapped By Circuit Breaker</em>}</li>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#getProviderDestination <em>Provider Destination</em>}</li>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.impl.ServiceDependencyImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDependencyImpl extends MinimalEObjectImpl.Container implements ServiceDependency {
	/**
	 * The default value of the '{@link #getConsumerOperation() <em>Consumer Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerOperation() <em>Consumer Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerOperation()
	 * @generated
	 * @ordered
	 */
	protected String consumerOperation = CONSUMER_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWrappedByCircuitBreaker() <em>Is Wrapped By Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWrappedByCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WRAPPED_BY_CIRCUIT_BREAKER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWrappedByCircuitBreaker() <em>Is Wrapped By Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWrappedByCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected boolean isWrappedByCircuitBreaker = IS_WRAPPED_BY_CIRCUIT_BREAKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderDestination() <em>Provider Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderDestination() <em>Provider Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderDestination()
	 * @generated
	 * @ordered
	 */
	protected String providerDestination = PROVIDER_DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

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
	protected ServiceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.SERVICE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerOperation() {
		return consumerOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerOperation(String newConsumerOperation) {
		String oldConsumerOperation = consumerOperation;
		consumerOperation = newConsumerOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_DEPENDENCY__CONSUMER_OPERATION, oldConsumerOperation, consumerOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWrappedByCircuitBreaker() {
		return isWrappedByCircuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWrappedByCircuitBreaker(boolean newIsWrappedByCircuitBreaker) {
		boolean oldIsWrappedByCircuitBreaker = isWrappedByCircuitBreaker;
		isWrappedByCircuitBreaker = newIsWrappedByCircuitBreaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER, oldIsWrappedByCircuitBreaker, isWrappedByCircuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_DEPENDENCY__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderDestination() {
		return providerDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderDestination(String newProviderDestination) {
		String oldProviderDestination = providerDestination;
		providerDestination = newProviderDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_DEPENDENCY__PROVIDER_DESTINATION, oldProviderDestination, providerDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_DEPENDENCY__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.SERVICE_DEPENDENCY__GENERATING_PSM);
		}
		return generatingPSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PIMPackage.SERVICE_DEPENDENCY__CONSUMER_OPERATION:
				return getConsumerOperation();
			case PIMPackage.SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER:
				return isIsWrappedByCircuitBreaker();
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_NAME:
				return getProviderName();
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_DESTINATION:
				return getProviderDestination();
			case PIMPackage.SERVICE_DEPENDENCY__ENVIRONMENT:
				return getEnvironment();
			case PIMPackage.SERVICE_DEPENDENCY__GENERATING_PSM:
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
			case PIMPackage.SERVICE_DEPENDENCY__CONSUMER_OPERATION:
				setConsumerOperation((String)newValue);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER:
				setIsWrappedByCircuitBreaker((Boolean)newValue);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_DESTINATION:
				setProviderDestination((String)newValue);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__GENERATING_PSM:
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
			case PIMPackage.SERVICE_DEPENDENCY__CONSUMER_OPERATION:
				setConsumerOperation(CONSUMER_OPERATION_EDEFAULT);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER:
				setIsWrappedByCircuitBreaker(IS_WRAPPED_BY_CIRCUIT_BREAKER_EDEFAULT);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_DESTINATION:
				setProviderDestination(PROVIDER_DESTINATION_EDEFAULT);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case PIMPackage.SERVICE_DEPENDENCY__GENERATING_PSM:
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
			case PIMPackage.SERVICE_DEPENDENCY__CONSUMER_OPERATION:
				return CONSUMER_OPERATION_EDEFAULT == null ? consumerOperation != null : !CONSUMER_OPERATION_EDEFAULT.equals(consumerOperation);
			case PIMPackage.SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER:
				return isWrappedByCircuitBreaker != IS_WRAPPED_BY_CIRCUIT_BREAKER_EDEFAULT;
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case PIMPackage.SERVICE_DEPENDENCY__PROVIDER_DESTINATION:
				return PROVIDER_DESTINATION_EDEFAULT == null ? providerDestination != null : !PROVIDER_DESTINATION_EDEFAULT.equals(providerDestination);
			case PIMPackage.SERVICE_DEPENDENCY__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case PIMPackage.SERVICE_DEPENDENCY__GENERATING_PSM:
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
		result.append(" (ConsumerOperation: ");
		result.append(consumerOperation);
		result.append(", isWrappedByCircuitBreaker: ");
		result.append(isWrappedByCircuitBreaker);
		result.append(", ProviderName: ");
		result.append(providerName);
		result.append(", ProviderDestination: ");
		result.append(providerDestination);
		result.append(", Environment: ");
		result.append(environment);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //ServiceDependencyImpl
