package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 211 Grades Analysis
*/
public class P211GradesAnalysis {
/* Requirements: https://youtu.be/PUPfcF4VU7I
 * Read the final grades for a course from a text file (separated by space),
 * as real numbers from 0 to 100 or higher. 
 * Compute the number of students, 
 * the maximum grade, 
 * the minimum grade 
 * and the average grade. 
 * Compute how many students got A+ (got a grade of at least 97).*/
//Hints: Be sure that you put a newline (enter) after the -1. 
//Your text file must have an empty  line at  the end in order to work on some operating systems.

	public static void main(String[] args) {
		System.out.println("Grade Analysis by Giovanni Castillo on 09/07/2025");
		/*starting by going into the run configurations and 
		adding the file path to the arguments from the 
		Run Config > Common > Standard Input and Output > Input file*/
		
		
		// read numbers from the grades.txt file then print them in the console
		//seperated by space
		Scanner in = new Scanner(System.in);
		System.out.print("The grades are: ");
		
		double grade = Double.parseDouble(in.next());//this reads the first Token
		//initialize computations:
		int numberOfStudents = 0;
		double maximumGrade = Double.NEGATIVE_INFINITY; //smallest possible number
		//guarantees that any grade will be larger than this number
		double minimumGrade = Double.POSITIVE_INFINITY; //largest possible number
		double sumOfGrades = 0;
		double averageGrade = 0;
		int studentsWithA = 0;
		
		while (grade >=0) {
			//print the grade
			System.out.print(grade + " ");
			//process the grade
			numberOfStudents++;//increment the number of students by 1
			sumOfGrades += grade; // adds every grade to the sumgrades val
			averageGrade = sumOfGrades/numberOfStudents; //gives average
			
			if(grade > maximumGrade) {
				maximumGrade = grade;
				/*this ensures that the maximum grade is updated to the current grade 
				if it's higher. so that at the end of the loop, 
				maximumGrade holds the highest grade*/
				
			}
			if(grade < minimumGrade) {
				minimumGrade = grade;
				
			}
			if (grade >=90) {
				studentsWithA++;
			}
			//read the next token
			 grade = Double.parseDouble(in.next());
			
		}
		System.out.println();
		in.close();
		//print the number of students
		System.out.println("The number of students is: " + numberOfStudents);
		System.out.println("the maxiumum grade is: "+maximumGrade);
		System.out.println("the minimum grade is: "+minimumGrade);
		System.out.println("Average grade is: "+averageGrade);
		System.out.println("Students with an A score: "+ studentsWithA);



	}

}
