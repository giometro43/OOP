
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined data types
Assignment: M1A-122
Program:126 Two Dices
*/

public class P126TwoDices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dice Roller by Giovanni Castillo on 08/31/2025");

		int dice1;
		int dice2;
		// rolls two dice by defining the range of the random numbers
		// 1 being the start of the range, and 6 being the end of the range
		// we cast int since we dont want the double data type of the random method to be used
		dice1 = (int) (1+Math.random() * 6); 
		dice2 = (int) (1+Math.random() * 6); 

		
		System.out.println("the dice 1 is:" + dice1);
		System.out.println("the dice 2 is:" + dice2);

	}

}
