/**
 * a class that inherits from the class Clock and
 * displays the time that has been affected by the
 * offset as if time zone have
 * @author Jihoo Park
 *
 */
/*
 * file name: WorldClock.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: assignment 2
 * due date: Mar. 24th, 2023
 * purpose: to test my knowledge on inheritance and polymorphism
 * class list: Clock.java, WorldClock.java, AlarmClock.java, ClockDemo.java, WorldClockDemo.java, ClocksDemo.jav
 */
public class WorldClock extends Clock{
	/**
	 * difference in time
	 */
	private double offset;
	/**
	 * an empty constructor to set the default value
	 * of offset to 0.0
	 */
	public WorldClock() {
		this(0.0);
	}
	/**
	 * a constructor with parameter of offset and some algorithm to
	 * determine if the offset is valid
	 * @param offset difference in time compared to the local time
	 */
	public WorldClock(double offset){
		this.offset = offset;
		/**
		 * converts the offset value to string for extraction of
		 * hours
		 */
		String offsetString = String.valueOf(offset);
		/**
		 * extracting of hours portion of the offset using substring
		 * then converted to int
		 */
		int offsetHrs = Integer.parseInt(offsetString.substring(0, offsetString.indexOf(".")));
		/**
		 * extracting of minutes portion of the offset by subtracting the hours from the whole
		 * offset
		 */
		double offsetMntsDbl = offset - offsetHrs;
		/**
		 * value to check if the minutes portion is valid (tenth of decimal)
		 * using modular division of 0.1. if the value is 0, then the minutes are
		 * properly inputed as a tenth of a decimal. because of the error java has with
		 * some float value, +-0.1 is also accepted because a hundredth modular 0.1 
		 * should never give these value.
		 */
		double offsetMntchkr = Double.parseDouble(String.format("%.2f",offsetMntsDbl%0.1));
		/**
		 * an if statement to determine if the offset minute portion is within acceptable range.
		 */
		if(offsetMntchkr == 0 || offsetMntchkr == 0.1 || offsetMntchkr == -0.1) {
			/**
			 * offset minute portion is acceptable, to the tenth of the fraction is converted to
			 * integer for further use
			 */
			int offsetMnts = (int)(offsetMntsDbl * 10);
			this.offsetHrs = offsetHrs;
			this.offsetMnts = offsetMnts;
			/**
			 * offset minute portion is not in a tenth form, the program exits
			 */
		}else {
		System.out.println("Invalid Value, please try again.");
		System.exit(0);
		}
	}
	/**
	 * offset hours portion
	 */
	int offsetHrs;
	/**
	 * offset minutes portion
	 */
	int offsetMnts;
	/**
	 * current local time, hours portion
	 */
	int currHrs = Integer.parseInt(super.getHours());
	/**
	 * current local time, minutes portion
	 */
	int currMnts = Integer.parseInt(super.getMinutes());

	/**
	 * overriding the method originating from the parent
	 * class to fit the current class to get new hours
	 * affected by the offset value
	 */
	@Override
	protected String getHours(){
		return String.valueOf(currHrs + offsetHrs);
	}
	/**
	 * overriding the method originating from the parent
	 * class to fit the current class to get new minutes
	 * affected by the offset value
	 */
	@Override
	protected String getMinutes(){
		int offsetMntsAct = offsetMnts * 6;
		return String.valueOf(currMnts + offsetMntsAct);
	}
	/**
	 * overriding the method originating from the parent
	 * class to fit the current class to get new time
	 * affected by the offset value
	 * if the minutes are negative or exceeds 59 minute range, converts to appropriate
	 * positive minutes
	 * if the hours are negative or exceeds 23 hour range, converts to appropriate
	 * positive hour
	 * returns the new time affected by the offset value
	 */
	@Override
	protected String getTime() {
		int minutesEnd = Integer.parseInt(getMinutes());
		int hrsEnd = Integer.parseInt(getHours());
		if(minutesEnd<0) {
			while(minutesEnd<0) {
				minutesEnd += 60;
				hrsEnd--;
			}
		}else {
			while(minutesEnd>=60) {
				minutesEnd -= 60;
				hrsEnd++;
			}}
		if(hrsEnd<0) {
			while(hrsEnd<0) {
				hrsEnd += 24;
			}
		}else {
			while(hrsEnd>=24) {
				hrsEnd -= 24;
			}
	}
		return hrsEnd + " : " + minutesEnd;}
}

