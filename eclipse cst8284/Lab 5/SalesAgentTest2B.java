package w23lab5;
/*  file name: SalesAgentTest2B.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */
/**
 * this program tests the SalesAgent class as well as its subclasses as directed in part b of the lab.
 * @author Jihoo Park
 */
public class SalesAgentTest2B {
	/**
	 * index number of the array that is to contain all the agents.
	 * maximum number of the agents requires to be 100, so the index number must be 99.
	 */
	private static final int MAX_NUMBER = 99;
	/**
	 * method main
	 * @param args command-line arguments for java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * a random number that will be used as number of agents
		 */
		int randoNum = 0;
		/**
		 * a while loop to randomly generate a number between 3 - 99 to be used as number of agents
		 * number of agent needs to be between 4 and 100, so min 3 and max 99 is selected to as index numbers
		 */
		while (randoNum < 3) {
			randoNum = (int) Math.round(MAX_NUMBER * (Math.random()));
		}
		/**
		 * a random number that will be used as age of each employees
		 */
		int randoAge;
		/**
		 * creating a new array of agents with randoNum as its index
		 */
		SalesAgent [] agentArr = new SalesAgent[randoNum];
		/**
		 * a for loop to populate the newly created array with new agents that has a while loop nested inside to choose 
		 * a random number between 18 and 40 to be used as age for each employee
		 * number between 18 and 40 was chose because I thought it a reasonable age group to be actively working
		 * in this imaginary company
		 */
		for(int count = 0; count < randoNum; count++) {
				randoAge = (int) Math.round(40 * (Math.random()));
				while(randoAge < 18) {
					randoAge = (int) Math.round(40 * (Math.random()));
				}
			agentArr[count] = new SalesAgent("name", randoAge);
		}
		/**
		 * a for loop to print out all the randomly generated agents 
		 */
		for (int printCount = 0; printCount < randoNum; printCount++){
			System.out.println(agentArr[printCount]);
		}
		System.out.println("number of agents: " + randoNum);
		System.out.println("Program by JiHoo Park");
	}

}
