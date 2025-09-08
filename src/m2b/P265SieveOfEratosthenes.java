package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 265 Sieve of Eratosthenes
*/
/** REQUIREMENTS:
 * Given a number n in the command line, compute and print all the prime numbers less or equal with n.
 * Implement the optimized method, Sieve of Eratosthenes.
 * Print the numbers as identified 10 per line.
 * Compute the execution time for the entire program.
 * Compare the times with the previous executions.
 */
public class P265SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println("Sieve of Eratosthenes by Giovanni Castillo on 09/07/2025");
        
        //based on P263aNaivePrimeOptimization
        
         
        
        //uses the exact same code as P261NaivePrime.java with the optimization implemented

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
        
        boolean[] prime =new boolean[n + 1]; // array to track prime status of numbers
        
        for (int k = 2; k <= n; k++) prime[k] = true; // initialize all numbers as prime

        
        for (int k = 2; k <= n; k++) {
        	
            
           
            
            if (prime[k]) {
            	 for(int i = 2*k; i<=n; i+=k) prime[i] = false; // mark multiples of k as non-prime
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
