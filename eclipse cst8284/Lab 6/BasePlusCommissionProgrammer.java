/*
 * file name: BasePlusCommissionProgrammer.java
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


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.
/**
 * class which inherits from the CommissionProgramer
 * @author Jihoo Park
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
/**
 * base salary programmer is paid
 */
private double baseSalary; // base salary per week

/**
 * 6 argument constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber SIN of the programmer
 * @param grossSales gross sales of the programmer
 * @param commissionRate commission rate of the programmer
 * @param baseSalary base salary of the programmer
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, 
double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

/**
 * if statement to determine if the base salary is 
 * a valid value
 */
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * set base salary
 * @param baseSalary base salary programmer is paid
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * get base salary
 * @return baseSalary base salary programmer is paid
 */
public double getBaseSalary() {
return baseSalary;
}

/**
 * gives 10% increase to the base salary
 * @return newBaseSalary new value of base salary
 */
public double newBaseSalary() {
	return (1.1 * getBaseSalary());
}


//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * overriding getPaymentAmount inherited from CommissionProgrammer 
 * to fit the current class
 */
@Override                                                            
public double getPaymentAmount() {                                             
return newBaseSalary() + super.getPaymentAmount();                        
} 

/**
 * overriding the toString method from the CommissionProgrammer class
 * to better represent the BasePlusCommissionProgrammer class
 */
@Override     
public String toString() {
	return "Base-plus Commission programmer: " + super.toStringB() +
			String.format("; Base salary: $%,.2f", getBaseSalary())
			+ String.format("%nNew base salary with 10%% increase: $%,.2f%n", newBaseSalary())//already included in PaymeInterface
			+ String.format("Payment due: $%,.2f; %n", getPaymentAmount())//added to PaymeInterface
			;
}               

}



