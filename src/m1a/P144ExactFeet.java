package m1a;

import javax.swing.JOptionPane;

/*@author Giovanni Castillo AIT502-11
Module: Predefined data types
Assignment: M1A-24
Program: 144 Exact Feet
*/
/*Requirements:
 * (1)Receives through a dialog the name and height in inches (as a real number) for two persons. 
 * (2)Computes the height in feet and inches. 
 * Compute the following conditions. 
 * (3)The first person has a height of an exact number of feet; 
 * (4)the second person has a height of an exact number of feet; 
 * (5)both of them have; 
 * (6)none of them have; 
 * (7)at least one have; none of them have. */
public class P144ExactFeet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Exact Feet by Giovanni Castillo on 08/31/2025");
		
		//(1)Receives through a dialog the name and height in inches (as a real number) for two persons.
		String firstName = JOptionPane.showInputDialog("Enter the first persons name:");
		String heightInches1 = JOptionPane.showInputDialog("Enter the first persons height in inches:");
		int inchesInt1 = Integer.parseInt(heightInches1);

		String secondName = JOptionPane.showInputDialog("Enter the second persons name:");
		String heightInches2 = JOptionPane.showInputDialog("Enter the second persons height in inches:");
		int inchesInt2 = Integer.parseInt(heightInches2);
		
	
		 /*(2)Computes the height in feet and inches. 
		  * 12 inches in a foot. we need to modulus of the inches divided by 12 
		  * to get the remainder for the inches if equal to zero. if not zero then not exact feet
		  */
		boolean exactFeet1 = (inchesInt1 % 12 ==0);
		boolean exactFeet2 = (inchesInt2 % 12 ==0);
		
		
		String message;
		
		message  = ("First persons name: " + firstName + ", and is  " + inchesInt1 +" inches tall. \n");
		message  += ("Second persons name: " + secondName + ", and is  " + inchesInt2 +" inches tall. \n");
		 //(3)The first person has a height of an exact number of feet; 

		message +=("It is " + exactFeet1 + " that " + firstName + "'s height is in feet exactly. \n");
		//(4)the second person has a height of an exact number of feet; 
		message +=("It is " + exactFeet2 + " that " + secondName + "'s height is in feet exactly. \n");
		
		//(4)both are born in a leap year; uses AND logic
		boolean bothExactFeet = exactFeet1 && exactFeet2;
		message +=("It is " + bothExactFeet + " that both have height exactly in feet. \n");
		// 5)none is born in a leap year; uses the NAND NOT-AND logic
		boolean noneExact = !exactFeet1 && !exactFeet2;
		message +=("It is " + noneExact + " that neither people have height exactly in feet. \n");
		// 6)any of them is born in a leap year; uses the OR logic
		boolean anyLeap = exactFeet1 || exactFeet2;
		message +=("It is " + anyLeap + " that any person has height exactly in feet. \n");
		// (7)exactly one of them is born in a leap year. uses the XOR A.K.A exclusive OR
		boolean oneLeap = exactFeet1 ^ exactFeet2;
		message +=("It is " + oneLeap + " that at least one person has height exactly in feet. \n");
		JOptionPane.showMessageDialog(null, message);
	}

}
