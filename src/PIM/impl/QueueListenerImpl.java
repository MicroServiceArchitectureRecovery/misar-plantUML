/**
 */
package PIM.impl;

import PIM.PIMPackage;
import PIM.QueueListener;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.QueueListenerImpl#getQueueName <em>Queue Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueListenerImpl extends MessageDestinationImpl implements QueueListener {
	/**
	 * The default value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected String queueName = QUEUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.QUEUE_LISTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueName(String newQueueName) {
		String oldQueueName = queueName;
		queueName = newQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.QUEUE_LISTENER__QUEUE_NAME, oldQueueName, queueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PIMPackage.QUEUE_LISTENER__QUEUE_NAME:
				return getQueueName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PIMPackage.QUEUE_LISTENER__QUEUE_NAME:
				setQueueName((String)newValue);
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
			case PIMPackage.QUEUE_LISTENER__QUEUE_NAME:
				setQueueName(QUEUE_NAME_EDEFAULT);
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
			case PIMPackage.QUEUE_LISTENER__QUEUE_NAME:
				return QUEUE_NAME_EDEFAULT == null ? queueName != null : !QUEUE_NAME_EDEFAULT.equals(queueName);
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
		result.append(" (QueueName: ");
		result.append(queueName);
		result.append(')');
		return result.toString();
	}

} //QueueListenerImpl
