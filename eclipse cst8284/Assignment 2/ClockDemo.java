/**
 * Tests the Clock class.
 * @author Jihoo Park
 */
/*
 * file name: ClockDemo.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: assignment 2
 * due date: Mar. 24th, 2023
 * purpose: to test my knowledge on inheritance and polymorphism
 * class list: Clock.java, WorldClock.java, AlarmClock.java, ClockDemo.java, WorldClockDemo.java, ClocksDemo.jav
 */
public class ClockDemo
{
	/**
	 * Method main which executes the program with sample values
	 * to test class Clock.java
	 * @param args command line arguments
	 */
   public static void main(String[] args)
   {
      //test Clock
     System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
      System.out.println(clock.timeString.toString());
   }
}
