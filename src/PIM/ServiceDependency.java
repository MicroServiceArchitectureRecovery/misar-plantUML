/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.ServiceDependency#getConsumerOperation <em>Consumer Operation</em>}</li>
 *   <li>{@link PIM.ServiceDependency#isIsWrappedByCircuitBreaker <em>Is Wrapped By Circuit Breaker</em>}</li>
 *   <li>{@link PIM.ServiceDependency#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link PIM.ServiceDependency#getProviderDestination <em>Provider Destination</em>}</li>
 *   <li>{@link PIM.ServiceDependency#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.ServiceDependency#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getServiceDependency()
 * @model
 * @generated
 */
public interface ServiceDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumer Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Operation</em>' attribute.
	 * @see #setConsumerOperation(String)
	 * @see PIM.PIMPackage#getServiceDependency_ConsumerOperation()
	 * @model
	 * @generated
	 */
	String getConsumerOperation();

	/**
	 * Sets the value of the '{@link PIM.ServiceDependency#getConsumerOperation <em>Consumer Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Operation</em>' attribute.
	 * @see #getConsumerOperation()
	 * @generated
	 */
	void setConsumerOperation(String value);

	/**
	 * Returns the value of the '<em><b>Is Wrapped By Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Wrapped By Circuit Breaker</em>' attribute.
	 * @see #setIsWrappedByCircuitBreaker(boolean)
	 * @see PIM.PIMPackage#getServiceDependency_IsWrappedByCircuitBreaker()
	 * @model
	 * @generated
	 */
	boolean isIsWrappedByCircuitBreaker();

	/**
	 * Sets the value of the '{@link PIM.ServiceDependency#isIsWrappedByCircuitBreaker <em>Is Wrapped By Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Wrapped By Circuit Breaker</em>' attribute.
	 * @see #isIsWrappedByCircuitBreaker()
	 * @generated
	 */
	void setIsWrappedByCircuitBreaker(boolean value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see PIM.PIMPackage#getServiceDependency_ProviderName()
	 * @model
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link PIM.ServiceDependency#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Destination</em>' attribute.
	 * @see #setProviderDestination(String)
	 * @see PIM.PIMPackage#getServiceDependency_ProviderDestination()
	 * @model
	 * @generated
	 */
	String getProviderDestination();

	/**
	 * Sets the value of the '{@link PIM.ServiceDependency#getProviderDestination <em>Provider Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Destination</em>' attribute.
	 * @see #getProviderDestination()
	 * @generated
	 */
	void setProviderDestination(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see PIM.PIMPackage#getServiceDependency_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link PIM.ServiceDependency#getEnvironment <em>Environment</em>}' attribute.
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
	 * @see PIM.PIMPackage#getServiceDependency_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // ServiceDependency
