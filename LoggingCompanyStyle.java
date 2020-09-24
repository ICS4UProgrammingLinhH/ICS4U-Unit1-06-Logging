// Import scanner and math rounder
import java.lang.Math; 
import java.util.Scanner;

/**
* Class LoggingCompanyStyle
* The logging program calculates how many logs can fit into
* the truck by getting the length of the log.

* @author  Linh Ho
* @version 1.0
* @since   2020-09-15 
*/




public class LoggingCompanyStyle {
  
  /**
   * Required javadoc.
  */
  
  public static void main(String[] args) {
      
    // Allow the user to put an input 
    Scanner userInput = new Scanner(System.in);
      
    // declare variables
    double logLength;
    double logWeight;
    
    // Ask the user for the length of the log
    System.out.println("What is the length of the logs?");
    
    // Use the user's input and put into the variable
    logLength = userInput.nextDouble();
    
    // Calculate the weight of the logs 
    logWeight = logLength * 20;
    
    //Calculate the amount of logs that can fit into the truck 
    double logsCanFit = 1100 / logWeight;
    
    // Display the number of logs that can fit into the truck
    System.out.println(Math.round(logsCanFit) + " logs can fit on the truck.");
  }
}