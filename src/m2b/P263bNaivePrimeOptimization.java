package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 263b Naive Prime Optimization
*/
/** REQUIREMENTS:
 * Given a number n in the command line, compute and print all the prime numbers less or equal with n.
 * Optimization 2: check only divisors less or equal with n/2.
 * Print the numbers as identified 10 per line.
 * Compute the execution time for the entire program.
 */
public class P263bNaivePrimeOptimization {
    public static void main(String[] args) {
        System.out.println("Naive Prime Optimization (b) by Giovanni Castillo on 09/08/2025");
        
        
        
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
            for (int i = 2; i <= k / 2; i++) { // optimization: check only up to k/2
                if (k % i == 0) {
                	prime = false;
                	break; // optimization: stop testing if a divisor is found
                }
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
