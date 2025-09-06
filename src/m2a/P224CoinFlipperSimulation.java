package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 224 Coin Flipper Simulation
*/
public class P224CoinFlipperSimulation {
	/*Requirements: https://youtu.be/4CCnNhXD09o 
	 *Repeats a simulation several times to check if a coin flipper is fair. 
	 *Inputs the number of simulations
	 *and the number of trials per simulation from keyboard. 
	 *For each simulation:
	 *flip the coin for each trial and record how many times was head and how many times was tail. 
	 *Compute the percentages for heads and tails. 
	 *Creates a table with the results and provide an average of all the simulations.*/
	public static void main(String[] args) {
		System.out.println("Coin flipper simulation by Giovanni Castillo on 09/07/2025");
		
		//read the number of simulations adn the number of trials from keyboard
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your number of simulations please(1 to 999): ");
		int simulations = in.nextInt();
		while(simulations <1 || simulations >999) {
			
			System.out.println("ERROR NUM OF SIMS > 1(1 -999). TRY AGAIN ");
			System.out.println("Enter your number of simulations please: ");
			simulations = in.nextInt();

		}
		System.out.println("Enter your number of trials to run in each sim please: ");
		int trials = in.nextInt();
		while(trials <1) {
			
			System.out.println("ERROR NUM OF TRIALS > 1. TRY AGAIN ");
			System.out.println("Enter your number of trials to run in each sim please:");
			trials = in.nextInt();

		}
		
		//prepare the sum of results
		double sumHeadPercent = 0; //initialize
		double sumTailsPercent = 0;
		
		
		
		//print a header for result table
		System.out.printf("SIM | HEADS | TAILS\n");
		System.out.printf("                   \n");
		System.out.printf("----+-------+------\n");

		//for each simulation
		for (int s=1; s<= simulations; s++) {
			//compute the statistic
			int sumHeads = 0;
			int sumTails = 0;
			for (int t=1; t<=trials; t++) {
				//perform the trial
				boolean isHead = Math.random() < 0.5;

				if(isHead)sumHeads++; else sumTails++;
			}
			double averageHeadsPerc = 100.0 * sumHeads / trials;
			double averageTailsPerc = 100.0 * sumTails / trials;
			sumHeadPercent += averageHeadsPerc;
			sumTailsPercent += averageHeadsPerc;
			
			
			//print the statistic
			System.out.printf("%3d | %6.2f  | %6.2f \n",s, averageHeadsPerc, averageTailsPerc);

		}
		//Computer and print the average result of all simulations
		
		//close the scanner
		in.close();
		
		
		
	}

}
