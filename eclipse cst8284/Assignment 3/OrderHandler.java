
/* file name: OrderHandler.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: Assignment 3
 * due date: April 9th , 2023
 * purpose: Practice and demonstrate the understanding of Exception
 * class list: CatHandler.java, DogHandler.java, FishHandler.java, FishHandler2Unchecked.java, OrderHandler.java
 */
/**
 * importing IOException
 */
import java.io.IOException;

/**
 * a program which runs a try and catch block in ordered fashion to demonstrate
 * how the arrangement of catch blocks can affect the out come
 * 
 * @author Jihoo Park
 */
public class OrderHandler {
	/**
	 * the main method which would run the try and catch blocks in specific order to
	 * demonstrate the affects
	 * 
	 * @param args command line arguements
	 * @throws Throwable the exception thrown by the try and catch blocks
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * first class which inherits from Exception
		 */
		class superclass extends Exception {
		}
		;
		/**
		 * second class which inherits from IOException
		 * 
		 * @author Jihoo Park
		 *
		 */
		class subclass extends IOException {
		}
		;

// what I assumed was being asked for in wrong order, gives compilation error

//		try {
//			throw new superclass();
//		} catch (superclass sup) {
//			System.out.println("Exception caught");
//		} catch (subclass sub) {
//			System.out.println("IOException caught");
//		} //error

// what I assumed was being asked for in the fixed order. Still gives the compilation error
		// why? I don't understand... maybe a fault in my code?

		try {
			throw new superclass();
		} catch (subclass sub) {
			System.out.println("IOException caught");
		} catch (superclass sup) {
			System.out.println("Exception caught");
		}

		/*		*//**
					 * the first try and catch block which throws and Exception and caught by
					 * Exception
					 */
		/*
		 * try { throw new superclass(); } catch (Exception sup1) {
		 * System.out.println("Exception thrown by superclass caught"); }
		 *//**
			 * the second try and catch block which throws and IOException and caught by
			 * Exception
			 *//*
				 * try { throw new subclass(); } catch (Exception sub2) {
				 * System.out.println("Exception thrown by subclass caught"); }
				 * 
				 * 
				 * // some thing I was playing around with // try { // throw new subclass(); //
				 * } catch (IOException sub1) { //
				 * System.out.println("IOException thrown by sublcass caught"); // } // // try {
				 * // throw new superclass(); // } catch (IOException sup2) { //
				 * System.out.println("IOException thrown by superclass caught"); // not really.
				 * // }
				 */
	}

}
