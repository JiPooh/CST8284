/*
 * file name: CovidStatisitcs.java
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab02
 * lab prof: George Krieger
 * due date: Jan 27th, 2023
 * purpose: Practice and demonstrate the use of arrays and debugger
 * class list: CovidStatistics.java
 */

/** program to display the number of covid patients of each specified province in each specified month
 * also prints number of recovered patients and the largest number of patient counts of a month in 
 * each province
* @author - various - JiHoo Park
* 
*/

public class CovidStatistics
{
	/**
	 * 
	 * @param args method main
	 */
public static void main(String[] args)
 {
	/**
	 * declaring the rows and columns of the patient arrays as constants to avoid any errors or mistakes
	 * down the road
	 */
   final int ROWS = 7;
   final int COLUMNS = 8;
   /**
    * 2d array that contains the number of patients, rows for each province and columns as each month
    */
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	 {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };
   /**
    * simple array that contains the name of each provinces
    */
   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   /**
    * displays each months that represents each columns of patient array
    * -- edit --
    * adjusted spacing for better placement and added 'maximum' after the months for part B of the lab
    */
   System.out.println("                 Month   Feb    March    April   May     June    July    Aug     Sept    Maximum");
   System.out.println();

   /** a nested for-loop to print out all the required values
   * the outer for-loop prints out the names of the province after padding while the inner for-loop
   * prints out the numbers of patients from the same row number as the province.
   * -- edit --
   * added an if statement in the inner for-loop to compare and save the largest number
   * and made the printf after the inner for-loop ends print out the greatest number saved.
   * the greatest number then resets as soon as the outer for-loop starts
   */
   
   for(int countR = 0; countR < ROWS; countR++) {
	   int maximus = 0;
	   System.out.printf("%22s   ", provinces[countR]);
	   for(int countC = 0; countC < COLUMNS; countC++) {
		   System.out.printf("%d    ", patients[countR][countC]);
		   if(maximus < patients[countR][countC]) {
			   maximus = patients[countR][countC];
		   }
		   
	   }
	   System.out.printf("%d%n", maximus);
	  

   }
   /** the nested for-loop to print out the number of "recovered patients" which is the sum of the columns
   * the outer for-loop keeps the inner for-loops to stay in a column each loop, while the inner for-loop
   * goes through the rows of each columns and calculates the sum. after the inner for-loop ends, calculated sum
   * is printed before starting a new outer for-loop
   */ 
   System.out.println();
   System.out.print("    Recovered Patients");


   for(int countC = 0; countC < COLUMNS; countC++) {
	   	int sums = 0;
	   	for(int countR = 0; countR < ROWS; countR++) {
	   		sums += patients[countR][countC];
	   	}
	  		System.out.printf(String.format("   %5d", sums));
	   }
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
   System.out.print("                         Program by JiHoo Park"); // prints the name of the student
}
}




   
   
   
   
   





