/* file name: FishHandler2Unchecked.java
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
 * to demonstrate a rethrowing of Exception, but with unchecked exception
 * @author Jihoo Park
 *
 */
public class FishHandler2Unchecked {
	/**
	 * the first class method which throws the initial exception 
	 * but is unchecked by the method throwing "Throwable" instead of "Exception"
	 * @throws Throwable the initial exception thrown
	 */
	public static void easterEnding() throws Throwable{
		System.out.println("Easter Ending throws an exception");
		throw new Exception();
	}
	/**
	 * the secon class method which catches and rethrows the Throwable
	 * thrown by the first class method
	 * @throws Throwable initial Throwable thrown again
	 */
	public static void easterStarting() throws Throwable{
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
	 * @throws Throwable the rethrown throwable
	 */
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		/**
		 * a try and catch block where the second class method is tried,
		 * calling the first class method which throws the initial throwable 
		 * and catching it, then the rethrown throwable is caught once again
		 * by the main method's catch block
		 */
		try {
			easterStarting();
		} catch (Exception ee){
			System.out.println("Rethrown object caught in main method");
		}
	}

} //Throwable = unchecked. Means can catch Exceptions or Runtime Errors.