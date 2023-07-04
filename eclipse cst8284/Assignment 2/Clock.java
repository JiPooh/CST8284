import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/*
 * file name: Clock.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: assignment 2
 * due date: Mar. 24th, 2023
 * purpose: to test my knowledge on inheritance and polymorphism
 * class list: Clock.java, WorldClock.java, AlarmClock.java, ClockDemo.java, WorldClockDemo.java, ClocksDemo.jav
 */
/**
 * a class that contains the method to extract the local hours
 * and minutes and put them together to print out the current
 * local time
 * @author Jihoo Park
 *
 */
public class Clock
{
	/**
	 * a string of code provided by the professor to retrieve
	 * current local date and time
	 */
	String timeString = LocalDateTime.ofInstant(Instant.now(),
            ZoneId.systemDefault()).toString();
   // Your work goes here
	/**
	 * a method to extract the current hour from the
	 * timeString
	 * @return current local hour
	 */
	protected String getHours(){
		return timeString.substring(11, 13);
	}
	/**
	 * a method to extract the current minute from the
	 * timeString
	 * @return current local minute
	 */
	protected String getMinutes(){
	   return timeString.substring(14, 16);
	}
	/**
	 * a method to put together the local
	 * hour and minute to display the current time
	 * @return current local time
	 */
	protected String getTime(){
	   return getHours() + " : " + getMinutes();
	}










}
