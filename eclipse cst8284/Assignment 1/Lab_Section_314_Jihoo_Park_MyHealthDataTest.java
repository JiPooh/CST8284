package assignment1;
/**
 * Driver class of this program which at the moment is populated with sample values 
 * @author JiHoo Park
 *
 */
public class MyHealthDataTest {
	/**
	 * Method main which executes the program with sample values
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patientOne = new Patient("JiHoo", "Park", "Male", 1995, 7, 14, 70.08, 198.42);
		Patient patientTwo = new Patient("Eleanor", "Park", "Female", 2021, 11, 25, 30.32, 33.06);
		
		patientOne.displayMyHealthData();
		patientTwo.displayMyHealthData();
	}

}
