/*
 * file name: Programmer.java
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

// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!
/**
 * an abstract class which implements the interface Payme
 * @author Jihoo Park
 *
 */
public abstract class Programmer  implements Payme{
/**
 * first name of the programmer
 */
private String firstName;
/**
 * last name of the programmer
 */
private String lastName;
/**
 * SIN of programmer
 */
private String socialSecurityNumber;

/**
 * three argument constructor
 * @param first first name of programmer
 * @param last last name of programmer
 * @param ssn SIN of programmer
 */
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/

/**
 * get first name
 * @return FirstName first name of programmer
 */
public String getFirstName() {
	return firstName;
}
/**
 * set first name
 * @param firstName first name of programmer
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * get last name of programmer
 * @return LastName last name of programmer
 */
public String getLastName() {
	return lastName;
}
/**
 * set last name of programmer
 * @param lastName last name of programmer
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * get SIN of programmer
 * @return socialSecurityNumber SIN of programmer
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}
/**
 * set SIN of programmer
 * @param socialSecurityNumber SIN of programmer
 */
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * overrides toString method from Payme interface to make
 * a String representative of Programmer object
 */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n", 
  getFirstName(), getLastName(), "Social security number", getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??

/**
 * a method to be used in children classes to retrieve amount of payment
 * for each classes
 */
public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


