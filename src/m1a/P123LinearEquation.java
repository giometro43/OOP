/**
 * 
 */
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-22
Program: 123 Linear Equation
*/
/**
 * 
 */
public class P123LinearEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creates a linerar equation ax+b = c, from cli inputs a,b,c
		//uses the double parse double method to convert the string inputs to double values
		// will print the coefficents and the solution to the equation
		
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double x = (c - b) / a;
		// prints the linear equation
		System.out.println("Linear Equation by Giovanni Castillo on 08/31/2025");
		System.out.println("Solve for x, ax+b=c: ");
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("c: " +c);
		// prints the solution to the equation
		System.out.print("Soultion: " + x);
		
		
	}

}
