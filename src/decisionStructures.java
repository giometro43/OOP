/*
Ch.3 Expectations:
- Read numeric grade [0..100] via Scanner (Y)
- Use if/else-if/else with relational + logical ops (Y)
- Validate input (out-of-range => error) (Y)
- Print letter grade A/B/C/D/F (Y)
*/
import java.util.Scanner;
import java.lang.Throwable;
public class decisionStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input a grade 1-100.");
		int grade = in.nextInt();
		
		// input validation, needs to be an integer
		//if(grade > 100 || grade <= -1 ) {
		while(grade > 100 || grade <= -1) {
			//NOTE: change if loop to while since it only repeats once
			/*Logic explanation: while grade is less than or equal
			 *to -1 (Neg inf) OR greater than 100 (positive if),repeat text prompt
			 leaves range 0-100 */
			System.out.println("Please input a grade 1-100.");
			grade = in.nextInt();   
				
		}
		if(grade <=100 && grade >=90){  
			System.out.print( "GRADE : A");
		}
		else if(grade <=89 && grade >=80){
			System.out.print( "GRADE : B");
		}
		else if(grade <=79 && grade >=70){
			System.out.print( "GRADE : C");
		}
		else if(grade <=69 && grade >=60){
			System.out.print( "GRADE : D");
		}
		else if(grade <= 59){
			System.out.print( "GRADE : F");
		}
		in.close();
		
	}

}
