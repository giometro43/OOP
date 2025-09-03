package m1b;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1B-21	
Program: 152 Guess Products
*/
public class P152GuessProducts {
	/* Requirements: The computer picks a 2 digit number (from 10-99) and provides the product of the digits to the user. 
	 * The user has 3 turns to guess the number. 
	 * After each turn the computer tells the user if the number is: too big, too small, or the same. 
	 * If the user does not guess in 3 turns the computer wins. */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Guess Products by Giovanni Castillo on 08/31/2025");
		
		//(1)The computer picks a 2 digit number (from 10-99)
		int sum = (int)(Math.random()*99) + 10;
		

		//(1a)provides the product of the digits to the user
		// solves for the two digits by using division and modulus
		int prod1 = sum / 10;
		int prod2 = sum % 10;
		// the clue will be used by the user to guess the number
		int clue = prod1 * prod2;
		System.out.println("The product of the two digits is :" + clue + ". Guess my number!");
		int guess1 = in.nextInt();
		// the user guesses the number by using the two digits provided by the computer to form a two digit number
		// Ex. if the computer provides 34 then what two numbers multiply together to make 34
		if (guess1 < sum) {
			System.out.println("Too small!");
		}
		else if(guess1 > sum) {
			System.out.println("Too Large!");
		}
		else if(guess1 == sum) {
			System.out.print("YOU WIN");
			return;
		}
		
		
		
		System.out.println("Second guess, using :" + clue);
		int guess2 = in.nextInt();
		if (guess2 < sum) {
			System.out.println("Too small!");
		}
		else if(guess2 > sum) {
			System.out.println("Too Large!");
		}
		else if(guess2 == sum) {
			System.out.print("YOU WIN");
			return;
		}
		
		System.out.println("Last guess, using:" + clue);
		int guess3 = in.nextInt();
		if (guess3 < sum) {
			System.out.println("Too small! You lose");
			System.out.println("The number was " + sum);
		}
		else if(guess3 > sum) {
			System.out.println("Too Large!");
			System.out.println("The number was " + sum);
		}
		else if(guess3 == sum) {
			System.out.print("YOU WIN");
			return;
		}
		
		in.close();
	}

}
