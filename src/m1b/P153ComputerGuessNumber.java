package m1b;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1B-21	
Program: 153 Computer Guess Number
*/
public class P153ComputerGuessNumber {
	/*Requirements: The computer tries to guess in 3 turns a random number picked by user (from 1 to 10). 
	 * After each turn the user tells the computer if the number is: too big, too small, or the same. 
	 * If the computer does not guess in 3 turns the user wins.
	 */


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Computer Guess Number by Giovanni Castillo on 08/31/2025");
		System.out.println("Give me a number between 1 and 10, and I will try to guess it!");
		int userNum = in.nextInt();	
		int guess1 = 1 +(int)(Math.random()*10);
		int guess2 = 1 +(int)(Math.random()*10);
		int guess3 = 1 +(int)(Math.random()*10);

		
		System.out.println("Is your number " + guess1 + "?");
		if (guess1 < userNum ) {
			System.out.println("Too small!");
		}
		else if(guess1 > userNum){
			System.out.println("Too large!");
		}
		else if(guess1 == userNum) {
			System.out.println("I WIN!");
			return;
		}
		
		System.out.println("Is your number " + guess2 + "?");	
		if (guess2 < userNum ) {
			System.out.println("Too small!");
		}
		else if(guess2 > userNum){
			System.out.println("Too large!");
		}
		else if(guess2 == userNum) {
			System.out.println("I WIN!");
			return;
		}
		System.out.println("Is your number " + guess3 + "?");
		if (guess3 < userNum ) {
			System.out.println("Too small!YOU WIN");
		
		}
		else if(guess3 > userNum){
			System.out.println("Too large! YOU WIN");
		}
		else if(guess3 == userNum) {
			System.out.println("I WIN!");
			return;
		}
		in.close();
	}

}
