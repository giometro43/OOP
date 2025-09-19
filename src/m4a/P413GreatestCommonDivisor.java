package m4a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Recursivity
Assignment: M4A-21
Program: 413 - Greatest Common Divisor
*/
public class P413GreatestCommonDivisor {

	/**REQUIREMENTS:
	 * Requirements: Create a program that will compute the greatest common 
	 * divisor using a recursive method.
	 * Run the program for the following inputs, and include a screenshot
	 *  for each run, showing the console outputs:
	 *  3, 9
	 *  75, 256
	 *  48, 160*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greatest Common Divisor by Giovanni Castillo - 09/21/2025");	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number please:");
		int a = in.nextInt();
		
		
		System.out.println("Enter the second number please:");
		int b = in.nextInt();
	 		System.out.printf("The greatest common divisor of %d and %d is: %.0f\n", a, b, gcd(a, b));
	 		
		
	}

	
	public static double gcd(double aD, double bD) {
		 int a = (int) aD;
		 int b = (int) bD;
		/* the formula for greatest common divisor is : gcd(a,b) = gcd(b, a mod b)
		 * base case for gcd is when n = 1, gcd(1) = 1, which means that 1 is the only divisor
		 * if n = 0, gcd(0) = a, which means that a is the only divisor 
		 *  
		 */
		 if(b==0) return aD; //base case
		 return gcd(b, a % b);
		 
		 	
		 
		 
	}
}
