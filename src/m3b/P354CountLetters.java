package m3b;

import java.util.Scanner;
import java.io.File;
/**@author Giovanni Castillo AIT502-11
Module: Libraries
Assignment: M3B-21
Program: 354 - Count Letters
*/
public class P354CountLetters {
	/**
	 * REQUIREMENTS:
	 * Count the lower case letters in a provided text from a file.
	 * HINT: 
	 * Reuse the CharacterCounter library from the previous assignment
	 * To read from a text file reuse the same strategy as in the program 
	 * Create a text file text.txt in which copy a text from an internet 
	 * page Add a end  line with a conventional  value (e.g.  ###END###)
	 * Create a scanner for the file text.txt
	 * read the next line,  while is different from the end line, 
	 * process the line  and read the next line.
	 * To process the data (count the lower case letters)
	 * Create a counted set string containing all the lower case letters 
	 * (before the read loop) (a String with all lower case letters)
	 * Define a counter array (before the read loop) 
	 * (call CharacterCount.define for the counted set above)
	 * In  the read loop, call the CharacterCount.update() method to process current  line
	 * After the end of the reading loop, print the counter.*/
	public static void main(String[] args) {
		System.out.println("CountLetters by Giovanni Castillo due by 08/15/2025");
		// Define the set of lowercase letters
		String countedSet = "abcdefghijklmnopqrstuvwxyz";
		// Define the counter array
		int[] counter = P353CharacterCounter.defineCounter(countedSet);
		try {
			Scanner scanner = new Scanner(new File("/Users/giovannicastillo/OOP/src/m3b/text.txt"));
			String line = scanner.nextLine();
			while (!line.equals("###END###")) {
				P353CharacterCounter.update(countedSet, counter, line);
				line = scanner.nextLine();
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		// Print the counter
		P353CharacterCounter.print("Counter: ", countedSet, counter);
	}

}