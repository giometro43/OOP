package m2a;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 221 Math Formula
*/
public class P221MathFormula {
/*Requirements: Read a positive number n from the keyboard. Compute the following terms both by addition and applying the formula:
Sum of numbers: 1 + 2 + 3 + ... + n;
Sum of numbers formula: n*(n+1)/2;
In the following ones we mark the power with ^, so 2^3 is 2 power 3 or 2*2*2 = 8;
Sum of squares: 1^2 + 2^2 + 3^2 + ... + n^2;
Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6;
Sum of cubes: 1^3 + 2^3 + 3^3 + ... + n^3;
Sum of cubes formula: ( n^4 + 2*(n^3) + n^2) / 4. Also compute the following product of numbers, named factorial:
m! = 1 * 2 * 3 * ... * m as a big integer. Print all the results. https://youtu.be/RPgoiLXxKkY */
//HINT: Be sure that you put a newline (enter) after the -1. Your text file must have an empty  line at  the end in order to work on some operating systems.

	public static void main(String[] args) {
		System.out.println("Math Formula by Giovanni Castillo on 09/07/2025");
		//read and check n from the keyboard
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter your positive number: ");
		int n = in.nextInt();
		
		while (n<1) {
			System.out.println("ERROR: ENTER POSITIVE NUMBER");
			System.out.println("Please enter your positive number: ");
			n = in.nextInt();
			return;
		}
			//computations
			
			//Sum of numbers: 1 + 2 + 3 + ... + n;
			int sum1 =0; 
			for (int i=1; i <=n; i++) {
				sum1+=i;
			}
			//Sum of numbers formula: n*(n+1)/2;
			int sum1formula = n*(n+1)/2;
		
			//Sum of squares: 1^2 + 2^2 + 3^2 + ... + n^2;
			int sum2 =0; 
			for (int i=1; i <=n; i++) {
				sum2+=i*i;
			}
			//Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6;
			int sum2formula = (2*(n*n*n) + 3*(n*n) + n) / 6; // changed formatting for me to understand better but same formula
			//Sum of cubes: 1^3 + 2^3 + 3^3 + ... + n^3;
			int sum3 =0;
			for (int i=1; i <=n; i++) {
				sum3+=i*i*i;
			}
			//Sum of cubes formula: ( n^4 + 2*(n^3) + n^2) / 4.
			int sum3formula = ( (n*n*n*n) + 2*(n*n*n) + (n*n) ) / 4;
			//compute the following product of numbers, named factorial:
			//m! = 1 * 2 * 3 * ... * m as a big integer.
			//used a long data type to store larger values because the requirement is to compute factorials as big integers
			
		  			long factorial = 1; 
		  				for (int i = 1; i <= n; i++) {
					    factorial *= i;
					    }
		
		//print the results
		System.out.println("Sum of numbers : 1 +2 +3+...N = "+ sum1);
		System.out.println("Sum of numbers formula: n*(n+1)/2 = "+ sum1formula);
		System.out.println("Sum of squares: 1^2 + 2^2 + 3^2 + ... + n^2 = "+ sum2);
		System.out.println("Sum of squares formula: ( 2*(n^3) + 3*(n^2) + n) / 6 = "+ sum2formula);
		System.out.println("Sum of cubes: 1^3 + 2^3 + 3^3 + ... + n^3 = "+ sum3);
		System.out.println("Sum of cubes formula: ( n^4 + 2*(n^3) + n^2) / 4 = "+ sum3formula);
		System.out.println("Factorial: n! =  "+ factorial);
		
		// close scanner
		in.close();
		
	}

}
