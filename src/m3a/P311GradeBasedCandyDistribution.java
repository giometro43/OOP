package m3a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**@author Giovanni Castillo AIT502-11
Module: Static Methods
Assignment:
Program: 
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
	/*
	 * Implement the main steps
	 * @param args - not used
	 */
	public static void main(String[] args) {
        System.out.println("Grade Based Candy Distribution by Giovanni Castillo, due 09/15/2025");
        // read the name, the number of grades and the grades for the first child from john.txt	
        // in package m3a
        Scanner childScanner1 = defineScanner("C:\\Users\\gcastillo\\git\\OOP\\src\\m3a\\john.txt");
        String child1Name = childScanner1.nextLine();
        int child1NumberOfGrades = childScanner1.nextInt();
        int [] child1Grades = readGrades(childScanner1, child1NumberOfGrades);
        childScanner1.close();
        
        Scanner childScanner2 = defineScanner("C:\\Users\\gcastillo\\git\\OOP\\src\\m3a\\dannyBoi.txt");
        String child2Name = childScanner2.nextLine();
        int child2NumberOfGrades = childScanner2.nextInt();
        int [] child2Grades = readGrades(childScanner2, child2NumberOfGrades);
        childScanner2.close();
              
	}

}