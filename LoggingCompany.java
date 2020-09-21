/**
 * Class LoggingCompany
* The logging program calculates how many logs can fit into
* the truck by getting the length of the log.
*
* @author  Linh Ho
* @version 1.0
* @since   2020-09-15 
*/
 
// Import scanner and math rounder
import java.util.Scanner;
import java.lang.Math; 
	
public class LoggingCompany {
	public static void main(String[] args) {
		
		// declare variables 
		Double logLength, logWeight, logsCanFit;
		
		// Allow the user to put an input
		Scanner userInput = new Scanner(System.in);
		
		// Ask the length of the log from user
		System.out.println("What is the length of the logs?");
		
		// Put user's input into a variable
		logLength = userInput.nextDouble();
		
		// Calculate the weight of the logs
		logWeight = logLength * 20;
		
		// Calculate the amount of logs that can fit into the truck
		logsCanFit = 1100/logWeight;
		
		// Show the number of logs that can fit into the truck
		System.out.println(Math.round(logsCanFit) + " logs can fit on the truck.");
	}
}