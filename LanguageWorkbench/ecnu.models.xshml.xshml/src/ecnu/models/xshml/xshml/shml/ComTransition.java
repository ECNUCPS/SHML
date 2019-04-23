/**
 */
package ecnu.models.xshml.xshml.shml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshml.shml.ComTransition#getCsrc <em>Csrc</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.ComTransition#getCtgt <em>Ctgt</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshml.shml.ShmlPackage#getComTransition()
 * @model
 * @generated
 */
public interface ComTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Csrc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecnu.models.xshml.xshml.shml.State#getOutgoingct <em>Outgoingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csrc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csrc</em>' reference.
	 * @see #setCsrc(State)
	 * @see ecnu.models.xshml.xshml.shml.ShmlPackage#getComTransition_Csrc()
	 * @see ecnu.models.xshml.xshml.shml.State#getOutgoingct
	 * @model opposite="outgoingct" required="true"
	 * @generated
	 */
	State getCsrc();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshml.shml.ComTransition#getCsrc <em>Csrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csrc</em>' reference.
	 * @see #getCsrc()
	 * @generated
	 */
	void setCsrc(State value);

	/**
	 * Returns the value of the '<em><b>Ctgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecnu.models.xshml.xshml.shml.State#getIncomingct <em>Incomingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctgt</em>' reference.
	 * @see #setCtgt(State)
	 * @see ecnu.models.xshml.xshml.shml.ShmlPackage#getComTransition_Ctgt()
	 * @see ecnu.models.xshml.xshml.shml.State#getIncomingct
	 * @model opposite="incomingct"
	 * @generated
	 */
	State getCtgt();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshml.shml.ComTransition#getCtgt <em>Ctgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctgt</em>' reference.
	 * @see #getCtgt()
	 * @generated
	 */
	void setCtgt(State value);

} // ComTransition
