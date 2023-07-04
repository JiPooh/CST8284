package w23lab4;
/*
 * file name: YourPurchasesTest2.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab04
 * lab prof: George Krieger
 * due date: Feb 12th, 2023
 * purpose: Practice and demonstrate the use of JUnit testing
 * class list: YourPurchases.java, YourPurchasesTest.java, YourPurchasesTest2.java
 */
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: RUN THIS AND SHOW THE FAILED TEST 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // TODO: IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	/**
	 * First test that runs only the first method from the failed test.
	 * runs without error, so this piece of code runs properly
	 */
	@Test
	public void findError() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		double result = aPurchase.getPurchase();
		double expected = 1.5;
		Assert.assertEquals(result, expected, EPSILON);
	}
	/**
	 * Second test that runs the first and the second method from the failed test.
	 * runs without error, so it is the third method that is giving the error
	 * since there are only three methods that are being tested.
	 */
	@Test
	public void findErrorB() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double result = aPurchase.getPayment();
		double expected = 5;
		Assert.assertEquals(result, expected, EPSILON);
	}
	/**
	 * third test which fixed the failed test
	 * the problem seems to be that the CalculateChange() adds the payment and purchase amount
	 * instead of subtracting. fixed by changing CalculateChange() with giveChange() method which
	 * calculates the change properly.
	 */
	@Test
	public void findErrorC() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.giveChange();
		double expected = 3.5;
		Assert.assertEquals(changeResult, expected,EPSILON);
}
	/**
	 * part b of the lab where I have to test the method CalculateChange() by testing every time a new method is introduced
	 * until a failure in test happens. The failure happened on method CalculateChange()
	 */
	@Test
	public void partB() {
		YourPurchases bPurchase = new YourPurchases();
		bPurchase.recordPurchase(35);
		//double result = bPurchase.getPurchase();
		//double expected = 35;
		//Assert.assertEquals(result, expected, EPSILON);
		bPurchase.receivePayment(45, 2, 7, 11, 70);
		//double result = bPurchase.getPayment();
		//double expected = 47.45;
		//Assert.assertEquals(result, expected, EPSILON);
		//bPurchase.CalculateChange();
		//double changeResult = bPurchase.CalculateChange(); //the method adds purchase amount and payment instead of subtracting
		//double expected = 12.45;
		//Assert.asserEquals(changeResult, expected, EPSILON);
		bPurchase.giveChange(); // this method correctly subtracts purchase amount from payment
		double changeResult = bPurchase.giveChange();
		double expected = 12.45;
		Assert.assertEquals(changeResult, expected,EPSILON);
	}
}	
	
	
	
	