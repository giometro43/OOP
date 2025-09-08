package m2b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 276a Matrix Subtraction
*/
/** REQUIREMENTS:
 * Modify the program 275 to compute the matrix subtraction.
 * The elements in the result are the difference between the
 * original elements on the corresponding position.
 */
public class P276aMatrixSubtraction {
    public static void main(String[] args) throws IOException {
        System.out.println("Matrix Subtraction by Giovanni Castillo on 09/07/2025");
    
        // Predefined path to the matrix storage
        String FILEPATH = "//Users/giovannicastillo/OOP/src/m2b/";
        String EXTENSION = ".txt";
        // Read the first matrix

        // --- Read the file name (e.g. m01) from the keyboard
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("The filename for the first matrix: ");
        String filename1 = keyboardScanner.nextLine();

        // --- Open a scanner to the file name
        Scanner matrixFile1Scanner =null;
        
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
        
        // Print the first matrix
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

        // Read the second matrix
        // --- Read the file name (e.g. m02) from the keyboard
        System.out.print("The filename for the second matrix: ");
        String filename2 = keyboardScanner.nextLine();

        // --- Open a scanner to the file name
        Scanner matrixFile2Scanner =null;
        
        try {
            matrixFile2Scanner = new Scanner(new File(FILEPATH + filename2 + EXTENSION));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found" + filename2);
            return;
        }
        // --- Read the sizes of the matrix from the file
        int noRows2 = matrixFile2Scanner.nextInt();
        int noCols2 = matrixFile2Scanner.nextInt();
        // --- Declare the matrix and initialize
        double[][] m2 = new double[noRows2][noCols2];
        // --- Read all elements from the file
        for (int r = 0; r < noRows2; r++) {
            for (int c = 0; c < noCols2; c++) {
                m2[r][c] = matrixFile2Scanner.nextDouble();
            }
        }
        // --- Close the scanner
        matrixFile2Scanner.close();
        // Print the second matrix
        System.out.println();
        System.out.println("***** " + filename2 + " *****");
        System.out.println();
        for (int r = 0; r < noRows2; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols2; c++) {
                System.out.printf("%6.2f", m2[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();

        // Check we can subtract
        if (noRows1 != noRows2 || noCols1 != noCols2) {
            System.out.println("ERROR! The matrices have different sizes.");
            return;
        }

        // Compute the difference matrix
        double[][] diff = new double[noRows1][noCols1];
        for (int r = 0; r < noRows1; r++) {
            for (int c = 0; c < noCols1; c++) {
                diff[r][c] = m1[r][c] - m2[r][c];
            }
        }
        // Print the difference matrix
        System.out.println();
        System.out.printf("***** DIFF= %s - %s *****\n" , filename1, filename2);
        System.out.println();
        for (int r = 0; r < noRows1; r++) {
            System.out.printf("| ");
            for (int c = 0; c < noCols1; c++) {
                System.out.printf("%6.2f", diff[r][c]);
            }
            System.out.printf("   |\n");
        }
        System.out.println();
        // Save the difference matrix in a file
        System.out.print("The filename for the difference matrix: ");
        String filenameDiff = keyboardScanner.nextLine();
        File fileDiff = new File(FILEPATH + filenameDiff + EXTENSION);
        try {
            if (!fileDiff.createNewFile()) {
                System.out.println("ERROR! THE FILE ALREADY EXISTS.");
                return;
            } }
            catch (IOException e) {
                System.out.println("ERROR! UNABLE TO CREATE THE FILE.");
                return;
            }
        try {
            FileWriter fileWriter = new FileWriter(fileDiff);
            fileWriter.write("" + noRows1 +" " + noCols1 + "\n\n");
            for (int r=0; r<noRows1; r++) {
                for (int c=0; c<noCols1;c++) {
                    fileWriter.write("" + diff[r][c] + " ");
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