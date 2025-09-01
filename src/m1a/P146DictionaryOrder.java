package m1a;
import javax.swing.JOptionPane;

/*@author Giovanni Castillo AIT502-11
Module: Predefined data types
Assignment: M1A-24
Program: 146 Dictionary Order
*/
/**Requirements: 
 * (1)Receives through a dialog three words (lower cases only). 
 * (2)Computes if they are in dictionary order. 
 * (3)Prints a complete sentence with the result. */
public class P146DictionaryOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// * (1)Receives through a dialog three words (lower cases only). 

		String word1 = JOptionPane.showInputDialog("Enter the first word (lower case only): ");
		String word2 = JOptionPane.showInputDialog("Enter the second word (lower case only): ");
		String word3 = JOptionPane.showInputDialog("Enter the third word (lower case only): ");
		
		// * (2)Computes if they are in dictionary order.
		boolean inOrder = (word1.compareTo(word2) <= 0) && (word2.compareTo(word3) <= 0);
		
		// * (3)Prints a complete sentence with the result.
		String message;
		message = "Dictionary Order by Giovanni Castillo on 08/31/2025\n";
		message += "The first word is " + word1 + ".\n The second word is " + word2 + 
				".\n The third word is " + word3 + ".\n";
		message += "It is " + inOrder + " that they are in dictionary order.";
		JOptionPane.showMessageDialog(null, message);

	}

}
