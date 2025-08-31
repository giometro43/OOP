/**
 * 
 */
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-21
Program: 115 Custom Welcome
*/
/*
 * Receives values from the command line and creates custom messages. 
 * OBJ: Command line parameter
 * Providing command line parameters
 * Using command line parameters
 * String arrays and indexes
 */ 
public class P115CustomWelcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Custom Welcome by Giovanni Castillo on 08/31/2025");
		// this program recieves the args[] array values from the run configurations menu
		// args[0] = first name, from the run > run configurations > arguments tab.
		// we will put the name of the person to welcome them in the program
		
		System.out.println("Hello " + args[0] + ", welcome to Java!");
		
		
		
	}

}
