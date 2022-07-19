/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.Microservice#getMicroserviceName <em>Microservice Name</em>}</li>
 *   <li>{@link PIM.Microservice#getContainer <em>Container</em>}</li>
 *   <li>{@link PIM.Microservice#getComponents <em>Components</em>}</li>
 *   <li>{@link PIM.Microservice#getInterface <em>Interface</em>}</li>
 *   <li>{@link PIM.Microservice#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link PIM.Microservice#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice Name</em>' attribute.
	 * @see #setMicroserviceName(String)
	 * @see PIM.PIMPackage#getMicroservice_MicroserviceName()
	 * @model
	 * @generated
	 */
	String getMicroserviceName();

	/**
	 * Sets the value of the '{@link PIM.Microservice#getMicroserviceName <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice Name</em>' attribute.
	 * @see #getMicroserviceName()
	 * @generated
	 */
	void setMicroserviceName(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(Container)
	 * @see PIM.PIMPackage#getMicroservice_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link PIM.Microservice#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link PIM.InfrastructurePatternComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see PIM.PIMPackage#getMicroservice_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructurePatternComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(ServiceInterface)
	 * @see PIM.PIMPackage#getMicroservice_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceInterface getInterface();

	/**
	 * Sets the value of the '{@link PIM.Microservice#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link PIM.ServiceDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see PIM.PIMPackage#getMicroservice_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceDependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Generating PSM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating PSM</em>' attribute list.
	 * @see PIM.PIMPackage#getMicroservice_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // Microservice
