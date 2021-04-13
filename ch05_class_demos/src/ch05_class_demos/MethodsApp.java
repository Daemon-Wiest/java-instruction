package ch05_class_demos;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MethodsApp {
//printwelcomemessage is declared as a method, and then called upon within the main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printWelcomeMessage();
		printWelcomeMessage("Daemon");
		System.out.println("55.7 / 6.2 = "+ quotient(55.7, 6.2));
		
		
		int n1 = getInt("Enter a whole number: ", sc);
		int n2 = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of numbers ["+n1+", "+n2+"]= " +(n1+n2));
		double d1 = getDouble("Enter a decimal value:  ", sc);
		System.out.println("decimal entered: "+d1);
		
		System.out.println("Bye");
sc.close();
	}
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the methods app");
	}
//static method with 1 parameter and no return
	private static void printWelcomeMessage(String name) {
		System.out.println("welcome, "+name+", to the methods app");
	}
//static method with 2 parameters and a return
	private static double quotient(double d1, double d2) {
		return d1 / d2;
	}

	// prompt user for a whole number and return that whole number
	// uses exception handling
	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		boolean isValid = false;
		while (!isValid) {
			try {
			System.out.print(prompt);
			nbr = sc.nextInt();
			isValid=true;
			}
			catch (InputMismatchException ime) {
				System.out.println("Invalid entry. Must be a whole number.");
				sc.nextLine();
				//nextline clears input from scanner, prevents the above sysout from being printed into the "enter another whole number" field
			}
		}
		return nbr;
	}
	// prompt for a decimal number and return it... using data validation
	private static double getDouble(String prompt, Scanner sc) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
		if(sc.hasNextDouble()){
			d = sc.nextDouble();
			isValid=true;
			
		}
		else {
			System.out.println("invalid entry. must be a decimal number");
			sc.next();
		}
		
	}
		return d;
}
}