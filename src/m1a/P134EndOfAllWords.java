package m1a;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module: predefined data types
Assignment: M1A-23
Program: 134 End of all words
*/

/**Requirements:
 * Read five words from the keyboard. 
 * Compute and print a new word with formed with 
 * the last letter in each of the read word.  
 */
public class P134EndOfAllWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("End of all words by Giovanni Castillo on 08/31/2025");

		
		System.out.println("Word 1:");
		String word1 = in.nextLine();
		System.out.println("Word 2:");
		String word2 = in.nextLine();
		System.out.println("Word 3:");
		String word3 = in.nextLine();
		System.out.println("Word 4:");
		String word4 = in.nextLine();
		
		String combinedWord = " "+ word1.charAt(word1.length()-1) + word2.charAt(word2.length()-1) + 
				word3.charAt(word3.length()-1) + word4.charAt(word4.length()-1);
		System.out.println("Combined word: " +combinedWord);

		
		
		
		
		
		
	}

}
