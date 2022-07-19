/**
 */
package PIM.impl;

import PIM.Ambient;
import PIM.Endpoint;
import PIM.FunctionalMicroservice;
import PIM.InfrastructureClientComponent;
import PIM.InfrastructureMicroservice;
import PIM.InfrastructurePatternCategory;
import PIM.InfrastructurePatternComponent;
import PIM.InfrastructureServerComponent;
import PIM.MessageDestination;
import PIM.Microservice;
import PIM.MicroserviceArchitecture;
import PIM.PIMFactory;
import PIM.PIMPackage;
import PIM.QueueListener;
import PIM.RootPIM;
import PIM.ServiceDependency;
import PIM.ServiceInterface;
import PIM.ServiceMessage;
import PIM.ServiceOperation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PIMPackageImpl extends EPackageImpl implements PIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootPIMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalMicroserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureMicroserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructurePatternComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureServerComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureClientComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum infrastructurePatternCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PIM.PIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PIMPackageImpl() {
		super(eNS_URI, PIMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PIMPackage init() {
		if (isInited) return (PIMPackage)EPackage.Registry.INSTANCE.getEPackage(PIMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPIMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PIMPackageImpl thePIMPackage = registeredPIMPackage instanceof PIMPackageImpl ? (PIMPackageImpl)registeredPIMPackage : new PIMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePIMPackage.createPackageContents();

		// Initialize created meta-data
		thePIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePIMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PIMPackage.eNS_URI, thePIMPackage);
		return thePIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootPIM() {
		return rootPIMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootPIM_Architecture() {
		return (EReference)rootPIMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceArchitecture() {
		return microserviceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroserviceArchitecture_ArchitectureName() {
		return (EAttribute)microserviceArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceArchitecture_Microservices() {
		return (EReference)microserviceArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroserviceArchitecture_GeneratingPSM() {
		return (EAttribute)microserviceArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_MicroserviceName() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Container() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Components() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Interface() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Dependencies() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_GeneratingPSM() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbient() {
		return ambientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_ContainerName() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_GeneratingPSM() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalMicroservice() {
		return functionalMicroserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureMicroservice() {
		return infrastructureMicroserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructurePatternComponent() {
		return infrastructurePatternComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructurePatternComponent_Category() {
		return (EAttribute)infrastructurePatternComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructurePatternComponent_Technology() {
		return (EAttribute)infrastructurePatternComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructurePatternComponent_Environment() {
		return (EAttribute)infrastructurePatternComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructurePatternComponent_GeneratingPSM() {
		return (EAttribute)infrastructurePatternComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureServerComponent() {
		return infrastructureServerComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureClientComponent() {
		return infrastructureClientComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterface_ServerURL() {
		return (EAttribute)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_Destinations() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterface_GeneratingPSM() {
		return (EAttribute)serviceInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestination() {
		return messageDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestination_Operation() {
		return (EReference)messageDestinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestination_Messages() {
		return (EReference)messageDestinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestination_Environment() {
		return (EAttribute)messageDestinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestination_GeneratingPSM() {
		return (EAttribute)messageDestinationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_RequestURI() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueListener() {
		return queueListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueListener_QueueName() {
		return (EAttribute)queueListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOperation() {
		return serviceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOperation_OperationName() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOperation_OperationDescription() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOperation_GeneratingPSM() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMessage() {
		return serviceMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMessage_MessageType() {
		return (EAttribute)serviceMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMessage_BodySchema() {
		return (EAttribute)serviceMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMessage_SchemaFormat() {
		return (EAttribute)serviceMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMessage_GeneratingPSM() {
		return (EAttribute)serviceMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDependency() {
		return serviceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_ConsumerOperation() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_IsWrappedByCircuitBreaker() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_ProviderName() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_ProviderDestination() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_Environment() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_GeneratingPSM() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInfrastructurePatternCategory() {
		return infrastructurePatternCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMFactory getPIMFactory() {
		return (PIMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootPIMEClass = createEClass(ROOT_PIM);
		createEReference(rootPIMEClass, ROOT_PIM__ARCHITECTURE);

		microserviceArchitectureEClass = createEClass(MICROSERVICE_ARCHITECTURE);
		createEAttribute(microserviceArchitectureEClass, MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME);
		createEReference(microserviceArchitectureEClass, MICROSERVICE_ARCHITECTURE__MICROSERVICES);
		createEAttribute(microserviceArchitectureEClass, MICROSERVICE_ARCHITECTURE__GENERATING_PSM);

		microserviceEClass = createEClass(MICROSERVICE);
		createEAttribute(microserviceEClass, MICROSERVICE__MICROSERVICE_NAME);
		createEReference(microserviceEClass, MICROSERVICE__CONTAINER);
		createEReference(microserviceEClass, MICROSERVICE__COMPONENTS);
		createEReference(microserviceEClass, MICROSERVICE__INTERFACE);
		createEReference(microserviceEClass, MICROSERVICE__DEPENDENCIES);
		createEAttribute(microserviceEClass, MICROSERVICE__GENERATING_PSM);

		ambientEClass = createEClass(AMBIENT);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__CONTAINER_NAME);
		createEAttribute(containerEClass, CONTAINER__GENERATING_PSM);

		functionalMicroserviceEClass = createEClass(FUNCTIONAL_MICROSERVICE);

		infrastructureMicroserviceEClass = createEClass(INFRASTRUCTURE_MICROSERVICE);

		infrastructurePatternComponentEClass = createEClass(INFRASTRUCTURE_PATTERN_COMPONENT);
		createEAttribute(infrastructurePatternComponentEClass, INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY);
		createEAttribute(infrastructurePatternComponentEClass, INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY);
		createEAttribute(infrastructurePatternComponentEClass, INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT);
		createEAttribute(infrastructurePatternComponentEClass, INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM);

		infrastructureServerComponentEClass = createEClass(INFRASTRUCTURE_SERVER_COMPONENT);

		infrastructureClientComponentEClass = createEClass(INFRASTRUCTURE_CLIENT_COMPONENT);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__SERVER_URL);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__DESTINATIONS);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__GENERATING_PSM);

		messageDestinationEClass = createEClass(MESSAGE_DESTINATION);
		createEReference(messageDestinationEClass, MESSAGE_DESTINATION__OPERATION);
		createEReference(messageDestinationEClass, MESSAGE_DESTINATION__MESSAGES);
		createEAttribute(messageDestinationEClass, MESSAGE_DESTINATION__ENVIRONMENT);
		createEAttribute(messageDestinationEClass, MESSAGE_DESTINATION__GENERATING_PSM);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__REQUEST_URI);

		queueListenerEClass = createEClass(QUEUE_LISTENER);
		createEAttribute(queueListenerEClass, QUEUE_LISTENER__QUEUE_NAME);

		serviceOperationEClass = createEClass(SERVICE_OPERATION);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__OPERATION_NAME);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__OPERATION_DESCRIPTION);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__GENERATING_PSM);

		serviceMessageEClass = createEClass(SERVICE_MESSAGE);
		createEAttribute(serviceMessageEClass, SERVICE_MESSAGE__MESSAGE_TYPE);
		createEAttribute(serviceMessageEClass, SERVICE_MESSAGE__BODY_SCHEMA);
		createEAttribute(serviceMessageEClass, SERVICE_MESSAGE__SCHEMA_FORMAT);
		createEAttribute(serviceMessageEClass, SERVICE_MESSAGE__GENERATING_PSM);

		serviceDependencyEClass = createEClass(SERVICE_DEPENDENCY);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__CONSUMER_OPERATION);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__PROVIDER_NAME);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__PROVIDER_DESTINATION);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__ENVIRONMENT);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__GENERATING_PSM);

		// Create enums
		infrastructurePatternCategoryEEnum = createEEnum(INFRASTRUCTURE_PATTERN_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getAmbient());
		functionalMicroserviceEClass.getESuperTypes().add(this.getMicroservice());
		infrastructureMicroserviceEClass.getESuperTypes().add(this.getMicroservice());
		infrastructureServerComponentEClass.getESuperTypes().add(this.getInfrastructurePatternComponent());
		infrastructureClientComponentEClass.getESuperTypes().add(this.getInfrastructurePatternComponent());
		endpointEClass.getESuperTypes().add(this.getMessageDestination());
		queueListenerEClass.getESuperTypes().add(this.getMessageDestination());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootPIMEClass, RootPIM.class, "RootPIM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootPIM_Architecture(), this.getMicroserviceArchitecture(), null, "architecture", null, 1, 1, RootPIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceArchitectureEClass, MicroserviceArchitecture.class, "MicroserviceArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroserviceArchitecture_ArchitectureName(), ecorePackage.getEString(), "ArchitectureName", null, 0, 1, MicroserviceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceArchitecture_Microservices(), this.getMicroservice(), null, "microservices", null, 1, -1, MicroserviceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroserviceArchitecture_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, MicroserviceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroservice_MicroserviceName(), ecorePackage.getEString(), "MicroserviceName", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Container(), this.getContainer(), null, "container", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Components(), this.getInfrastructurePatternComponent(), null, "components", null, 0, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Interface(), this.getServiceInterface(), null, "interface", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Dependencies(), this.getServiceDependency(), null, "dependencies", null, 0, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambientEClass, Ambient.class, "Ambient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, PIM.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_ContainerName(), ecorePackage.getEString(), "ContainerName", null, 0, 1, PIM.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, PIM.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalMicroserviceEClass, FunctionalMicroservice.class, "FunctionalMicroservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructureMicroserviceEClass, InfrastructureMicroservice.class, "InfrastructureMicroservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructurePatternComponentEClass, InfrastructurePatternComponent.class, "InfrastructurePatternComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructurePatternComponent_Category(), this.getInfrastructurePatternCategory(), "Category", null, 0, 1, InfrastructurePatternComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructurePatternComponent_Technology(), ecorePackage.getEString(), "Technology", null, 0, 1, InfrastructurePatternComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructurePatternComponent_Environment(), ecorePackage.getEString(), "Environment", null, 0, 1, InfrastructurePatternComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructurePatternComponent_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, InfrastructurePatternComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureServerComponentEClass, InfrastructureServerComponent.class, "InfrastructureServerComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructureClientComponentEClass, InfrastructureClientComponent.class, "InfrastructureClientComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterface_ServerURL(), ecorePackage.getEString(), "ServerURL", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterface_Destinations(), this.getMessageDestination(), null, "destinations", null, 1, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterface_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDestinationEClass, MessageDestination.class, "MessageDestination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageDestination_Operation(), this.getServiceOperation(), null, "operation", null, 0, 1, MessageDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDestination_Messages(), this.getServiceMessage(), null, "messages", null, 1, -1, MessageDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDestination_Environment(), ecorePackage.getEString(), "Environment", null, 0, 1, MessageDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDestination_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, MessageDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoint_RequestURI(), ecorePackage.getEString(), "RequestURI", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueListenerEClass, QueueListener.class, "QueueListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueListener_QueueName(), ecorePackage.getEString(), "QueueName", null, 0, 1, QueueListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOperationEClass, ServiceOperation.class, "ServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceOperation_OperationName(), ecorePackage.getEString(), "OperationName", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_OperationDescription(), ecorePackage.getEString(), "OperationDescription", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMessageEClass, ServiceMessage.class, "ServiceMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMessage_MessageType(), ecorePackage.getEString(), "MessageType", null, 0, 1, ServiceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMessage_BodySchema(), ecorePackage.getEString(), "BodySchema", null, 0, 1, ServiceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMessage_SchemaFormat(), ecorePackage.getEString(), "SchemaFormat", null, 0, 1, ServiceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMessage_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, ServiceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDependencyEClass, ServiceDependency.class, "ServiceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDependency_ConsumerOperation(), ecorePackage.getEString(), "ConsumerOperation", null, 0, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_IsWrappedByCircuitBreaker(), ecorePackage.getEBoolean(), "isWrappedByCircuitBreaker", null, 0, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_ProviderName(), ecorePackage.getEString(), "ProviderName", null, 0, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_ProviderDestination(), ecorePackage.getEString(), "ProviderDestination", null, 0, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_Environment(), ecorePackage.getEString(), "Environment", null, 0, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_GeneratingPSM(), ecorePackage.getEString(), "GeneratingPSM", null, 1, -1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.class, "InfrastructurePatternCategory");
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.DEVELOPMENT_PATTERN_DATA_PERSISTENCE);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.DEVELOPMENT_PATTERN_DATA_CACHE);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.SECURITY_PATTERN_WEB_SECURITY);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_LOG_CORRELATION);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING);
		addEEnumLiteral(infrastructurePatternCategoryEEnum, InfrastructurePatternCategory.OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING);

		// Create resource
		createResource(eNS_URI);
	}

} //PIMPackageImpl
