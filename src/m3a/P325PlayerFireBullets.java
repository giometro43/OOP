package m3a;

import java.util.Scanner;

/**REQUIREMENTS:
 * Modify the program 1 to allow the user to fire a bullet in a direction 
 * (using fa, fs, fd or fw as input). 
 * The bullet will move one cell at each turn and 
 * will kill the monster but will be destroyed by a wall.*/
public class P325PlayerFireBullets {

	/**@author Giovanni Castillo AIT502-11
	Module: Static Methods
	Assignment:
	Program: 
	*/
	public static void main(String[] args) {
		System.out.println("Player fire bullets - Giovanni Castillo - 05/14/2025");
		//cells in the room
		final char EMPTY_CELL = '.';
		final char EXIT_CELL = 'E';
		final char PLAYER_CHAR = 'o';
		final char MONSTER_CHAR = '*';
		final char WALL_CELL = '#';
		final char WIN_CHAR = 'W';
		final char LOSE_CHAR = '@';
		final char BULLET_CHAR = 'B';

		Scanner scanner = new Scanner(System.in);
		// read the length (no of columns) and the width (no of rows) of the room
		int length;
		boolean error = false;
		do {
			System.out.println("The lenfth of the room is:");
			length = scanner.nextInt();
			error =(length <4 || length > 30);
			if (error) System.out.println("ERROR: the length must be between 4 and 30");
		}while (error);

		int width;
		do {
			System.out.println("The width of the room is:");
			width = scanner.nextInt();
			error =(width <4 || width > 30);
			if (error) System.out.println("ERROR: the width must be between 4 and 30");
		}while (error);

		// declare and initialize the room as empty
		char [][] room = new char [width][length];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				room[i][j] = EMPTY_CELL;
			}
		}

		// place the exit
		int exitRow = (int)(Math.random() * width);
		int exitCol = (int)(Math.random() * length);
		room[exitRow][exitCol] = EXIT_CELL;

		// place the player
		int playerRow;
		int playerCol;
		do {
			playerRow = (int)(Math.random() * (width-2));
			playerCol = (int)(Math.random() * (length-2));
		}while (room[playerRow][playerCol] !=EMPTY_CELL);
		room[playerRow][playerCol] = PLAYER_CHAR;

		// add the walls
		for (int i=0; i<width; i++) {
			if (room[i][0] ==EMPTY_CELL) room [i][0] = WALL_CELL;
			if (room[i][length-1] ==EMPTY_CELL) room [i][length-1] = WALL_CELL;
		}
		for (int j=0; j<length; j++) {
			if (room[0][j] ==EMPTY_CELL) room [0][j] = WALL_CELL;
			if (room[width-1][j] ==EMPTY_CELL) room [width-1][j] = WALL_CELL;
		}

		// read the number of obstacles
		int numberObstacles;
		do {
			System.out.println("Enter the number of obstacles :");
			numberObstacles = scanner.nextInt();
			error = (numberObstacles <0 || numberObstacles > 0.3 * (length-2) * (width-2));
			if (error) System.out.println("ERROR: Invalid number of obstacles");
		}while (error);

		// place the inside obstacles 
		for (int o=1; o<=numberObstacles; o++) {
			int obstacleRow;
			int obstacleCol;
			do {
				obstacleRow = 1+ (int)(Math.random() * (width-2));
				obstacleCol = 1+ (int)(Math.random() * (length-2));
			}while (room[obstacleRow][obstacleCol] !=EMPTY_CELL);
			room[obstacleRow][obstacleCol] = '#';
		}

		//place the monster
		int monsterRow;
		int monsterCol;
		do {
			monsterRow = 1+ (int)(Math.random() * (width-2));
			monsterCol = 1+ (int)(Math.random() * (length-2));
		}while (room[monsterRow][monsterCol] !=EMPTY_CELL);
		room [monsterRow][monsterCol] = MONSTER_CHAR;

		// bullet state
		boolean bulletActive = false;
		int bulletRow = -1, bulletCol = -1, bulletDr = 0, bulletDc = 0;

		// repeat turn by turn move 
		boolean winner = false;
		boolean loser = false;
		do {
			//print the room
			for (int i=0; i<width ; i++) {
				for (int j=0; j<length; j++) {
					System.out.print(room[i][j] + " ");
				}
				System.out.println();
			}

			// ask the user to move or fire
			System.out.println("Enter your move (a=left, s=down, d=right, w=up, fa=fire left, fs=fire down, fd=fire right, fw=fire up):");
			String moveInput = scanner.next();
			char move = moveInput.charAt(0);
			boolean fire = moveInput.length() == 2 && moveInput.charAt(0) == 'f';

			int row = playerRow;
			int col = playerCol;

			if (fire && !bulletActive) {
				// Fire a bullet if none is active
				char fireDir = moveInput.charAt(1);
				switch (fireDir) {
					case 'a': bulletDr = 0; bulletDc = -1; break;
					case 'd': bulletDr = 0; bulletDc = 1; break;
					case 'w': bulletDr = -1; bulletDc = 0; break;
					case 's': bulletDr = 1; bulletDc = 0; break;
					default: bulletDr = 0; bulletDc = 0; break;
				}
				if (bulletDr != 0 || bulletDc != 0) {
					bulletRow = playerRow;
					bulletCol = playerCol;
					bulletActive = true;
				}
				// Player does not move this turn if firing
			} else if (!fire) {
				switch (move) {
					case 'a': col--; break;
					case 'd': col++; break;
					case 's': row++; break;
					case 'w': row--; break;
					default: System.out.println("ERROR: invalid move, use a,s,d,w or fa,fs,fd,fw");
				}
				// Handle player movement
				switch (room[row][col]) {
					case EXIT_CELL:
						winner = true;
						room[playerRow][playerCol] = EMPTY_CELL;
						room[row][col] = WIN_CHAR;
						playerRow = row;
						playerCol = col;
						break;
					case EMPTY_CELL:
						room[playerRow][playerCol] = EMPTY_CELL;
						playerRow = row;
						playerCol = col;
						room[playerRow][playerCol] = PLAYER_CHAR;
						break;
					case PLAYER_CHAR:
						break;
					default:
						loser = true;
						room[playerRow][playerCol] = EMPTY_CELL;
						playerRow = row;
						playerCol = col;
						room[playerRow][playerCol] = LOSE_CHAR;
						break;
				}
			}

			// Move the bullet if active
			if (bulletActive) {
				// Remove bullet from previous cell if not just fired
				if (!(bulletRow == playerRow && bulletCol == playerCol)) {
					room[bulletRow][bulletCol] = EMPTY_CELL;
				}
				bulletRow += bulletDr;
				bulletCol += bulletDc;
				if (room[bulletRow][bulletCol] == WALL_CELL) {
					bulletActive = false;
				} else if (room[bulletRow][bulletCol] == MONSTER_CHAR) {
					room[bulletRow][bulletCol] = EMPTY_CELL;
					bulletActive = false;
					System.out.println("You killed the monster!");
				} else {
					room[bulletRow][bulletCol] = BULLET_CHAR;
				}
			}

			if(winner||loser) break;
			// move the monster
			row = monsterRow + (int)(Math.random() * 3) -1;
			col = monsterCol + (int)(Math.random() * 3) -1;
			switch (room[row][col]) {
				case PLAYER_CHAR:
					loser = true;
					room[monsterRow][monsterCol] = EMPTY_CELL;
					monsterRow = row;
					monsterCol = col;
					room[monsterRow][monsterCol] = LOSE_CHAR;
					break;
				case EMPTY_CELL:
					room[monsterRow][monsterCol] = EMPTY_CELL;
					monsterRow = row;
					monsterCol = col;
					room[monsterRow][monsterCol] = MONSTER_CHAR;
					break;
				default:
					break;
			}
			if (loser) break;
			//check the status
		} while (true);

		// print the message win or lost and the final version of the room
		for (int i=0; i<width ; i++) {
			for (int j=0; j<length; j++) {
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
		if (winner) System.out.println("YOU WIN!");
		else if (loser) System.out.println("YOU LOSE!");
		scanner.close();
	}
}