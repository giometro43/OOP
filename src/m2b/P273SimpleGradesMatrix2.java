package m2b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 273 Simple Grades Matrix 2
*/
/** REQUIREMENTS:
 * Continue the program from 271. Add:
 * - Compute the minimum and maximum grade to an assignment for each student.
 * - Compute the average, minimum and maximum grade obtained by a student for each assignment.
 * - Compute the average, minimum and maximum grade obtained by any student to any assignment.
 * Print a table with headers both with the original grades and the computed information.
 * Print the global computations after the end of the table.
 */
public class P273SimpleGradesMatrix2 {
    public static void main(String[] args) {
        System.out.println("Simple Grades Matrix 2 by Giovanni Castillo on 09/07/2025");
     // Prepare the file
        Scanner scanner;
        try {
            scanner = new Scanner(new File("//Users/giovannicastillo/OOP/src/m2b/grades.txt"));
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("ERROR: File not found");
            return;
        }

        // Read and check the number of students (<=100)
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents < 1 || numberOfStudents > 100) {
            System.out.println("ERROR: Invalid number of students (must be between 1 and 100).");
            return;
        }

        // Read and check the number of assignments (<=10)
        int numberOfAssignments = scanner.nextInt();
        if (numberOfAssignments < 1 || numberOfAssignments > 10) {
            System.out.println("ERROR: Invalid number of assignments (must be between 1 and 10).");
            return;
        }

        // Read and check the maximum grade per assignment (<=100)
        int maxAssignmentGrade = scanner.nextInt();
        if (maxAssignmentGrade < 1 || maxAssignmentGrade > 100) {
            System.out.println("ERROR: Invalid maximum grade per assignment (must be between 1 and 100).");
            return;
        }
    

    
    
 // Declare the grades matrix
        int[][] grade = new int[numberOfStudents][numberOfAssignments];

    
 // Read for each student the integer grades for each assignment
        for (int s = 0; s < numberOfStudents; s++) {
            for (int a = 0; a < numberOfAssignments; a++) {
                grade[s][a] = scanner.nextInt();
                if (grade[s][a] < 0 || grade[s][a] > maxAssignmentGrade) {
                    System.out.println("ERROR: Invalid grade");
                }
            }
        }
    
 // Print a table with headers in console
        System.out.printf("| STU |");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf(" %3d |", a);
        }
        System.out.println();

        System.out.printf("+-----+");
        for (int a = 1; a <= numberOfAssignments; a++) {
            System.out.printf("-----+");
        }
        System.out.println();

        for (int s = 0; s < numberOfStudents; s++) {
            System.out.printf("| %3d |", (s + 1));
            for (int a = 0; a < numberOfAssignments; a++) {
                System.out.printf(" %3d |", grade[s][a]);
            }
            System.out.println();
        }
    // Compute the sum and average of grades by row for each student
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
        
     // NEW: Compute the minimum and maximum grade to an assignment for each student.
        int[] minStudent = new int[numberOfStudents];
        int[] maxStudent = new int[numberOfStudents];
        for (int s = 0; s < numberOfStudents; s++) {
            minStudent[s] = grade[s][0];
            maxStudent[s] = grade[s][0];
            for (int a = 1; a < numberOfAssignments; a++) {
                if (grade[s][a] < minStudent[s]) {
                    minStudent[s] = grade[s][a];
                } else if (grade[s][a] > maxStudent[s]) {
                    maxStudent[s] = grade[s][a];
                }
            }
        }
     // NEW: Compute the average, minimum and maximum grade obtained by a student for each of the assignments.
        int[] sumAssignment = new int[numberOfAssignments];
        double[] averageAssignment = new double[numberOfAssignments];
        int[] minAssignment = new int[numberOfAssignments];
        int[] maxAssignment = new int[numberOfAssignments];

        for (int a = 0; a < numberOfAssignments; a++) {
            sumAssignment[a] = grade[0][a];
            minAssignment[a] = grade[0][a];
            maxAssignment[a] = grade[0][a];

            for (int s = 1; s < numberOfStudents; s++) {
                sumAssignment[a] += grade[s][a];
                if (grade[s][a] < minAssignment[a]) minAssignment[a] = grade[s][a];
                else if (grade[s][a] > maxAssignment[a]) maxAssignment[a] = grade[s][a];
            }

            averageAssignment[a] = 1.0 * sumAssignment[a] / numberOfStudents;
        }
     // NEW: Compute the average, minimum and maximum grade obtained by any student to any assignment.
        int sumGlobal = 0;
        double averageGlobal;
        int minGlobal = grade[0][0];
        int maxGlobal = grade[0][0];

        for (int s = 0; s < numberOfStudents; s++) {
            for (int a = 0; a < numberOfAssignments; a++) {
                sumGlobal += grade[s][a];
                if (grade[s][a] < minGlobal) minGlobal = grade[s][a];
                else if (grade[s][a] > maxGlobal) maxGlobal = grade[s][a];
            }
        }

        averageGlobal = 1.0 * sumGlobal / (numberOfStudents * numberOfAssignments);
     // Print a table with headers containing also the computed sum and average
        
        
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
            		sum[s], average[s], minStudent[s], maxStudent[s]);
            System.out.println();
        }
        
        System.out.printf("+-----+");
        for (int a = 1; a <= numberOfAssignments; a++) {
        				System.out.printf("-----+");
        }
        
        System.out.printf("------+--------+-----+-----+");
        System.out.println();

        System.out.println("\nGlobal computations:");
        System.out.println("Minimum global grade: " + minGlobal);
        System.out.println("Maximum global grade: " + maxGlobal);
        System.out.println("Sum of all grades: " + sumGlobal);
        System.out.println("Average of all grades: " + averageGlobal);
        
        
        
        
    }
}