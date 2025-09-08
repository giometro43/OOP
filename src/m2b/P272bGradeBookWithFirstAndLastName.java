package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 272b Grade Book with First and Last Name
*/
/** REQUIREMENTS:
 * Modify the program 271 and 272a to read the list of first and last names for the students
 * (one per line, from separate files). A first name or last name has maximum 15 characters and at least 2
 * (including the spaces). Store the first and last name in a matrix.
 * Print the first and last name in the table in different columns, along with grades, sum, and average.
 */
public class P272bGradeBookWithFirstAndLastName {
    public static void main(String[] args) {
        System.out.println("Grade Book with First and Last Name by Giovanni Castillo on 09/07/2025");
        java.util.Scanner gradeScanner;
        java.util.Scanner firstNameScanner;
        java.util.Scanner lastNameScanner;
        try {
            gradeScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/grades.txt"));
            firstNameScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/firstNames.txt"));//used in my previous assignment P252
            lastNameScanner = new java.util.Scanner(new java.io.File("//Users/giovannicastillo/OOP/src/m2b/lastNames.txt"));//used in my previous assignment P252
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
        // Read first and last names
        String[][] names = new String[numberOfStudents][2];
        for (int s = 0; s < numberOfStudents; s++) {
            if (!firstNameScanner.hasNextLine() || !lastNameScanner.hasNextLine()) {
                System.out.println("ERROR: Not enough names in file.");
                return;
            }
            String first = firstNameScanner.nextLine().trim();
            String last = lastNameScanner.nextLine().trim();
            if (first.length() < 2 || first.length() > 15) {
                System.out.println("ERROR: First name must be between 2 and 15 characters: " + first);
                return;
            }
            if (last.length() < 2 || last.length() > 15) {
                System.out.println("ERROR: Last name must be between 2 and 15 characters: " + last);
                return;
            }
            names[s][0] = first;
            names[s][1] = last;
        }
        // Print table with first and last names
        System.out.printf("| %-15s | %-15s |", "FIRST NAME", "LAST NAME");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.println();
        System.out.printf("+-----------------+-----------------+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.println();
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %-15s | %-15s |", names[s][0], names[s][1]);
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
        System.out.printf("| %-15s | %-15s |", "FIRST NAME", "LAST NAME");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.printf(" SUM | AVERAGE |");
        System.out.println();
        System.out.printf("+-----------------+-----------------+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.printf("-----+---------|");
        System.out.println();
        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %-15s | %-15s |", names[s][0], names[s][1]);
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %3d |", grade[s][a]);
            }
            System.out.printf(" %4d | %7.2f |", sum[s], average[s]);
            System.out.println();
        }
    }
}