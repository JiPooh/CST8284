package lab3package;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author JiHoo Park.
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {

	/**
	 * YOUR CODE STARTS HERE
	*/
		System.out.println("Event Schedule 1");
		EventSchedule instanceOne = new EventSchedule();
		System.out.println(instanceOne.createReport());

		System.out.println("Event Schedule 2");
		EventSchedule instanceTwo = new EventSchedule(2023);
		System.out.println(instanceTwo.createReport());

		System.out.println("Event Schedule 3");
		EventSchedule instanceThree = new EventSchedule(2023, 12);
		System.out.println(instanceThree.createReport());

		System.out.println("Event Schedule 4");
		EventSchedule instanceFour = new EventSchedule(2023, 12, 15);
		System.out.println(instanceFour.createReport());
		
	/**
	 * YOUR CODE ENDS HERE
	*/
	}

}
