package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 266 Sieve of Eratosthenes Analysis
*/
/** REQUIREMENTS:
 * Modify program 265 to read a list of values from command line.
 * Compute the number of primes and execution time for each value (without printing the primes).
 * Print an analysis table at the end of the program.
 */
public class P266SieveOfEratosthenesAnalysis {
    public static void main(String[] args) {
        System.out.println("Sieve of Eratosthenes Analysis by Giovanni Castillo on 09/07/2025");
        //based on P263aNaivePrimeOptimization
        
        //uses the exact same code as P261NaivePrime.java with the optimization implemented

        // read the number to which we compute the prime numbers (N)
        System.out.println("n       primes   time(ms)");
        for (int arg = 0; arg < args.length; arg++) {
            int n = Integer.parseInt(args[arg]);
            
            if (n < 2) {
                System.out.printf("%d     ERROR\n", n);
                continue;
            }
            //mark the start of the execution 
            long startTime = System.currentTimeMillis();

            int noOfPrimes = 0;
            int noPerLine = 0;
            
            boolean[] prime = new boolean[n + 1]; // array to track prime status of numbers
            
            for (int k = 2; k <= n; k++) prime[k] = true; // initialize all numbers as prime

            for (int k = 2; k <= n; k++) {
                if (prime[k]) {
                    for (int i = 2 * k; i <= n; i += k) prime[i] = false; // mark multiples of k as non-prime
                }
            }
            
            for (int k = 2; k <= n; k++) {
                if (prime[k]) noOfPrimes++;
            }
            //mark the end of the execution
            long endTime = System.currentTimeMillis();
            
            //compute and print the total time
            long duration = endTime - startTime;
            System.out.printf("%-7d %-8d %-8d\n", n, noOfPrimes, duration);
        }
    }
}


