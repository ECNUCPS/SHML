/**
 */
package shml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unif Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shml.UnifDistribution#getA <em>A</em>}</li>
 *   <li>{@link shml.UnifDistribution#getB <em>B</em>}</li>
 * </ul>
 *
 * @see shml.ShmlPackage#getUnifDistribution()
 * @model
 * @generated
 */
public interface UnifDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(float)
	 * @see shml.ShmlPackage#getUnifDistribution_A()
	 * @model
	 * @generated
	 */
	float getA();

	/**
	 * Sets the value of the '{@link shml.UnifDistribution#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(float value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(float)
	 * @see shml.ShmlPackage#getUnifDistribution_B()
	 * @model
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link shml.UnifDistribution#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

} // UnifDistribution
