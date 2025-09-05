package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 215 Biggest Shape
*/
public class P215BiggestShape {
/* Requirements: https://youtu.be/kwDIITM8IeU 
 * Given a text file with a list of shapes constructed by the students in grade 2. 
 * The file has the following predefined structure: FIRSTNAME LASTNAME SHAPE SIZE1 SIZE2(if any). 
 * The end of the text is marked by "###END###". 
 * Where both first name and last name have a single word, 
 * shape is one of rectangle (2 sizes), square(one size), circle (one radius). 
 * Compute and print who did the biggest shape (biggest area), shape type, and its area to give bonus points.*/
	public static void main(String[] args) {
		System.out.println("Biggest Shape by Giovanni Castillo on 09/07/2025");
		
		//initialize the computations
		String maxFirstName = null;
		String maxLastName = null;
		String maxShape =null;
		double maxArea= -1;
		//read the first token
		
		Scanner in = new Scanner(System.in);
		String token = in.next();
		
		
		//while not the end token
		while (!token.equals("###END###")) {
		
			//read the remaining tokens
			String firstName = token;
			String lastName = in.next();
			String shape = in.next();
			double size1 = Double.parseDouble(in.next());
			double size2 = -1;
			if (shape.equals("rectangle")) {
				size2 = Double.parseDouble(in.next());
			}
			//compute the area
			double area = -1;
			if(shape.equals("rectangle")) area = size1 * size2;
			else if (shape.equals("square")) area =size1* size1;
			else if (shape.equals("circle")) area = Math.PI* size1 * size1;
			// If the area is bigger than the current shape
			if(area  > maxArea ) {
				maxFirstName = firstName;
				maxLastName = lastName;
				maxShape = shape;
				maxArea = area;
			}
			// Update the biggest shape
			
			//Print debug information
			
//			System.out.println("First: "+ firstName);
//			System.out.println("Last Name: "+ lastName);
//			System.out.println("Shape: " + shape);
//			System.out.println("Size 1: "+ size1);
//			System.out.println("Size 2: " +size2);
//			System.out.println("Area: "+ area);
			
			
			
				
				
			///read the next token
			token = in.next();
		}	
	
	
		// print the biggest shape
		System.out.println("Max FirstName: "+ maxFirstName);
		System.out.println("Max LastName: "+ maxLastName);
		System.out.println("Max Shape: " + maxShape);
		System.out.println("Max Area: "+ maxArea);
	}

}