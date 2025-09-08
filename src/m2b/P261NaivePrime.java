package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 261 Naive Prime
*/
/** REQUIREMENTS:
 * Given a number n in the command line, compute and print all the prime numbers less or equal with n.
 * Use a naive method to test for each number k from 2 to n if it is prime.
 * The test will consider all numbers from 2 to k-1 and see if they are divisors of k.
 * If none is, then the number is prime.
 * Print the numbers as identified 10 per line.
 * Compute the execution time for the entire program.
 */
public class P261NaivePrime {
    public static void main(String[] args) {
        System.out.println("Naive Prime by Giovanni Castillo on 09/07/2025");
        
        
        // read the number to which we compute the prime numbers (N)
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println("ERROR: the number is expected to be 2 or bigger.");
            return;
        }
        //mark the start of the execution 

        long startTime = System.currentTimeMillis();

        //for each number k from 2 to n check if its prime
        System.out.printf("The prime numbers up to %d are:", n);
        int noOfPrimes = 0;
        int noPerLine = 0;
        for (int k = 2; k <= n; k++) {
            boolean prime = true;
            //for each number from 2 to k - 1 check if divides k
            for (int i = 2; i < k - 1; i++) {
                if (k % i == 0) prime = false;
            }
            if (prime) {
                System.out.print(k + " ");
                noOfPrimes++;
                noPerLine++;
                if (noPerLine == 10) {
                    System.out.println();
                    noPerLine = 0;
                	}
            	}
        	}
        	//mark the end of the execution
        	
        	long endTime = System.currentTimeMillis();
        	
        	//compute and print the total time
        	long duration = endTime - startTime;
        	System.out.printf("The method took %d ms to execute.", duration);
        	System.out.printf("\nThere are %d primes less or equal with %d.\n", noOfPrimes, n);
        	System.out.printf("The method took %d ms to execute.\n", duration);
    
    }
}
