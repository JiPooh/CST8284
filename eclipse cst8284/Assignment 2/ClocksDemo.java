/**
 * tests all the classes (Clock.java WorldClock.java and AlarmClock.java)
 * @author Jihoo Park
 *
 */
/*
 * file name: ClocksDemo.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: assignment 2
 * due date: Mar. 24th, 2023
 * purpose: to test my knowledge on inheritance and polymorphism
 * class list: Clock.java, WorldClock.java, AlarmClock.java, ClockDemo.java, WorldClockDemo.java, ClocksDemo.jav
 */
public class ClocksDemo {
		/**
		 * Method main which executes the program with sample values
		 * to test the classes Clock.java WorldClock.java and AlarmClock.java
		 * @param args command line arguments
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		WorldClock wclock = new WorldClock(3);
		AlarmClock aclock = new AlarmClock(12,30);
		
		Clock[] clocks = {clock, wclock, aclock};
		for(int i=0; i<clocks.length; i++) {
			System.out.println(clocks[i].getTime() + " //Class name: " + clocks[i].getClass().getSimpleName());
			
		}
	}

}
