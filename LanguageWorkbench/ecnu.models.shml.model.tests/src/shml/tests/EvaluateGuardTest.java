/**
 */
package shml.tests;

import junit.textui.TestRunner;

import shml.EvaluateGuard;
import shml.ShmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluate Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluateGuardTest extends GuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluateGuardTest.class);
	}

	/**
	 * Constructs a new Evaluate Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evaluate Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvaluateGuard getFixture() {
		return (EvaluateGuard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShmlFactory.eINSTANCE.createEvaluateGuard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EvaluateGuardTest
