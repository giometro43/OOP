package m3a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**@author Giovanni Castillo AIT502-11
Module: Static Methods
Assignment: M3A-21
Program: 311 - Grade Based Candy Distribution
*/
public class P311GradeBasedCandyDistribution {
	/** REQUIREMENTS:
	 * 
	 */
	public static Scanner defineScanner(String fileName) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			
		}catch (FileNotFoundException e) {
			System.out.println("File not found. Please check the file name and try again.");
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	/** 
	 * Read a list of grades with numberOfGrades elements from the scanner
	 * @param scanner- the scanner for the source of the grades
	 * @param numberOfGrades- the number of grades to read
	 * @return an array with the grades read
	 * */
	private static int [] readGrades(Scanner scanner, int numberOfGrades) {
		int [] grades = new int [numberOfGrades];
		for (int i = 0; i < numberOfGrades; i++) {
			grades[i] = scanner.nextInt();
		}
		return grades;
	}
	
	/**
	 * Print the standarc console the prefix dollowde on the same line
	 * by the elements of the array seperated by a space and go onto the next 
	 * line
	 * @param prefix  the prefix wto be printed before elements
	 * @param array the array that we print
	 */
	public static void printIntArray(String prefix, int [] array) {
		System.out.print(prefix);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	/**
	 * Compute the sum of the elements of an array
	 * @param array an array of integers
	 * @return the sum computed, an integer value
	 */
	public static int sumIntArray(int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	
	/**
	 * Compute the average of the elements of an array
	 * @param aarry an array of integers
	 * @return the avereage computed, a double value
	 */
	
	public static double averageIntArray(int [] array) {
		return 1.0 * sumIntArray(array) / array.length;
		
	}
	
	/**
	 * Implement the main steps
	 * @param args - not used
	 */
	public static void main(String[] args) {
        System.out.println("Grade Based Candy Distribution by Giovanni Castillo, due 09/15/2025");
        // read the name, the number of grades and the grades for the first child from john.txt	
        // in package m3a
        Scanner childScanner1 = defineScanner("/Users/giovannicastillo/OOP/src/m3a/PuaghtucketPat.txt");
        String child1Name = childScanner1.nextLine();
        int child1NumberOfGrades = childScanner1.nextInt();
        int [] child1Grades = readGrades(childScanner1, child1NumberOfGrades);
        childScanner1.close();
        
        	// print the grades for the first child
        	printIntArray(child1Name + "'s grades: ", child1Grades);
        
        Scanner childScanner2 = defineScanner("//Users/giovannicastillo/OOP/src/m3a/SourdoughSam.txt");
        String child2Name = childScanner2.nextLine();
        int child2NumberOfGrades = childScanner2.nextInt();
        int [] child2Grades = readGrades(childScanner2, child2NumberOfGrades);
        childScanner2.close();
              // print the grades for the second child
        	printIntArray(child2Name + "'s grades: ", child2Grades);
        	
        	//compute the average for the first child
        	double child1Average = averageIntArray(child1Grades);
        	System.out.printf("%s's average grade is: %.2f\n", child1Name, child1Average);
        	//compute the average for the second child
        	double child2Average = averageIntArray(child2Grades);
        	System.out.printf("%s's average grade is: %.2f\n", child2Name, child2Average);
        	
        	
        	// compare the averages and decide the winner of candies
        	if (child1Average > child2Average) {
				System.out.printf("%s has a higher average than %s, so %s gets 3 candies\n", child1Name, child2Name, child1Name);
				}else if (child2Average > child1Average) {
					System.out.printf("%s has a higher average than %s, so %s gets 3 candies\n", child2Name, child1Name, child2Name);
				}
				else {
					System.out.printf("Both %s and %s have the same average, so both get 3 candies\n", child1Name, child2Name);
				}
				
        	
	}

}














