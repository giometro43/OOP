package m1a;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module:Predefined data types
Assignment: M1A-23
Program: 136 two digit octal
*/
/**Requirements:Read a two digit octal number. 
 * Similar with binary numbers, an octal number has only the digits from zero to seven.
 * Compute and print the decimal value of this number.*/
public class P136TwoDigitOctal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Two digit octal by Giovanni Castillo on 08/31/2025");
		
		System.out.println("Print two digit of octal seperate: ");
		String octal = in.next();
		
		// seperates the octal into two digits
		char octalp1 = octal.charAt(0);
		char octalp2 = octal.charAt(1);
		// converts the vlaue from char to int
		int dec1 = octalp1 - '0';
		int dec2 = octalp2 - '0';
		int decimal = (dec1 * 8) + (dec2 * 1);  
		System.out.println("Decimal value :" + decimal);
		
	}

}
