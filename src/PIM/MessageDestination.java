/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.MessageDestination#getOperation <em>Operation</em>}</li>
 *   <li>{@link PIM.MessageDestination#getMessages <em>Messages</em>}</li>
 *   <li>{@link PIM.MessageDestination#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.MessageDestination#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getMessageDestination()
 * @model
 * @generated
 */
public interface MessageDestination extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ServiceOperation)
	 * @see PIM.PIMPackage#getMessageDestination_Operation()
	 * @model containment="true"
	 * @generated
	 */
	ServiceOperation getOperation();

	/**
	 * Sets the value of the '{@link PIM.MessageDestination#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ServiceOperation value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link PIM.ServiceMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see PIM.PIMPackage#getMessageDestination_Messages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceMessage> getMessages();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see PIM.PIMPackage#getMessageDestination_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link PIM.MessageDestination#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getMessageDestination_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // MessageDestination
