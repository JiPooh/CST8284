package w23lab4;
/*
 * file name: YourPurchasesTest.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab04
 * lab prof: George Krieger
 * due date: Feb 12th, 2023
 * purpose: Practice and demonstrate the use of JUnit testing
 * class list: YourPurchases.java, YourPurchasesTest.java, YourPurchasesTest2.java
 */

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2.0);
		double result = aPurchase.getPurchase();
		double expected = 2.0;
		Assert.assertEquals(expected, result, EPSILON);
   }	
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 
   /**\
    * testing if the entire program runs properly. There seems to be no error.
    */
   @Test
    public void testYourPurchase() {
	   YourPurchases bPurchase = new YourPurchases();
	   bPurchase.recordPurchase(50.0);
	   bPurchase.receivePayment(50, 20, 25, 20, 0);
	   double result = bPurchase.giveChange();
	   double expectedChange = (50 + (20*0.25) + (25*0.1) + (20*0.05)) - 50;
	   Assert.assertEquals(result, expectedChange, EPSILON);
   }
  
     
   }

