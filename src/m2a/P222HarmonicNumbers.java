package m2a;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 221 Harmonic Numbers
*/
public class P222HarmonicNumbers {
	/*Requirements: Read a positive number n from the keyboard. 
	 * Compute the harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n. Print the result.*/
	public static void main(String[] args) {
		System.out.println("Harmonic Numbers by Giovanni Castillo on 09/07/2025");
		
		//read and check n from the keyboard
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter your positive number: ");
		//nextInt checks for integer input and if not int then it doesnt work
		int n = in.nextInt();
		//this while loop checks if the number is positive for input validation
		while (n<1) {
			System.out.println("ERROR: ENTER POSITIVE NUMBER");
			System.out.println("Please enter your positive number: ");
			n = in.nextInt();
			return;
		}
			//computations
			
			//Harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n.
			// a harmonic number is the sum of the reciprocals of the first n natural numbers
		 	// double data type to store the result because harmonic numbers can be fractional
			double harmonicNumber =0; 
			for (int i=1; i <=n; i++) {
				// for loop to iterate from 1 to n and add the reciprocal of each integer to the harmonic number
				harmonicNumber+= 1.0/i;
			}
			//expected output example:  Harmonic number 5 = 2.28333 
			//this makes sense because 5 = 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28333
			//print the results and the formula
			System.out.println("Formula : Hn = 1 + 1/2 + 1/3 + ... + 1/n");
			System.out.printf("Harmonic number H%d = %.5f%n", n, harmonicNumber);
			// close scanner
			in.close();
			}
}


