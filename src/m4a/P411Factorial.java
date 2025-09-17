package m4a;
/**@author Giovanni Castillo AIT502-11
Module: Recursivity
Assignment: M4A-21
Program: 411 - Factorial
*/
/**REQUIREMENTS:
 * Requirements: Compute the factorial of a number n, 
 * using a recursive implementation. 
 * The factorial of a number n is: n! = 1 x 2 x 3 x ... x n. 
 * We can also write the formula as: n! = (n-1)! x n .
 */

public class P411Factorial {
	/** Compute the factorial of a number, using a recursive implementation
	 * @param n- the number for which we compute the factorial (positive integer)
	 * @return - a long with the computed result of possible*/
	
	/** 
	 * Main method testing the factorial defined for known values:
	 * Examples include: 
	 * 1! = 1;
	 * 2!=2;
	 * 3!=6;
	 * 4!=24;
	 * @param args - not used
	 */
	public static long factorial(int n) {
		/* what is recursive implementation? :
		 * A recursive implementation is a method that calls itself to solve a problem.
		 * The method must have a base case to stop the recursion.
		 * The method must also have a recursive case to call itself with a smaller problem.
		 * The base case is the simplest case that can be solved without recursion.
		 * The recursive case is the case that can be solved by calling the method with a smaller problem.
		 * The method must also have a way to combine the results of the smaller problems to solve the original problem.
		 * For example, the factorial of a number n can be defined as:
		 * n! = n * (n-1)!
		 *  
		 */
		
		
		
		if(n == 1)return 1;
		if(n == 2)return 1;
		
		if(n == 1)return 1;
		
		// returns the value of N. 
		return 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial by Giovanni Castillo - 09/21/2025");
		
	}

}
