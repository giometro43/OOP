package m2a;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 217 Multiplication Table
*/
public class P217MultiplicationTable {
/* Requirements: https://youtu.be/XL6E31Xz6bw
 * Read a whole number from 1 to 20 from the command line. 
 * If the number is wrong show an error and stop the execution. 
 * Create a multiplication table from 1 to 20 for that received number. 
 * Allign the values in the table.*/
	public static void main(String[] args) {
		System.out.println("Multiplication Table by Giovanni Castillo on 09/07/2025");
		//read and check the number :n
		int n = Integer.parseInt(args[0]);
		//stop if not valid input
		if(n > 20 || n < 1) {
			System.out.println("ERROR: not between 1-10");
			return;
		}
		//creating a for loop
		for (int m=1; m<=20; m++) { // for the condition of 1 to 10, increment after completion of first attempt
		
		
		//for each number , from 1 to 10
			while(m<=20) {
			//print the line n x m
				// next m
				System.out.printf("%d x %2d = %3d\n", n,m, n*m);//%d = entirety, %2d = only 2 digits , %3d = 3 digits
				m++;
						}
			}

	}

}
