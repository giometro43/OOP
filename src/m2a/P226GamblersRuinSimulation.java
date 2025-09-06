package m2a;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-22
Program: 226 Gambler's Ruin Simulation
*/
public class P226GamblersRuinSimulation {
	/*Requirements: 
	 * Implement and modify Gambler's ruin simulation from the textbook or textbook website. 
	 *Modify, to show the results from several simulations not only one, 
	 *in a formatted table. 
	 *Compute the average over all simulations.
	 * Introduction to Programming in Java: an interdisciplinary approach, 2nd Ed. Pg 71)
	 **/
	//make changes to the original code so that it can run multiple simulations and show the results in a formatted table
	
	public static void main(String[] args) {
		System.out.println("Gamblers Ruin Simulation by Giovanni Castillo on 09/07/2025");
		int stake = Integer.parseInt(args[0]); // initial amount of money
		int goal = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);
		int totalBets = 0; 
		int totalWins = 0; 
		
		System.out.printf("%-10s %-10s %-10s %-10s%n", "Trial", "Bets", "Result", "Final Cash");
		System.out.printf("--------------------------------------------\n");
		/* The loop runs the number of times said by the cl arguments
		 * For each trial, it removes or adds the cash to the initial stake and 
		 * adds to the total bets and total wins */
		for (int t = 1; t <= trials; t++) { 
			int cash = stake;
			int bets = 0; 
			/*
			 * this part of the code simulates the betting process.
			 * The while loop continues as long as the gambler has some cash (cash > 0)
			 * and hasn't yet reached their goal (cash < goal) or when they bust */
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) cash++;
				else cash--;
			} // Cash is either 0 (ruin) or they meet the goal and win
			totalBets += bets;
			if (cash == goal) totalWins++;
			String result = (cash == goal) ? "Win" : "Ruin";
			System.out.printf("%-10d %-10d %-10s %-10d%n\n", t, bets, result, cash);	
		}
		System.out.println();
		System.out.printf("--------------------------------------------\n");
		System.out.printf("Overall Win Percentage: %.2f%n", 100.0 * totalWins / trials);
		System.out.printf("Average Number of Bets: %.2f%n", (double) totalBets / trials);
	}

}
