package w23lab5;
/*  file name: SalesAgentTest.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */


/**
 * program to test SalesAgent class as well as its subclasses as directed in the lab instruction
 * @author Jihoo Park
*/
public class SalesAgentTest
{  
	/**
	 * method main
	 * @param args command-line arguments of java
	 */
   public static void main(String[] args)
   {

	//... your code starts here!
	   // 1- create 2 sales agents, one sales supervisor, and one sales chief.
	   SalesAgent agent1 = new SalesAgent("Eleanor Lamb", 21);
	   SalesAgent agent2 = new SalesAgent("Arthur Morgan", 34);
	   SalesSupervisor supervisor1 = new SalesSupervisor("Trevor Philips", 37, "Vancouver");
	   SalesChief chief1 = new SalesChief("Gordon Freeman", 44, "New York", "Alien Comms");
	   //2-  print all created objects
	   System.out.println(agent1.toString());
	   System.out.println(agent2.toString());
	   System.out.println(supervisor1.toString());
	   System.out.println(chief1.toString());
   }
}  