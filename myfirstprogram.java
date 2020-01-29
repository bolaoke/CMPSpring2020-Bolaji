/**
 * 
 * @author Bolaji
 * created :1.29.20
 * description : This program calculates the Birth Year
 * 
 **/ 
 import java.util.Scanner;
public class myfirstprogram {
//This is the first method the JVM looks for,to run
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Welcome to My First" + " program \n This program calculates" + " the birth year ");
		System.out.print("Enter your age: ");
		int age      = keyboard.nextInt();
		
		int birthYear = 2020-age;
		System.out.println("You are most likely to be born in " + birthYear);
				
		// TODO Auto-generated method stub

	}

}
