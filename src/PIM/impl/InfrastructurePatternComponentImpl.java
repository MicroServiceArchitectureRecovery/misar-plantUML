/**
 */
package PIM.impl;

import PIM.InfrastructurePatternCategory;
import PIM.InfrastructurePatternComponent;
import PIM.PIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Pattern Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PIM.impl.InfrastructurePatternComponentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link PIM.impl.InfrastructurePatternComponentImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link PIM.impl.InfrastructurePatternComponentImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.impl.InfrastructurePatternComponentImpl#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructurePatternComponentImpl extends MinimalEObjectImpl.Container implements InfrastructurePatternComponent {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final InfrastructurePatternCategory CATEGORY_EDEFAULT = InfrastructurePatternCategory.SERVICE_ROUTING_PATTERN_API_GATEWAY_AND_PROXY;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected InfrastructurePatternCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratingPSM() <em>Generating PSM</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingPSM()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generatingPSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructurePatternComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PIMPackage.Literals.INFRASTRUCTURE_PATTERN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePatternCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(InfrastructurePatternCategory newCategory) {
		InfrastructurePatternCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratingPSM() {
		if (generatingPSM == null) {
			generatingPSM = new EDataTypeUniqueEList<String>(String.class, this, PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM);
		}
		return generatingPSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY:
				return getCategory();
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY:
				return getTechnology();
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT:
				return getEnvironment();
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM:
				return getGeneratingPSM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY:
				setCategory((InfrastructurePatternCategory)newValue);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM:
				getGeneratingPSM().clear();
				getGeneratingPSM().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM:
				getGeneratingPSM().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case PIMPackage.INFRASTRUCTURE_PATTERN_COMPONENT__GENERATING_PSM:
				return generatingPSM != null && !generatingPSM.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Category: ");
		result.append(category);
		result.append(", Technology: ");
		result.append(technology);
		result.append(", Environment: ");
		result.append(environment);
		result.append(", GeneratingPSM: ");
		result.append(generatingPSM);
		result.append(')');
		return result.toString();
	}

} //InfrastructurePatternComponentImpl
