package m3b;

public class P353CharacterCounterTest {

	/**@author Giovanni Castillo AIT502-11
	Module: Libraries
	Assignment: M3B-21
	Program: 353 - Character Counter Test
	*/
	public static void main(String[] args) {
		/**
		 * REQUIREMENTS:
		 * A library of methods to process an int array: int[].
		 * Methods include: reading the array with a scanner, printing the array to the standard console, computing min, max, sum and average.
		 */
	    String countedSetABC = "ABC";
	    int[] counterABC = P353CharacterCounter.defineCounter(countedSetABC);

	    P353CharacterCounter.print("Counter ABC: ", countedSetABC, counterABC);
	    P353CharacterCounter.update(countedSetABC, counterABC, "A asdfsadfasd B asdfasdffdsa C asdfasdfsd");
	    P353CharacterCounter.print("\nCounter ABC:", countedSetABC, counterABC);

	    P353CharacterCounter.update(countedSetABC, counterABC, "asdfasdf A asdfsadfasd B asdfasdffdsa C asdfasdfsd");
	    P353CharacterCounter.print("\nCounter ABC: ", countedSetABC, counterABC);
	    P353CharacterCounter.update(countedSetABC, counterABC, "AAABBBCCCAAACCCBBBBBBCCCAAACCCBB");
	    P353CharacterCounter.print("\nCounter ABC: ", countedSetABC, counterABC);

	
	}



}
