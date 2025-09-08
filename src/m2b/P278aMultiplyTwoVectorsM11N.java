package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 278a Multiply Two Vectors mx1 and 1xn
*/
/** REQUIREMENTS:
 * Multiply an mx1 vector by a 1xn vector.
 * The result is an mxn matrix where each element at position (r, c)
 * is equal to m1[r][0] * m2[0][c].
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P278aMultiplyTwoVectorsM11N {
    public static void main(String[] args) {
        System.out.println("Multiply Two Vectors mx1 and 1xn by Giovanni Castillo on 09/08/2025");
        // Predefined path to the vector storage
        String FILEPATH = "//Users/giovannicastillo/OOP/src/m2b/";
        String EXTENSION = ".txt";
        Scanner keyboardScanner = new Scanner(System.in);
        // --- Read the file name for the mx1 vector
        System.out.print("The filename for the mx1 (column) vector: ");
        String filename1 = keyboardScanner.nextLine();
        Scanner vectorFile1Scanner = null;
        try {
            vectorFile1Scanner = new Scanner(new File(FILEPATH + filename1 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename1);
            return;
        }
        // --- Read the size and elements of the mx1 vector
        int noRows1 = vectorFile1Scanner.nextInt();
        double[] m1 = new double[noRows1];
        for (int r = 0; r < noRows1; r++) {
            m1[r] = vectorFile1Scanner.nextDouble();
        }
        vectorFile1Scanner.close();
        // Print the mx1 vector
        System.out.println();
        System.out.println("***** " + filename1 + " (" + noRows1 + " x 1) *****");
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| %6.2f   |\n", m1[r]);
        }
        System.out.println();
        // --- Read the file name for the 1xn vector
        System.out.print("The filename for the 1xn (row) vector: ");
        String filename2 = keyboardScanner.nextLine();
        Scanner vectorFile2Scanner = null;
        try {
            vectorFile2Scanner = new Scanner(new File(FILEPATH + filename2 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename2);
            return;
        }
        // --- Read the size and elements of the 1xn vector
        int noCols2 = vectorFile2Scanner.nextInt();
        double[] m2 = new double[noCols2];
        for (int c = 0; c < noCols2; c++) {
            m2[c] = vectorFile2Scanner.nextDouble();
        }
        vectorFile2Scanner.close();
        // Print the 1xn vector
        System.out.println();
        System.out.println("***** " + filename2 + " (1 x " + noCols2 + ") *****");
        System.out.print("| ");
        for (int c = 0; c < noCols2; c++) {
            System.out.printf("%6.2f", m2[c]);
        }
        System.out.println("   |");
        System.out.println();
        // --- Compute the mxn matrix (outer product)
        double[][] result = new double[noRows1][noCols2];
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols2; c++) {
                result[r][c] = m1[r] * m2[c];
            }
        }
        // Print the result matrix
        System.out.println();
        System.out.printf("***** PRODUCT= %s * %s *****\n", filename1, filename2);
        System.out.println();
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols2; c++) {
                System.out.printf("%6.2f", result[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
    }
}