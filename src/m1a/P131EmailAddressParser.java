package m1a;
import java.util.Scanner;
/**
 * 
 */

/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-23
Program: 
*/
/**Requirements: 
 * Receives an email address as a text from the keyboard, 
 * in the format "account@server.domain". 
 * Identifies the account, the server and the domain. 
 * Prints the identified account, server and domain.
 * 
 */
public class P131EmailAddressParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a new scanner object from the import
		System.out.println("Email Address Parser by Giovanni Castillo on 08/31/2025");

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your email address");
		String emailAddress = in.nextLine();
		
		int endUsername = emailAddress.indexOf("@");
		String accountName = emailAddress.substring(0 ,endUsername);
		System.out.println("account name = " + accountName);
		
		int endServer = emailAddress.indexOf(".");
		String serverName = emailAddress.substring(endUsername +1 ,endServer);
		System.out.println("Server name = " + serverName);

		int endDomain = emailAddress.indexOf("");
		String domainName = emailAddress.substring(endServer + 1 ,emailAddress.length());
		System.out.println("Domain type = " + domainName);

		
		
		

	}

}
