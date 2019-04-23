/**
 */
package shml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shml.ExpoDistribution;
import shml.ShmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expo Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpoDistributionTest extends TestCase {

	/**
	 * The fixture for this Expo Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpoDistribution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpoDistributionTest.class);
	}

	/**
	 * Constructs a new Expo Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpoDistributionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Expo Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExpoDistribution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Expo Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpoDistribution getFixture() {
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
		setFixture(ShmlFactory.eINSTANCE.createExpoDistribution());
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

} //ExpoDistributionTest
