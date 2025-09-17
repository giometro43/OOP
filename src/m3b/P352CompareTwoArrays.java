package m3b;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Libraries
Assignment: M3B-21
Program: 352 - Compare Two Arrays
*/
public class P352CompareTwoArrays {

	/**
	 * REQUIREMENTS:
	 * Read two arrays and compare: which one has the minimum value, 
	 * the maximum value, the greater sum, the greater average.
	 */
	public static void main(String[] args) {
		System.out.println("CompareTwoArrays by Giovanni Castillo due by 08/15/2025");
		Scanner scanner = new Scanner(System.in);
		// Read first array
		System.out.println("Enter the first array (size then elements):");
		int[] array1 = P351IntArrayLibrary.read(scanner);
		// Read second array
		System.out.println("Enter the second array (size then elements):");
		int[] array2 = P351IntArrayLibrary.read(scanner);
		// Print both arrays
		P351IntArrayLibrary.print(array1, "Array 1: ", " ", " ", " ", "\n");
		P351IntArrayLibrary.print(array2, "Array 2: ", " ", " ", " ", "\n");
		// Compare min values
		int min1 = P351IntArrayLibrary.min(array1);
		int min2 = P351IntArrayLibrary.min(array2);
		if (min1 < min2) {
			System.out.println("Array 1 has the minimum value: " + min1);
		} else if (min2 < min1) {
			System.out.println("Array 2 has the minimum value: " + min2);
		} else {
			System.out.println("Both arrays have the same minimum value: " + min1);
		}
		// Compare max values
		int max1 = P351IntArrayLibrary.max(array1);
		int max2 = P351IntArrayLibrary.max(array2);
		if (max1 > max2) {
			System.out.println("Array 1 has the maximum value: " + max1);
		} else if (max2 > max1) {
			System.out.println("Array 2 has the maximum value: " + max2);
		} else {
			System.out.println("Both arrays have the same maximum value: " + max1);
		}
		// Compare sums
		int sum1 = P351IntArrayLibrary.sum(array1);
		int sum2 = P351IntArrayLibrary.sum(array2);
		if (sum1 > sum2) {
			System.out.println("Array 1 has the greater sum: " + sum1);
		} else if (sum2 > sum1) {
			System.out.println("Array 2 has the greater sum: " + sum2);
		} else {
			System.out.println("Both arrays have the same sum: " + sum1);
		}
		// Compare averages
		double avg1 = P351IntArrayLibrary.average(array1);
		double avg2 = P351IntArrayLibrary.average(array2);
		if (avg1 > avg2) {
			System.out.println("Array 1 has the greater average: " + avg1);
		} else if (avg2 > avg1) {
			System.out.println("Array 2 has the greater average: " + avg2);
		} else {
			System.out.println("Both arrays have the same average: " + avg1);
		}
		scanner.close();
	}

}