package w23lab5;
/*  file name: SalesAgentTest2.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */
/**
   This program is the tests for the SalesAgent class including the subclasses.
   @author Jihoo Park
*/
public class SalesAgentTest2
{  
	//  Define here a maximum number of agents as a constant class variable.
	/**
	 * index number of the array that is to contain all the agents.
	 * maximum number of the agents requires to be 4, so the index number must be 3.
	 */
	 private static final int INDX = 3;
	 
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
	   SalesSupervisor agent3 = new SalesSupervisor("Trevor Philips", 37, "Vancouver");
	   SalesChief agent4 = new SalesChief("Gordon Freeman", 44, "New York", "Alien Comms");
	   SalesAgent [] agent = {
		agent1, agent2, agent3, agent4
	   };
	   //2-     in a loop, use Polymorphism to print all sales agents in the array
	   for(int count = 0; count <= INDX; count++) {
		   System.out.println(agent[count]);
	   }
		 // 
		 // Hint: when you call println() to print an object,
		 // the  toString() method of that object is called
   }
}  