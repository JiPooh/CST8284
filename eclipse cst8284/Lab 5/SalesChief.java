package w23lab5;
/*  file name: SalesChief.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */
/**
 * a class of sales chief with name, age and location inherited from SalesSupervisor class and department of its own
 * @author Jihoo Park
 *
 */
public class SalesChief extends SalesSupervisor{
	/**
	 * department of the sales chief
	 */
private String department;
	/**
	 * SalesChief as an object
	 * @param name name of the sales chief, inherited from SalesSupervisor
	 * @param age age of the sales chief, inherited from SalesSupervisor
	 * @param location location of the sales chief, inherited from SalesSupervisor
	 * @param department department of the sales chief
	 */
	SalesChief(String name, int age, String location, String department){
		super(name, age, location);
		this.department = department;
	}
	/**
	 * a toString method to represent the SalesChief object
	 * @return a String representation of SalesChief object
	 */
	public String toString() {
		return "Sales Chief [susper= " + super.toString() + ", department= " + department + "]";
	}
}
