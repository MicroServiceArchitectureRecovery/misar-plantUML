/**
 */
package PIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root PIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.RootPIM#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getRootPIM()
 * @model
 * @generated
 */
public interface RootPIM extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' containment reference.
	 * @see #setArchitecture(MicroserviceArchitecture)
	 * @see PIM.PIMPackage#getRootPIM_Architecture()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MicroserviceArchitecture getArchitecture();

	/**
	 * Sets the value of the '{@link PIM.RootPIM#getArchitecture <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' containment reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(MicroserviceArchitecture value);

} // RootPIM
