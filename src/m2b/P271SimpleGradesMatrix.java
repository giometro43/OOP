package m2b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-23
Program: 271 Simple Grades Matrix
*/
/** REQUIREMENTS:
 * Read from a file the number of students (<=100), the number of assignments (<=10),
 * the maximum grade per assignment (<=100), and for each student the integer grades
 * for each assignment. Check the data is correct and store it in variables.
 * Print a table with headers (assignment no and student no) with the information.
 * Compute the sum of all assignments by row and the average by row.
 * Print a table with headers both with the original grades and the computed information.
 */
public class P271SimpleGradesMatrix {
    public static void main(String[] args) {
        System.out.println("Simple Grades Matrix by Giovanni Castillo on 09/07/2025");
        
       
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
        // Print a table with headers containing also the computed sum and average
            System.out.printf("| STU |");
            for (int a = 1; a <= numberOfAssignments; a++) {
                System.out.printf(" %3d |", a);
            }
            System.out.printf(" SUM | AVERAGE |");
            System.out.println();
            System.out.printf("+-----+");
            for (int a = 1; a <= numberOfAssignments; a++) {
                System.out.printf("-----+");
            }
            System.out.printf("-----+---------|");
            System.out.println();

            for (int s = 0; s < numberOfStudents; s++) {
                System.out.printf("| %3d |", (s + 1));
                for (int a = 0; a < numberOfAssignments; a++) {
                    System.out.printf(" %3d |", grade[s][a]);
                }
                System.out.printf(" %4d | %7.2f |", sum[s], average[s]);
                System.out.println();
            }
        }
    }