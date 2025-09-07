package m2b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 254 Age Analysis
*/
/** REQUIREMENTS:
 * Create a file with the age in whole years for around 20 friends and relatives.
 * Start the file with the number of persons considered and follow with the list of ages.
 * Read, store and print in a table (10 values per row) the ages.
 * Compute and print minimum, maximum, sum, average,
 * and count how many persons have an age within 5 years of yours.
 */

//base program on P253
public class P254AgeAnalysis {
    public static void main(String[] args) {
        System.out.println("Age Analysis by Giovanni Castillo on 09/08/2025");
        
        //include code in each section of the comments not past each section
        //read the path and name of the file
        String filename = null;
        if (args.length > 0) {
            //filename is provided in the cl
            filename = args[0];
        } else {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the path and name of the file: ");
            filename = keyboard.nextLine();
            // Do not close keyboard here, as we may need it later
        }
        System.out.println("Filename: " + filename);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR -- File not found. ");
            return;
        }
        
        int numberOfPersons = fileScanner.nextInt();
        System.out.println("Number of persons: " + numberOfPersons);
        int[] ages = new int[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            ages[i] = fileScanner.nextInt();
        }
        fileScanner.close();

        //ask the user for your age
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int yourAge = keyboard.nextInt();
        // Do not close keyboard to avoid closing System.in
        System.out.println("Your age is: " + yourAge);

        //print the values in a table
        System.out.printf("Ages of %d persons:\n", numberOfPersons);
        for(int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%4d", ages[i]);
            if (i % 10 == 9) System.out.println();
        }
        System.out.println();

        //compute and print minimum,
        int minValue = ages[0];
        for (int i = 1; i < numberOfPersons; i++) {
            if (ages[i] < minValue) {
                minValue = ages[i];
            }
        }
        System.out.printf("%30s %4d\n", "Minimum Age:", minValue);

        // compute and print maximum,
        int maxValue = ages[0];
        for (int i = 1; i < numberOfPersons; i++) {
            if (ages[i] > maxValue) {
                maxValue = ages[i];
            }
        }
        System.out.printf("%30s %4d\n", "Maximum Age:", maxValue);

        // compute and print sum,
        int sum = 0;
        for (int i = 0; i < numberOfPersons; i++) {
            sum += ages[i];
        }
        System.out.printf("%30s %4d\n", "Sum of Ages:", sum);

        // compute and print average,
        double average = (double) sum / numberOfPersons;
        System.out.printf("%30s %4.2f\n", "Average Age:", average);

        // count how many persons have an age within 5 years of yours.
        int countWithin5Years = 0;
        for (int i = 0; i < numberOfPersons; i++) {
            if (Math.abs(ages[i] - yourAge) <= 5) {
                countWithin5Years++;
            }
        }
        System.out.printf("%30s %4d\n", "Persons within 5 years of your age:", countWithin5Years);
    }
}
