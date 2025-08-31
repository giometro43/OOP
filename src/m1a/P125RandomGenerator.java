/**
 * NOTE: Made changes to requirements since the portion for doubles included the int variables
 * incase that wasnt intended.
 */
package m1a;
/*@author Giovanni Castillo AIT502-11
Module: Predefined Data Types
Assignment: M1A-22
Program: 125 Random Generator
*/
/*- Args: a (double), b (double), m (int), n (int) with a < b and m <= n
- Print 3 DOUBLE randoms:
  1) in [0, 1)
  2) in [0, a)
  3) in [a, b)
- Print 3 INT randoms:
  4) in [1, m]
  5) in [0, m]
  6) in [m, n]
Notes:
- Use Math.random() which returns a double in [0, 1)
- Validate inputs (a < b, m <= n) before generating numbers
- Include a header line: "P125RandomGenerator by <name> on <date>"
*/
public class P125RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random Generator by Giovanni Castillo on 08/31/2025");

		// defined the first 4 values, step 1 and 2 DONE
		double a = Double.parseDouble(args[0]);
		System.out.println("Value of A: "+a);
		double b = Double.parseDouble(args[1]);
		System.out.println("Value of B: "+b);
		
		int m = Integer.parseInt(args[2]);
		System.out.println("Value of m: " + m);
		int n = Integer.parseInt(args[3]);
		System.out.println("Value of n: "+n);
		
		// now we will use the math package, with the random method
		// by default it uses [0,1) -> step 1 DONE
		double realRandom1 = Math.random();
		System.out.println("Random double Number from 0 including and 1 excluding: "+ realRandom1);
		// multiplying by A will get the random number very close to A but not exactly, 
		//making the range excluding - step 2 DONE
		
		double realRandom2 = Math.random()* a ;

		System.out.println("random double number from 0 including to A excluding :" + realRandom2);
		
		// step 3 DONE
		double realRandom3 = a + Math.random() * (b-a);
		System.out.println("Random double number from [a,b)"+realRandom3);
		
		//from 1 to m int, casting it with the int at the beginning of the equation
		//Step 4 DONE
		int intRandom1= (int) (1+ Math.random() * m);
		System.out.println("Random int number from [1,m)"+intRandom1);
		
		//int from [0, m], Step 5 DONE, excluding the add 1 
		int intRandom2 = (int)(Math.random() *m);
		System.out.println("Random int number from [0,m)"+intRandom2);
		
		//int range[m, n] Step 6 DONE
		int intRandom3 = (int)(m+ Math.random() * (n-m));
		System.out.println("Random int number from [m,n)"+intRandom3);
	}

}
