package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 212 Friends Height
*/
public class P212FriendsHeight {
/* Requirements: 
 * Read the heights of your friends from a text file (separated by space), 
 * as positive real numbers. 
 * Compute the number of friends, the maximum height (in feet and inches),
 *  the minimum height (in feet and inches), and the average height of your friends.*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Friends Height by Giovanni Castillo on 09/07/2025");
		System.out.println("The heights are: ");

		double height = Double.parseDouble(in.next());
		//initialize computations:
		int numberOfFriends=0;
		double minimumHeight = Double.POSITIVE_INFINITY;
		double maximumHeight = Double.NEGATIVE_INFINITY;
		double sumOfHeight = 0;
		double averageHeight = 0;
		
		
			while(height>=0) {
			System.out.print(height + " ");
			numberOfFriends++;
			sumOfHeight +=height;
			averageHeight = sumOfHeight/numberOfFriends;
			
				if(height > maximumHeight) {
					maximumHeight = height;
					}
					
				if(height < minimumHeight) {
					minimumHeight = height;
					}
			
			height = Double.parseDouble(in.next());
			}
		
		System.out.println();
		in.close();
		//print the final response for friend height
		System.out.println("The number of friends is " + numberOfFriends);
		System.out.println("the max height is: "+maximumHeight);
		System.out.println("The min height is: "+minimumHeight);
		System.out.println("the average height is: "+ averageHeight);
		
	}

}
