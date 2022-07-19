/**
 */
package PIM.util;

import PIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PIM.PIMPackage
 * @generated
 */
public class PIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PIMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIMSwitch<Adapter> modelSwitch =
		new PIMSwitch<Adapter>() {
			@Override
			public Adapter caseRootPIM(RootPIM object) {
				return createRootPIMAdapter();
			}
			@Override
			public Adapter caseMicroserviceArchitecture(MicroserviceArchitecture object) {
				return createMicroserviceArchitectureAdapter();
			}
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseAmbient(Ambient object) {
				return createAmbientAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseFunctionalMicroservice(FunctionalMicroservice object) {
				return createFunctionalMicroserviceAdapter();
			}
			@Override
			public Adapter caseInfrastructureMicroservice(InfrastructureMicroservice object) {
				return createInfrastructureMicroserviceAdapter();
			}
			@Override
			public Adapter caseInfrastructurePatternComponent(InfrastructurePatternComponent object) {
				return createInfrastructurePatternComponentAdapter();
			}
			@Override
			public Adapter caseInfrastructureServerComponent(InfrastructureServerComponent object) {
				return createInfrastructureServerComponentAdapter();
			}
			@Override
			public Adapter caseInfrastructureClientComponent(InfrastructureClientComponent object) {
				return createInfrastructureClientComponentAdapter();
			}
			@Override
			public Adapter caseServiceInterface(ServiceInterface object) {
				return createServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseMessageDestination(MessageDestination object) {
				return createMessageDestinationAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseQueueListener(QueueListener object) {
				return createQueueListenerAdapter();
			}
			@Override
			public Adapter caseServiceOperation(ServiceOperation object) {
				return createServiceOperationAdapter();
			}
			@Override
			public Adapter caseServiceMessage(ServiceMessage object) {
				return createServiceMessageAdapter();
			}
			@Override
			public Adapter caseServiceDependency(ServiceDependency object) {
				return createServiceDependencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PIM.RootPIM <em>Root PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.RootPIM
	 * @generated
	 */
	public Adapter createRootPIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.MicroserviceArchitecture <em>Microservice Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.MicroserviceArchitecture
	 * @generated
	 */
	public Adapter createMicroserviceArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.Ambient <em>Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.Ambient
	 * @generated
	 */
	public Adapter createAmbientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.FunctionalMicroservice <em>Functional Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.FunctionalMicroservice
	 * @generated
	 */
	public Adapter createFunctionalMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.InfrastructureMicroservice <em>Infrastructure Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.InfrastructureMicroservice
	 * @generated
	 */
	public Adapter createInfrastructureMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.InfrastructurePatternComponent <em>Infrastructure Pattern Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.InfrastructurePatternComponent
	 * @generated
	 */
	public Adapter createInfrastructurePatternComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.InfrastructureServerComponent <em>Infrastructure Server Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.InfrastructureServerComponent
	 * @generated
	 */
	public Adapter createInfrastructureServerComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.InfrastructureClientComponent <em>Infrastructure Client Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.InfrastructureClientComponent
	 * @generated
	 */
	public Adapter createInfrastructureClientComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.ServiceInterface
	 * @generated
	 */
	public Adapter createServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.MessageDestination <em>Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.MessageDestination
	 * @generated
	 */
	public Adapter createMessageDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.QueueListener <em>Queue Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.QueueListener
	 * @generated
	 */
	public Adapter createQueueListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.ServiceOperation
	 * @generated
	 */
	public Adapter createServiceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.ServiceMessage <em>Service Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.ServiceMessage
	 * @generated
	 */
	public Adapter createServiceMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PIM.ServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PIM.ServiceDependency
	 * @generated
	 */
	public Adapter createServiceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PIMAdapterFactory
