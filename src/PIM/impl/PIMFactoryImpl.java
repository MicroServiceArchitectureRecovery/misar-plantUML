/**
 */
package PIM.impl;

import PIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PIMFactoryImpl extends EFactoryImpl implements PIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PIMFactory init() {
		try {
			PIMFactory thePIMFactory = (PIMFactory)EPackage.Registry.INSTANCE.getEFactory(PIMPackage.eNS_URI);
			if (thePIMFactory != null) {
				return thePIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PIMPackage.ROOT_PIM: return createRootPIM();
			case PIMPackage.MICROSERVICE_ARCHITECTURE: return createMicroserviceArchitecture();
			case PIMPackage.MICROSERVICE: return createMicroservice();
			case PIMPackage.AMBIENT: return createAmbient();
			case PIMPackage.CONTAINER: return createContainer();
			case PIMPackage.FUNCTIONAL_MICROSERVICE: return createFunctionalMicroservice();
			case PIMPackage.INFRASTRUCTURE_MICROSERVICE: return createInfrastructureMicroservice();
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT: return createInfrastructurePatternComponent();
			case PIMPackage.INFRASTRUCTURE_SERVER_COMPONENT: return createInfrastructureServerComponent();
			case PIMPackage.INFRASTRUCTURE_CLIENT_COMPONENT: return createInfrastructureClientComponent();
			case PIMPackage.SERVICE_INTERFACE: return createServiceInterface();
			case PIMPackage.MESSAGE_DESTINATION: return createMessageDestination();
			case PIMPackage.ENDPOINT: return createEndpoint();
			case PIMPackage.QUEUE_LISTENER: return createQueueListener();
			case PIMPackage.SERVICE_OPERATION: return createServiceOperation();
			case PIMPackage.SERVICE_MESSAGE: return createServiceMessage();
			case PIMPackage.SERVICE_DEPENDENCY: return createServiceDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_CATEGORY:
				return createInfrastructurePatternCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_CATEGORY:
				return convertInfrastructurePatternCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootPIM createRootPIM() {
		RootPIMImpl rootPIM = new RootPIMImpl();
		return rootPIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceArchitecture createMicroserviceArchitecture() {
		MicroserviceArchitectureImpl microserviceArchitecture = new MicroserviceArchitectureImpl();
		return microserviceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ambient createAmbient() {
		AmbientImpl ambient = new AmbientImpl();
		return ambient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIM.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalMicroservice createFunctionalMicroservice() {
		FunctionalMicroserviceImpl functionalMicroservice = new FunctionalMicroserviceImpl();
		return functionalMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureMicroservice createInfrastructureMicroservice() {
		InfrastructureMicroserviceImpl infrastructureMicroservice = new InfrastructureMicroserviceImpl();
		return infrastructureMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePatternComponent createInfrastructurePatternComponent() {
		InfrastructurePatternComponentImpl infrastructurePatternComponent = new InfrastructurePatternComponentImpl();
		return infrastructurePatternComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureServerComponent createInfrastructureServerComponent() {
		InfrastructureServerComponentImpl infrastructureServerComponent = new InfrastructureServerComponentImpl();
		return infrastructureServerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureClientComponent createInfrastructureClientComponent() {
		InfrastructureClientComponentImpl infrastructureClientComponent = new InfrastructureClientComponentImpl();
		return infrastructureClientComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestination createMessageDestination() {
		MessageDestinationImpl messageDestination = new MessageDestinationImpl();
		return messageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueListener createQueueListener() {
		QueueListenerImpl queueListener = new QueueListenerImpl();
		return queueListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation createServiceOperation() {
		ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMessage createServiceMessage() {
		ServiceMessageImpl serviceMessage = new ServiceMessageImpl();
		return serviceMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDependency createServiceDependency() {
		ServiceDependencyImpl serviceDependency = new ServiceDependencyImpl();
		return serviceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePatternCategory createInfrastructurePatternCategoryFromString(EDataType eDataType, String initialValue) {
		InfrastructurePatternCategory result = InfrastructurePatternCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfrastructurePatternCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMPackage getPIMPackage() {
		return (PIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PIMPackage getPackage() {
		return PIMPackage.eINSTANCE;
	}

} //PIMFactoryImpl
