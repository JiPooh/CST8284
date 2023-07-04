/* file name: DogHandler.java
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
 * a simple program which runs 4 try and catch block sets where
 * different types of exception are thrown but all are caught by Exception
 * @author Jihoo Park
 *
 */
public class DogHandler {
/**
 * the main method which would run the 4 try and catch block sets
 * @param args command line arguments
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * a class which inherits from Exception with
		 * empty body
		 */
		class ExceptionDog extends Exception{};
		/**
		 * a class which inherits from the first class (ExceptionDog)
		 * with an empty body
		 */
		class ExceptionPuppy extends ExceptionDog{};
		/**
		 * a try and catch block where an exception is thrown by ExceptionDog
		 * and caught by exception
		 */
		try {
			throw new ExceptionDog();
		} catch (Exception exception) {
			System.out.println("Exception Dog have been caught");
		}
		/**
		 * a try and catch block where an exception is thrown by ExceptionPuppy,
		 * which is the child of ExceptionDog, and caught by exception
		 */
		try {
			throw new ExceptionPuppy();
		} catch (Exception exception) {
			System.out.println("Exception Puppy have been caught");
		}
		/**
		 * a try and catch block where a null pointer exception is thrown by 
		 * NullPointerException and caught by exception
		 */
		try {
			throw new NullPointerException();
		} catch (Exception exception) {
			System.out.println("Exception Null Pointer have been caught");
		}
		/**
		 * a try and catch block where an IOException is thrown by IOException
		 * and caught by exception
		 */
		try {
			throw new IOException();
		} catch (Exception exception) {
			System.out.println("Exception System IO have been caught");
		}
	}

}
