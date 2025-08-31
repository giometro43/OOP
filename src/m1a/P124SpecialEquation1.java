package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-22
Program: 124 Special Equation 1
*/

public class P124SpecialEquation1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Solve the linear equation ax+b=cx+d where a, b, c and d 
		 * are provided as command line arguments. Assumes a and c are not equal.
		 */
		/*
		 * To solve this: 
		 * 1. Subtract cx from both sides: ax - cx + b = d
		 * 2. Combine like terms: (a - c)x + b = d, so that they are being multiplied by x
		 * 3. Subtract b from both sides: (a - c)x = d - b
		 * 4. Divide both sides by (a - c): x = (d - b) / (a - c) and I will 
		 * define it in the result variable */
		// this is the logic of the end result of the equation, we will just define the end formula.
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = Double.parseDouble(args[3]);
		// ax + b = cx + d, subtract cx from both sides, then get do arithmatec to solve for d.
		double result = (d - b) / (a - c);

		

		System.out.println("Special Equation 1 by Giovanni Castillo on 08/31/2025");
		System.out.println("Solve for x, ax+b=c: ");
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("c: " +c);
		System.out.println("d: " +d);
		// prints the solution to the equation
		System.out.print("Result: " + result);
		

	}

}
