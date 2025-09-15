/**
 * 
 */
package m3b;

/**
 * 
 */
public class P353CharacterCounterTest {

	
	
	
	/**
	 * Simple tests for the character counter library
	 * @param args – not used
	 */
	public static void main(String[] args) {
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
