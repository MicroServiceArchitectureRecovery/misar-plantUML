/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.ServiceInterface#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link PIM.ServiceInterface#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link PIM.ServiceInterface#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getServiceInterface()
 * @model
 * @generated
 */
public interface ServiceInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server URL</em>' attribute.
	 * @see #setServerURL(String)
	 * @see PIM.PIMPackage#getServiceInterface_ServerURL()
	 * @model
	 * @generated
	 */
	String getServerURL();

	/**
	 * Sets the value of the '{@link PIM.ServiceInterface#getServerURL <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server URL</em>' attribute.
	 * @see #getServerURL()
	 * @generated
	 */
	void setServerURL(String value);

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
	 * The list contents are of type {@link PIM.MessageDestination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' containment reference list.
	 * @see PIM.PIMPackage#getServiceInterface_Destinations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MessageDestination> getDestinations();

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getServiceInterface_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // ServiceInterface
