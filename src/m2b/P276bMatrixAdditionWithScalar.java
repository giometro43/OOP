package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 276b Matrix Addition With Scalar
*/
/** REQUIREMENTS:
 * Modify the program 275 to read a matrix and a number.
 * Compute the matrix addition with the number read.
 * The elements in the result are the sum of the original elements with the scalar.
 * Perform tests: correct examples, wrong input filename, wrong output filename.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P276bMatrixAdditionWithScalar {
    public static void main(String[] args) throws IOException {
        System.out.println("Matrix Addition With Scalar by Giovanni Castillo on 09/07/2025");
        // Predefined path to the matrix storage
        String FILEPATH = "//Users/giovannicastillo/OOP/src/m2b/";
        String EXTENSION = ".txt";
        // Read the matrix
        // --- Read the file name (e.g. m01) from the keyboard
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("The filename for the matrix: ");
        String filename1 = keyboardScanner.nextLine();
        // --- Open a scanner to the file name
        Scanner matrixFile1Scanner = null;
        try {
            matrixFile1Scanner = new Scanner(new File(FILEPATH + filename1 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found" + filename1);
            return;
        }
        // --- Read the sizes of the matrix from the file
        int noRows1 = matrixFile1Scanner.nextInt();
        int noCols1 = matrixFile1Scanner.nextInt();
        // --- Declare the matrix and initialize
        double[][] m1 = new double[noRows1][noCols1];
        // --- Read all elements from the file
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols1; c++) {
                m1[r][c] = matrixFile1Scanner.nextDouble();
            }
        }
        // --- Close the scanner
        matrixFile1Scanner.close();
        // Print the matrix
        System.out.println();
        System.out.println("***** " + filename1 + " *****");
        System.out.println();
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols1; c++) {
                System.out.printf("%6.2f", m1[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
        // Read the scalar value
        System.out.print("Enter the scalar to add: ");
        double scalar = 0.0;
        try {
            scalar = Double.parseDouble(keyboardScanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid scalar value.");
            return;
        }
        // Compute the sum matrix (matrix + scalar)
        double[][] sum = new double[noRows1][noCols1];
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols1; c++) {
                sum[r][c] = m1[r][c] + scalar;
            }
        }
        // Print the sum matrix
        System.out.println();
        System.out.printf("***** SUM= %s + %.2f *****\n", filename1, scalar);
        System.out.println();
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols1; c++) {
                System.out.printf("%6.2f", sum[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
        // Save the sum matrix in a file
        System.out.print("The filename for the sum matrix: ");
        String filenameSum = keyboardScanner.nextLine();
        File fileSum = new File(FILEPATH + filenameSum + EXTENSION);
        try {
            if (!fileSum.createNewFile()) {
                System.out.println("ERROR! THE FILE ALREADY EXISTS.");
                return;
            }
        } catch (IOException e) {
            System.out.println("ERROR! UNABLE TO CREATE THE FILE.");
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(fileSum);
            fileWriter.write("" + noRows1 + " " + noCols1 + "\n\n");
            for (int r = 0; r < noRows1; r++) {
                for (int c = 0; c < noCols1; c++) {
                    fileWriter.write("" + sum[r][c] + " ");
                }
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR! UNABLE TO WRITE THE FILE.");
            return;
        }
    }
}