package m1a;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module:
Assignment: 
Program: 
*/
/**
 * Requirements: Reads a name from the input keyboard, 
 * as first and last name. Compute and print 
 * the initials and name abbreviation.
 */
public class P133NameInitials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Name initials by Giovanni Castillo on 08/31/2025");
	//takes user input for the first and last name
	System.out.println("Please input your first name and last name");
	String firstName = in.next();
	String lastName = in.next();
	in.close();
	
	
	// makes char values from the position of the user input at 0, the start of the string
	char fnInitials = firstName.charAt(0);
	char lnInitials = lastName.charAt(0);
	
	
	
	System.out.println("Initials: " + fnInitials + lnInitials);
	System.out.println("Name abbrieviation: " + fnInitials + "." + lnInitials + ".");

	

	

	}

}
