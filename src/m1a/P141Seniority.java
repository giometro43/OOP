package m1a;

import javax.swing.JOptionPane;

/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-24
Program:141 Seniority
*/
/**Requirements: Receives through a dialog the name and year of birth for two persons. 
 * Computes if the first person has seniority (born in an earlier year), 
 * if the second person has seniority or if they are born in the same year. 
 * Print all the results following the pattern: "It is true that John has seniority." 
 * or "It is false that Mary has seniority."*/
public class P141Seniority {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Seniority by Giovanni Castillo on 08/31/2025");
		
		
		// creates dialog box with JOptionpane
		String firstName = JOptionPane.showInputDialog("Enter the first persons name:");
		String firstBY = JOptionPane.showInputDialog("Enter the first persons Birth Year:");
		int byInt1 = Integer.parseInt(firstBY);

		String secondName = JOptionPane.showInputDialog("Enter the second persons name:");
		String secondBY = JOptionPane.showInputDialog("Enter the second persons Birth Year:");
		int byInt2 = Integer.parseInt(secondBY);

		//P1: Computes if the first person has seniority (born in an earlier year), 
		boolean seniority1 = byInt1 < byInt2;
		//P2: if the second person has seniority or if they are born in the same year. 
		boolean seniority2 = byInt2 < byInt1;
		//checks for no seniority
		boolean noseniority = byInt1 ==byInt2;
		
		// composes message with fields provided earlier after collecting from dialog boxes
		String message;
		message  = ("First persons name: " + firstName + ", and born on: " + firstBY +". \n");
		message +=("Second persons name: " + secondName+ ", and born on: " + secondBY + ". \n");
		message +=("It is " + seniority1 + " that person 1 has seniority over person 2. \n");
		message +=("It is " + seniority2 + " that person 2 has seniority over person 1. \n");
		message +=("It is " + noseniority + " that person 1 and person 2 have the same birth year. \n");
		JOptionPane.showMessageDialog(null, message);
	}
}
