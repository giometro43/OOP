package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 262 Naive Prime Analysis
*/
/** REQUIREMENTS:
 * Modify the program 261 to read a list of values from command line.
 * Compute the number of primes and execution time for each value (without printing the primes).
 * Print an analysis table at the end of the program.
 */

public class P262NaivePrimeAnalysis {
    public static void main(String[] args) {
        System.out.println("Naive Prime Analysis by Giovanni Castillo on 09/08/2025");
        
        if (args.length == 0) {
            System.out.println("ERROR: Please provide at least one integer argument in the Run Configurations.");
            return;
        }
        // print the header of the analysis table
        System.out.println("n       primes   time(ms)");
        for (int arg = 0; arg < args.length; arg++) {
            int n = Integer.parseInt(args[arg]);
            if (n < 2) {
                System.out.printf("%d     ERROR\n", n);
                continue;
            }
            // mark the start of the execution
            long startTime = System.currentTimeMillis();
            int noOfPrimes = 0;
            // for each number k from 2 to n check if its prime
            for (int k = 2; k <= n; k++) {
                boolean prime = true;
                for (int i = 2; i < k; i++) {
                    if (k % i == 0) prime = false;
                }
                if (prime) {
                    noOfPrimes++;
                }
            }
            // mark the end of the execution.
            long endTime = System.currentTimeMillis();
            // compute and print the total time
            long duration = endTime - startTime;
            System.out.printf("%-7d %-8d %-8d\n", n, noOfPrimes, duration);
        }
    }
}
  