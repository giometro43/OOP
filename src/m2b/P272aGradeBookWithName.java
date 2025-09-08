package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 272a Grade Book with Name
*/
/** REQUIREMENTS:
 * Read from a file the number of students (<=100), the number of assignments (<=10),
 * the maximum grade per assignment (<=100), and for each student the integer grades
 * for each assignment. Then, read a list of names for the students (one per line, from a file).
 * A name has maximum 30 characters and at least 5 (including the space).
 * Print the name in the table instead of student number.
 * Compute the sum of all assignments by row and the average by row.
 * Print a table with headers both with the original grades and the computed information, including names.
 */
public class P272aGradeBookWithName {
    public static void main(String[] args) {
        System.out.println("Grade Book with Name by Giovanni Castillo on 09/07/2025");
        java.util.Scanner gradeScanner;
        java.util.Scanner nameScanner;
        try {
            gradeScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/grades.txt"));
            nameScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/firstNames.txt"));//used in previous assignment P252
        } catch (java.io.FileNotFoundException e) {
            System.out.println("ERROR: File not found");
            return;
        }
        int numberOfStudents = gradeScanner.nextInt();
        if (numberOfStudents < 1 || numberOfStudents > 100) {
            System.out.println("ERROR: Invalid number of students (must be between 1 and 100).");
            return;
        }
        int numberOfAssignments = gradeScanner.nextInt();
        if (numberOfAssignments < 1 || numberOfAssignments > 10) {
            System.out.println("ERROR: Invalid number of assignments (must be between 1 and 10).");
            return;
        }
        int maxAssignmentGrade = gradeScanner.nextInt();
        if (maxAssignmentGrade < 1 || maxAssignmentGrade > 100) {
            System.out.println("ERROR: Invalid maximum grade per assignment (must be between 1 and 100).");
            return;
        }
        int[][] grade = new int[numberOfStudents][numberOfAssignments];
        for (int s = 0; s < numberOfStudents; s++) {
            for (int a = 0; a < numberOfAssignments; a++) {
                grade[s][a] = gradeScanner.nextInt();
                if (grade[s][a] < 0 || grade[s][a] > maxAssignmentGrade) {
                    System.out.println("ERROR: Invalid grade");
                }
            }
        }
        // Read names
        String[] names = new String[numberOfStudents];
        for (int s = 0; s < numberOfStudents; s++) {
            if (!nameScanner.hasNextLine()) {
                System.out.println("ERROR: Not enough names in file.");
                return;
            }
            String name = nameScanner.nextLine().trim();
            if (name.length() < 5 || name.length() > 30) {
                System.out.println("ERROR: Name must be between 5 and 30 characters: " + name);
                return;
            }
            names[s] = name;
        }
        // Print table with names
        System.out.printf("| %-30s |", "NAME");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.println();
        System.out.printf("+--------------------------------+" );
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.println();
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %-30s |", names[s]);
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %3d |", grade[s][a]);
            }
            System.out.println();
        }
        // Compute sum and average
        System.out.printf("\n\n COMPUTED SUM AND AVERAGE TABLE: \n\n");
        int[] sum = new int[numberOfStudents];
        double[] average = new double[numberOfStudents];
        for (int s = 0; s < numberOfStudents; s++) {
            sum[s] = 0;
            for (int a = 0; a < numberOfAssignments; a++) {
                sum[s] += grade[s][a];
            }
            average[s] = 1.0 * sum[s] / numberOfAssignments;
        }
        // Print table with names, sum, and average
        System.out.printf("| %-30s |", "NAME");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.printf(" SUM | AVERAGE |");
        System.out.println();
        System.out.printf("+--------------------------------+" );
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.printf("-----+---------|");
        System.out.println();
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %-30s |", names[s]);
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %3d |", grade[s][a]);
            }
            System.out.printf(" %4d | %7.2f |", sum[s], average[s]);
            System.out.println();
        }
    }
}