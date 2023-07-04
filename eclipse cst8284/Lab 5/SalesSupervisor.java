package w23lab5;
/*  file name: SalesSupervisor.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */
/**
 * a class of sales supervisor with name and age inherited from salesAgent class and location of its own
 * @author Jihoo Park
 *
 */
public class SalesSupervisor extends SalesAgent{
	/**
	 * location of the supervisor
	 */
private String location;
/**
 * SalesSupervisor as an object
 * @param name name of the supervisor, inherited from SalesAgent
 * @param age age of the supervisor, inherited from SalesAgent
 * @param location location of the supervisor
 */
	SalesSupervisor(String name, int age, String location){
		super(name, age);
		this.location = location;
}
	/**
	 * a toString method to represent the SalesSupervisor object
	 * @return a string representation of SalesSupervisor object
	 */
	public String toString() {
		return "Sales Supervisor [super= " + super.toString() + ", location= " + location + "]";
	}
}
