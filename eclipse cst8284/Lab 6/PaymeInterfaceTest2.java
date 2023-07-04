/*
 * file name: PaymeInterfaceTest2.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab06
 * due date: Mar. 31st, 2023
 * purpose: to test my knowledge on abstract classes, interface, inheritance and polymorphism
 * class list: Payme.java, Invoice.java, Programmer.java, HourlyProgrammer.java, 
 * SalariedProgrammer.java, CommissionProgrammer.java, BasePlusCommissionProgrammer.java, 
 * PaymeInterfaceTest.java, PaymeInterfaceTest2.java
 */

// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.
/**
 * a program to test the classes, Payme.java, Invoice.java, Programmer.java, HourlyProgrammer.java, 
 * SalariedProgrammer.java, CommissionProgrammer.java, BasePlusCommissionProgrammer.java
 * unlike the first test, this one uses the interface to print String representation of
 * each programmer class
 * @author Jihoo Park
 *
 */
public class PaymeInterfaceTest2  {

/**
 * method main which execute the program to test the program
 * @param args command line arguments
 */
public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
Payme[] paymeObjects = new Payme[6];

//END CODE
 

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
paymeObjects[0] = new Invoice("1125", "Smart Phone", 2, 999.99);
paymeObjects[1] = new Invoice("515", "Novella Collection", 11, 24.99);
paymeObjects[2] = new HourlyProgrammer("Songebob", "JihooPark", "111-111-111", 14.50, 40);
paymeObjects[3] = new SalariedProgrammer("Patrick", "Park", "222-222-222", 2500);
paymeObjects[4] = new CommissionProgrammer("Squidward", "Jihoo", "333-333-333", 12300, 0.3);
paymeObjects[5] = new BasePlusCommissionProgrammer("Sandy", "ParkJihoo", "444-444-444", 14400, 0.07, 1700);

// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
	/*
	 * for (Payme currentPayme : paymeObjects) { // output currentPayme and its
	 * appropriate payment amount System.out.printf("%s \n",
	 * currentPayme.toString());
	 * 
	 * if (currentPayme instanceof BasePlusCommissionProgrammer) { // downcast Payme
	 * reference to // BasePlusCommissioProgrammer reference, and know why we're
	 * doing thisS BasePlusCommissionProgrammer programmer =
	 * (BasePlusCommissionProgrammer) currentPayme;
	 * 
	 * double oldBaseSalary = programmer.getBaseSalary();
	 * programmer.setBaseSalary(1.10 * oldBaseSalary); System.out.printf(
	 * "new base salary with 10%% increase is: $%,.2f\n",
	 * programmer.getBaseSalary()); System.out.printf("Payment due: $" +
	 * String.format("%,.2f; %n", programmer.getPaymentAmount())); }
	 * 
	 * 
	 * 
	 * // TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR // OUTPUT
	 * FOLLOWS THE OUTPUT SAMPLE PROVIDED
	 * 
	 * // START CODE
	 * 
	 * // END CODE
	 * 
	 * }
	 */

	
	  for(int i=0; i<paymeObjects.length; i++) { 
		  paymeObjects[i].display();
	  }
	 
}
}


