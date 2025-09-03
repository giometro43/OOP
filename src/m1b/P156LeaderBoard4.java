package m1b;

import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Conditionals
Assignment: M1A-21
Program: 156 Leader Board 4
*/
public class P156LeaderBoard4 {
	/* (PROGRAM 1)Requirements: 
	 * Read from the command line the user name (a single word) and number of points (double) for 3 gamers. 
	 * Print the leader board starting with the user having the most points. */
	
	
	//Requirements: Same as program 1 but for 4 gamers. Tell if we have a winner or there is a tie for first place.
	


	public static void main(String[] args) {
		
		System.out.println("Leader Board by Giovanni Castillo on 08/31/2025");
		
		Scanner in = new Scanner(System.in);
		// initialize the variables to be used for the scores in CLI
		String user1 = args[0];
		double points1 = Double.parseDouble(args[1]);
		String user2 = args[2];
		double points2 = Double.parseDouble(args[3]);
		String user3 = args[4];
		double points3 = Double.parseDouble(args[5]);
		String user4 = args[6];
		double points4 = Double.parseDouble(args[7]);
	
		
		if(points1 < points2) { 
			String tempUser = user1;
			user1 = user2;
			user2 = tempUser;
			double tempPoints = points1;
			points1 = points2;
			points2 = tempPoints;
			}
		if (points2 < points3) {
			//changes user 2 with user3
			String tempUser = user3;
			user3 = user2;
			user2 = tempUser;
			double tempPoints = points3;
			points3 = points2;
			points2 = tempPoints;
 
			if (points1 < points2) { 
				tempUser = user1;
				user1 = user2;
				user2 = tempUser;
				tempPoints = points1;
				points1 = points2;
				points2 = tempPoints;
			}
		
		}
		//Adds the 4th user and points to the leaderboard, and sorts them depending on the points that they have
		if (points3 < points4) {
			//changes user 3 with user4
			String tempUser = user4;
			user4 = user3;
			user3 = tempUser;
			double tempPoints = points4;
			points4 = points3;
			points3 = tempPoints;
 
			if (points2 < points3) { 
				tempUser = user2;
				user2 = user3;
				user3 = tempUser;
				tempPoints = points2;
				points2 = points3;
				points3 = tempPoints;
				
				if (points1 < points2) { 
					tempUser = user1;
					user1 = user2;
					user2 = tempUser;
					tempPoints = points1;
					points1 = points2;
					points2 = tempPoints;
				}
			}
		}
		System.out.println("LEADER BOARD: ");
		System.out.println("user " + user1 + ",  - Points: " + points1);
		System.out.println("user " + user2 + ",  - Points: " + points2);
		System.out.println("user " + user3 + ",  - Points: " + points3);
		System.out.println("user " + user4 + ",  - Points: " + points4);

	}

}

