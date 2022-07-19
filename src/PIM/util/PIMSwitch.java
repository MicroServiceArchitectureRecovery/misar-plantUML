/**
 */
package PIM.util;

import PIM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PIM.PIMPackage
 * @generated
 */
public class PIMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PIMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMSwitch() {
		if (modelPackage == null) {
			modelPackage = PIMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PIMPackage.ROOT_PIM: {
				RootPIM rootPIM = (RootPIM)theEObject;
				T result = caseRootPIM(rootPIM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.MICROSERVICE_ARCHITECTURE: {
				MicroserviceArchitecture microserviceArchitecture = (MicroserviceArchitecture)theEObject;
				T result = caseMicroserviceArchitecture(microserviceArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.MICROSERVICE: {
				Microservice microservice = (Microservice)theEObject;
				T result = caseMicroservice(microservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.AMBIENT: {
				Ambient ambient = (Ambient)theEObject;
				T result = caseAmbient(ambient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseAmbient(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.FUNCTIONAL_MICROSERVICE: {
				FunctionalMicroservice functionalMicroservice = (FunctionalMicroservice)theEObject;
				T result = caseFunctionalMicroservice(functionalMicroservice);
				if (result == null) result = caseMicroservice(functionalMicroservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.INFRASTRUCTURE_MICROSERVICE: {
				InfrastructureMicroservice infrastructureMicroservice = (InfrastructureMicroservice)theEObject;
				T result = caseInfrastructureMicroservice(infrastructureMicroservice);
				if (result == null) result = caseMicroservice(infrastructureMicroservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT: {
				InfrastructurePatternComponent infrastructurePatternComponent = (InfrastructurePatternComponent)theEObject;
				T result = caseInfrastructurePatternComponent(infrastructurePatternComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.INFRASTRUCTURE_SERVER_COMPONENT: {
				InfrastructureServerComponent infrastructureServerComponent = (InfrastructureServerComponent)theEObject;
				T result = caseInfrastructureServerComponent(infrastructureServerComponent);
				if (result == null) result = caseInfrastructurePatternComponent(infrastructureServerComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.INFRASTRUCTURE_CLIENT_COMPONENT: {
				InfrastructureClientComponent infrastructureClientComponent = (InfrastructureClientComponent)theEObject;
				T result = caseInfrastructureClientComponent(infrastructureClientComponent);
				if (result == null) result = caseInfrastructurePatternComponent(infrastructureClientComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.SERVICE_INTERFACE: {
				ServiceInterface serviceInterface = (ServiceInterface)theEObject;
				T result = caseServiceInterface(serviceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.MESSAGE_DESTINATION: {
				MessageDestination messageDestination = (MessageDestination)theEObject;
				T result = caseMessageDestination(messageDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = caseMessageDestination(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.QUEUE_LISTENER: {
				QueueListener queueListener = (QueueListener)theEObject;
				T result = caseQueueListener(queueListener);
				if (result == null) result = caseMessageDestination(queueListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.SERVICE_OPERATION: {
				ServiceOperation serviceOperation = (ServiceOperation)theEObject;
				T result = caseServiceOperation(serviceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.SERVICE_MESSAGE: {
				ServiceMessage serviceMessage = (ServiceMessage)theEObject;
				T result = caseServiceMessage(serviceMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PIMPackage.SERVICE_DEPENDENCY: {
				ServiceDependency serviceDependency = (ServiceDependency)theEObject;
				T result = caseServiceDependency(serviceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root PIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root PIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootPIM(RootPIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceArchitecture(MicroserviceArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbient(Ambient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalMicroservice(FunctionalMicroservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureMicroservice(InfrastructureMicroservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Pattern Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Pattern Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructurePatternComponent(InfrastructurePatternComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Server Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Server Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureServerComponent(InfrastructureServerComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Client Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Client Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureClientComponent(InfrastructureClientComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterface(ServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestination(MessageDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueListener(QueueListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOperation(ServiceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMessage(ServiceMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDependency(ServiceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PIMSwitch
