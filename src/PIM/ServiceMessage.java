/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.ServiceMessage#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link PIM.ServiceMessage#getBodySchema <em>Body Schema</em>}</li>
 *   <li>{@link PIM.ServiceMessage#getSchemaFormat <em>Schema Format</em>}</li>
 *   <li>{@link PIM.ServiceMessage#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getServiceMessage()
 * @model
 * @generated
 */
public interface ServiceMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see PIM.PIMPackage#getServiceMessage_MessageType()
	 * @model
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link PIM.ServiceMessage#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Body Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Schema</em>' attribute.
	 * @see #setBodySchema(String)
	 * @see PIM.PIMPackage#getServiceMessage_BodySchema()
	 * @model
	 * @generated
	 */
	String getBodySchema();

	/**
	 * Sets the value of the '{@link PIM.ServiceMessage#getBodySchema <em>Body Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Schema</em>' attribute.
	 * @see #getBodySchema()
	 * @generated
	 */
	void setBodySchema(String value);

	/**
	 * Returns the value of the '<em><b>Schema Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Format</em>' attribute.
	 * @see #setSchemaFormat(String)
	 * @see PIM.PIMPackage#getServiceMessage_SchemaFormat()
	 * @model
	 * @generated
	 */
	String getSchemaFormat();

	/**
	 * Sets the value of the '{@link PIM.ServiceMessage#getSchemaFormat <em>Schema Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Format</em>' attribute.
	 * @see #getSchemaFormat()
	 * @generated
	 */
	void setSchemaFormat(String value);

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getServiceMessage_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // ServiceMessage
