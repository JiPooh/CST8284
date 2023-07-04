/*
 * file name: CommissionProgrammer.java
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

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.
/**
 * class which inherits from the abstract class Programmer
 * @author Jihoo Park
 *
 */
public class CommissionProgrammer extends Programmer { 
/**
 * gross weekly sales
 */
private double grossSales; // gross weekly sales
/**
 * commission percentage
 */
private double commissionRate; // commission percentage

/**
 * 5 argument constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber SIN of the programmer
 * @param grossSales gross weekly sales of the programmer
 * @param commissionRate commission percentage of the programmer
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

/**
 * if statement to determine if the commission rate is 
 * a valid value
 */
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

/**
 * if statement to determine if the gross sales is
 * a valid value
 */
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * set gross sales
 * @param grossSales gross weekly sales
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * get gross sales
 * @return grossSales gross weekly sales
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * set commission rate
 * @param commissionRate commission percentage
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * get commission rate
 * @return commissionRate commission percentage
 */
public double getCommissionRate() {
return commissionRate;
} 


//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * overriding getPaymentAmount method inherited from Programmer class
 * to fit the current class
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

/**
 * overriding toString method inherited from Programmer class
 * to better represent CommissionProgrammer class
 */
@Override      
public String toString() {
	return "Commission programmer: " + toStringB() + String.format("%n") +
			String.format("Payment due: $%,.2f %n", getPaymentAmount());
}                                             

/**
 * a toString method for the child class to use for its own toString
 * @return String representation of gross sales and commission rate
 */
public String toStringB() {
	return  super.toString() +
			String.format("Gross sales: $%,.2f; ", getGrossSales()) +
			String.format("Commission rate: %,.2f", getCommissionRate());
}


}

