// - assignment package  
package m1a;
/*@author Giovanni Castillo AIT502-11
Module:Predefined Data Types
Assignment: M1A-21
Program: 114 Hello Class Cipher
*/
/**
 * 
 */
public class P114HelloClassCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello Class Cipher by Giovanni Castillo on 08/31/2025");
		
		/*
		 * define the cipher:
        Write the following message at the standard console:
         Hello, Class! using a substitution cipher with the following rules:
         a letter is substituted by the next letter in alphabet, space is replaced by $,
         comma by & and exclamation mark by #. You must use variables to construct the result.
		*/
        String h = "i";
		String e = "f";
		String l = "m";
		String o = "p";
		String comm = "&";
		String spce = "$";
		String c = "d";
		//no l since it's already defined
		String a = "b";
		String s = "t";
		String excl = "#";

				
		
		// create the message, combines the strings with their actual values as the naming 
		// convention for the message, hidden by the obscured output
		String message;
		message = h+e+l+l+o+comm+spce+c+l+a+s+s+excl;
		
		// print the message
		//
		System.out.print(message);

	}

}
