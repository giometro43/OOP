package m1b;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1B-21	
Program: 151 Guess in 3
*/
public class P151GuessIn3 {
	/*Requirements: Guess in 3 turns a random number picked by computer (from 1 to 10). 
	 * After each turn the computer tells the user if the number is: too big, too small, or the same. 
	 * If the user does not guess in 3 turns the computer win. */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("PROGRAM NAME by Giovanni Castillo on DUE/DATE/2025");
		int randomNum = 1 +(int)(Math.random()*10);
		System.out.println("Guess my number!");
		int guess1 = in.nextInt();	
		
		if (guess1 < randomNum ) {
			System.out.println("Too small!");
		}
		else if(guess1 > randomNum){
			System.out.println("Too large!");
		}
		else if(guess1 == randomNum) {
			System.out.println("YOU WINNNNNN!");
			return;
		}
		System.out.print("Guess my number again!");
		int guess2 = in.nextInt();	
		if (guess2 < randomNum ) {
			System.out.println("Too small!");
		}
		else if(guess2 > randomNum){
			System.out.println("Too large!");
		}
		else if(guess2 == randomNum) {
			System.out.println("YOU WINNNNNN!");
			return;
		}
		System.out.print("Guess my number one last time!");
		int guess3 = in.nextInt();
		if (guess3 < randomNum ) {
			System.out.println("Too small! You lose");
			System.out.println("The number was " + randomNum);
		}
		else if(guess3 > randomNum){
			System.out.println("Too large! You lose");
			System.out.println("The number was " + randomNum);
		}
		else if(guess3 == randomNum) {
			System.out.println("YOU WINNNNNN!");
			return;
		}
		in.close();
	}

}
