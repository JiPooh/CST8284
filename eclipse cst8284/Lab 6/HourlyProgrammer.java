/*
 * file name: HourlyProgrammer.java
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

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.
/**
 * class which inherits from the abstract class Programmer
 * @author Jihoo Park
 *
 */
public class HourlyProgrammer extends Programmer {
/**
 * amount the programmer is paid per hour
 */
private double wage; // wage per hour
/**
 * amount of hours the programmer worked
 */
private double hours; // hours worked for week

/**
 * 5 argument constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber SIN of the programmer
 * @param wage amount paid by hour for programmer
 * @param hours hours worked by programmer
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);
/**
 * an if statement to determine if the input for the wage is negative
 * which is an unaccepted value
 */
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}
/**
 * an if statement to determine if the input for the hours is
 * valid
 */
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * set wage
 * @param wage amount the programmer is paid per hour
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * get wage
 * @return wage amount the programmer is paid per hour
 */
public double getWage() {
return wage;
} 

/**
 * set hours worked
 * @param hours amount of hours the programmer worked
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * get hours worked
 * @return hours amount of hours the programmer worked
 */
public double getHours() {
return hours;
} 


//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * overriding getPaymentAmount method inherited from Programmer class
 * to fit the current class
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          
          
/**
 * overriding the toString method from Programmer class 
 * to better represent HourlyProgrammer class
 */
@Override
public String toString() {
	return "Hourly programmer: " + super.toString() + 
			String.format("Hourly wage: $%,.2f; ", getWage()) +
			String.format("Hours worked: %,.2f%n", getHours()) +
			String.format("Payment due: $%,.2f %n", getPaymentAmount());
}
                     
}

