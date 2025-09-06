package m2a;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 225 Dice Roller Simulation
*/
public class P225DiceRollerSimulation {
	/*Requirements: 
	 * Repeats a simulation several times to check if a dice roller is fair. 
	 * Inputs the number of simulations and the number of trials per simulation from keyboard. 
	 * For each simulation, roll the die for each trial and record how many times each face was up (1, 2, 3, 4, 5, and 6). 
	 * Compute the percentages for each face (1-6). 
	 * Creates a table with the results and provide an average of all the simulations.*/
	public static void main(String[] args) {
		System.out.println("Dice Roller simulation by Giovanni Castillo on 09/07/2025");
		
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
		
		double sumOnePercent = 0;
		double sumTwoPercent = 0;
		double sumThreePercent = 0;
		double sumFourPercent = 0;
		double sumFivePercent = 0;
		double sumSixPercent = 0;


		
		
		
		//print a header for result table
		System.out.printf("SIM | ONE  | TWO  | THREE  | FOUR  | FIVE  | SIX  |\n");
		System.out.printf("                   \n");
		System.out.printf("----+------+------+--------+--------+------+------+\n");

		//for each simulation
		for (int s=1; s<= simulations; s++) {
			//compute the statistic

			int sumOne=0;
			int sumTwo=0;
			int sumThree=0;
			int sumFour=0;
			int sumFive=0;
			int sumSix=0;

			for (int t=1; t<=trials; t++) {
				//perform the trial
				int diceRoll = (int) (1+ Math.random() *6);
				switch(diceRoll) {
				case 1: sumOne++;break;
				case 2: sumTwo++;break;
				case 3: sumThree++;break;
				case 4: sumFour++;break;
				case 5: sumFive++;break;
				case 6: sumSix++;break;

				}
			}
			
			
			double averageOnePerc = 100.0 * sumOne / trials;

			double averageTwoPerc = 100.0 * sumTwo / trials;

			double averageThreePerc = 100.0 * sumThree / trials;

			double averageFourPerc = 100.0 * sumFour / trials;

			double averageFivePerc = 100.0 * sumFive / trials;
			
			double averageSixPerc = 100.0 * sumSix / trials;

			sumOnePercent += averageOnePerc;
			sumTwoPercent += averageTwoPerc;
			sumThreePercent += averageThreePerc;
			sumFourPercent += averageFourPerc;
			sumFivePercent += averageFivePerc;
			sumSixPercent += averageSixPerc;

	
			
			
			//print the statistic

			System.out.printf("%3d |%6.2f|%6.2f| %6.2f | %6.2f| %6.2f|%6.2f|\n",s, averageOnePerc, averageTwoPerc , averageThreePerc, averageFourPerc, averageFivePerc, averageSixPerc);

		}
		//Computer and print the average result of all simulations
		
		//close the scanner
		in.close();
		
		
		
	}
	
}
