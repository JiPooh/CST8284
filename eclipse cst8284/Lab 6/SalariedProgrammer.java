/*
 * file name: SalariedProgrammer.java
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

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.
/**
 * class which inherits from the abstract class Programmer
 * @author Jihoo Park
 *
 */
public class SalariedProgrammer extends Programmer  {
/**
 * salary the programmer is paid per week
 */
private double weeklySalary;

/**
 * 4 argument constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber SIN of the programmer
 * @param weeklySalary weekly salary of the programmer
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

/**
 * if statement to determine if the weekly salary is
 * a valid value
 */
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * set weekly salary
 * @param weeklySalary salary the programmer is paid per week
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * get weekly salary
 * @return weeklySalary salary the programmer is paid per week
 */
public double getWeeklySalary() {
return weeklySalary;
} 

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * overriding getPaymentAmount method inherited from Programmer class
 * to fit the current class
 */
@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
}                                             

/**
 * overriding the toString method from Programmer class 
 * to better represent SalariedProgrammer class
 */
@Override
public String toString() {
	return "Salaried programmer: " + super.toString() +
			String.format("Weekly salary: $%,.2f%n", getWeeklySalary()) +
			String.format("Payment due: $%,.2f %n", getPaymentAmount());
}

}

