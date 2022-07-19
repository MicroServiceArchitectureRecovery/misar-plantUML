/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.MicroserviceArchitecture#getArchitectureName <em>Architecture Name</em>}</li>
 *   <li>{@link PIM.MicroserviceArchitecture#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link PIM.MicroserviceArchitecture#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getMicroserviceArchitecture()
 * @model
 * @generated
 */
public interface MicroserviceArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Name</em>' attribute.
	 * @see #setArchitectureName(String)
	 * @see PIM.PIMPackage#getMicroserviceArchitecture_ArchitectureName()
	 * @model
	 * @generated
	 */
	String getArchitectureName();

	/**
	 * Sets the value of the '{@link PIM.MicroserviceArchitecture#getArchitectureName <em>Architecture Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Name</em>' attribute.
	 * @see #getArchitectureName()
	 * @generated
	 */
	void setArchitectureName(String value);

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link PIM.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see PIM.PIMPackage#getMicroserviceArchitecture_Microservices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getMicroserviceArchitecture_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // MicroserviceArchitecture
