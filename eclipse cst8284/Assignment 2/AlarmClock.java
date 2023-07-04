/**
 * a class that inherits from class Clock and sets up
 * an alarm which the program would remember and compare
 * with the current local time and display the amount of
 * time passed since the time set as alarm, if the local
 * time has passed the alarm time
 * @author Jihoo Park
 *
 */
/*
 * file name: AlarmClock.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: assignment 2
 * due date: Mar. 24th, 2023
 * purpose: to test my knowledge on inheritance and polymorphism
 * class list: Clock.java, WorldClock.java, AlarmClock.java, ClockDemo.java, WorldClockDemo.java, ClocksDemo.jav
 */
public class AlarmClock extends Clock {
	/**
	 * hour set for the alarm
	 */
	private int hours;
	/**
	 * minutes set for the alarm
	 */
	private int minutes;
	/**
	 * an empty constructor of AlarmClock
	 * to set the default alarm time
	 * to 0:0
	 */
	public AlarmClock(){
		this(0,0);
	}
	/**
	 * constructor of AlarmClock that sets the parameters
	 * @param hours hour of the alarm clock
	 * @param minutes minutes of the alarm clock
	 */
	public AlarmClock(int hours, int minutes){
		this.hours = hours;
		this.minutes = minutes;
	}
	/**
	 * the method that would format the alarm clock
	 * in to a proper form, 0-23 hours and 0-59 min
	 * @param hours hour of the alarm clock
	 * @param minutes minutes of the alarm clock
	 * @return alarm string value which indicates the time set for alarm
	 */
	public String setAlarm(int hours, int minutes){
		while(minutes >= 60) {
			minutes -= 60;
			hours++;
		}
		while(hours >= 24) {
			hours -= 24;
		}
		String alarm = hours + " : " + minutes;
		return alarm;
	}
	/**
	 * overriding the method originating from the parent
	 * class to fit the current class it returns the 
	 * time difference between the alarm time and 
	 * local time
	 */
	@Override
	protected String getTime() {
		int minPassed = 0;
		int hrsPassed = 0;
		if(hours <= Integer.parseInt(super.getHours())) {	
			int passedInMin = (hours*60+minutes)
			-((Integer.parseInt(super.getHours())*60)
					+Integer.parseInt(super.getMinutes()));
			minPassed = passedInMin%60;
			hrsPassed = (passedInMin - minPassed)/60;
		}else {
			System.out.println("Not time yet");
			
		}
		return "The alarm was set off " + Math.abs(hrsPassed) + " hours and " + Math.abs(minPassed) + " minutes ago";
	}
	
}
