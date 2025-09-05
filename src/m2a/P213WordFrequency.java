package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 213 Word Frequency
*/
public class P213WordFrequency {
/* Requirements: https://youtu.be/HPZ7LgaYwkE
 * Reads a text from a file, word by word. 
 * The end of the text is marked by "###END###". 
 * Trims the beginning and end symbols as needed. 
 * Count the number of words 
 * and count how many times the following words appear: the, a, an, and. 
 * Compute the frequency of these words in the text.*/
	public static void main(String[] args) {
		System.out.println("Word Frequency by Giovanni Castillo on 09/07/2025");
		//initialize the computations
		int countWords = 0;
		int countThe = 0;
		int countA =0;
		int countAn=0;
		int countAnd=0;
		//read the first word
		Scanner in = new Scanner(System.in);
		String token = in.next();
		//while is not the end of text word
			while (!token.equals("###END###")) {
				
			
			//prepare the word
			String word = token.toLowerCase();
			while (word.charAt(word.length()-1)=='.' || word.charAt(word.length()-1)==';' || word.charAt(word.length()-1)==',' ||
					word.charAt(word.length()-1)=='/' || word.charAt(word.length()-1)=='(' || word.charAt(word.length()-1)==')' ||
					word.charAt(word.length()-1)=='-') {
				word = word.substring(0,word.length()-1);
			}
			while (word.charAt(0)=='(') {
				word = word.substring(1);
			}
			
			//print the read token and the prepared word
			System.out.println("Token:    "+token + "------------    Word:     " + word);
			//process the word
			
			//read the next token
		token = in.next();
		}
			in.close();
		//compute frequency
		
		//print the result of computations 
	}

}
