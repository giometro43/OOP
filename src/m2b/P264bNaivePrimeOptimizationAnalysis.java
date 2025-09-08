package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-22
Program: 264b Naive Prime Optimization Analysis
*/
/** REQUIREMENTS:
 * Modify program 263b to read a list of values from the command line.
 * Compute the number of primes and execution time for each value (without printing the primes).
 * Print an analysis table at the end of the program.
 */
public class P264bNaivePrimeOptimizationAnalysis {
    public static void main(String[] args) {
        System.out.println("Naive Prime Optimization Analysis (b) by Giovanni Castillo on 09/08/2025");
        System.out.println("n       primes   time(ms)");
        for (int arg = 0; arg < args.length; arg++) {
            int n = Integer.parseInt(args[arg]);
            if (n < 2) {
                System.out.printf("%d     ERROR\n", n);
                continue;
            }
            long startTime = System.currentTimeMillis();
            int noOfPrimes = 0;
            for (int k = 2; k <= n; k++) {
                boolean prime = true;
                for (int i = 2; i <= k / 2; i++) {
                    if (k % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    noOfPrimes++;
                }
            }
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.printf("%-7d %-8d %-8d\n", n, noOfPrimes, duration);
        }
    }
}