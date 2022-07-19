/**
 */
package PIM.impl;

import PIM.PIMPackage;
import PIM.ServiceMessage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.ServiceMessageImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link PIM.impl.ServiceMessageImpl#getBodySchema <em>Body Schema</em>}</li>
 *   <li>{@link PIM.impl.ServiceMessageImpl#getSchemaFormat <em>Schema Format</em>}</li>
 *   <li>{@link PIM.impl.ServiceMessageImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceMessageImpl extends MinimalEObjectImpl.Container implements ServiceMessage {
	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected String messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodySchema() <em>Body Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySchema()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodySchema() <em>Body Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySchema()
	 * @generated
	 * @ordered
	 */
	protected String bodySchema = BODY_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaFormat() <em>Schema Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaFormat() <em>Schema Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaFormat()
	 * @generated
	 * @ordered
	 */
	protected String schemaFormat = SCHEMA_FORMAT_EDEFAULT;

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
	protected ServiceMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.SERVICE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(String newMessageType) {
		String oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_MESSAGE__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodySchema() {
		return bodySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySchema(String newBodySchema) {
		String oldBodySchema = bodySchema;
		bodySchema = newBodySchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_MESSAGE__BODY_SCHEMA, oldBodySchema, bodySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaFormat() {
		return schemaFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaFormat(String newSchemaFormat) {
		String oldSchemaFormat = schemaFormat;
		schemaFormat = newSchemaFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.SERVICE_MESSAGE__SCHEMA_FORMAT, oldSchemaFormat, schemaFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.SERVICE_MESSAGE__GENERATING_PSM);
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
			case PIMPackage.SERVICE_MESSAGE__MESSAGE_TYPE:
				return getMessageType();
			case PIMPackage.SERVICE_MESSAGE__BODY_SCHEMA:
				return getBodySchema();
			case PIMPackage.SERVICE_MESSAGE__SCHEMA_FORMAT:
				return getSchemaFormat();
			case PIMPackage.SERVICE_MESSAGE__GENERATING_PSM:
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
			case PIMPackage.SERVICE_MESSAGE__MESSAGE_TYPE:
				setMessageType((String)newValue);
				return;
			case PIMPackage.SERVICE_MESSAGE__BODY_SCHEMA:
				setBodySchema((String)newValue);
				return;
			case PIMPackage.SERVICE_MESSAGE__SCHEMA_FORMAT:
				setSchemaFormat((String)newValue);
				return;
			case PIMPackage.SERVICE_MESSAGE__GENERATING_PSM:
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
			case PIMPackage.SERVICE_MESSAGE__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case PIMPackage.SERVICE_MESSAGE__BODY_SCHEMA:
				setBodySchema(BODY_SCHEMA_EDEFAULT);
				return;
			case PIMPackage.SERVICE_MESSAGE__SCHEMA_FORMAT:
				setSchemaFormat(SCHEMA_FORMAT_EDEFAULT);
				return;
			case PIMPackage.SERVICE_MESSAGE__GENERATING_PSM:
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
			case PIMPackage.SERVICE_MESSAGE__MESSAGE_TYPE:
				return MESSAGE_TYPE_EDEFAULT == null ? messageType != null : !MESSAGE_TYPE_EDEFAULT.equals(messageType);
			case PIMPackage.SERVICE_MESSAGE__BODY_SCHEMA:
				return BODY_SCHEMA_EDEFAULT == null ? bodySchema != null : !BODY_SCHEMA_EDEFAULT.equals(bodySchema);
			case PIMPackage.SERVICE_MESSAGE__SCHEMA_FORMAT:
				return SCHEMA_FORMAT_EDEFAULT == null ? schemaFormat != null : !SCHEMA_FORMAT_EDEFAULT.equals(schemaFormat);
			case PIMPackage.SERVICE_MESSAGE__GENERATING_PSM:
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
		result.append(" (MessageType: ");
		result.append(messageType);
		result.append(", BodySchema: ");
		result.append(bodySchema);
		result.append(", SchemaFormat: ");
		result.append(schemaFormat);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //ServiceMessageImpl
