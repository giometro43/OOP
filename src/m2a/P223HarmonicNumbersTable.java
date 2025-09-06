package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 223  Harmonic Numbers Table
*/
public class P223HarmonicNumbersTable {
	/*Requirements:Read a positive number n from the keyboard. 
	 * Compute the harmonic numbers Hk = 1 + 1/2 + 1/3 + ... + 1/k for all k between 1 and n. \
	 * Print the results in a table with header and values aligned.*/
	public static void main(String[] args) {
		// same thing as the program on P222HarmonicNumbers.java just add the table part with a loop 
		System.out.println("Harmonic Numbers Table by Giovanni Castillo on 09/07/2025");
		//use and check n from the keyboard but only integers and positive 
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter your positive number: ");
		int n = in.nextInt();
		while (n<1) {
			System.out.println("ERROR: ENTER POSITIVE NUMBER");
			System.out.println("Please enter your positive number: ");
			n = in.nextInt();
			return;
		}
			//computations
		
			System.out.println("-------------------------");
			// loop to compute harmonic numbers from 1 to n
			for (int k=1; k <=n; k++) {
				double harmonicNumber =0; 
				for (int i=1; i <=k; i++) {
					harmonicNumber+= 1.0/i;
				}
				// print each harmonic number in the table with formatting
				//with print f like we used in P218 instead of println
				System.out.printf("%-10d %-20.5f%n", k, harmonicNumber);
			}
			// close scanner
			in.close();
		/* an example for n=5 would be: 
			 k         Hk
			-------------------------
			 1         1.00000
			 2         1.50000
			 3         1.83333
			 4         2.08333
			 5         2.28333 */
			// this makes sense because H5 = 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28333, same as P222
	}

}
