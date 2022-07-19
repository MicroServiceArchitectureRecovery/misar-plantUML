/**
 */
package PIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Pattern Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PIM.InfrastructurePatternComponent#getCategory <em>Category</em>}</li>
 *   <li>{@link PIM.InfrastructurePatternComponent#getTechnology <em>Technology</em>}</li>
 *   <li>{@link PIM.InfrastructurePatternComponent#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link PIM.InfrastructurePatternComponent#getGeneratingPSM <em>Generating PSM</em>}</li>
 * </ul>
 *
 * @see PIM.PIMPackage#getInfrastructurePatternComponent()
 * @model
 * @generated
 */
public interface InfrastructurePatternComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link PIM.InfrastructurePatternCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see PIM.InfrastructurePatternCategory
	 * @see #setCategory(InfrastructurePatternCategory)
	 * @see PIM.PIMPackage#getInfrastructurePatternComponent_Category()
	 * @model
	 * @generated
	 */
	InfrastructurePatternCategory getCategory();

	/**
	 * Sets the value of the '{@link PIM.InfrastructurePatternComponent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see PIM.InfrastructurePatternCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(InfrastructurePatternCategory value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see PIM.PIMPackage#getInfrastructurePatternComponent_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link PIM.InfrastructurePatternComponent#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see PIM.PIMPackage#getInfrastructurePatternComponent_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link PIM.InfrastructurePatternComponent#getEnvironment <em>Environment</em>}' attribute.
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
	 * @see PIM.PIMPackage#getInfrastructurePatternComponent_GeneratingPSM()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGeneratingPSM();

} // InfrastructurePatternComponent
