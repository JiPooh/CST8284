/*
 * file name: Payme.java
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

/**
 * This is the abstract class Payme, which is an interface for other classes to use.
 * @author Jihoo Park
 *
 */
interface Payme {
	/**
	 * method to be used by all children classes as its own version
	 * @return paymentAmount different payment amount for each class of programmers
	 */
	double getPaymentAmount();
	/**
	 * method to display the toString representation of each programmers
	 */
	default void display() {
		System.out.println(toString());
	}
}
