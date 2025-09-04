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
		String dateInput = in.nextLine();
		
		
		// index of the three sides of the date format.
		int index1 = dateInput.indexOf('/');
		int index2 = dateInput.lastIndexOf('/');
		
		int month = Integer.parseInt(dateInput.substring(0,index1));
		int day = Integer.parseInt(dateInput.substring(index1 + 1, index2));
		int year = Integer.parseInt(dateInput.substring(index2 + 1));
		//check year input
		boolean wrong;
		switch (month) {
		//all months with 31 days
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			wrong = day > 31 || day < 1;
			break;
		case 4: case 6: case 9: case 11:
			//months with 30 days
			wrong = day < 1 || day >30;
			break;
		case 2: 
			// for feb, check if leap year
			//check if leap year
			if (year % 400 == 0 ||year % 4 == 0 && year % 100 != 0) {
				wrong = day <1 || day >29;
			}
			else{
				wrong = day <1|| day>28;
			}
		break;
		default:
			wrong  = true;
			break;
		}	
		if (wrong) {
			System.out.println("Your date is wrong, try again.");
			return;}
		String dateOutput = "";
		switch(month)
		{
		case 1:dateOutput = "January";break;
		case 2: dateOutput = "Feburary";break;
		case 3: dateOutput = "March";break;
		case 4: dateOutput = "April";break;
		case 5: dateOutput = "May";break;
		case 6: dateOutput = "June";break;
		case 7: dateOutput = "July";break;
		case 8: dateOutput = "August";break;
		case 9: dateOutput = "September";break;
		case 10: dateOutput = "October";break;
		case 11: dateOutput = "November";break;
		case 12: dateOutput = "December";break;}
		dateOutput +=" " + day + ", " + year;
		System.out.println("the date is : " + dateOutput);
		
	}


}
