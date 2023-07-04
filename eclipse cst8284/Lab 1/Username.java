package lab1;
/*
 * file name: Username.java
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
 * class that contains the worker methods
 * @author JiHoo Park
 *
 */

public class Username {
	/**
	 * declaration of variable for first name of user
	 */
	private String userFirstName;
	/**
 	* declaration of variable for last name of user
 	*/
	private String userLastName;
	/**
	 * declaration of variable for student id of user
	 */
	private long studentNum;

/**
 * blank constructor to give empty default value
 */
public Username() {
	this(null,null,0);
	}
/**
 * constructor with argument to set its parameter
 * @param userFirstName first name of the user
 * @param userLastName last name of the user
 * @param studentNum student number of the user
 */
public Username(String userFirstName, String userLastName, long studentNum) {
	this.userFirstName = userFirstName;
	this.userLastName = userLastName;
	this.studentNum = studentNum;
	}

/**
 * the getter method for first name of the user
 * @return userFirstName first name of user
 */
public String getUserFirstName() {
	return userFirstName;
}
/**
 * the setter method for the first name of the user
 * @param userFirstName first name of user
 */
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}

/**
 * the getter method for the last name of the user
 * @return userLastName last name of user
 */
public String getUserLastName() {
	return userLastName;
}
/**
 * the setter method for the last name of the user
 * @param userLastName last name of user
 */
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}

/**
 * the getter method for the student id of the user
 * @return studentNum student number of the user
 */
public long getStudentNum() {
	return studentNum;
}
/**
 * the setter method for the student id of the user
 * @param studentNum student number of user
 */
public void setStudentNum(long studentNum) {
	this.studentNum = studentNum;
}


}
