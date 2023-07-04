package lab1;
import java.util.Scanner;
/**
 * class that contains method main for program that receives and displays user information
 * @author JiHoo Park
 *
 */
public class Driver {
/*
 * file name: Driver.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab01
 * lab prof: George Krieger
 * due date: Jan 27th, 2023
 * purpose: to learn the basics of javadoc
 * class list: Driver.java, Username.java
 */

/**
 * @param args method main
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * initializing instance of Username
 * @see Username.java
 */
Username userName = new Username();
String userFirstName;
String userLastName;
long studentNum;
Scanner userInput = new Scanner(System.in);
/**
 * displays a request for user first name
 */
System.out.println("Please enter your first name");
/**
 * scans input of user for first name
 */
userFirstName = userInput.next();
/**
 * getter method for first name from Username.java
 */
userName.getUserFirstName();
/**
 * setter method for first name from Username.java
 */
userName.setUserFirstName(userFirstName);
userInput.nextLine();// cleans up the input line
/**
 * displays the request for user last name
 */
System.out.println("Please enter your last name");
/**
 * scans input of user for last name
 */
userLastName = userInput.next();
/**
 * getter method for last name from Username.java
 */
userName.getUserLastName();
/**
 * setter method for last name from Username.java
 */
userName.setUserLastName(userLastName);
userInput.nextLine();// cleans up the input line
/**
 * displays the request for user student id
 */
System.out.println("Please enter your student ID number");
/**
 * scans input of user for student id
 */
studentNum = userInput.nextLong();
/**
 * getter method for student id from Username.java
 */
userName.getStudentNum();
/**
 * setter method for student id from Username.java
 */
userName.setStudentNum(studentNum);
userInput.nextLine();// clean up the input line

userInput.close();// close scanner to prevent resource leak

System.out.println("Full name: " + userFirstName + " " + userLastName);// displays user's full name
System.out.println("Student ID number: " + studentNum);// displays user's student id
System.out.println("Program by JiHoo Park");// displays programmer name
	}
}
