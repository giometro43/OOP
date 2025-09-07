package m2a;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 228 Fibonacci Table
*/
public class P228FibonacciTable {
/*Requirements: 
Create a table with the Fibonacci numbers.
F0=0,
F1=1,
F2=F0+F1=1,
F3=F2+F1=2,
F4=F3+F2=3,
F5=F4+F3=5, ...
F(N)=F(N-1)+F(N-2)
Print all terms that may be computed as an int in a table, 
showing the index of the number and its value.*/

	/* Some key take-aways from the LOOPS module: 
	 * iteration means to repeat the process a certain number of times
	 * indexing means to keep track of the number of iterations by using a variable (usually i or n)
	 * loop body is the code that is executed in each run of the loop
	 * --------------------
	 * for loops are used when the number of iterations is known beforehand
	 * while loops are used when the number of iterations is not known beforehand
	 * do-while loops are used when the loop body must be executed at least once
	 * --------------------
	 * nested loops are loops within loops. ------------
	/* STEPS FOR LOOPS -------
	 * REVIEW : Steps of a for loop:
	1. initialization before the loop starts
	2. condition to continue the loop
	3. update at the end of each iteration 
	Steps of a while loop:
	 * 1. initialization before the loop starts
	 * 2. condition to continue the loop
	 * 3. update within the loop body
	 * 4. loop body is executed as long as the condition is true
	Steps of a do-while loop:
	 * 1. initialization before the loop starts
	 * 2. loop body is executed at least once
	 * 3. condition to continue the loop
	 * 4. update within the loop body
	 * 5. loop body is executed as long as the condition is true
	Steps of a nested loop:
	 * 1. outer loop initialization before the outer loop starts
	 * 2. outer loop condition to continue the outer loop
	 * 3. inner loop initialization before the inner loop starts
	 * 4. inner loop condition to continue the inner loop
	 * 5. inner loop body is executed as long as the inner loop condition is true
	 * 6. inner loop update within the inner loop body
	 * 7. once the inner loop condition is false, the outer loop update is executed */

	public static void main(String[] args) {
		System.out.println("Fibonacci Table by Giovanni Castillo on 09/07/2025");
		// based on P227
		// with the exact same comments for each section 
		
		//fibonacci numbers are the sum of the two previous ones 
		// example: F(5) = F(4) + F(3) = 3 + 2 = 5, 
		System.out.println(" FIBONACCI |      VALUE");
		System.out.println("-----------+------------");

		// For each Fibonacci number, print a row in the table
		// each fibonacci number is the sum of the two previous ones
		int i = 0; // the index of the Fibonacci number
		int fibNMinus2 = 0; 
		int fibNMinus1 = 1; 
		int fibN = fibNMinus2; // Start with F(0)
		boolean hasNext = true;
		do {
			System.out.printf("%9d  | %10d%n", i, fibN);

			// Get the next Fibonacci number by summing the two previous ones
			// F(n) = F(n-1) + F(n-2) 
			if (i == 0) { 
				fibN = fibNMinus1; // F(1)
			} else {
				int nextFib = fibNMinus1 + fibNMinus2;
				hasNext = nextFib >= 0 && nextFib < Integer.MAX_VALUE; // Check for overflow
				if (hasNext) {
					fibNMinus2 = fibNMinus1;
					fibNMinus1 = nextFib;
					fibN = nextFib;
				}
			}
			i++;
		} while (hasNext);
		
		if (hasNext == false) { //just prints the end line so it looks good once the boolean is false
			System.out.println("-----------+------------");
		}
		
		
	}

}
