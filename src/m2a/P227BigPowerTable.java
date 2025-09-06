package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 227 Big Power Table
*/
public class P227BigPowerTable {
	/*Requirements: Read a positive number from the keyboard. 
	 *Print a formatted table with all the powers of that number that may be computed as an int.*/
	// meaning to the range of an int in java 2,147,483,647, any more then we will get an overflow error so stop it 
	public static void main(String[] args) {
		System.out.println("Big Power Table by Giovanni Castillo on 09/07/2025");
		// Read a number n >= 2
        Scanner in = new Scanner(System.in);
        boolean error;
        int n;
        do {
            System.out.print("For which number (2 or higher) you want the power table? ");
            n = in.nextInt();
            error = n < 2;
            if (error) {
                System.out.println("ERROR: Please enter a number 2 or higher.");
            }
        } while (error);

        // Print the table header
        System.out.println("    POWER |      VALUE");
        System.out.println("-----------+------------");

        // For each power, print a row in the table
        int power = 0;
        int value = 1;
        boolean hasNext;
        do {
            System.out.printf("%9d | %10d%n", power, value);

            // Can we compute the next value without overflowing int?
            hasNext = value < Integer.MAX_VALUE / n;
            if (hasNext) {
                power++;
                value *= n;
            }
        } while (hasNext);

        // Close resources
        in.close();
	}

}
