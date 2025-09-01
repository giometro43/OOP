package m1a;

import javax.swing.JOptionPane;

/*@author Giovanni Castillo AIT502-11
Module: Predefined Data types
Assignment: M1A-24
Program: 142 Taller
*/
/**
 * Requirements:Receives through a dialog the name and height in inches (as a real number) for two persons.
 *  Computes if the first person is taller, 
 *  if the second person is taller or if they have the same height.


 */
public class P142Taller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Taller by Giovanni Castillo on 08/31/2025");
		

		// creates dialog box with JOptionpane
		String firstName = JOptionPane.showInputDialog("Enter the first persons name:");
		String firstHY = JOptionPane.showInputDialog("Enter the first persons Height Year:");
		int height1 = Integer.parseInt(firstHY);

		String secondName = JOptionPane.showInputDialog("Enter the second persons name:");
		String secondHY = JOptionPane.showInputDialog("Enter the second persons height:");
		int height2 = Integer.parseInt(secondHY);
		//P1: Computes if the first person is taller (born in an earlier year), 
				boolean taller1 = height1 > height2;
				//P2: if the second person has seniority or if they are born in the same year. 
				boolean taller2 = height2 > height1;
				//checks for no seniority
				boolean sameheight = height1 ==height2;
				
				// composes message with fields provided earlier after collecting from dialog boxes
				String message;
				message  = ("First persons name: " + firstName + ", and " + height1 +" inches tall. \n");
				message +=("Second persons name: " + secondName+ ", and " + height2 + " inches tall. \n");
				message +=("It is " + taller1 + " that person 1 is taller than person 2. \n");
				message +=("It is " + taller2 + " that person 2 is taller than person 1. \n");
				message +=("It is " + sameheight + " that person 1 and person 2 are the same height. \n");
				JOptionPane.showMessageDialog(null, message);
			

	}

}
