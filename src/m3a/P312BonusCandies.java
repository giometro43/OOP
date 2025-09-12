package m3a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author Giovanni Castillo AIT502-11
 * Module: 3A
 * Assignment: Static Methods
 * Program: 312 - Bonus Candies
 */
public class P312BonusCandies {
    /**
     * REQUIREMENTS:
     * Modify the program 1 to also provide one candy for each maximum grade they got.
     * Specific instructions:
     * - Include all the programs in the package m3a
     * - The class (program) name must be: P312BonusCandies
     * - Start the program printing: name of the program, your name, current date
     * - Add Javadoc comments
     * - Add inline comments
     * - Modify the previous program
     */

    /**
     * Define a scanner for a file, or System.in if not found
     * @param fileName the file to read
     * @return Scanner object
     */
    public static Scanner defineScanner(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name and try again.");
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    /**
     * Read a list of grades from the scanner
     * @param scanner the scanner for the source of the grades
     * @param numberOfGrades the number of grades to read
     * @return an array with the grades read
     */
    private static int[] readGrades(Scanner scanner, int numberOfGrades) {
        int[] grades = new int[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = scanner.nextInt();
        }
        return grades;
    }

    /**
     * Print the prefix followed by the elements of the array
     * @param prefix the prefix to be printed before elements
     * @param array the array to print
     */
    public static void printIntArray(String prefix, int[] array) {
        System.out.print(prefix);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Compute the sum of the elements of an array
     * @param array an array of integers
     * @return the sum computed
     */
    public static int sumIntArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * Compute the average of the elements of an array
     * @param array an array of integers
     * @return the average computed
     */
    public static double averageIntArray(int[] array) {
        return 1.0 * sumIntArray(array) / array.length;
    }

    /**
     * Count the number of times the maximum grade appears in the array
     * @param array an array of integers
     * @return the count of maximum grades
     */
    public static int countMaxGrades(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        int count = 0;
        for (int value : array) {
            if (value == max) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method to implement the bonus candies logic
     * @param args not used
     */
    public static void main(String[] args) {
        // Print program name, author, and current date
        System.out.println("Bonus Candies by Giovanni Castillo, due 09/15/2025");

        // Read the name, number of grades, and grades for the first child
        Scanner childScanner1 = defineScanner("/Users/giovannicastillo/OOP/src/m3a/PuaghtucketPat.txt");
        String child1Name = childScanner1.nextLine();
        int child1NumberOfGrades = childScanner1.nextInt();
        int[] child1Grades = readGrades(childScanner1, child1NumberOfGrades);
        childScanner1.close();
        printIntArray(child1Name + "'s grades: ", child1Grades);

        // Read the name, number of grades, and grades for the second child
        Scanner childScanner2 = defineScanner("/Users/giovannicastillo/OOP/src/m3a/SourdoughSam.txt");
        String child2Name = childScanner2.nextLine();
        int child2NumberOfGrades = childScanner2.nextInt();
        int[] child2Grades = readGrades(childScanner2, child2NumberOfGrades);
        childScanner2.close();
        printIntArray(child2Name + "'s grades: ", child2Grades);

        // Compute averages
        double child1Average = averageIntArray(child1Grades);
        double child2Average = averageIntArray(child2Grades);
        System.out.printf("%s's average grade is: %.2f\n", child1Name, child1Average);
        System.out.printf("%s's average grade is: %.2f\n", child2Name, child2Average);

        // Compute candies for averages
        int child1Candies = 0;
        int child2Candies = 0;
        if (child1Average > child2Average) {
            child1Candies += 3;
            System.out.printf("%s has a higher average than %s, so %s gets 3 candies\n", child1Name, child2Name, child1Name);
        } else if (child2Average > child1Average) {
            child2Candies += 3;
            System.out.printf("%s has a higher average than %s, so %s gets 3 candies\n", child2Name, child1Name, child2Name);
        } else {
            child1Candies += 3;
            child2Candies += 3;
            System.out.printf("Both %s and %s have the same average, so both get 3 candies\n", child1Name, child2Name);
        }

        // Add candies for each maximum grade
        int child1MaxCount = countMaxGrades(child1Grades);
        int child2MaxCount = countMaxGrades(child2Grades);
        child1Candies += child1MaxCount;
        child2Candies += child2MaxCount;
        System.out.printf("%s gets %d bonus candies for %d maximum grades.\n", child1Name, child1MaxCount, child1MaxCount);
        System.out.printf("%s gets %d bonus candies for %d maximum grades.\n", child2Name, child2MaxCount, child2MaxCount);

        // Print total candies for each child
        System.out.printf("Total candies for %s: %d\n", child1Name, child1Candies);
        System.out.printf("Total candies for %s: %d\n", child2Name, child2Candies);
    }
}