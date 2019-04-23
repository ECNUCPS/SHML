/**
 */
package shml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shml.ShmlFactory;
import shml.UnifDistribution;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unif Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnifDistributionTest extends TestCase {

	/**
	 * The fixture for this Unif Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnifDistribution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnifDistributionTest.class);
	}

	/**
	 * Constructs a new Unif Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifDistributionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unif Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UnifDistribution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unif Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnifDistribution getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShmlFactory.eINSTANCE.createUnifDistribution());
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

} //UnifDistributionTest
