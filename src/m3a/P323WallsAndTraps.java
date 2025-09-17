package m3a;

/**REQUIREMENTS:
 * Modify the program 1 to place a trap on the board randomly. 
 * A trap has the following format (horizontal or vertical):
	###
	...
	###
	If the player enters the trap it will close the exits, trapping the player inside:
	###
	#o#
	### */
public class P323WallsAndTraps {

	/**@author Giovanni Castillo AIT502-11
	Module: Static Methods
	Assignment: M3A-21
	Program: 323 - Walls and Traps
	*/
	public static void main(String[] args) {
		System.out.println("Walls and Traps - Giovanni Castillo - 09/15/2025");
		// Use methods from P322RandomRoomMethods for room setup
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int length = P322RandomRoomMethods.readDimension("The lenfth of the room is:", scanner);
		int width = P322RandomRoomMethods.readDimension("The width of the room is:", scanner);
		char[][] room = P322RandomRoomMethods.createEmptyRoom(width, length);
		P322RandomRoomMethods.placeExit(room);
		P322RandomRoomMethods.placePlayer(room);
		P322RandomRoomMethods.addWalls(room);
		int numberObstacles = P322RandomRoomMethods.readNumberObstacles(width, length, scanner);
		scanner.close();
		P322RandomRoomMethods.placeObstacles(room, numberObstacles);

		// Place a trap randomly (horizontal orientation)
		int trapRow = -1, trapCol = -1;
		boolean placed = false;
		while (!placed) {
			trapRow = 1 + (int)(Math.random() * (width - 3)); // ensure 3x3 fits
			trapCol = 1 + (int)(Math.random() * (length - 3));
			if (canPlaceTrap(room, trapRow, trapCol)) {
				placeTrap(room, trapRow, trapCol);
				placed = true;
			}
		}

		// Print the initial room
		P322RandomRoomMethods.printRoom(room);

		// Simulate player movement: check if player is inside trap, if so, close trap
		if (placed && playerInTrap(room, trapRow, trapCol)) {
			closeTrap(room, trapRow, trapCol);
			System.out.println("\nThe player has entered the trap! The trap closes...");
			P322RandomRoomMethods.printRoom(room);
		}
	}

	/**
	 * Checks if a 3x3 trap can be placed at the given position (no player, exit, or obstacles)
	 */
	public static boolean canPlaceTrap(char[][] room, int row, int col) {
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (room[i][j] != '.') return false;
			}
		}
		return true;
	}

	/**
	 * Places a horizontal trap at the given position
	 */
	public static void placeTrap(char[][] room, int row, int col) {
		// Top and bottom rows: ###
		for (int j = col; j < col + 3; j++) {
			room[row][j] = '#';
			room[row+2][j] = '#';
		}
		// Middle row: ...
		for (int j = col; j < col + 3; j++) {
			room[row+1][j] = '.';
		}
	}

	/**
	 * Checks if the player is inside the trap (center cell)
	 */
	public static boolean playerInTrap(char[][] room, int row, int col) {
		return room[row+1][col+1] == 'o';
	}

	/**
	 * Closes the trap, trapping the player inside
	 */
	public static void closeTrap(char[][] room, int row, int col) {
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				room[i][j] = '#';
			}
		}
		room[row+1][col+1] = 'o';
	}
}