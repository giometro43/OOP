/**
 * REQUIREMENTS:
 * Test the int array library methods for reading, printing, min, max, sum, and average.
 */
package m3b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Libraries
Assignment: M3B-21
Program: 351 - Int Array Library Test
*/
public class P351IntArrayLibraryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("IntArrayLibraryTest by Giovanni Castillo due by 08/15/2025");
	
		// read an array
		 Scanner scanner;
	        try {
	            scanner = new Scanner(new File("/Users/giovannicastillo/OOP/src/m3b/array-01.txt"));
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: Cannot define the scanner.");
	            return;
	        }

	        int[] array01 = P351IntArrayLibrary.read(scanner);
	        scanner.close();
		

		// print the array 
	    //set : { 1, 2, 3 }
	    P351IntArrayLibrary.print(array01, "Set: { ", ", ", ", ", " }", "\n");
	    // the numners are 1, 2, and 3.
	    P351IntArrayLibrary.print(array01, "The numbers are ", ", ", ", ", " and ", ".\n");
	    // 1 2 3
	    P351IntArrayLibrary.print(array01, "", " ", " ", " ", "\n");
	    
	    
		// compute and print the minimum value
	    System.out.println("The Minimum value is: " + P351IntArrayLibrary.min(array01));
	    
	    

		// compute and print the maximum value
	    System.out.println("The Maximum value is: " + P351IntArrayLibrary.max(array01));

		// compute and print the sum of the values
	    System.out.println("The Sum is: " + P351IntArrayLibrary.sum(array01));
		// compute and print the average of the values
	    System.out.println("The Average is: " + P351IntArrayLibrary.average(array01));
	}

}