/* file name: CatHandler.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: Assignment 3
 * due date: April 9th , 2023
 * purpose: Practice and demonstrate the understanding of Exception
 * class list: CatHandler.java, DogHandler.java, FishHandler.java, FishHandler2Unchecked.java, OrderHandler.java
 */
/**
 * a simple program which runs two try and catch sets where the three exceptions thrown
 * are related by inheritance
 * @author Jihoo Park
 *
 */
public class CatHandler {

	/**
	 * the main method which would execute the pair of try and catch sets
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * the first exception which inherits from the class Exception
		 * with empty body
		 */
		class ExceptionAlpha extends Exception{};
		/**
		 * the second exception which inherits from the first exception (Alpha)
		 * with empty body
		 */
		class ExceptionBeta extends ExceptionAlpha{};
		/**
		 * the last exception which inherits from the second exception (Beta)
		 * with empty body
		 */
		class ExceptionGamma extends ExceptionBeta{};

		/**
		 * a try and catch block where an exception is thrown from Gamma,
		 * the lowest hierarchy exception, and caught by Alpha, the grandpa exception
		 */
		try {
			throw new ExceptionGamma();
		} catch (ExceptionAlpha alpha2) {
			System.out.println("Exception Gamma have been caught");
		}
		/**
		 * a try and catch block where an exception is thrown from Beta,
		 * the middle hierarchy exception, and caught by Alpha, the highest
		 * hierarchy exception
		 */
		try {
			throw new ExceptionBeta();
		} catch (ExceptionAlpha alpha1){
			System.out.println("Exception Beta have been caught");
		}
		

	}

}
