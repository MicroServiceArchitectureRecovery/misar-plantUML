/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.ServiceOperation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link PIM.ServiceOperation#getOperationDescription <em>Operation Description</em>}</li>
 *   <li>{@link PIM.ServiceOperation#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getServiceOperation()
 * @model
 * @generated
 */
public interface ServiceOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see PIM.PIMPackage#getServiceOperation_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link PIM.ServiceOperation#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Description</em>' attribute.
	 * @see #setOperationDescription(String)
	 * @see PIM.PIMPackage#getServiceOperation_OperationDescription()
	 * @model
	 * @generated
	 */
	String getOperationDescription();

	/**
	 * Sets the value of the '{@link PIM.ServiceOperation#getOperationDescription <em>Operation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Description</em>' attribute.
	 * @see #getOperationDescription()
	 * @generated
	 */
	void setOperationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getServiceOperation_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // ServiceOperation
