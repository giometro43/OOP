package m2b;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 252 Random Full Names
*/
/** REQUIREMENTS:
 * Create two files, one with 10 last names and one with 10 first names.
 * Read the two files in two different arrays.
 * Generate full names by picking a random first name and a random last name.
 * Ask the user how many full names to generate.
 */

/* HINTS:
 * 1a. Create a file named firstnames.txt containing 10 first names, one per line, and end the file with an empty line.
1b. Create a file named lastnames.txt containing 10 last names, one per line, and end the file with an empty line.
2a. Similar with program 611 read the first names in an array of 10 Strings from the first names file
2b. Similar with the first names read the last names in an array of 10 Strings from the last names file
3a. Print the list of first names separated by a space (similar with the print in the program 611)
3b. Print the list of last names separated by a space (similar with the print in the program 611)
4a. Ask the user how many full names to generate
4b. Declare an array of full names for the desired size
5a. For the desired number of full names repeat the steps:
6a. Generate a random number from 0 to 9 (inclusive) to represent the index of the first name
6b. Generate a random number from 0 to 9 (inclusive) to represent the index of the last name
6c. Initialize the full name as the first name followed by a space followed by the last name
7a. Print the full names, one per line and with their number (ex: 1. John Doe), from 1 to the desired number of full names
 */
public class P252RandomFullNames {
    public static void main(String[] args) {
        System.out.println("Random Full Names by Giovanni Castillo on 09/07/2025");
        // intro to arrays, which will be used to store the names
        Scanner scannerFirst = null;
        Scanner scannerLast = null;
        try {
        				scannerFirst = new Scanner(new File("/Users/giovannicastillo/OOP/src/m2b/firstNames.txt"));
			scannerLast = new Scanner(new File("/Users/giovannicastillo/OOP/src/m2b/lastNames.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // Print the stack trace for debugging
			System.out.println("File not found. ");
			return;
			
        }
        //declare and initialize the array
        //read the list with all the
        String[] firstNames = new String[10];//size of 10, and declare array type as string
        String[] lastNames = new String[10];//size of 10, and declare array
        for (int i = 0; i < 10; i++) {
			firstNames[i] = scannerFirst.next();
			lastNames[i] = scannerLast.next();
		}
        //Print the names separated by a space
		System.out.println("All the first names are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(firstNames[i] + " ");
			
		}
		System.out.println();
		System.out.println("All the last names are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(lastNames[i] + " ");
			
		}
		System.out.println();
		//read the number of full names to generate
		Scanner in = new Scanner(System.in); //second scanner defined for the user keyboard input
		int numberOfFullNames = 0;
		boolean error = false;
		do {
			System.out.print("Provide number of full names to generate: ");
			numberOfFullNames = in.nextInt();
			error = numberOfFullNames < 1; // if number of full names is less than 1 throw error
			if (error)
				System.out.println("ERROR: the number of full names must be at least one.");
		}
		while (error);
		// generate and print the full names
		Random random = new Random();
		for (int fullNameNumber = 1; fullNameNumber <= numberOfFullNames
				; fullNameNumber++) {
			int firstNameIndex = random.nextInt(10); // generates a random number from 0 to 9
			int lastNameIndex = random.nextInt(10); // generates a random number from 0 to 9
			System.out.println(fullNameNumber + ". " + firstNames[firstNameIndex] + " " + lastNames[lastNameIndex]);
			
		}
				in.close();
		scannerFirst.close();
		scannerLast.close();		
    }
}
