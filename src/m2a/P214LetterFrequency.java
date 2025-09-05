package m2a;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 214 Letter Frequency
*/
public class P214LetterFrequency {
/* Requirements: Reads a text from a file, word by word. 
 * The end of the text is marked by "###END###". 
 * Compute the frequency of each vowel: a, e, i, o, u in the text, 
 * with respect to all the letters in the text.*/
	public static void main(String[] args) {
		System.out.println("Letter Frequency by Giovanni Castillo on 09/07/2025");
		
		//initialize the computations &&& Make changes to the countLetters variable 
		//since we are counting letters now
		char letter = ' ';
		int countLetters = 0;
		int countThe = 0;
		int countA =0;
		int countE =0;
		int countI =0;
		int countO =0;
		int countU =0;

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
			for (int i = 0; i < word.length(); i++) {
			    letter = word.charAt(i);
			    
			    if (Character.isLetter(letter)) {
			        countLetters++;
			        switch (letter) {
			            case 'a': countA++; break;
			            case 'e': countE++; break;
			            case 'i': countI++; break;
			            case 'o': countO++; break;
			            case 'u': countU++; break;

			        }
					System.out.println("Token:    "+token + "------------    Letter:     " + letter);

			    }
			}

			//read the next to
			token = in.next();
		}
			
			in.close();
		
			//compute frequency by converting to double for countThe, since we will get word otherwise
			//the current format of the dividend is integer. use 100.0 to get percentage
		double freqA = 100.0 * countA / (double)countLetters;
		double freqE = 100.0 * countE / (double)countLetters;
		double freqI = 100.0 * countI / (double)countLetters;
		double freqO = 100.0 * countO / (double)countLetters;
		double freqU = 100.0 * countU / (double)countLetters;

		
		//print the result of computations
			System.out.println("Total words: " + countLetters);
			System.out.println("Number of \"a\": " + countA);
			System.out.println("Number of \"e\": " + countE);
			System.out.println("Number of \"i\": " + countI);
			System.out.println("Number of \"o\": " + countO);
			System.out.println("Number of \"u\": " + countU);

			System.out.println("Frequency of of \"a\": " + freqA);
			System.out.println("Frequency of of \"e\": " + freqE);
			System.out.println("Frequency of of \"i\": " + freqI);
			System.out.println("Frequency of of \"o\": " + freqO);
			System.out.println("Frequency of of \"u\": " + freqU);

			
	}

	//}
}
