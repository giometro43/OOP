package m1b;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1B-21
Program: 158 Time Converter
*/
public class P158TimeConerter {
//Requirements: Read from the keyboard a duration in the format: HH:MM:SS. Convert the duration in number of seconds.: reference this as replica with changes for use case

	public static void main(String[] args) {
		System.out.println("Time Converter by Giovanni Castillo on 08/31/2025");
		//use a scanner for the input
		System.out.println("Enter a duration in the format HH:MM:SS: ");
		Scanner in = new Scanner(System.in);
		String timeInput = in.nextLine();
		// index of the three sides of the time format.
		int index1 = timeInput.indexOf(':');
		int index2 = timeInput.lastIndexOf(':');
		int hours = Integer.parseInt(timeInput.substring(0,index1));
		int minutes = Integer.parseInt(timeInput.substring(index1 + 1, index2));
		int seconds = Integer.parseInt(timeInput.substring(index2 + 1));
		//check time input
		boolean wrong;
		// check if hours, minutes, seconds are in the correct range by using if else statements
		if (hours < 0 || hours > 23) {
			// if hours is less than 0 or greater than 23 then the time is wrong
			wrong = true;
		}
		else if (minutes < 0 || minutes > 59) {
			// if minutes is less than 0 or greater than 59 then the time is wrong
			wrong = true;
		}
		else if (seconds < 0 || seconds > 59) {
			wrong = true;
		}
		else {
			wrong = false;
		}
		if (wrong) {
			System.out.println("Your time is wrong, try again.");
			return;}
		// make the total duration in seconds by multiplying hours by 3600, minutes by 60 and adding seconds
		int totalSeconds = hours * 3600 + minutes * 60 + seconds;
		System.out.println("The total duration in seconds is: " + totalSeconds + " seconds.");
		in.close();
		
		in.close();
	}

}
