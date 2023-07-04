package lab1;
import java.util.Scanner;
/**
 * class that contains the main method for program that creates user ID and displays it
 * @author JiHoo Park
 *
 */
public class userID {
	/*
	 * file name: userID.java
	 * student name: JiHoo Park
	 * student number: 041081334
	 * Course: CST8284 314
	 * assignment: lab01/week2
	 * lab prof: George Krieger
	 * due date: Jan 27th, 2023
	 * purpose: to create a program that follows the algorithm
	 * class list: userID.java, Username.java
	 */
/**
 * 
 * @param args method main
 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/**
 * initializing an instance of class Username
 */
Username username = new Username();
Scanner input = new Scanner(System.in);
String firstN;
String lastN;
String firstID;
String midID;
long studentID;
/**
 * request user's first name
 */
System.out.println("please enter your first name:");
/**
 * receives user input as first name
 */
firstN = input.next();
/**
 * getter method for user first name
 */
username.getUserFirstName();
/**
 * setter method for user first name
 */
username.setUserFirstName(firstN);
input.nextLine();// clears input line
/**
 * request user's last name
 */
System.out.println("please enter your last name:");
/**
 * receives user input as last name
 */
lastN = input.next();
/**
 * getter method for user last name
 */
username.getUserLastName();
/**
 * setter method for user last name
 */
username.setUserLastName(lastN);
input.nextLine();// clears input line
/**
 * request user's student id #
 */
System.out.println("please enter your student ID number:");
/**
 * receives user input as student id
 */
studentID = input.nextLong();
/**
 * getter method for user student number
 */
username.getStudentNum();
/**
 * setter method for user student number
 */
username.setStudentNum(studentID);
input.nextLine();//clears input line
input.close();// close scanner to prevent resource leak

/**
 * an if statement just in case user last name is shorter than 4 characters
 * a method to format the last name of the user to extract the first 4 characters and sets to lower case
 * to be used as the first part of the user ID
 */
if(lastN.length() > 4) {
firstID = lastN.substring(0,4).toLowerCase();
} else {
	firstID = lastN.toLowerCase();
	}
/**
 * an if statement just in case user first name is shorter than 3 characters
 * a method to format the first name of the user to extract the first 3 characters and sets to lower case
 * to be used as the middle part of the user ID
 */
if(firstN.length() > 3) {
midID = firstN.substring(0,3).toLowerCase();
} else {
	midID = firstN.toLowerCase();
}
/**
 * student id is 9 digits that starts with a 0, so 8 saved digits
 * a method to format the student id number as String data type and extract the last 3 digits to 
 * be used as the final part of the user ID
 */
String finID = String.format("%d",studentID).substring(5,8);
/**
 * creating the user ID with the newly formatted values of first middle and last part of the ID
 */
String userID = firstID + midID + finID;
/**
 * prints the user ID
 */
System.out.printf("Your user ID is: " + userID + "%n");
/**
 * prints the programmer name
 */
System.out.println("Program by JiHoo Park");
	}

}
