/**
 */
package PIM.impl;

import PIM.MessageDestination;
import PIM.PIMPackage;
import PIM.ServiceMessage;
import PIM.ServiceOperation;

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
 * An implementation of the model object '<em><b>Message Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.MessageDestinationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link PIM.impl.MessageDestinationImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link PIM.impl.MessageDestinationImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.impl.MessageDestinationImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDestinationImpl extends MinimalEObjectImpl.Container implements MessageDestination {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation operation;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceMessage> messages;

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
	protected MessageDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.MESSAGE_DESTINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ServiceOperation newOperation, NotificationChain msgs) {
		ServiceOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PIMPackage.MESSAGE_DESTINATION__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ServiceOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MESSAGE_DESTINATION__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PIMPackage.MESSAGE_DESTINATION__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MESSAGE_DESTINATION__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<ServiceMessage>(ServiceMessage.class, this, PIMPackage.MESSAGE_DESTINATION__MESSAGES);
		}
		return messages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.MESSAGE_DESTINATION__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.MESSAGE_DESTINATION__GENERATING_PSM);
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
			case PIMPackage.MESSAGE_DESTINATION__OPERATION:
				return basicSetOperation(null, msgs);
			case PIMPackage.MESSAGE_DESTINATION__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case PIMPackage.MESSAGE_DESTINATION__OPERATION:
				return getOperation();
			case PIMPackage.MESSAGE_DESTINATION__MESSAGES:
				return getMessages();
			case PIMPackage.MESSAGE_DESTINATION__ENVIRONMENT:
				return getEnvironment();
			case PIMPackage.MESSAGE_DESTINATION__GENERATING_PSM:
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
			case PIMPackage.MESSAGE_DESTINATION__OPERATION:
				setOperation((ServiceOperation)newValue);
				return;
			case PIMPackage.MESSAGE_DESTINATION__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends ServiceMessage>)newValue);
				return;
			case PIMPackage.MESSAGE_DESTINATION__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case PIMPackage.MESSAGE_DESTINATION__GENERATING_PSM:
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
			case PIMPackage.MESSAGE_DESTINATION__OPERATION:
				setOperation((ServiceOperation)null);
				return;
			case PIMPackage.MESSAGE_DESTINATION__MESSAGES:
				getMessages().clear();
				return;
			case PIMPackage.MESSAGE_DESTINATION__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case PIMPackage.MESSAGE_DESTINATION__GENERATING_PSM:
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
			case PIMPackage.MESSAGE_DESTINATION__OPERATION:
				return operation != null;
			case PIMPackage.MESSAGE_DESTINATION__MESSAGES:
				return messages != null && !messages.isEmpty();
			case PIMPackage.MESSAGE_DESTINATION__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case PIMPackage.MESSAGE_DESTINATION__GENERATING_PSM:
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
		result.append(" (Environment: ");
		result.append(environment);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //MessageDestinationImpl
