package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * A class that is used to test a method (getBMI()) in Patient.java
 * @author JiHoo Park
 *
 */
class MyHealthDataTest2 {
	/**
	 * an instance of Patient.java so I can use the method that is being tested
	 */
Patient patient = new Patient();
/**
 * declaration of weight to be used for the calculation
 */
double weight;
/**
 * declaration of height to be used for the calculation
 */
double height;
/**
 * first test of getBMI() method which will come out as a success
 * I am assuming the patient is 75 inches tall and weighs 150lb
 * the setter for both weight and height are required to give the correct value
 * for the instance patient so the method getBMI() can work with the correct value
 * all other variables available in class Patient is not required for the
 * calculation of BMI, so I will only set the value for weight and height.
 */
	@Test
	void testSuccess() {
		double testBMI1;
		double calcBMI1;
		weight = 75;
		height = 150;
		patient.setWeight(weight);
		patient.setHeight(height);
		calcBMI1 = (weight*703)/(height*height);
		testBMI1 = patient.getBMI();
		assertEquals(calcBMI1, testBMI1,0.0001);

	}
	/**
	 * second test of getBMI() method which will give a failure
	 * I am assuming the patient is 66 inches tall and weighs 111lb
	 * the failure comes from the lack of setters for both height and weight for the
	 * class Patient which would result in failure of giving the getBMI() the correct
	 * values to work with.
	 */
	@Test
	void testFail() {
		double testBMI2;
		double calcBMI2;
		weight = 66;
		height = 111;
		calcBMI2 = (weight*703)/(height*height);
		testBMI2 = patient.getBMI();
		assertEquals(calcBMI2, testBMI2,0.0001);

	}

}
