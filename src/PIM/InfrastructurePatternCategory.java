/**
 */
package PIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Infrastructure Pattern Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PIM.PIMPackage#getInfrastructurePatternCategory()
 * @model
 * @generated
 */
public enum InfrastructurePatternCategory implements Enumerator {
	/**
	 * The '<em><b>Service Routing Pattern API Gateway and Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY(0, "Service_Routing_Pattern_API_Gateway_and_Proxy", "Service_Routing_Pattern_API_Gateway_and_Proxy"),

	/**
	 * The '<em><b>Service Routing Pattern Registry and Discovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY(1, "Service_Routing_Pattern_Registry_and_Discovery", "Service_Routing_Pattern_Registry_and_Discovery"),

	/**
	 * The '<em><b>Development Pattern Centralized Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION(2, "Development_Pattern_Centralized_Configuration", "Development_Pattern_Centralized_Configuration"),

	/**
	 * The '<em><b>Development Pattern Data Persistence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_DATA_PERSISTENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_PATTERN_DATA_PERSISTENCE(3, "Development_Pattern_Data_Persistence", "Development_Pattern_Data_Persistence"),

	/**
	 * The '<em><b>Development Pattern Data Cache</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_DATA_CACHE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_PATTERN_DATA_CACHE(4, "Development_Pattern_Data_Cache", "Development_Pattern_Data_Cache"),

	/**
	 * The '<em><b>Development Pattern Asynchronous Message Brokering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING(5, "Development_Pattern_Asynchronous_Message_Brokering", "Development_Pattern_Asynchronous_Message_Brokering"),

	/**
	 * The '<em><b>Client Resiliency Pattern Load Balancer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER(6, "Client_Resiliency_Pattern_Load_Balancer", "Client_Resiliency_Pattern_Load_Balancer"),

	/**
	 * The '<em><b>Client Resiliency Pattern Circuit Breaker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER(7, "Client_Resiliency_Pattern_Circuit_Breaker", "Client_Resiliency_Pattern_Circuit_Breaker"),

	/**
	 * The '<em><b>Security Pattern Web Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_PATTERN_WEB_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_PATTERN_WEB_SECURITY(8, "Security_Pattern_Web_Security", "Security_Pattern_Web_Security"),

	/**
	 * The '<em><b>Security Pattern Authorization and Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION(9, "Security_Pattern_Authorization_and_Authentication", "Security_Pattern_Authorization_and_Authentication"),

	/**
	 * The '<em><b>Observability Pattern Application Metrics Logging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING(10, "Observability_Pattern_Application_Metrics_Logging", "Observability_Pattern_Application_Metrics_Logging"),

	/**
	 * The '<em><b>Observability Pattern Application Metrics Generation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION(11, "Observability_Pattern_Application_Metrics_Generation", "Observability_Pattern_Application_Metrics_Generation"),

	/**
	 * The '<em><b>Observability Pattern Application Metrics Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION(12, "Observability_Pattern_Application_Metrics_Aggregation", "Observability_Pattern_Application_Metrics_Aggregation"),

	/**
	 * The '<em><b>Observability Pattern Application Metrics Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS(13, "Observability_Pattern_Application_Metrics_Analysis", "Observability_Pattern_Application_Metrics_Analysis"),

	/**
	 * The '<em><b>Observability Pattern Application Metrics Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING(14, "Observability_Pattern_Application_Metrics_Monitoring", "Observability_Pattern_Application_Metrics_Monitoring"),

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Generation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION(15, "Observability_Pattern_Circuit_Breaker_Metrics_Generation", "Observability_Pattern_Circuit_Breaker_Metrics_Generation"),

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION(16, "Observability_Pattern_Circuit_Breaker_Metrics_Aggregation", "Observability_Pattern_Circuit_Breaker_Metrics_Aggregation"),

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING(17, "Observability_Pattern_Circuit_Breaker_Metrics_Monitoring", "Observability_Pattern_Circuit_Breaker_Metrics_Monitoring"),

	/**
	 * The '<em><b>Observability Pattern Log Correlation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_LOG_CORRELATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_LOG_CORRELATION(18, "Observability_Pattern_Log_Correlation", "Observability_Pattern_Log_Correlation"),

	/**
	 * The '<em><b>Observability Pattern Distributed Tracing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING(19, "Observability_Pattern_Distributed_Tracing", "Observability_Pattern_Distributed_Tracing"),

	/**
	 * The '<em><b>Observability Pattern Distributed Tracing Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING(20, "Observability_Pattern_Distributed_Tracing_Monitoring", "Observability_Pattern_Distributed_Tracing_Monitoring");

	/**
	 * The '<em><b>Service Routing Pattern API Gateway and Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY
	 * @model name="Service_Routing_Pattern_API_Gateway_and_Proxy"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY_VALUE = 0;

	/**
	 * The '<em><b>Service Routing Pattern Registry and Discovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY
	 * @model name="Service_Routing_Pattern_Registry_and_Discovery"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY_VALUE = 1;

	/**
	 * The '<em><b>Development Pattern Centralized Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION
	 * @model name="Development_Pattern_Centralized_Configuration"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION_VALUE = 2;

	/**
	 * The '<em><b>Development Pattern Data Persistence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_DATA_PERSISTENCE
	 * @model name="Development_Pattern_Data_Persistence"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_PATTERN_DATA_PERSISTENCE_VALUE = 3;

	/**
	 * The '<em><b>Development Pattern Data Cache</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_DATA_CACHE
	 * @model name="Development_Pattern_Data_Cache"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_PATTERN_DATA_CACHE_VALUE = 4;

	/**
	 * The '<em><b>Development Pattern Asynchronous Message Brokering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING
	 * @model name="Development_Pattern_Asynchronous_Message_Brokering"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING_VALUE = 5;

	/**
	 * The '<em><b>Client Resiliency Pattern Load Balancer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER
	 * @model name="Client_Resiliency_Pattern_Load_Balancer"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER_VALUE = 6;

	/**
	 * The '<em><b>Client Resiliency Pattern Circuit Breaker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER
	 * @model name="Client_Resiliency_Pattern_Circuit_Breaker"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER_VALUE = 7;

	/**
	 * The '<em><b>Security Pattern Web Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_PATTERN_WEB_SECURITY
	 * @model name="Security_Pattern_Web_Security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_PATTERN_WEB_SECURITY_VALUE = 8;

	/**
	 * The '<em><b>Security Pattern Authorization and Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION
	 * @model name="Security_Pattern_Authorization_and_Authentication"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION_VALUE = 9;

	/**
	 * The '<em><b>Observability Pattern Application Metrics Logging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING
	 * @model name="Observability_Pattern_Application_Metrics_Logging"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING_VALUE = 10;

	/**
	 * The '<em><b>Observability Pattern Application Metrics Generation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION
	 * @model name="Observability_Pattern_Application_Metrics_Generation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION_VALUE = 11;

	/**
	 * The '<em><b>Observability Pattern Application Metrics Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION
	 * @model name="Observability_Pattern_Application_Metrics_Aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION_VALUE = 12;

	/**
	 * The '<em><b>Observability Pattern Application Metrics Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS
	 * @model name="Observability_Pattern_Application_Metrics_Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS_VALUE = 13;

	/**
	 * The '<em><b>Observability Pattern Application Metrics Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING
	 * @model name="Observability_Pattern_Application_Metrics_Monitoring"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING_VALUE = 14;

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Generation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION
	 * @model name="Observability_Pattern_Circuit_Breaker_Metrics_Generation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION_VALUE = 15;

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION
	 * @model name="Observability_Pattern_Circuit_Breaker_Metrics_Aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION_VALUE = 16;

	/**
	 * The '<em><b>Observability Pattern Circuit Breaker Metrics Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING
	 * @model name="Observability_Pattern_Circuit_Breaker_Metrics_Monitoring"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING_VALUE = 17;

	/**
	 * The '<em><b>Observability Pattern Log Correlation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_LOG_CORRELATION
	 * @model name="Observability_Pattern_Log_Correlation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_LOG_CORRELATION_VALUE = 18;

	/**
	 * The '<em><b>Observability Pattern Distributed Tracing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING
	 * @model name="Observability_Pattern_Distributed_Tracing"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_VALUE = 19;

	/**
	 * The '<em><b>Observability Pattern Distributed Tracing Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING
	 * @model name="Observability_Pattern_Distributed_Tracing_Monitoring"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING_VALUE = 20;

	/**
	 * An array of all the '<em><b>Infrastructure Pattern Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InfrastructurePatternCategory[] VALUES_ARRAY =
		new InfrastructurePatternCategory[] {
			SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY,
			SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY,
			DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION,
			DEVELOPMENT_PATTERN_DATA_PERSISTENCE,
			DEVELOPMENT_PATTERN_DATA_CACHE,
			DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING,
			CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER,
			CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER,
			SECURITY_PATTERN_WEB_SECURITY,
			SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION,
			OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING,
			OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION,
			OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION,
			OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS,
			OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING,
			OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION,
			OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION,
			OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING,
			OBSERVABILITY_PATTERN_LOG_CORRELATION,
			OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING,
			OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING,
		};

	/**
	 * A public read-only list of all the '<em><b>Infrastructure Pattern Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InfrastructurePatternCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Infrastructure Pattern Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfrastructurePatternCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfrastructurePatternCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infrastructure Pattern Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfrastructurePatternCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfrastructurePatternCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infrastructure Pattern Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfrastructurePatternCategory get(int value) {
		switch (value) {
			case SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY_VALUE: return SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY;
			case SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY_VALUE: return SERVICE_ROUTING_PATTERN_REGISTRY_AND_DISCOVERY;
			case DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION_VALUE: return DEVELOPMENT_PATTERN_CENTRALIZED_CONFIGURATION;
			case DEVELOPMENT_PATTERN_DATA_PERSISTENCE_VALUE: return DEVELOPMENT_PATTERN_DATA_PERSISTENCE;
			case DEVELOPMENT_PATTERN_DATA_CACHE_VALUE: return DEVELOPMENT_PATTERN_DATA_CACHE;
			case DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING_VALUE: return DEVELOPMENT_PATTERN_ASYNCHRONOUS_MESSAGE_BROKERING;
			case CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER_VALUE: return CLIENT_RESILIENCY_PATTERN_LOAD_BALANCER;
			case CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER_VALUE: return CLIENT_RESILIENCY_PATTERN_CIRCUIT_BREAKER;
			case SECURITY_PATTERN_WEB_SECURITY_VALUE: return SECURITY_PATTERN_WEB_SECURITY;
			case SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION_VALUE: return SECURITY_PATTERN_AUTHORIZATION_AND_AUTHENTICATION;
			case OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING_VALUE: return OBSERVABILITY_PATTERN_APPLICATION_METRICS_LOGGING;
			case OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION_VALUE: return OBSERVABILITY_PATTERN_APPLICATION_METRICS_GENERATION;
			case OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION_VALUE: return OBSERVABILITY_PATTERN_APPLICATION_METRICS_AGGREGATION;
			case OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS_VALUE: return OBSERVABILITY_PATTERN_APPLICATION_METRICS_ANALYSIS;
			case OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING_VALUE: return OBSERVABILITY_PATTERN_APPLICATION_METRICS_MONITORING;
			case OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION_VALUE: return OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_GENERATION;
			case OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION_VALUE: return OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_AGGREGATION;
			case OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING_VALUE: return OBSERVABILITY_PATTERN_CIRCUIT_BREAKER_METRICS_MONITORING;
			case OBSERVABILITY_PATTERN_LOG_CORRELATION_VALUE: return OBSERVABILITY_PATTERN_LOG_CORRELATION;
			case OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_VALUE: return OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING;
			case OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING_VALUE: return OBSERVABILITY_PATTERN_DISTRIBUTED_TRACING_MONITORING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfrastructurePatternCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InfrastructurePatternCategory
