/**
 * REQUIREMENTS:
 * Count the digits in a provided text from a file.
 */
package m3b;

import java.util.Scanner;
import java.io.File;

/**
 * 
 */
public class P355CountDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("CountDigits by Giovanni Castillo due by 08/15/2025");
		// Define the set of digits
		String countedSet = "0123456789";
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