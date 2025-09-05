package m2a;
import java.util.Scanner;
/**@author Giovanni Castillo AIT502-11
Module: Loops
Assignment: M2A-21
Program: 216 Temperature
*/
public class P216Temperature {
/* Requirements: Given a text file with a list of maximum temperatures readings either in Celsius (marked with C)
 * or Fahrenheit (marked with F) for some cities in a given day. 
 * The file has the following predefined structure: CITYNAME TEMPERATURE UNIT(C/F). 
 * The end of the text is marked by "###END###". 
 * The city name is a single word (use _ or - for composed words). 
 * Compute and print where was the biggest temperature.*/
	public static void main(String[] args) {
		System.out.println("Tempurature by Giovanni Castillo on 09/07/2025");
		
		//initialize the computations
		String maxCity = null;
		double maxTempCelsius= 0;
		double maxTempFer = 0;
		
		
		//read the first token
		Scanner in = new Scanner (System.in);
		String token = in.next();//reads first element
		//logic: read tokens until you reach the end
		//while not the end token
		while(!token.equals("###END###")) {
			//read the remaining tokens
			//explain each purpose and its string to double conversion
			String cityName = token;
			//read the city name as a string since it can contain letters and symbols
			String tempString = in.next();
			//read the temperature as a string because 
			//the current format is a number followed by a letter so we cant make it a double yet
			char unit = tempString.charAt(tempString.length()-1);
			/*read the last character of the string to determine if its 
			 * in Celsius or Fahrenheit by using charAt
			charAt reads a specific character in a string based on its index
			in laymens terms it reads the last character of the string*/
			double tempNum = Double.parseDouble(tempString.substring(0, tempString.length()-1));
			/*read the number portion of the string by using substring
			 * substring reads a portion of a string based on the starting and ending index. example: 23C has a length of 3 so length()-1 is 2 which is the index of C so we exclude it and read from index 0 to index 1 which is 23
			 * */
			//convert to Feienheight if needed
			if (unit == 'C') {
				/* convert to Celsius using string manipulation we did earlier we would
				use the formula F= C * 9/5 +32 to convert C to F
			 	by isolating F */ 
				
				
			}
			
			// If the temperature is bigger than the current max
			
				// Update the biggest temperature
				
			//Print debug information
			System.out.println("City Name:" +cityName);
			System.out.println("Tempurature:" + tempNum);
			
			
			//read the next token
			token = in.next();
		//end of while
		}
		//close the scanner
		
		//print the final result
		
		
		
		
		
	}

}
