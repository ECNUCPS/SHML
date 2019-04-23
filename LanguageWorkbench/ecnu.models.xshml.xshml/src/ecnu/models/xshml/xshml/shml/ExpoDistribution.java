/**
 */
package ecnu.models.xshml.xshml.shml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expo Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshml.shml.ExpoDistribution#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshml.shml.ShmlPackage#getExpoDistribution()
 * @model
 * @generated
 */
public interface ExpoDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(float)
	 * @see ecnu.models.xshml.xshml.shml.ShmlPackage#getExpoDistribution_Lambda()
	 * @model
	 * @generated
	 */
	float getLambda();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshml.shml.ExpoDistribution#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(float value);

} // ExpoDistribution
