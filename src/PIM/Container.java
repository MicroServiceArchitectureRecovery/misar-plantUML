/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.Container#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link PIM.Container#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Ambient {
	/**
	 * Returns the value of the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name</em>' attribute.
	 * @see #setContainerName(String)
	 * @see PIM.PIMPackage#getContainer_ContainerName()
	 * @model
	 * @generated
	 */
	String getContainerName();

	/**
	 * Sets the value of the '{@link PIM.Container#getContainerName <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name</em>' attribute.
	 * @see #getContainerName()
	 * @generated
	 */
	void setContainerName(String value);

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getContainer_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // Container
