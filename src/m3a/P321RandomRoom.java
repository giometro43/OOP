package m3a;
import java.util.Scanner;
/**REQUIREMENTS: 
 * Create the representation of a room in a game as a matrix. 
 * Read the length and width of the room as two integers. 
 * We will have "width" rows and "length" columns in the matrix. 
 * Around the room there is a wall marked with '#'. 
 * In the room there is one exit marked with 'E' randomly placed. 
 * Also in the room there is a player marked with o. 
 * Empty spaces are marked with '.' 
 * Read a number of obstacles (walls '#') and place that number in the matrix. 
 * Check that your number is not too big compared with the length and width 
 * (i.e. less or equal with .2 * (length-2) * (width-2) ). 
 * Print the obtained matrix.*/
public class P321RandomRoom {
	/**@author Giovanni Castillo AIT502-11
	Module: Static Methods
	Assignment: M3A-21
	Program: 321 - Random Room
	*/
	public static void main(String[] args) {
		System.out.println("Random room - Giovanni Castillo - 05/14/2025");
		Scanner scanner = new Scanner(System.in);
		// read the length (no of columns) and the width (no of rows) of the room
		int length;
		boolean error = false;
		do {
			System.out.println("The lenfth of the room is:");
			length = scanner.nextInt();
			error =(length <4 || length > 30);
			if (error) 	System.out.println("ERROR: the length must be between 4 and 30");
			
		}while (error);
		
		int width;
		do {
			System.out.println("The width of the room is:");
			width = scanner.nextInt();
			error =(width <4 || width > 30);
			if (error) 	System.out.println("ERROR: the width must be between 4 and 30");
		}while (error);
		// declare and initialize the room as empty
		char [][] room = new char [width][length];
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				room[i][j] = '.';
			}
		}
		// place the exit
		int exitRow = (int)(Math.random() * width);
		int exitCol = (int)(Math.random() * length);
		room[exitRow][exitCol] = 'E';
		// place the player
		int playerRow;
		int playerCol;
		do {
			playerRow = (int)(Math.random() * (width-2));
			playerCol = (int)(Math.random() * (length-2));
		}while (room[playerRow][playerCol] !='.');
		room[playerRow][playerCol] = 'o';
		// add the walls
		for (int i=0; i<width; i++) {
			if (room[i][0] =='.') room [i][0] = '#';
			if (room[i][length-1] =='.') room [i][length-1] = '#';
		}
		for (int j=0; j<length; j++) {
			if (room[0][j] =='.') room [0][j] = '#';
			if (room[width-1][j] =='.') room [width-1][j] = '#';
		}
		// read the number of obstacles
		int numberObstacles;
		do {
			System.out.println("Enter the number of obstacles :");
			numberObstacles = scanner.nextInt();
			error = (numberObstacles <0 || numberObstacles > 0.3 * (length-2) * (width-2));
			if (error) System.out.println("ERROR: Invalid number of obstacles");
		}while (error);
		scanner.close();
		// place the inside obstacles 
		for (int o=1; o<=numberObstacles; o++) {
			int obstacleRow;
			int obstacleCol;
			do {
				obstacleRow = 1+ (int)(Math.random() * (width-2));
				obstacleCol = 1+ (int)(Math.random() * (length-2));
			}while (room[obstacleRow][obstacleCol] !='.');
			room[obstacleRow][obstacleCol] = '#';
		}
		
		//print the room
		for (int i=0; i<width ; i++) {
			for (int j=0; j<length; j++) {
				System.out.print(room[i][j] + " ");
				
			}
			System.out.println();
		}
		}

}