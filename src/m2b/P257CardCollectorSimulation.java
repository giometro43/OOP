package m2b;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 257 Card Collector Simulation
*/
/** REQUIREMENTS:
 * A cereal producer puts in each box of cereals a collector card with a player.
 * We want to know the average number of boxes that need to be bought to get all the cards.
 * Run simulations that randomly pick a card for each bought box, until all cards are collected.
 * The user provides the number of players in the promotion and how many simulations to run.
 * Compute and print statistics: average number of boxes bought;
 * minimum number of boxes bought; maximum number of boxes bought.
 */
public class P257CardCollectorSimulation {
    public static void main(String[] args) {
        System.out.println("Card Collector Simulation by Giovanni Castillo on 09/08/2025");
        
        //read the number of players in the promotion
        Scanner scanner =new Scanner(System.in);
        int numberOfPlayers;
        boolean error;
        
        do {
        	System.out.print("Number of players: ");
        	numberOfPlayers = scanner.nextInt();
        	error = numberOfPlayers <2;
        	if(error) {
        		System.out.println("ERROR: please provide a whole number greater than 1");
        	}
        }while(error);
        
        
        // read the number of simulations
        int numberOfSimulations;
        do {
        	System.out.println("Number of simulations: ");
        	numberOfSimulations = scanner.nextInt();
        	error = numberOfSimulations <1;
        	if (error) {
        		System.out.println("ERROR: please provide a whole nuber at least 1");

        	} 
        }while (error);
        
        //define the array for the results of the simulation
        int [] numberOfBoxes = new int[numberOfSimulations];
        
        //for each simulation run the simulation and store the results
        for (int s=1; s<= numberOfSimulations; s++) {
        	
        
        //initialize the marker that keeps what cards I already bought
        boolean[] bought =new boolean[numberOfPlayers];
        	//no card bought
        	for (int c=0; c<numberOfPlayers; c++)bought[c]= false;
        		int numberOfDifferentCards = 0;
        		int boxNumber = 0;
        		
        		do {
        			boxNumber++;
        			int cardNumber = (int) (Math.random()*numberOfPlayers);
        			if(!bought [cardNumber]) {
        				numberOfDifferentCards++;
        				bought[cardNumber] = true;
        				
        			}
        			
        		}while(numberOfDifferentCards < numberOfPlayers);
        		System.out.printf("Simulation %5d needs %4d boxes.\n", s, boxNumber);
        		numberOfBoxes[s-1] = boxNumber;
        		
        } 
        
        //process the result to compute average, minimum, maximum
        int sum =numberOfBoxes[0];
        int maximum =numberOfBoxes[0];
        int minimum =numberOfBoxes[0];
        for (int s=1; s<numberOfSimulations; s++) {
        	sum  += numberOfBoxes[s];
        	if(numberOfBoxes[s]<minimum)minimum = numberOfBoxes[s];
        	else if(numberOfBoxes[s]>maximum)maximum =numberOfBoxes[s];
        }
        double average =1.0 * sum/numberOfSimulations;

        //print the results
        System.out.println("Average number of Boxes:" + average);
        System.out.println("Min number of Boxes:" + minimum);
        System.out.println("Max number of Boxes:" + maximum);

         }
 }

    

