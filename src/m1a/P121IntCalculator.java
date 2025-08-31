//assingment module package
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-22 
Program: 121 Int Calculator
*/
/* Program 121: int Calculator
- Read two ints from command-line args: args[0], args[1]
- Print Integer.MIN_VALUE and Integer.MAX_VALUE
- Print the two numbers and their: additive inverses, sum, difference, product,
  integer quotient, integer remainder
- Print the min and max of the two inputs
*/

public class P121IntCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Int Calculator by Giovanni Castillo on 08/31/2025");

		// makese use of the integer parse int method to convert the string input to an integer
		// since the cli takes strings and not integers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		//this prints the minumum value using the min_value & max method from the integer class
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		// prints the two numbers and their additive inverses, sum, difference, product
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);
		System.out.println("Additive inverse of first number: " + (-a));
		System.out.println("Additive inverse of second number: " + (-b));
		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));
		// prints the product, integer quotient, integer remainder
		System.out.println("Product: " + (a * b));
		System.out.println("Integer quotient: " + (a / b));
		System.out.println("Integer remainder: " + (a % b));
		// prints the min and max of the two inputs using the math class min and max methods
		System.out.println("Minimum of the two numbers: " + Math.min(a, b));
		System.out.println("Maximum of the two numbers: " + Math.max(a, b));
		

	}

}
