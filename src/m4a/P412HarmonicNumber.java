package m4a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Recursivity
Assignment: M4A-21
Program: 412 - Harmonic Number
*/
public class P412HarmonicNumber {

	/**REQUIREMENTS:
	 * No requirements in the assignment,
	 * I assume that its to compute a harmonic number liek this:
	 * H(n) = 1 + 1/2 + 1/3 + ... + 1/n
	 * and recursively as
	 * H(n) = H(n-1) + 1/n
	 * with H(1) = 1
	 * Ex. H(5) = 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.2833
	 */
	
	public static double harmonicNum(double n) {
		//base case
		if(n==1)return 1;
		
		//example: harmonic number 3, 1 + 1/3 + 1/2 +1 / 3
		return (harmonicNum(n-1) +(1/n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Harmonic Number by Giovanni Castillo - 09/21/2025");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of harmonic numbers please:");
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("H(%d)=%.3f\n", i, harmonicNum(i));
		    System.out.print("Equation: ");

			for (int j = 1; j <= i; j++) {
		        if (j > 1 ) System.out.print(" + ");
		        if (j  == 1 ) System.out.print(" 1 ");
		        else System.out.printf("1/%d", j);
		    }
		    System.out.println();
				
			
			
		}
	}

}
