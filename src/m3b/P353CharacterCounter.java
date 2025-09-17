/**
 * REQUIREMENTS:
 * Library with utilities to define, print, and update a character counter for a text fragment.
 */
package m3b;
/**@author Giovanni Castillo AIT502-11
Module: Libraries
Assignment: M3B-21
Program: 
*/
public class P353CharacterCounter {

	
	/**
	 * Define a counter for characters provided in an input set
	 * Example:
	 * defineCounter("abc") return a counter: int[3] {0, 0, 0}
	 * with counter[0] counting how many times "a" appears, count[1] for "b"s and
	 * count[2] for "c"
	 * @param countedSet – a String with the characters that will be counted (set)
	 * @return – a counter for the characters
	 *          (array of integers – index linked with the counted set)
	 */
	public static int[] defineCounter(String countedSet) {
	    int[] counter = new int[countedSet.length()];
	    for (int i = 0; i < countedSet.length(); i++) {
	        counter[i] = 0;
	    }
	    return counter;
	}
	
	/**
	 * Print the counter
	 */
	public static void print(String header, String countedSet, int[] counter) {
	    System.out.print(header);
	    for (int i = 0; i < countedSet.length(); i++) {
	        System.out.print("'" + countedSet.charAt(i) + "'(" + counter[i] + "); ");
	    }
	}

	/**
	 * Update the counter for new text
	 * @param countedSet – the characters that are counted
	 * @param counter – the counting of each character in the counted set
	 * @param text – the text based on which the counter is updated
	 * @return the received counter (updated) – the counter will always be updated
	 */

	
	public static int[] update(String countedSet, int[] counter, String text) {
	    for (int i = 0; i < text.length(); i++) {
	        char ch = text.charAt(i);
	        int countedIndex = countedSet.indexOf(ch);
	        if (countedIndex >= 0) {
	            counter[countedIndex]++;
	        }
	    }
	    return counter;
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("CharacterCounter by Giovanni Castillo due by 08/15/2025");
		// TODO Auto-generated method stub

	}

}