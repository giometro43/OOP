package m1a;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module:Predefined Data Types
Assignment: M1A-23
Program: 132 Phone Number Parser
*/
/**
 * 
 */
public class P132PhoneNumberParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Phone Number Parser by Giovanni Castillo on 08/31/2025");

		System.out.println("Please enter your phone number in 999-999-9999 format:");
		String phoneNumber = in.nextLine();
		
		
		String areaCode = phoneNumber.substring(0,3);
		
		System.out.println("Your area code is: " + areaCode);
		
		String localNumber = phoneNumber.substring(3,10);
		
		System.out.println("Your local number is: " + localNumber);
		
		

	}

}
