package m3a;
import java.util.Scanner;
/**REQUIREMENTS:
 * Refactor the program 321 to use methods.
 * Create methods for all elementary operations and for organizing the code.
 */
public class P322RandomRoomMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Random room methods - Giovanni Castillo - 05/14/2025");
		Scanner scanner = new Scanner(System.in);
		int length = readDimension("The length of the room is:", scanner);
		int width = readDimension("The width of the room is:", scanner);
		char[][] room = createEmptyRoom(width, length);
		placeExit(room);
		placePlayer(room);
		addWalls(room);
		int numberObstacles = readNumberObstacles(width, length, scanner);
		scanner.close();
		placeObstacles(room, numberObstacles);
		printRoom(room);
	}

	/**
	 * Reads and validates a room dimension (length or width)
	 */
	public static int readDimension(String prompt, Scanner scanner) {
		int value;
		boolean error;
		do {
			System.out.println(prompt);
			value = scanner.nextInt();
			error = (value < 4 || value > 30);
			if (error) System.out.println("ERROR: the " + (prompt.contains("lenfth") ? "length" : "width") + " must be between 4 and 30");
		} while (error);
		return value;
	}

	/**
	 * Creates and initializes the room as empty
	 */
	public static char[][] createEmptyRoom(int width, int length) {
		char[][] room = new char[width][length];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				room[i][j] = '.';
			}
		}
		return room;
	}

	/**
	 * Randomly places the exit 'E' in the room
	 */
	public static void placeExit(char[][] room) {
		int width = room.length;
		int length = room[0].length;
		int exitRow = (int) (Math.random() * width);
		int exitCol = (int) (Math.random() * length);
		room[exitRow][exitCol] = 'E';
	}

	/**
	 * Randomly places the player 'o' in the room (not on a wall or exit)
	 */
	public static void placePlayer(char[][] room) {
		int width = room.length;
		int length = room[0].length;
		int playerRow, playerCol;
		do {
			playerRow = (int) (Math.random() * (width - 2));
			playerCol = (int) (Math.random() * (length - 2));
		} while (room[playerRow][playerCol] != '.');
		room[playerRow][playerCol] = 'o';
	}

	/**
	 * Adds border walls '#' around the room
	 */
	public static void addWalls(char[][] room) {
		int width = room.length;
		int length = room[0].length;
		for (int i = 0; i < width; i++) {
			if (room[i][0] == '.') room[i][0] = '#';
			if (room[i][length - 1] == '.') room[i][length - 1] = '#';
		}
		for (int j = 0; j < length; j++) {
			if (room[0][j] == '.') room[0][j] = '#';
			if (room[width - 1][j] == '.') room[width - 1][j] = '#';
		}
	}

	/**
	 * Reads and validates the number of obstacles
	 */
	public static int readNumberObstacles(int width, int length, Scanner scanner) {
		int numberObstacles;
		boolean error;
		do {
			System.out.println("Enter the number of obstacles :");
			numberObstacles = scanner.nextInt();
			error = (numberObstacles < 0 || numberObstacles > 0.3 * (length - 2) * (width - 2));
			if (error) System.out.println("ERROR: Invalid number of obstacles");
		} while (error);
		return numberObstacles;
	}

	/**
	 * Randomly places obstacles '#' inside the room
	 */
	public static void placeObstacles(char[][] room, int numberObstacles) {
		int width = room.length;
		int length = room[0].length;
		for (int o = 1; o <= numberObstacles; o++) {
			int obstacleRow, obstacleCol;
			do {
				obstacleRow = 1 + (int) (Math.random() * (width - 2));
				obstacleCol = 1 + (int) (Math.random() * (length - 2));
			} while (room[obstacleRow][obstacleCol] != '.');
			room[obstacleRow][obstacleCol] = '#';
		}
	}

	/**
	 * Prints the room matrix
	 */
	public static void printRoom(char[][] room) {
		int width = room.length;
		int length = room[0].length;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
	}
}