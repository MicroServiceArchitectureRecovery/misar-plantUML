/**
 */
package PIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PIM.PIMFactory
 * @model kind="package"
 * @generated
 */
public interface PIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://localhost/mdd/PIM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PIM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PIMPackage eINSTANCE = PIM.impl.PIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link PIM.impl.RootPIMImpl <em>Root PIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.RootPIMImpl
	 * @see PIM.impl.PIMPackageImpl#getRootPIM()
	 * @generated
	 */
	int ROOT_PIM = 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PIM__ARCHITECTURE = 0;

	/**
	 * The number of structural features of the '<em>Root PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PIM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.MicroserviceArchitectureImpl <em>Microservice Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.MicroserviceArchitectureImpl
	 * @see PIM.impl.PIMPackageImpl#getMicroserviceArchitecture()
	 * @generated
	 */
	int MICROSERVICE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Architecture Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__MICROSERVICES = 1;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__GENERATING_PSM = 2;

	/**
	 * The number of structural features of the '<em>Microservice Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Microservice Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.MicroserviceImpl
	 * @see PIM.impl.PIMPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__MICROSERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__GENERATING_PSM = 5;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.AmbientImpl <em>Ambient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.AmbientImpl
	 * @see PIM.impl.PIMPackageImpl#getAmbient()
	 * @generated
	 */
	int AMBIENT = 3;

	/**
	 * The number of structural features of the '<em>Ambient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ambient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.ContainerImpl
	 * @see PIM.impl.PIMPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_NAME = AMBIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATING_PSM = AMBIENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = AMBIENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = AMBIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.FunctionalMicroserviceImpl <em>Functional Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.FunctionalMicroserviceImpl
	 * @see PIM.impl.PIMPackageImpl#getFunctionalMicroservice()
	 * @generated
	 */
	int FUNCTIONAL_MICROSERVICE = 5;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__MICROSERVICE_NAME = MICROSERVICE__MICROSERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__CONTAINER = MICROSERVICE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__COMPONENTS = MICROSERVICE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__INTERFACE = MICROSERVICE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__DEPENDENCIES = MICROSERVICE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE__GENERATING_PSM = MICROSERVICE__GENERATING_PSM;

	/**
	 * The number of structural features of the '<em>Functional Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MICROSERVICE_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.InfrastructureMicroserviceImpl <em>Infrastructure Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.InfrastructureMicroserviceImpl
	 * @see PIM.impl.PIMPackageImpl#getInfrastructureMicroservice()
	 * @generated
	 */
	int INFRASTRUCTURE_MICROSERVICE = 6;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__MICROSERVICE_NAME = MICROSERVICE__MICROSERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__CONTAINER = MICROSERVICE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__COMPONENTS = MICROSERVICE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__INTERFACE = MICROSERVICE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__DEPENDENCIES = MICROSERVICE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE__GENERATING_PSM = MICROSERVICE__GENERATING_PSM;

	/**
	 * The number of structural features of the '<em>Infrastructure Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MICROSERVICE_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.InfrastructurePatternComponentImpl <em>Infrastructure Pattern Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.InfrastructurePatternComponentImpl
	 * @see PIM.impl.PIMPackageImpl#getInfrastructurePatternComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM = 3;

	/**
	 * The number of structural features of the '<em>Infrastructure Pattern Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Infrastructure Pattern Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PATTERN_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.InfrastructureServerComponentImpl <em>Infrastructure Server Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.InfrastructureServerComponentImpl
	 * @see PIM.impl.PIMPackageImpl#getInfrastructureServerComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT__CATEGORY = INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT__TECHNOLOGY = INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT__ENVIRONMENT = INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT__GENERATING_PSM = INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM;

	/**
	 * The number of structural features of the '<em>Infrastructure Server Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT_FEATURE_COUNT = INFRASTRUCTURE_PATTERN_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Server Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVER_COMPONENT_OPERATION_COUNT = INFRASTRUCTURE_PATTERN_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.InfrastructureClientComponentImpl <em>Infrastructure Client Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.InfrastructureClientComponentImpl
	 * @see PIM.impl.PIMPackageImpl#getInfrastructureClientComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT__CATEGORY = INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT__TECHNOLOGY = INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT__ENVIRONMENT = INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT__GENERATING_PSM = INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM;

	/**
	 * The number of structural features of the '<em>Infrastructure Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT_FEATURE_COUNT = INFRASTRUCTURE_PATTERN_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CLIENT_COMPONENT_OPERATION_COUNT = INFRASTRUCTURE_PATTERN_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.ServiceInterfaceImpl
	 * @see PIM.impl.PIMPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__SERVER_URL = 0;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__DESTINATIONS = 1;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__GENERATING_PSM = 2;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.MessageDestinationImpl <em>Message Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.MessageDestinationImpl
	 * @see PIM.impl.PIMPackageImpl#getMessageDestination()
	 * @generated
	 */
	int MESSAGE_DESTINATION = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__GENERATING_PSM = 3;

	/**
	 * The number of structural features of the '<em>Message Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.EndpointImpl
	 * @see PIM.impl.PIMPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__OPERATION = MESSAGE_DESTINATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__MESSAGES = MESSAGE_DESTINATION__MESSAGES;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ENVIRONMENT = MESSAGE_DESTINATION__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__GENERATING_PSM = MESSAGE_DESTINATION__GENERATING_PSM;

	/**
	 * The feature id for the '<em><b>Request URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__REQUEST_URI = MESSAGE_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = MESSAGE_DESTINATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = MESSAGE_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.QueueListenerImpl <em>Queue Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.QueueListenerImpl
	 * @see PIM.impl.PIMPackageImpl#getQueueListener()
	 * @generated
	 */
	int QUEUE_LISTENER = 13;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER__OPERATION = MESSAGE_DESTINATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER__MESSAGES = MESSAGE_DESTINATION__MESSAGES;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER__ENVIRONMENT = MESSAGE_DESTINATION__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER__GENERATING_PSM = MESSAGE_DESTINATION__GENERATING_PSM;

	/**
	 * The feature id for the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER__QUEUE_NAME = MESSAGE_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Queue Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER_FEATURE_COUNT = MESSAGE_DESTINATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Queue Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_LISTENER_OPERATION_COUNT = MESSAGE_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PIM.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.ServiceOperationImpl
	 * @see PIM.impl.PIMPackageImpl#getServiceOperation()
	 * @generated
	 */
	int SERVICE_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__OPERATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__OPERATION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__GENERATING_PSM = 2;

	/**
	 * The number of structural features of the '<em>Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.ServiceMessageImpl <em>Service Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.ServiceMessageImpl
	 * @see PIM.impl.PIMPackageImpl#getServiceMessage()
	 * @generated
	 */
	int SERVICE_MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE__MESSAGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Body Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE__BODY_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Schema Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE__SCHEMA_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE__GENERATING_PSM = 3;

	/**
	 * The number of structural features of the '<em>Service Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.impl.ServiceDependencyImpl
	 * @see PIM.impl.PIMPackageImpl#getServiceDependency()
	 * @generated
	 */
	int SERVICE_DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>Consumer Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__CONSUMER_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Is Wrapped By Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER = 1;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__PROVIDER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Provider Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__PROVIDER_DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__ENVIRONMENT = 4;

	/**
	 * The feature id for the '<em><b>Generating PSM</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__GENERATING_PSM = 5;

	/**
	 * The number of structural features of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PIM.InfrastructurePatternCategory <em>Infrastructure Pattern Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PIM.InfrastructurePatternCategory
	 * @see PIM.impl.PIMPackageImpl#getInfrastructurePatternCategory()
	 * @generated
	 */
	int INFRASTRUCTURE_PATTERN_CATEGORY = 17;


	/**
	 * Returns the meta object for class '{@link PIM.RootPIM <em>Root PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root PIM</em>'.
	 * @see PIM.RootPIM
	 * @generated
	 */
	EClass getRootPIM();

	/**
	 * Returns the meta object for the containment reference '{@link PIM.RootPIM#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Architecture</em>'.
	 * @see PIM.RootPIM#getArchitecture()
	 * @see #getRootPIM()
	 * @generated
	 */
	EReference getRootPIM_Architecture();

	/**
	 * Returns the meta object for class '{@link PIM.MicroserviceArchitecture <em>Microservice Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Architecture</em>'.
	 * @see PIM.MicroserviceArchitecture
	 * @generated
	 */
	EClass getMicroserviceArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link PIM.MicroserviceArchitecture#getArchitectureName <em>Architecture Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture Name</em>'.
	 * @see PIM.MicroserviceArchitecture#getArchitectureName()
	 * @see #getMicroserviceArchitecture()
	 * @generated
	 */
	EAttribute getMicroserviceArchitecture_ArchitectureName();

	/**
	 * Returns the meta object for the containment reference list '{@link PIM.MicroserviceArchitecture#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see PIM.MicroserviceArchitecture#getMicroservices()
	 * @see #getMicroserviceArchitecture()
	 * @generated
	 */
	EReference getMicroserviceArchitecture_Microservices();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.MicroserviceArchitecture#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.MicroserviceArchitecture#getGeneratingPSM()
	 * @see #getMicroserviceArchitecture()
	 * @generated
	 */
	EAttribute getMicroserviceArchitecture_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see PIM.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link PIM.Microservice#getMicroserviceName <em>Microservice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Microservice Name</em>'.
	 * @see PIM.Microservice#getMicroserviceName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_MicroserviceName();

	/**
	 * Returns the meta object for the containment reference '{@link PIM.Microservice#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see PIM.Microservice#getContainer()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link PIM.Microservice#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see PIM.Microservice#getComponents()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Components();

	/**
	 * Returns the meta object for the containment reference '{@link PIM.Microservice#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see PIM.Microservice#getInterface()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link PIM.Microservice#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see PIM.Microservice#getDependencies()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Dependencies();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.Microservice#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.Microservice#getGeneratingPSM()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.Ambient <em>Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambient</em>'.
	 * @see PIM.Ambient
	 * @generated
	 */
	EClass getAmbient();

	/**
	 * Returns the meta object for class '{@link PIM.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see PIM.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link PIM.Container#getContainerName <em>Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Name</em>'.
	 * @see PIM.Container#getContainerName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ContainerName();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.Container#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.Container#getGeneratingPSM()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.FunctionalMicroservice <em>Functional Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Microservice</em>'.
	 * @see PIM.FunctionalMicroservice
	 * @generated
	 */
	EClass getFunctionalMicroservice();

	/**
	 * Returns the meta object for class '{@link PIM.InfrastructureMicroservice <em>Infrastructure Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Microservice</em>'.
	 * @see PIM.InfrastructureMicroservice
	 * @generated
	 */
	EClass getInfrastructureMicroservice();

	/**
	 * Returns the meta object for class '{@link PIM.InfrastructurePatternComponent <em>Infrastructure Pattern Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Pattern Component</em>'.
	 * @see PIM.InfrastructurePatternComponent
	 * @generated
	 */
	EClass getInfrastructurePatternComponent();

	/**
	 * Returns the meta object for the attribute '{@link PIM.InfrastructurePatternComponent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see PIM.InfrastructurePatternComponent#getCategory()
	 * @see #getInfrastructurePatternComponent()
	 * @generated
	 */
	EAttribute getInfrastructurePatternComponent_Category();

	/**
	 * Returns the meta object for the attribute '{@link PIM.InfrastructurePatternComponent#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see PIM.InfrastructurePatternComponent#getTechnology()
	 * @see #getInfrastructurePatternComponent()
	 * @generated
	 */
	EAttribute getInfrastructurePatternComponent_Technology();

	/**
	 * Returns the meta object for the attribute '{@link PIM.InfrastructurePatternComponent#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see PIM.InfrastructurePatternComponent#getEnvironment()
	 * @see #getInfrastructurePatternComponent()
	 * @generated
	 */
	EAttribute getInfrastructurePatternComponent_Environment();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.InfrastructurePatternComponent#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.InfrastructurePatternComponent#getGeneratingPSM()
	 * @see #getInfrastructurePatternComponent()
	 * @generated
	 */
	EAttribute getInfrastructurePatternComponent_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.InfrastructureServerComponent <em>Infrastructure Server Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Server Component</em>'.
	 * @see PIM.InfrastructureServerComponent
	 * @generated
	 */
	EClass getInfrastructureServerComponent();

	/**
	 * Returns the meta object for class '{@link PIM.InfrastructureClientComponent <em>Infrastructure Client Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Client Component</em>'.
	 * @see PIM.InfrastructureClientComponent
	 * @generated
	 */
	EClass getInfrastructureClientComponent();

	/**
	 * Returns the meta object for class '{@link PIM.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see PIM.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceInterface#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see PIM.ServiceInterface#getServerURL()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_ServerURL();

	/**
	 * Returns the meta object for the containment reference list '{@link PIM.ServiceInterface#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destinations</em>'.
	 * @see PIM.ServiceInterface#getDestinations()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Destinations();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.ServiceInterface#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.ServiceInterface#getGeneratingPSM()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.MessageDestination <em>Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination</em>'.
	 * @see PIM.MessageDestination
	 * @generated
	 */
	EClass getMessageDestination();

	/**
	 * Returns the meta object for the containment reference '{@link PIM.MessageDestination#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see PIM.MessageDestination#getOperation()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EReference getMessageDestination_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link PIM.MessageDestination#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see PIM.MessageDestination#getMessages()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EReference getMessageDestination_Messages();

	/**
	 * Returns the meta object for the attribute '{@link PIM.MessageDestination#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see PIM.MessageDestination#getEnvironment()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EAttribute getMessageDestination_Environment();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.MessageDestination#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.MessageDestination#getGeneratingPSM()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EAttribute getMessageDestination_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see PIM.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link PIM.Endpoint#getRequestURI <em>Request URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request URI</em>'.
	 * @see PIM.Endpoint#getRequestURI()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_RequestURI();

	/**
	 * Returns the meta object for class '{@link PIM.QueueListener <em>Queue Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Listener</em>'.
	 * @see PIM.QueueListener
	 * @generated
	 */
	EClass getQueueListener();

	/**
	 * Returns the meta object for the attribute '{@link PIM.QueueListener#getQueueName <em>Queue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Name</em>'.
	 * @see PIM.QueueListener#getQueueName()
	 * @see #getQueueListener()
	 * @generated
	 */
	EAttribute getQueueListener_QueueName();

	/**
	 * Returns the meta object for class '{@link PIM.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Operation</em>'.
	 * @see PIM.ServiceOperation
	 * @generated
	 */
	EClass getServiceOperation();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceOperation#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see PIM.ServiceOperation#getOperationName()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EAttribute getServiceOperation_OperationName();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceOperation#getOperationDescription <em>Operation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Description</em>'.
	 * @see PIM.ServiceOperation#getOperationDescription()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EAttribute getServiceOperation_OperationDescription();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.ServiceOperation#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.ServiceOperation#getGeneratingPSM()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EAttribute getServiceOperation_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.ServiceMessage <em>Service Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Message</em>'.
	 * @see PIM.ServiceMessage
	 * @generated
	 */
	EClass getServiceMessage();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceMessage#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see PIM.ServiceMessage#getMessageType()
	 * @see #getServiceMessage()
	 * @generated
	 */
	EAttribute getServiceMessage_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceMessage#getBodySchema <em>Body Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Schema</em>'.
	 * @see PIM.ServiceMessage#getBodySchema()
	 * @see #getServiceMessage()
	 * @generated
	 */
	EAttribute getServiceMessage_BodySchema();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceMessage#getSchemaFormat <em>Schema Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Format</em>'.
	 * @see PIM.ServiceMessage#getSchemaFormat()
	 * @see #getServiceMessage()
	 * @generated
	 */
	EAttribute getServiceMessage_SchemaFormat();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.ServiceMessage#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.ServiceMessage#getGeneratingPSM()
	 * @see #getServiceMessage()
	 * @generated
	 */
	EAttribute getServiceMessage_GeneratingPSM();

	/**
	 * Returns the meta object for class '{@link PIM.ServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Dependency</em>'.
	 * @see PIM.ServiceDependency
	 * @generated
	 */
	EClass getServiceDependency();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceDependency#getConsumerOperation <em>Consumer Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Operation</em>'.
	 * @see PIM.ServiceDependency#getConsumerOperation()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ConsumerOperation();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceDependency#isIsWrappedByCircuitBreaker <em>Is Wrapped By Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wrapped By Circuit Breaker</em>'.
	 * @see PIM.ServiceDependency#isIsWrappedByCircuitBreaker()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_IsWrappedByCircuitBreaker();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceDependency#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see PIM.ServiceDependency#getProviderName()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceDependency#getProviderDestination <em>Provider Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Destination</em>'.
	 * @see PIM.ServiceDependency#getProviderDestination()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ProviderDestination();

	/**
	 * Returns the meta object for the attribute '{@link PIM.ServiceDependency#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see PIM.ServiceDependency#getEnvironment()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_Environment();

	/**
	 * Returns the meta object for the attribute list '{@link PIM.ServiceDependency#getGeneratingPSM <em>Generating PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generating PSM</em>'.
	 * @see PIM.ServiceDependency#getGeneratingPSM()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_GeneratingPSM();

	/**
	 * Returns the meta object for enum '{@link PIM.InfrastructurePatternCategory <em>Infrastructure Pattern Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Infrastructure Pattern Category</em>'.
	 * @see PIM.InfrastructurePatternCategory
	 * @generated
	 */
	EEnum getInfrastructurePatternCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PIMFactory getPIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PIM.impl.RootPIMImpl <em>Root PIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.RootPIMImpl
		 * @see PIM.impl.PIMPackageImpl#getRootPIM()
		 * @generated
		 */
		EClass ROOT_PIM = eINSTANCE.getRootPIM();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_PIM__ARCHITECTURE = eINSTANCE.getRootPIM_Architecture();

		/**
		 * The meta object literal for the '{@link PIM.impl.MicroserviceArchitectureImpl <em>Microservice Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.MicroserviceArchitectureImpl
		 * @see PIM.impl.PIMPackageImpl#getMicroserviceArchitecture()
		 * @generated
		 */
		EClass MICROSERVICE_ARCHITECTURE = eINSTANCE.getMicroserviceArchitecture();

		/**
		 * The meta object literal for the '<em><b>Architecture Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE_ARCHITECTURE__ARCHITECTURE_NAME = eINSTANCE.getMicroserviceArchitecture_ArchitectureName();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_ARCHITECTURE__MICROSERVICES = eINSTANCE.getMicroserviceArchitecture_Microservices();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE_ARCHITECTURE__GENERATING_PSM = eINSTANCE.getMicroserviceArchitecture_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.MicroserviceImpl
		 * @see PIM.impl.PIMPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Microservice Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__MICROSERVICE_NAME = eINSTANCE.getMicroservice_MicroserviceName();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CONTAINER = eINSTANCE.getMicroservice_Container();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__COMPONENTS = eINSTANCE.getMicroservice_Components();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__INTERFACE = eINSTANCE.getMicroservice_Interface();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DEPENDENCIES = eINSTANCE.getMicroservice_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__GENERATING_PSM = eINSTANCE.getMicroservice_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.AmbientImpl <em>Ambient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.AmbientImpl
		 * @see PIM.impl.PIMPackageImpl#getAmbient()
		 * @generated
		 */
		EClass AMBIENT = eINSTANCE.getAmbient();

		/**
		 * The meta object literal for the '{@link PIM.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.ContainerImpl
		 * @see PIM.impl.PIMPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTAINER_NAME = eINSTANCE.getContainer_ContainerName();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__GENERATING_PSM = eINSTANCE.getContainer_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.FunctionalMicroserviceImpl <em>Functional Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.FunctionalMicroserviceImpl
		 * @see PIM.impl.PIMPackageImpl#getFunctionalMicroservice()
		 * @generated
		 */
		EClass FUNCTIONAL_MICROSERVICE = eINSTANCE.getFunctionalMicroservice();

		/**
		 * The meta object literal for the '{@link PIM.impl.InfrastructureMicroserviceImpl <em>Infrastructure Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.InfrastructureMicroserviceImpl
		 * @see PIM.impl.PIMPackageImpl#getInfrastructureMicroservice()
		 * @generated
		 */
		EClass INFRASTRUCTURE_MICROSERVICE = eINSTANCE.getInfrastructureMicroservice();

		/**
		 * The meta object literal for the '{@link PIM.impl.InfrastructurePatternComponentImpl <em>Infrastructure Pattern Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.InfrastructurePatternComponentImpl
		 * @see PIM.impl.PIMPackageImpl#getInfrastructurePatternComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_PATTERN_COMPONENT = eINSTANCE.getInfrastructurePatternComponent();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY = eINSTANCE.getInfrastructurePatternComponent_Category();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY = eINSTANCE.getInfrastructurePatternComponent_Technology();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT = eINSTANCE.getInfrastructurePatternComponent_Environment();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM = eINSTANCE.getInfrastructurePatternComponent_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.InfrastructureServerComponentImpl <em>Infrastructure Server Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.InfrastructureServerComponentImpl
		 * @see PIM.impl.PIMPackageImpl#getInfrastructureServerComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SERVER_COMPONENT = eINSTANCE.getInfrastructureServerComponent();

		/**
		 * The meta object literal for the '{@link PIM.impl.InfrastructureClientComponentImpl <em>Infrastructure Client Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.InfrastructureClientComponentImpl
		 * @see PIM.impl.PIMPackageImpl#getInfrastructureClientComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_CLIENT_COMPONENT = eINSTANCE.getInfrastructureClientComponent();

		/**
		 * The meta object literal for the '{@link PIM.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.ServiceInterfaceImpl
		 * @see PIM.impl.PIMPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__SERVER_URL = eINSTANCE.getServiceInterface_ServerURL();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__DESTINATIONS = eINSTANCE.getServiceInterface_Destinations();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__GENERATING_PSM = eINSTANCE.getServiceInterface_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.MessageDestinationImpl <em>Message Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.MessageDestinationImpl
		 * @see PIM.impl.PIMPackageImpl#getMessageDestination()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION = eINSTANCE.getMessageDestination();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION__OPERATION = eINSTANCE.getMessageDestination_Operation();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION__MESSAGES = eINSTANCE.getMessageDestination_Messages();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION__ENVIRONMENT = eINSTANCE.getMessageDestination_Environment();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION__GENERATING_PSM = eINSTANCE.getMessageDestination_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.EndpointImpl
		 * @see PIM.impl.PIMPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Request URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__REQUEST_URI = eINSTANCE.getEndpoint_RequestURI();

		/**
		 * The meta object literal for the '{@link PIM.impl.QueueListenerImpl <em>Queue Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.QueueListenerImpl
		 * @see PIM.impl.PIMPackageImpl#getQueueListener()
		 * @generated
		 */
		EClass QUEUE_LISTENER = eINSTANCE.getQueueListener();

		/**
		 * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE_LISTENER__QUEUE_NAME = eINSTANCE.getQueueListener_QueueName();

		/**
		 * The meta object literal for the '{@link PIM.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.ServiceOperationImpl
		 * @see PIM.impl.PIMPackageImpl#getServiceOperation()
		 * @generated
		 */
		EClass SERVICE_OPERATION = eINSTANCE.getServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION__OPERATION_NAME = eINSTANCE.getServiceOperation_OperationName();

		/**
		 * The meta object literal for the '<em><b>Operation Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION__OPERATION_DESCRIPTION = eINSTANCE.getServiceOperation_OperationDescription();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION__GENERATING_PSM = eINSTANCE.getServiceOperation_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.ServiceMessageImpl <em>Service Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.ServiceMessageImpl
		 * @see PIM.impl.PIMPackageImpl#getServiceMessage()
		 * @generated
		 */
		EClass SERVICE_MESSAGE = eINSTANCE.getServiceMessage();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MESSAGE__MESSAGE_TYPE = eINSTANCE.getServiceMessage_MessageType();

		/**
		 * The meta object literal for the '<em><b>Body Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MESSAGE__BODY_SCHEMA = eINSTANCE.getServiceMessage_BodySchema();

		/**
		 * The meta object literal for the '<em><b>Schema Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MESSAGE__SCHEMA_FORMAT = eINSTANCE.getServiceMessage_SchemaFormat();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MESSAGE__GENERATING_PSM = eINSTANCE.getServiceMessage_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.impl.ServiceDependencyImpl
		 * @see PIM.impl.PIMPackageImpl#getServiceDependency()
		 * @generated
		 */
		EClass SERVICE_DEPENDENCY = eINSTANCE.getServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Consumer Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__CONSUMER_OPERATION = eINSTANCE.getServiceDependency_ConsumerOperation();

		/**
		 * The meta object literal for the '<em><b>Is Wrapped By Circuit Breaker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__IS_WRAPPED_BY_CIRCUIT_BREAKER = eINSTANCE.getServiceDependency_IsWrappedByCircuitBreaker();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__PROVIDER_NAME = eINSTANCE.getServiceDependency_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Provider Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__PROVIDER_DESTINATION = eINSTANCE.getServiceDependency_ProviderDestination();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__ENVIRONMENT = eINSTANCE.getServiceDependency_Environment();

		/**
		 * The meta object literal for the '<em><b>Generating PSM</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__GENERATING_PSM = eINSTANCE.getServiceDependency_GeneratingPSM();

		/**
		 * The meta object literal for the '{@link PIM.InfrastructurePatternCategory <em>Infrastructure Pattern Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PIM.InfrastructurePatternCategory
		 * @see PIM.impl.PIMPackageImpl#getInfrastructurePatternCategory()
		 * @generated
		 */
		EEnum INFRASTRUCTURE_PATTERN_CATEGORY = eINSTANCE.getInfrastructurePatternCategory();

	}

} //PIMPackage
