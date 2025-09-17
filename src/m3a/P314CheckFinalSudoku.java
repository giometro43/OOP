package m3a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author Giovanni Castillo AIT502-11
 * Module: Static Methods
 * Assignment: M3A-21
 * Program: 314 - Check Final Sudoku*/
public class P314CheckFinalSudoku {
    /**
     * REQUIREMENTS:
     * The program will receive a Sudoku table in a file, the numbers 1-9 without spaces for the placed numbers. Place an empty line at the end.
     * Check that the table is a final correct solution (no zeros, all digits 1-9 only once per row, column, and square).
     *
     * Grading: 25 points
     *
     * Specific instructions:
     * - Follow the video to create your code
     * - Include all the programs in the package m3a
     * - The class (program) name must be: P314CheckFinalSudoku
     * - Start the program printing: name of the program, your name, current date
     * - Add Javadoc comments
     * - Add inline comments
     * - Modify the previous program
     */
    /**
     * Check if the set is a correct sudoku set
     * all digits from 1 to 9 only once, no zeros allowed
     * @param set A string of 9 digits (no zeros allowed)
     * @return true if a correct sudoku set, false otherwise
     */
    public static boolean checkSet(String set) {
        boolean[] found = new boolean[10];
        for (int i = 1; i < 10; i++) found[i] = false;
        for (int i = 0; i < set.length(); i++) {
            int d = set.charAt(i) - '0';
            if (d < 1 || d > 9) return false; // must be 1-9 only
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
        System.out.println("Check Final Sudoku by Giovanni Castillo, due 09/15/2025");
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
        System.out.println("The final table is correct.");
    }
}