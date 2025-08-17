
public class Strings {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		/*[Ch. 2 – Java Fundamentals]
		 * Write a small Java program that declares variables of
		 * at least four different primitive data types, assigns 
		 * them values, performs some arithmetic and string concatenation,
		 * and outputs the results. Concepts needed: primitive types,
		 * literals, variables, operators, System.out.println, type conversion.
		 */
		
		int age = 35;
		boolean isHuman = true;
		char gender = 'F';
		float LifeStatus = 1;
		System.out.print("1982 INITAL TARGET PARAMETERS:");
		System.out.println("\n" + age);
		System.out.println(isHuman);
		System.out.println(gender);
		System.out.println(LifeStatus);
		if(age == 35) {
			
			age = 36;
			isHuman = false;
			gender = 'R';
			LifeStatus = 1 - 1;
			System.out.print("TARGET AQUIRED PARAMETERS:");
			System.out.println("\n" + age);
			System.out.println(isHuman);
			System.out.println(gender);
			System.out.println(LifeStatus);
			}
			
	}
		
}




