package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 274 Shortest and Longest Names
*/
/** REQUIREMENTS:
 * Continue the program 273 to compute the shortest and longest first names and last names.
 * If more than one name is shortest or longest then print the first found.
 * Print the results in the table, showing the shortest and longest first and last names at the bottom.
 */
public class P274ShortestAndLongestNames {
    public static void main(String[] args) {
        System.out.println("Shortest and Longest Names by Giovanni Castillo on 09/07/2025");
        // Prepare the file
        java.util.Scanner gradeScanner;
        java.util.Scanner firstNameScanner;
        java.util.Scanner lastNameScanner;
        try {
            gradeScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/grades.txt"));
            firstNameScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/firstNames.txt"));
            lastNameScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/lastNames.txt"));
        } catch (java.io.FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("ERROR: File not found");
            return;
        }

        // Read and check the number of students (<=100)
        int numberOfStudents = gradeScanner.nextInt();
        if (numberOfStudents < 1 || numberOfStudents > 100) {
            System.out.println("ERROR: Invalid number of students (must be between 1 and 100).");
            return;
        }

        // Read and check the number of assignments (<=10)
        int numberOfAssignments = gradeScanner.nextInt();
        if (numberOfAssignments < 1 || numberOfAssignments > 10) {
            System.out.println("ERROR: Invalid number of assignments (must be between 1 and 10).");
            return;
        }

        // Read and check the maximum grade per assignment (<=100)
        int maxAssignmentGrade = gradeScanner.nextInt();
        if (maxAssignmentGrade < 1 || maxAssignmentGrade > 100) {
            System.out.println("ERROR: Invalid maximum grade per assignment (must be between 1 and 100).");
            return;
        }

        // Declare the grades matrix
        int[][] grade = new int[numberOfStudents][numberOfAssignments];
        // Declare the names matrix
        String[][] names = new String[numberOfStudents][2]; // [][0]=first, [][1]=last

        // Read for each student the integer grades for each assignment
        for (int s = 0; s < numberOfStudents; s++) {
            for (int a = 0; a < numberOfAssignments; a++) {
                grade[s][a] = gradeScanner.nextInt();
                if (grade[s][a] < 0 || grade[s][a] > maxAssignmentGrade) {
                    System.out.println("ERROR: Invalid grade");
                }
            }
        }
        // Read first and last names
        for (int s = 0; s < numberOfStudents; s++) {
            if (!firstNameScanner.hasNextLine() || !lastNameScanner.hasNextLine()) {
                System.out.println("ERROR: Not enough names in file.");
                return;
            }
            names[s][0] = firstNameScanner.nextLine().trim();
            names[s][1] = lastNameScanner.nextLine().trim();
        }
        // Find shortest and longest first and last names
        String shortestFirst = names[0][0];
        String longestFirst = names[0][0];
        String shortestLast = names[0][1];
        String longestLast = names[0][1];
        for (int s = 1; s < numberOfStudents; s++) {
            if (names[s][0].length() < shortestFirst.length()) shortestFirst = names[s][0];
            if (names[s][0].length() > longestFirst.length()) longestFirst = names[s][0];
            if (names[s][1].length() < shortestLast.length()) shortestLast = names[s][1];
            if (names[s][1].length() > longestLast.length()) longestLast = names[s][1];
        }
        // Compute per-student (row) stats
        int[] sum = new int[numberOfStudents];
        double[] average = new double[numberOfStudents];
        int[] minRow = new int[numberOfStudents];
        int[] maxRow = new int[numberOfStudents];
        for (int s = 0; s < numberOfStudents; s++) {
            sum[s] = 0;
            minRow[s] = grade[s][0];
            maxRow[s] = grade[s][0];
            for (int a = 0; a < numberOfAssignments; a++) {
                sum[s] += grade[s][a];
                if (grade[s][a] < minRow[s]) minRow[s] = grade[s][a];
                if (grade[s][a] > maxRow[s]) maxRow[s] = grade[s][a];
            }
            average[s] = 1.0 * sum[s] / numberOfAssignments;
        }
        // Compute per-assignment (column) stats
        double[] avgCol = new double[numberOfAssignments];
        int[] minCol = new int[numberOfAssignments];
        int[] maxCol = new int[numberOfAssignments];
        for (int a = 0; a < numberOfAssignments; a++) {
            int sumCol = 0;
            minCol[a] = grade[0][a];
            maxCol[a] = grade[0][a];
            for (int s = 0; s < numberOfStudents; s++) {
                sumCol += grade[s][a];
                if (grade[s][a] < minCol[a]) minCol[a] = grade[s][a];
                if (grade[s][a] > maxCol[a]) maxCol[a] = grade[s][a];
            }
            avgCol[a] = 1.0 * sumCol / numberOfStudents;
        }
        // Compute global stats
        int globalMin = grade[0][0];
        int globalMax = grade[0][0];
        int globalSum = 0;
        int totalCount = numberOfStudents * numberOfAssignments;
        for (int s = 0; s < numberOfStudents; s++) {
            for (int a = 0; a < numberOfAssignments; a++) {
                if (grade[s][a] < globalMin) globalMin = grade[s][a];
                if (grade[s][a] > globalMax) globalMax = grade[s][a];
                globalSum += grade[s][a];
            }
        }
        double globalAvg = 1.0 * globalSum / totalCount;
        // Print table with names and grades and computed info
        System.out.printf("| %-15s | %-15s |", "FIRST NAME", "LAST NAME");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %5d |", a);
        }
        System.out.printf(" %5s | %7s | %5s | %5s |\n", "SUM", "AVG", "MIN", "MAX");
        System.out.printf("+-----------------+-----------------+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-------+");
        }
        System.out.printf("-------+-------+-------+-------+\n");
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %-15s | %-15s |", names[s][0], names[s][1]);
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %5d |", grade[s][a]);
            }
            System.out.printf(" %5d | %7.2f | %5d | %5d |\n", sum[s], average[s], minRow[s], maxRow[s]);
        }
        // Print separator
        System.out.printf("+-----------------+-----------------+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-------+");
        }
        System.out.printf("-------+-------+-------+-------+\n");
        // Print per-assignment stats
        System.out.printf("| %15s | %15s |", " ", " ");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %5d |", a);
        }
        System.out.println();
        System.out.printf("| %15s | %15s |", "AVG", " ");
        for (int a = 0; a < numberOfAssignments; a++) {
            System.out.printf(" %5.2f |", avgCol[a]);
        }
        System.out.println();
        System.out.printf("| %15s | %15s |", "MIN", " ");
        for (int a = 0; a < numberOfAssignments; a++) {
            System.out.printf(" %5d |", minCol[a]);
        }
        System.out.println();
        System.out.printf("| %15s | %15s |", "MAX", " ");
        for (int a = 0; a < numberOfAssignments; a++) {
            System.out.printf(" %5d |", maxCol[a]);
        }
        System.out.println();
        // Print global stats
        System.out.printf("\nGlobal stats: AVG = %.2f, MIN = %d, MAX = %d\n", globalAvg, globalMin, globalMax);
        // Print a table with headers containing also the computed sum and average
        System.out.printf("| STU |");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.printf(" SUM  |AVERAGE | MIN | MAX |");
        System.out.println();
        System.out.printf("+-----+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.printf("------|--------|-----|-----|");
        System.out.println();
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %3d |", (s + 1));
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %3d |", grade[s][a]);
            }
            System.out.printf(" %4d | %6.2f | %3d | %3d |",
                sum[s], average[s], minRow[s], maxRow[s]);
            System.out.println();
        }
        System.out.printf("+-----+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.printf("------+--------+-----+-----+");
        System.out.println();
        System.out.println("\nGlobal computations:");
        System.out.println("Minimum global grade: " + globalMin);
        System.out.println("Maximum global grade: " + globalMax);
        System.out.println("Sum of all grades: " + globalSum);
        System.out.println("Average of all grades: " + globalAvg);
        // Print shortest and longest names
        System.out.println("\nShortest first name:  " + shortestFirst);
        System.out.println("Longest first name:   " + longestFirst);
        System.out.println("Shortest last name:   " + shortestLast);
        System.out.println("Longest last name:    " + longestLast);
    }
}