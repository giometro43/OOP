/**
 * 
 */
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-21
Program: 116 Hello Class by Instructor
*/
/**
 * This will be a simple program that prints "Hello Class!" to the console, but uses the 
 * same arguements from 115, so that the instructor name can be printed this time
 */
public class P116HelloClassByInstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(e.g. "Hello, Class! My name is Mihai Boicu.").
		System.out.println("Hello Class by Instructor by Giovanni Castillo on 08/31/2025");
		String greeting = "Hello, Class! My name is " + args[0] + " " + args[1] + ".";
		
		System.out.println(greeting);
	}

}
