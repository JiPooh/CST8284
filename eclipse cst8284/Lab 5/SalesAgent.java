package w23lab5;
/*  file name: SalesAgent.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab05
 * due date: March 17th , 2023
 * purpose: Practice and demonstrate the use of polymorphism and inheritance
 * class list: SalesAgent.java, SalesSupervisor.java, SalesChief.java, SalesAgentTest.java, SalesAgentTest2.java, SalesAgentTest2B.java
 */


// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/**
   This class shows a Sales Agent with a name and age.
   @author Jihoo Park
*/
public class SalesAgent
{  
	/**
	 * name of the agent
	 */
   private String name;
   /**
    * age of the agent
    */
   private int age;

   /**
      In this portion of your code, construct a SalesAgent object.
      @param name the name of the Sales Agent
      @param age the age of the Sales Agent
   */
SalesAgent(String name, int age){
	this.name = name;
	this.age = age;
}

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */

   public String toString()
   {  
      return "Sales Agent [name= " + name + ", age= " + age + "]";
   }
}