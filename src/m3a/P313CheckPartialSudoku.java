package m3a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author Giovanni Castillo AIT502-11
 * Module: 3A
 * Assignment: Static Methods
 * Program: 313 - Check partial Sudoku*/
public class P313CheckPartialSudoku {
    /**
     * REQUIREMENTS:
     * The program will receive a Sudoku table in a file, the numbers 1-9 without spaces for the placed numbers and 0 to represent an empty space. Place an empty line at the end.
     * Check that the table is a partial correct solution.
     *
     * Grading: 25 points
     *
     * Specific instructions:
     * - Follow the video to create your code
     * - Include all the programs in the package m3a
     * - The class (program) name must be: P313CheckPartialSudoku
     * - Start the program printing: name of the program, your name, current date
     * - Add Javadoc comments
     * - Add inline comments
     */
	/**
	 * Check if the set is a correct sudoku set
	 * all digits from 1 to 9 only once
	 * @param set A string of 9 digits (0 for empty space)
	 * @return true if a correct sudoku set, false otherwise
	 */
	
	/**
	 * Check if the set is a correct sudoku set
	 * @param set A string of 9 digits (0 for empty space)
	 * @return true if a correct sudoku set, false otherwise
	 */
	public static boolean checkSet(String set) {
		boolean[] found = new boolean[10]; 
		for (int i = 0; i < 10; i++) found[i] = false;
			for (int i = 0; i <set.length(); i++) {
				int d = set.charAt(i)-'0' ;
				if (d == 0) continue; // FIX: skip zeros correctly
				if (found[d]) {
					return false;
				}
			found[d] = true;
		}
		return true; 
	}
	/**
	 * return a string with the digits on the required column from the table
	 * @param table A table as an array of strings
	 * @param column the index of the column needed
	 * @return a string with the characters on the required column
	 */
	public static String getColumn(String[] table, int column) {
		String result = "";
		for (int r = 0; r < 9; r++) {
			result += table[r].charAt(column);
		}
		return result;
	}
	
	/**
	 * return a string with the digits on the required square from the table
	 * @param table a table as an array of strings
	 * @param row the top row of the square
	 * @param column the left column of the square
	 * @return a string with the characters on the required square
	 */
	public static String getSquare(String[] table, int row, int column) {
		String result = "";
			for (int r = row; r < row + 3; r++) {
				result += table[r].substring(column, column + 3);
			}
			return result;
		}

		

	
	/**
	 * The main method
	 * @param args - command line arguments, the first one is the file name
	 */
		public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Check Partial Sudoku by Giovanni Castillo, due 09/15/2025");
        //create the file scanner
        Scanner scanner;
        try {
			scanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: invalid file input.");
			return;
		}
        // read the sudoku as an array of strings
        String[] sudoku = new String[9];
        for (int i = 0; i < 9; i++) {
			sudoku[i] = scanner.nextLine();
		}
        scanner.close();
        //check all the rows
        for (int r=0; r<9; r++) {
			if (!checkSet(sudoku[r])) {
				System.out.println("ERROR: Row " + (r+1) + " is incorrect.");
				return;
			}
		}
        //check all the columns
        for (int c = 0; c < 9; c++) {
        	String square = getColumn(sudoku, c);
        		if (!checkSet(square)) {
        			System.out.println("ERROR: Column " + (c+1) + " contains duplicated digits.");
					return;
        		}
        }
        //check all the squares
        for (int r=0; r<9; r+=3) {
			for (int c=0; c<9; c+=3) {
				String square = getSquare(sudoku, r, c);
				if (!checkSet(square)) {
					System.out.println("ERROR: Square with top left corner at (" + (r+1) + "," + (c+1) + ") contains duplicated digits.");
					return;
				}
			}
		}
		//print the result
		System.out.println("The partial table is correct.");
	}
}
