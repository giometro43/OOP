package m2b;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 258 Rare Cards
*/
/** REQUIREMENTS:
 * Modify program 257 to allow one of the cards (e.g. card 0)
 * to be twice as rare as the other cards.
 * Using a rare card will make the number of boxes needed much larger.
 * Investigate how much larger.
 */

//uses program structure and comments to divide up tasks like in P257.
public class P258RareCards {
    public static void main(String[] args) {
        System.out.println("Rare Cards by Giovanni Castillo on 09/07/2025");
        //read the number of players in the promotion
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;
        boolean error;
        do {
            System.out.print("Number of players: ");
            numberOfPlayers = scanner.nextInt();
            error = numberOfPlayers < 2;
            if (error) {
                System.out.println("ERROR: please provide a whole number greater than 1");
            }
        } while (error);
        // read the number of simulations
        int numberOfSimulations;
        do {
            System.out.println("Number of simulations: ");
            numberOfSimulations = scanner.nextInt();
            error = numberOfSimulations < 1;
            if (error) {
                System.out.println("ERROR: please provide a whole nuber at least 1");
            }
        } while (error);
        //define the array for the results of the simulation
        int[] numberOfBoxes = new int[numberOfSimulations];
        //for each simulation run the simulation and store the results
        for (int s = 1; s <= numberOfSimulations; s++) {
            boolean[] hasCard = new boolean[numberOfPlayers];
            boolean hasRare = false;
            int numberOfDifferentCards = 0;
            int boxNumber = 0;
            while (true) {
                boxNumber++;
                // pick a card: card 0 is rare (1/(numberOfPlayers+1)), others are normal (1/(numberOfPlayers+1) each)
                int card;
                if (Math.random() < (1.0 / (numberOfPlayers + 1))) {
                    card = 0; // rare card
                } else {
                    card = 1 + (int)(Math.random() * numberOfPlayers);
                }
                if (card == 0) {
                    hasRare = true;
                } else {
                    if (!hasCard[card - 1]) {
                        numberOfDifferentCards++;
                        hasCard[card - 1] = true;
                    }
                }
                boolean allNormal = (numberOfDifferentCards == numberOfPlayers);
                if (allNormal && hasRare) {
                    break;
                }
            }
            System.out.printf("Simulation %5d needs %4d boxes.\n", s, boxNumber);
            numberOfBoxes[s - 1] = boxNumber;
        }
        //process the result to compute average, minimum, maximum
        int sum = numberOfBoxes[0];
        int maximum = numberOfBoxes[0];
        int minimum = numberOfBoxes[0];
        for (int s = 1; s < numberOfSimulations; s++) {
            sum += numberOfBoxes[s];
            if (numberOfBoxes[s] < minimum) minimum = numberOfBoxes[s];
            else if (numberOfBoxes[s] > maximum) maximum = numberOfBoxes[s];
        }
        double average = 1.0 * sum / numberOfSimulations;
        //print the results
        System.out.println("Average number of Boxes:" + average);
        System.out.println("Min number of Boxes:" + minimum);
        System.out.println("Max number of Boxes:" + maximum);
        //close the scanner
        scanner.close();
    }
}