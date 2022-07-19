/**
 */
package PIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PIM.PIMPackage
 * @generated
 */
public interface PIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PIMFactory eINSTANCE = PIM.impl.PIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root PIM</em>'.
	 * @generated
	 */
	RootPIM createRootPIM();

	/**
	 * Returns a new object of class '<em>Microservice Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice Architecture</em>'.
	 * @generated
	 */
	MicroserviceArchitecture createMicroserviceArchitecture();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>Ambient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ambient</em>'.
	 * @generated
	 */
	Ambient createAmbient();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Functional Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Microservice</em>'.
	 * @generated
	 */
	FunctionalMicroservice createFunctionalMicroservice();

	/**
	 * Returns a new object of class '<em>Infrastructure Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Microservice</em>'.
	 * @generated
	 */
	InfrastructureMicroservice createInfrastructureMicroservice();

	/**
	 * Returns a new object of class '<em>Infrastructure Pattern Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Pattern Component</em>'.
	 * @generated
	 */
	InfrastructurePatternComponent createInfrastructurePatternComponent();

	/**
	 * Returns a new object of class '<em>Infrastructure Server Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Server Component</em>'.
	 * @generated
	 */
	InfrastructureServerComponent createInfrastructureServerComponent();

	/**
	 * Returns a new object of class '<em>Infrastructure Client Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Client Component</em>'.
	 * @generated
	 */
	InfrastructureClientComponent createInfrastructureClientComponent();

	/**
	 * Returns a new object of class '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface</em>'.
	 * @generated
	 */
	ServiceInterface createServiceInterface();

	/**
	 * Returns a new object of class '<em>Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Destination</em>'.
	 * @generated
	 */
	MessageDestination createMessageDestination();

	/**
	 * Returns a new object of class '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint</em>'.
	 * @generated
	 */
	Endpoint createEndpoint();

	/**
	 * Returns a new object of class '<em>Queue Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Listener</em>'.
	 * @generated
	 */
	QueueListener createQueueListener();

	/**
	 * Returns a new object of class '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Operation</em>'.
	 * @generated
	 */
	ServiceOperation createServiceOperation();

	/**
	 * Returns a new object of class '<em>Service Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Message</em>'.
	 * @generated
	 */
	ServiceMessage createServiceMessage();

	/**
	 * Returns a new object of class '<em>Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Dependency</em>'.
	 * @generated
	 */
	ServiceDependency createServiceDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PIMPackage getPIMPackage();

} //PIMFactory
