/**
 * 
 * 
 * @author Student
 *
 **/
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		String answer=" ";
		int n=10;
		
		for(int i =0; i < n; i++);
		{ 
		  System.out.print("Hello, how are you?");
		  answer = scnr.nextLine();
		  
		  System.out.print("Your last answer was " + answer);
		}
		// TODO Auto-generated method stub

	}

}
