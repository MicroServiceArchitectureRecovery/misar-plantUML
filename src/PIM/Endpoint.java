/**
 */
package PIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.Endpoint#getRequestURI <em>Request URI</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends MessageDestination {
	/**
	 * Returns the value of the '<em><b>Request URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request URI</em>' attribute.
	 * @see #setRequestURI(String)
	 * @see PIM.PIMPackage#getEndpoint_RequestURI()
	 * @model
	 * @generated
	 */
	String getRequestURI();

	/**
	 * Sets the value of the '{@link PIM.Endpoint#getRequestURI <em>Request URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request URI</em>' attribute.
	 * @see #getRequestURI()
	 * @generated
	 */
	void setRequestURI(String value);

} // Endpoint
