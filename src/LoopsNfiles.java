
public class LoopsNfiles {
	/*Ch.4 Expectations:
	- Use while or do-while for input validation
	- Read integers until sentinel (-1), compute sum and average
	- Use for loop once (e.g., to echo values or simulate N iterations)
	- Optional: write results to a file and read it back*/
	public static void main(String[] args) {
		
		String me = "uncool";
		while(me == "uncool") {
		
			//do-while loop example 
		
			int homers = 0;
			do {
				homers = homers + 1; 
				System.out.print("HOME RUNNN SHOHEII OHTANI #" + homers + "\n");
			}
			while( homers < 10);
			
			for(int injured49ers = 1; injured49ers < 53; injured49ers++  ) {
				System.out.print("We've got someone down on the field! Player hurt #" + injured49ers + "\n");
			}
		
			
			
			
			me = "cool";
		}
		

	}

}
