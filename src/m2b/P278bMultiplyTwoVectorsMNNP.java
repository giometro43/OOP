package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 278b Multiply Two Vectors mxn and nxp
*/
/** REQUIREMENTS:
 * Multiply an mxn matrix by an nxp matrix.
 * The result is an mxp matrix.
 * Each element (r, c) in the result is equal to the sum of
 * products of corresponding elements from row r of the first matrix
 * and column c of the second matrix.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P278bMultiplyTwoVectorsMNNP {
    public static void main(String[] args) {
        System.out.println("Multiply Two Vectors mxn and nxp by Giovanni Castillo on 09/07/2025");
        // Predefined path to the matrix storage
        String FILEPATH = "//Users/giovannicastillo/OOP/src/m2b/";
        String EXTENSION = ".txt";
        Scanner keyboardScanner = new Scanner(System.in);
        // --- Read the file name for the first matrix (mxn)
        System.out.print("The filename for the first matrix (mxn): ");
        String filename1 = keyboardScanner.nextLine();
        Scanner matrixFile1Scanner = null;
        try {
            matrixFile1Scanner = new Scanner(new File(FILEPATH + filename1 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename1);
            return;
        }
        // --- Read the sizes and elements of the first matrix
        int noRows1 = matrixFile1Scanner.nextInt();
        int noCols1 = matrixFile1Scanner.nextInt();
        double[][] m1 = new double[noRows1][noCols1];
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols1; c++) {
                m1[r][c] = matrixFile1Scanner.nextDouble();
            }
        }
        matrixFile1Scanner.close();
        // Print the first matrix
        System.out.println();
        System.out.println("***** " + filename1 + " (" + noRows1 + " x " + noCols1 + ") *****");
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols1; c++) {
                System.out.printf("%6.2f", m1[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
        // --- Read the file name for the second matrix (nxp)
        System.out.print("The filename for the second matrix (nxp): ");
        String filename2 = keyboardScanner.nextLine();
        Scanner matrixFile2Scanner = null;
        try {
            matrixFile2Scanner = new Scanner(new File(FILEPATH + filename2 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename2);
            return;
        }
        // --- Read the sizes and elements of the second matrix
        int noRows2 = matrixFile2Scanner.nextInt();
        int noCols2 = matrixFile2Scanner.nextInt();
        double[][] m2 = new double[noRows2][noCols2];
        for (int r = 0; r < noRows2; r++) {
            for (int c = 0; c < noCols2; c++) {
                m2[r][c] = matrixFile2Scanner.nextDouble();
            }
        }
        matrixFile2Scanner.close();
        // Print the second matrix
        System.out.println();
        System.out.println("***** " + filename2 + " (" + noRows2 + " x " + noCols2 + ") *****");
        for (int r = 0; r < noRows2; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols2; c++) {
                System.out.printf("%6.2f", m2[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
        // --- Check that the matrices can be multiplied (noCols1 == noRows2)
        if (noCols1 != noRows2) {
            System.out.println("ERROR! The matrices have incompatible sizes for multiplication.");
            return;
        }
        // --- Compute the product matrix (mxp)
        double[][] result = new double[noRows1][noCols2];
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols2; c++) {
                double sum = 0.0;
                for (int k = 0; k < noCols1; k++) {
                    sum += m1[r][k] * m2[k][c];
                }
                result[r][c] = sum;
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