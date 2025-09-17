package m3b;
import java.util.Scanner;
	/**@author Giovanni Castillo AIT502-11
	Module: Static Methods
	Assignment: M3B-21
	Program: 351 - Int Array Library
	*/
public class P351IntArrayLibrary {
	/**
	 * REQUIREMENTS:
	 * A library of methods to process an int array: int[].
	 * Methods include: reading the array with a scanner, printing the array to the standard console, computing min, max, sum and average.
	 */
	
	/**
	 * Read an array from a scanner in the following format: <br>
	 * Start with the number of elements in the array,
	 * followed by the list of elements,
	 * separated by spaces, and ends with an empty line. <br>
	 *
	 * @param scanner A Scanner with which we read the array
	 * @return the int array read from the scanner
	 */
	public static int[] read(Scanner scanner) {
	    int n = scanner.nextInt();
	    int[] array = new int[n];
	    for (int i = 0; i < n; i++) {
	        array[i] = scanner.nextInt();
	    }
	    return array;
	}
	
	
	public static void main(String[] args) {
		System.out.println("IntArrayLibrary by Giovanni Castillo due by 08/15/2025");
		
	}
		


		
	/**
	 * Print an array to standard console with the format:
	 * prefix firstElement firstSeparator secondElement middleSeparator ...
	 * lastSeparator lastElement suffix
	 * 
	 * Examples:
	 * Set: { 1, 2, 3 }
	 * The numbers are 1, 2, and 3.
	 * 1 2 3
	 *
	 * @param prefix Shown at the beginning of the elements
	 * @param firstSeparator Shown after the first element, if more  than 2 elements 
	 * are present, 
	 * @param middleSeparator - used if more than 4 elements, between elements 2-n-2.
	 * @param lastSeparator - used if more than 1 element, between elements n-1 and n
	 * @param suffix - shown at the end of the elements
	 */

		public static void print (int[] array, String prefix, String firstSeparator, String middleSeparator, 
				String lastSeparator, String suffix) {
			System.out.print(prefix);
		    String separator = "";
		    for (int i = 0; i < array.length; i++) {
		        System.out.print(separator);
		        System.out.print(array[i]);
		        if (i == 0) 
		            separator = firstSeparator;
		        else 
		            separator = middleSeparator;
		        if (i == array.length - 2) 
		            separator = lastSeparator;
		    }
		    System.out.print(suffix);
			
			
		}
		/**
		 * Compute the minimum value in an non empty array
		 * @param array a non empty int array
		 * @return the minimum value in the array (an int)
		 */
		public static int min(int[] array) {
		    int minValue = array[0];
		    for (int i = 1; i < array.length; i++) {
		        if (array[i] < minValue) {
		            minValue = array[i];
		        }
		    }
		    return minValue;
		}
		
		/**
		 * Compute the maximum value in an non empty array
		 * @param array a non empty int array
		 * @return the maximum value in the array (an int)
		 */
		public static int max(int[] array) {
		    int maxValue = array[0];
		    for (int i = 1; i < array.length; i++) {
		        if (array[i] > maxValue) {
		            maxValue = array[i];
		        }
		    }
		    return maxValue;
		}

		
		/**
		 * Compute the sum of values in an non empty array
		 * @param array a non empty int array
		 * @return the sum of values in the array (an int)
		 */
		public static int sum(int[] array) {
		    int sum = 0;
		    for (int i = 0; i < array.length; i++) {
		        sum += array[i];
		    }
		    return sum;
		}
		
		/**
		 * Compute the average of values in an non empty array
		 * @param array a non empty int array
		 * @return the average of the values in the array (a double)
		 */
		public static double average(int[] array) {
		    return 1.0 * sum(array) / array.length;
		}

		
		
}