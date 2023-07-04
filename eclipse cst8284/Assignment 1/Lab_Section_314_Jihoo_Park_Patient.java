package assignment1;
//23W CST8284
//Assignment 1: Patient.java

import java.time.LocalDate;
import java.time.Period;

//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
/**
 * Class that contains the constructor for the class Patient both with and without parameters 
 * and methods to retrieve patient information and calculate age, BMI, and min/max target heart rate
 * with the retrieved information of patient 
 * @author JiHoo Park
 *
 */
public class Patient {
//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

//START CODE
	/**
	 * First name of the patient
	 */
private String firstName;
/**
 * Last name of the patient
 */
private String lastName;
/**
 * Gender of the patient
 */
private String gender;
/**
 * Birth year of the patient
 */
private int birthYear;
/**
 * Birth month of the patient
 */
private int birthMonth;
/**
 * Birth date of the patient
 */
private int birthDay;
/**
 * Height of the patient in inches
 */
private double height;
/**
 * Weight of the patient in pounds
 */
private double weight;
//END CODE


// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
/**
 * Empty constructor of class Patient which sets the default values to be null or 0
 */
public Patient () {
	this(null, null, null, 0, 0, 0, 0.0, 0.0);
}
/**
 * Constructor with populated parameter which sets the parameter for the class Patient
 * @param firstName First name of the patient
 * @param lastName Last name of the patient
 * @param gender gender of the patient
 * @param birthYear birth year of the patient
 * @param birthMonth birth month of the patient
 * @param birthDay birth date of the patient
 * @param height height of the patient
 * @param weight weight of the patient
 */
public Patient(String firstName, String lastName, String gender, 
		int birthYear, int birthMonth, int birthDay, 
		double height, double weight){
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.birthYear = birthYear;
this.birthMonth = birthMonth;
this.birthDay = birthDay;
this.height = height;
this.weight = weight;
}
//END CODE



//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
/**
 * Getter method which returns the value of firstName
 * @return firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * Setter method which sets the firstName with the appropriate value
 * @param firstName First name of the patient
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * Getter method which returns the value for lastName
 * @return lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * Setter method which sets the lastName with the appropriate value
 * @param lastName Last name of the patient
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * Getter method which returns the value for gender
 * @return gender
 */
public String getGender() {
	return gender;
}
/**
 * Setter method which sets the gender with the appropriate value
 * @param gender Gender of the patient
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * Getter method which returns the value for birthYear
 * @return birthYear
 */
public int getBirthYear() {
	return birthYear;
}
/**
 * Setter method which sets the birthYear with the appropriate value
 * @param birthYear Birth year of the patient
 */
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
/**
 * Getter method which returns the value for birthMonth
 * @return birthMonth
 */
public int getBirthMonth() {
	return birthMonth;
}
/**
 * Setter method which sets the birthMonth with the appropriate value
 * @param birthMonth Birth month of the patient
 */
public void setBirthMonth(int birthMonth) {
	this.birthMonth = birthMonth;
}
/**
 * Getter method which returns the value for birthDay
 * @return birthDay
 */
public int getBirthDay() {
	return birthDay;
}/**
 * Setter method which sets the birthDay with the appropriate value
 * @param birthDay Birth day of the patient
 */
public void setBirthDay(int birthDay) {
	this.birthDay = birthDay;
}
/**
 * Getter method which returns the value for height in inches
 * @return height
 */
public double getHeight() {
	return height;
}
/**
 * Setter method which sets the height with the appropriate value
 * @param height height of the patient in inches
 */
public void setHeight(double height) {
	this.height = height;
}
/**
 * Getter method which returns the value for weight in pounds
 * @return weight
 */
public double getWeight() {
	return weight;
}
/**
 * Setter method which sets the weight with the appropriate value
 * @param weight weight of the patient in pounds
 */
public void setWeight(double weight) {
	this.weight = weight;
}
/**
 * Method which calculates the age of the patient by calculating the period between
 * current time and the DoB of the patient
 * @return age
 */
public int getAge() {
	LocalDate bDay = LocalDate.of(birthYear, birthMonth, birthDay);
	return Period.between(bDay, LocalDate.now()).getYears();
}
/**
 * Method which calculates the max heart rate of the patient by subtracting 220 by the age of the patient
 * @return maximumHeartRate
 */
public int getMaximumHeartRate() {
	return (220 - getAge());
}
/**
 * Method which calculates the max target heart rate of the patient by multiplying the maxHeartRate by 0.85
 * @return maxTargetHeartRate
 */
public double getMaximumTargetHeartRate() {
	return (getMaximumHeartRate()*0.85);
}
/**
 * Method which calculates the min target heart rate of the patient by dividing the maxHeartRate by half
 * @return minTargetHeartRate
 */
public double getMinimumTargetHeartRate() {
	return (getMaximumHeartRate()/2);
}

//THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
/**
 * Method which calculate the BMI of the patient by (weight*703)/(height^2)
 * @return BMI
 */
public double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight());
} 

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

/**
 * Method which generates the 'report' of the patient information
 * it prints out the first, last name
 * gender
 * birthday
 * age
 * height and weight
 * max heart rate
 * min/max target heart rate
 * BMI and a chart with the meaning of its values
 */
public void displayMyHealthData() {
	

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
   
// START CODE
	System.out.printf("-------Patient Information-------%n");
	System.out.println();
	System.out.printf("First Nmae: %s%n", firstName);
	System.out.printf("Last Nmae: %s%n", lastName);
	System.out.printf("Gender: %s%n", gender);
	System.out.printf("Birth date: %d %d %d%n", birthYear, birthMonth, birthDay);
	System.out.printf("Age: %d years%n", getAge());
	System.out.printf("Height: %.2f%n", height);
	System.out.printf("Weight: %.2f%n", weight);
	System.out.printf("Maximum heart rate: %d%n", getMaximumHeartRate());
	System.out.printf("Maximum target heart rate: %.2f%n", getMaximumTargetHeartRate());
	System.out.printf("Minimum target heart rate: %.2f%n", getMinimumTargetHeartRate());
	System.out.printf("BMI: %f%n", getBMI());
	
//END CODE
   
//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
   System.out.println();
} 

} // end class Patient



