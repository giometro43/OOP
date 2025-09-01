package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined data types
Assignment: M1A-24
Program: 143 Leap year
*/
/* Requirements: 
 * (1)Receives through a dialog the name and year of birth for two persons. 
 * Computes the following conditions: 
 * (2)the first person is born in a leap year; 
 * (3)the second person is born in a leap year; 
 * (4)both are born in a leap year; 
 * (5)none is born in a leap year; 
 * (6)any of them is born in a leap year; 
 * (7)exactly one of them is born in a leap year. */

import javax.swing.JOptionPane;

public class P143LeapYear {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		System.out.println("Leap Year by Giovanni Castillo on 08/31/2025");

		// creates dialog box with JOptionpane
		
		//Step 1, created two people from dialog boxes and got their birth year
		String firstName = JOptionPane.showInputDialog("Enter the first persons name:");
		String firstYear = JOptionPane.showInputDialog("Enter the first persons Birth Year:");
		int byInt1 = Integer.parseInt(firstYear);

		String secondName = JOptionPane.showInputDialog("Enter the second persons name:");
		String secondYear = JOptionPane.showInputDialog("Enter the second persons Birth Year:");
		int byInt2 = Integer.parseInt(secondYear);
		
		
		 /* what is a leap year: when a year is divisible by 400, OR divisible by 4 AND NOT divisible by 100
		 * notice the logic, we will use operators for the leap year.we will see that the years 
		 * remainder is equal to or not equal to zero to check if it is a leap year*/
		
		// (2)the first person is born in a leap year
		boolean leapYear1 = (byInt1 % 400==0) || ((byInt1 % 4 ==0)&&(byInt1 %100 != 0));
		// (3)the second person is born in a leap year; 
		boolean leapYear2 = (byInt2 % 400==0) || ((byInt2 % 4 ==0)&&(byInt2 %100 != 0));

		
		String message;
		
		message  = ("First persons name: " + firstName + ", and born on: " + byInt1 +". \n");
		message +=("Second persons name: " + secondName+ ", and born on: " + byInt2 + ". \n");
		message +=("It is " + leapYear1 + " that " + firstName + " is born on a leap year. \n");
		message +=("It is " + leapYear2 + " that " +secondName + " is born on a leap year. \n");
		
		//(4)both are born in a leap year; uses AND logic
		boolean bothLeap = leapYear1 && leapYear2;
		message +=("It is " + bothLeap + " that both people are born on a leap year. \n");
		// 5)none is born in a leap year; uses the NAND NOT-AND logic
		boolean noneLeap = !leapYear1 && !leapYear2;
		message +=("It is " + noneLeap + " that neither people are born on a leap year. \n");
		// 6)any of them is born in a leap year; uses the OR logic
		boolean anyLeap = leapYear1 || leapYear2;
		message +=("It is " + anyLeap + " that at least one person is born on a leap year. \n");
		// (7)exactly one of them is born in a leap year. uses the XOR A.K.A exclusive OR
		boolean oneLeap = leapYear1 ^ leapYear2;
		message +=("It is " + oneLeap + " that at least one person is born on a leap year. \n");
		JOptionPane.showMessageDialog(null, message);
	}

}
