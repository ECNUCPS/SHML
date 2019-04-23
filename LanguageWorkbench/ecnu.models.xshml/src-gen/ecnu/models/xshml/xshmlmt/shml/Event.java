/**
 */
package ecnu.models.xshml.xshmlmt.shml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Event#getName <em>Name</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Event#getSend <em>Send</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Event#getReceive <em>Receive</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Event#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' attribute.
	 * @see #setSend(int)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getEvent_Send()
	 * @model
	 * @generated
	 */
	int getSend();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Event#getSend <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send</em>' attribute.
	 * @see #getSend()
	 * @generated
	 */
	void setSend(int value);

	/**
	 * Returns the value of the '<em><b>Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive</em>' attribute.
	 * @see #setReceive(int)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getEvent_Receive()
	 * @model
	 * @generated
	 */
	int getReceive();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Event#getReceive <em>Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive</em>' attribute.
	 * @see #getReceive()
	 * @generated
	 */
	void setReceive(int value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(int)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getEvent_Active()
	 * @model
	 * @generated
	 */
	int getActive();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Event#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(int value);

} // Event
