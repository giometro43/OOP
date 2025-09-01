package m1a;
import java.util.Scanner;
/*@author Giovanni Castillo AIT502-11
Module:Predefined data types
Assignment: M1A-23
Program: 135 Half Byte Value
*/
/**Requirements: Reads a half-byte (4 binary digits, e.g. 0011 or 1010) from keyboard.
 * Computes and prints the decimal value of the half-byte.
 */
public class P135HalfByteValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Half Bye Value by Giovanni Castillo on 08/31/2025");
		
		
		System.out.println("Please enter a half byte binary value");
		String halfByte = in.next();
		
		/* binary values can be converted using powers of twos.
		 * from right to left, each bit increases, from the right is 1, 
		 * then next left is 2, then left 4 etc.
		 */
		char bit3 = halfByte.charAt(0);
		char bit2 = halfByte.charAt(1);
		char bit1 = halfByte.charAt(2);
		char bit0 = halfByte.charAt(3);
		
		System.out.println("Bit at 8ths place: " +bit3 );
		System.out.println("Bit at 4ths place: " +bit2 );
		System.out.println("Bit at 2ths place: " +bit1 );
		System.out.println("Bit at units place: " +bit0 );
		
		// converts the bits from characters to integers, just by subtracting the zero. no impact
		int vd3 = bit3 - '0';
		int vd2 = bit2 - '0';
		int vd1 = bit1 - '0';
		int vd0 = bit0 - '0';
		
		
		//going back to the conversion logic, manually multiplying each value by each power and adding
		// to convert them to decimal
		int decimalValue = vd3*8 + vd2*4 + vd1*2 + vd0;
		System.out.println("Binary value converted to decimal:  " +decimalValue);
	}
}
