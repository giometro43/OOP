// - assignment package  
package m1a;


/*@author Giovanni Castillo AIT502-11
Module:Predefined Data Types
Assignment: M1A-21
Program: 113 Substitution Cipher
*/
/**
 * Prints Hello java using a substitution cipher
 */
public class P113SubstitutionCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Substitution Cipher by Giovanni Castillo on 08/31/2025");
		
		//define the cipher
		String h = "a";
		String e = "s";
		String l = "p";
		String o = "1";
		String comm = ">";
		String spce = "[";
		String j = "+";
		String a = "2";
		String v = "6";
		String excl = "/";

				
		
		// create the message, combines the strings with their actual values as the naming 
		// convention for the message, hidden by the obscured output
		String message;
		message = h+e+l+l+o+comm+spce+j+a+v+a+excl;
		
		// print the message
		//
		System.out.print(message);

	}

}
