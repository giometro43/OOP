package m1a;

import javax.swing.JOptionPane;

/*@author Giovanni Castillo AIT502-11
Module: Predefined data types
Assignment: M1A-24
Program: 145 Grade Book order
*/
/**Requirements: 
 * (1)Receives the first and last name of two students using dialog windows. 
 * (2)Check if they have the same last name; 
 * (3)if they have the same first name; 
 * (4)if they have the same name; 
 * (5)if the first one must appear first in the grade book; 
 * (6)if the second must appear first in the grade book. 
 * (7)Print the results with complete sentences using dialog windows. */
public class P145GradeBookOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Grade Book Order by Giovanni Castillo on 08/31/2025");
		
		// * (1)Receives the first and last name of two students using dialog windows. 
		String firstFN = JOptionPane.showInputDialog("Enter the first persons name:");
		String firstLN = JOptionPane.showInputDialog("Enter the first persons surname:");

		String secondFN = JOptionPane.showInputDialog("Enter the second persons name:");
		String secondLN = JOptionPane.showInputDialog("Enter the second persons surname:");

		
		// * (2)Check if they have the same last name; 
		boolean sameFN = firstFN.equals(secondFN);
		
		// * (3)if they have the same first name; 
		boolean sameLN = firstLN.equals(secondLN);

		//* (4)if they have the same name; 
		boolean sameName = sameFN && sameLN;
		// * (5)if the first one must appear first in the grade book; 
		boolean firstIsFirst = (firstLN.compareTo(secondLN)<0) || sameLN &&firstFN.compareTo(secondFN)<0;
		// * (6)if the second must appear first in the grade book. 
		boolean secondIsFirst = !firstIsFirst && !sameName;

		// * (7)Print the results with complete sentences using dialog windows. 

		String message;
		
		message = ("First persons name: " + firstFN + ", and last name: " + firstLN + ". \n");
		message +=("First persons name: " + secondFN + ", and last name: " + secondLN +". \n");
		message +=("It is " + sameFN + " that both have the same first name. \n");
		message +=("It is " + sameLN + " that both have the same last name. \n");
		message +=("It is " + sameName + " that both have the same first and last name. \n");
		message +=("It is " + firstIsFirst + " that " + firstFN + " is first in the grade book. \n");
		message +=("It is " + secondIsFirst + " that " + secondFN + " is first in the grade book. \n");
		JOptionPane.showMessageDialog(null, message);




	}

}
