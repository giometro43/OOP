package m1b;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1B-21
Program: 157 Date Converter
*/
public class P157DateConverter {
	/*Requirements: Read a current date from the keyboard as a string in the format MM/DD/YYYY (e.g. 2/4/2021, 12/2/2020)
	 * If the date is wrong provide an error message. If the date is correct, convert it in the format: 
	 * MONTH DD, YYYY (e.g. February 4, 2021; December 2, 2020). 
	 * You may need to check if there year is a leap year or not. 
	 * Do not use any predefined method for processing the date. Write the algorithm yourself
	 */
	public static void main(String[] args) {
	
		System.out.println("Date Converter by Giovanni Castillo on 08/31/2025");
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter a date in the format mm/dd/yyyy: ");
		String dateRaw = in.nextLine();
		
		
		// index of the three sides of the date format.
		int index1 = dateRaw.indexOf('/');
		int index2 = dateRaw.lastIndexOf('/');
		
		int month = Integer.parseInt(dateRaw.substring(0,index1));
	}

}
