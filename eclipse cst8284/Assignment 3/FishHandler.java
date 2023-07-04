/* file name: FishHandler.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: Assignment 3
 * due date: April 9th , 2023
 * purpose: Practice and demonstrate the understanding of Exception
 * class list: CatHandler.java, DogHandler.java, FishHandler.java, FishHandler2Unchecked.java, OrderHandler.java
 */
/**
 * a program which runs a try and catch block within a try and catch block
 * to demonstrate a rethrowing of Exception
 * @author Jihoo Park
 *
 */
public class FishHandler {
	/**
	 * first class method which throws an exception
	 * @throws Exception exception thrown initially
	 */
	public static void easterEnding() throws Exception{
		System.out.println("Easter Ending throws an exception");
		throw new Exception();
	}
	/**
	 * second class method which catches and rethrows the first exception
	 * @throws Exception initial exception thrown again
	 */
	public static void easterStarting() throws Exception{
		try {
			easterEnding();
		} catch (Exception ee) {
			System.out.println("Easter Starting catches an exception thrown by easterEnding");
			throw ee;
		}
	}
	/**
	 * the main method which runs the chained try and catch blocks
	 * @param args command line arguments
	 * @throws Exception the rethrown exception
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/**
		 * a try and catch block where the second class method is tried,
		 * calling the first class method which throws the initial exception 
		 * and catching it, then the rethrown exception is caught once again
		 * by the main method's catch block
		 */
		try {
			easterStarting();
		} catch (Exception ee){
			System.out.println("Rethrown object caught in main method");
		}
	}

} // Exception = checked. Means exceptions checked at compile, and never catch runtime errors