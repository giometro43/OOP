package m2b;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 253 Production Analysis
*/
/** REQUIREMENTS:
 * Given a text file with the following content:
 * First, it contains the number of years analyzed.
 * Then, it contains the production (in thousands of units) per year.
 * For instance, the file production.txt contains car production in 36 previous years.
 * The name of the file is either provided as a command line argument or the user is asked for it.
 * Read, store and print in a table (5 values per row) the production values in an array.
 * Compute and print minimum, maximum, sum, average,
 * and count in how many years the production was over 10 million.
 */


public class P253ProductionAnalysis {
    public static void main(String[] args) {
        System.out.println("Production Analysis by Giovanni Castillo on 09/08/2025");
   
        //read the path and name of the file
        String filename = null;
        if (args.length >0) {
        	//filename is provided in the cl
        	filename = args[0];
        } else {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the path and name of the file: ");
			filename = keyboard.nextLine();
			keyboard.close();
		}
        System.out.println("Filename: " + filename);
        // read the file and store it in an array
        Scanner fileScanner = null;
        try {
        	fileScanner = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("ERROR -- File not found. ");
			return;
		}	
        
        int numberOfYears = fileScanner.nextInt();
        
        double[] productionQuantity = new double[numberOfYears];
        for (int i = 0; i < numberOfYears; i++) {
        	
        	productionQuantity[i] = fileScanner.nextDouble();
        }
        
        
        fileScanner.close();
        //print the values in a table
         System.out.printf("Production quantities for %d years:\n", numberOfYears);
         for(int i = 0; i <numberOfYears; i++) {
        	 System.out.printf("%12.2f", productionQuantity[i]);
        	 if (i%5==4) System.out.println();
         }
         
        //perform analysis
        
        // compute and print minimum,
        double minValue = productionQuantity[0];
        for (int i=1; i<numberOfYears; i++) {
			if (productionQuantity[i]< minValue) {
				minValue = productionQuantity[i];
			}
		}
        System.out.println();
        System.out.printf("%30s %12.2f\n", "Minimum Value:", minValue);
        // compute and print maximum,
        double maxValue = productionQuantity[0];
        for (int i=1; i<numberOfYears; i++) {
        	if (productionQuantity[i]> maxValue) {
        		maxValue = productionQuantity[i];
        	}
        }
        
        System.out.printf("%30s %12.2f\n", "Maximum Valuel:", maxValue);

        // compute and print sum, 
        double sum = 0;
        for (int i=0; i<numberOfYears; i++) {
        	sum += productionQuantity[i];
        }
        System.out.printf("%30s %12.2f\n", "Production total:", sum);
        //compute and print average
         double average = sum / numberOfYears;
         System.out.printf("%30s %12.2f\n", "Average production:", average);
         
        // count and print in how many years the production was over 10 million.
         
         int countHighProduction = 0;
         for (int i=0; i < numberOfYears; i++) {
			 if (productionQuantity[i] > 10000) countHighProduction++;
							 
		 }
         System.out.printf("%30s %9d\n", "High Production years: ", countHighProduction);
    }
}
