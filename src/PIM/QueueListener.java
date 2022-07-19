/**
 */
package PIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.QueueListener#getQueueName <em>Queue Name</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getQueueListener()
 * @model
 * @generated
 */
public interface QueueListener extends MessageDestination {
	/**
	 * Returns the value of the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Name</em>' attribute.
	 * @see #setQueueName(String)
	 * @see PIM.PIMPackage#getQueueListener_QueueName()
	 * @model
	 * @generated
	 */
	String getQueueName();

	/**
	 * Sets the value of the '{@link PIM.QueueListener#getQueueName <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Name</em>' attribute.
	 * @see #getQueueName()
	 * @generated
	 */
	void setQueueName(String value);

} // QueueListener
