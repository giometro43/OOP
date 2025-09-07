package m2b;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 251 Girls Teams
*/
/** REQUIREMENTS:
 * Imagine a game, in which the computer creates girl teams of soccer players
 * to simulate a tournament in which the user will participate.
 * The program reads a list of 100 possible names (first names) of girls from a file,
 * that is explicitly specified in the program. It stores the names in an array of Strings,
 * and prints the names separated by a space in the console.
 * Then asks the user to provide a number of teams and team sizes
 * and randomly prints teams with that number of players.
 */
public class P251GirlsTeams {
    public static void main(String[] args) throws 
    FileNotFoundException{
        System.out.println("Girls Teams by Giovanni Castillo on 09/08/2025");
        
        // intro to arrays, which will be used to store the names
        Scanner scanner= null; 
        try {
        scanner = new Scanner(new File("/Users/giovannicastillo/OOP/src/m2b/girl-names.txt"));
        }
        catch (FileNotFoundException e) {
        	e.printStackTrace(); // Print the stack trace for debugging
			System.out.println("File not found. ");
			return;
		}
        //declare and initialize the array 
        //read the list with all the names of the girls
        String[] allNames = new String[100];//size of 100, and declare array type as string
        for (int i= 0; i <100; i++) {
        	allNames[i] = scanner.next();
        	
        }
        //Print the names serperated by a space
        
        System.out.println("All the names are: ");
        for (int i=0;i<100; i ++) {
        	System.out.print(allNames[i]);
        }
        System.out.println();
        
        
        //read the number of teams and the team sizes

        Scanner in = new Scanner(System.in); //second scanner defined for the user keyboard input
        int numberOfTeams = 0;
        boolean error = false;
        do {
        	System.out.print("Provide number of teams: ");
        	numberOfTeams =	in.nextInt();
        	error = numberOfTeams <1; // if number of teams is less than 1 throw error
        	if (error)System.out.println("ERROR: the number of teams must be at least one.");
        }  while(error);
        
        int teamSize = 0;
   
        do {
        	System.out.print("Provide the size of the team: ");
        	teamSize =	in.nextInt();
        	error = teamSize <1; //if team Size is less than 1 throw error
        	if (error)System.out.println("ERROR: The team size must be at least one: ");
        }  while(error);
                
        
        // generate and print the teams
        for (int teamNumber = 1; teamNumber <=numberOfTeams; teamNumber++) {
        	System.out.print("Team " + teamNumber+ ": ");
        	for (int memberNumber = 1; memberNumber <=teamSize; memberNumber++) {
            	int nameIndex= (int)(Math.random()*100);
            	System.out.print(allNames[nameIndex]+" ");
            }
        	System.out.println();
        			
        }
        
        //close scanner
        scanner.close();
    }
}
