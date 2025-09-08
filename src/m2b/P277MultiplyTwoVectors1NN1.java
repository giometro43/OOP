package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 277 Multiply Two Vectors 1xn and nx1
*/
/** REQUIREMENTS:
 * Multiply a 1xn vector by an nx1 vector (dot product).
 * The result is a number computed as the sum of the products of the
 * corresponding elements from the first vector with the ones from the second vector.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P277MultiplyTwoVectors1NN1 {
    public static void main(String[] args) {
        System.out.println("Multiply Two Vectors 1xn and nx1 by Giovanni Castillo on 09/08/2025");
        // Predefined path to the vector storage
        String FILEPATH = "//Users/giovannicastillo/OOP/src/m2b/";
        String EXTENSION = ".txt";
        Scanner keyboardScanner = new Scanner(System.in);
        // --- Read the file name for the 1xn vector
        System.out.print("The filename for the 1xn (row) vector: ");
        String filename1 = keyboardScanner.nextLine();
        Scanner vectorFile1Scanner = null;
        try {
            vectorFile1Scanner = new Scanner(new File(FILEPATH + filename1 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename1);
            return;
        }
        // --- Read the size and elements of the 1xn vector
        int noCols1 = vectorFile1Scanner.nextInt();
        double[] v1 = new double[noCols1];
        for (int c = 0; c < noCols1; c++) {
            v1[c] = vectorFile1Scanner.nextDouble();
        }
        vectorFile1Scanner.close();
        // Print the 1xn vector
        System.out.println();
        System.out.println("***** " + filename1 + " (1 x " + noCols1 + ") *****");
        System.out.print("| ");
        for (int c = 0; c < noCols1; c++) {
            System.out.printf("%6.2f", v1[c]);
        }
        System.out.println("   |");
        System.out.println();
        // --- Read the file name for the nx1 vector
        System.out.print("The filename for the nx1 (column) vector: ");
        String filename2 = keyboardScanner.nextLine();
        Scanner vectorFile2Scanner = null;
        try {
            vectorFile2Scanner = new Scanner(new File(FILEPATH + filename2 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename2);
            return;
        }
        // --- Read the size and elements of the nx1 vector
        int noRows2 = vectorFile2Scanner.nextInt();
        double[] v2 = new double[noRows2];
        for (int r = 0; r < noRows2; r++) {
            v2[r] = vectorFile2Scanner.nextDouble();
        }
        vectorFile2Scanner.close();
        // Print the nx1 vector
        System.out.println();
        System.out.println("***** " + filename2 + " (" + noRows2 + " x 1) *****");
        for (int r = 0; r < noRows2; r++) {
            System.out.printf("| %6.2f   |\n", v2[r]);
        }
        System.out.println();
        // --- Check that the sizes match for dot product
        if (noCols1 != noRows2) {
            System.out.println("ERROR! The vectors have incompatible sizes for dot product.");
            return;
        }
        // --- Compute the dot product
        double result = 0.0;
        for (int i = 0; i < noCols1; i++) {
            result += v1[i] * v2[i];
        }
        // Print the result
        System.out.println();
        System.out.printf("Dot product (result): %.4f\n", result);
    }
}