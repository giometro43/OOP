package m2a;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 218 Power Table
*/
public class P218PowerTable {
/*Requirements: Read a whole number from 1 to 10 from the command line. 
 * If the number is wrong show an error and stop the execution. 
 * Create a power table from 1 to 10 for that received number. 
 * Allign the values in the table. 
 * A row will look like "2 ^ 3 = 8", 
 * but with extra spaces as needed for allignment.*/
	public static void main(String[] args) {
		System.out.println("Power Table by Giovanni Castillo on 09/07/2025");
		//read and check the number :n
				int n = Integer.parseInt(args[0]);
				//stop if not valid input
				if(n > 10 || n < 1) {
					System.out.println("ERROR: not between 1-10");
					return;
				}
				//creating a for loop
				for (int m=1; m<=10; m++) { // for the condition of 1 to 20, increment after completion of first attempt
					int result = 1;
				
					 for (int i = 0; i < m; i++) {
			                result *= n;
			            }
				//for each number , from 1 to 20
					
					//print the line n x m
						// next m
						System.out.printf("%2d ^ %2d = %4d\n", n, m, result);//%d = entirety, %2d = only 2 digits , %3d = 3 digits
						m++;
								
					}

		}
	
}
