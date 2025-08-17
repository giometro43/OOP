/*
Ch.3 Expectations:
- Read numeric grade [0..100] via Scanner
- Use if/else-if/else with relational + logical ops
- Validate input (out-of-range => error)
- Print letter grade A/B/C/D/F
*/
import java.util.Scanner;
public class decisionStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a grade 1-100.");
		int grade = in.nextInt();
		
		if(grade > 100 || grade < 1 ) {
			System.out.println("Please input a grade 1-100.");
			grade = in.nextInt();   
		}
		else if(grade <=100 || grade >=90){
			System.out.print( "GRADE : A");
		}
		else if(grade <=89 || grade >=80){
			System.out.print( "GRADE : B");
		}
		else if(grade <=79 || grade >=70){
			System.out.print( "GRADE : C");
		}
		else if(grade <=69 || grade >=60){
			System.out.print( "GRADE : D");
		}
		else if(grade <= 59){
			System.out.print( "GRADE : F");
		}
		in.close();
		
	}

}
