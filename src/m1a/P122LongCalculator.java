package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-22
Program: 122 Long Calculator
*/
/**
 * 
 */
public class P122LongCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Long Calculator by Giovanni Castillo on 08/31/2025");
		// new data type, long which is a 64 bit signed two's complement integer
		// can hold values from -2^63 to 2^63-1
		
		// makes use of the Long parse int method to convert the string input to a long value
		// since the cli takes strings and not long values
		long a = Long.parseLong(args[0]); 
		long b = Long.parseLong(args[1]);
		
		//this prints the minumum value using the min_value & max method from the integer class
		System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		// prints the two numbers and their additive inverses, sum, difference, product
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);
		System.out.println("Additive inverse of first number: " + (-a));
		System.out.println("Additive inverse of second number: " + (-b));
		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));
		// prints the product, long quotient, integer remainder
		System.out.println("Product: " + (a * b));
		System.out.println("Long quotient: " + (a / b));
		System.out.println("Long remainder: " + (a % b));
		// prints the min and max of the two inputs using the math class min and max methods
		System.out.println("Minimum of the two numbers: " + Math.min(a, b));
		System.out.println("Maximum of the two numbers: " + Math.max(a, b));
	}

}
