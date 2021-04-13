package ch02_class_demo;

import java.util.Scanner; //this line imports the scanner class, allowing you to utilize scanner objects

public class ScannerApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		String choice = "y";
		Scanner sc = new Scanner(System.in); //at point of writing, the ide doesnt know what scanner is, as it hasnt been imported or defined
		while (choice.equalsIgnoreCase("y")) {
				
			// pg 61
			System.out.print("Hi, what is your name? ");
			String name = sc.next();
			String name2 = sc.next();
			System.out.println("Hello "+name +" " +name2);
			// clear the buffer
			sc.nextLine();
			System.out.println("Enter a sentence: ");
			String sentence = sc.nextLine();
			System.out.println(sentence);
			
			System.out.println("Enter a whole number: ");
			int n1 = sc.nextInt();
			System.out.println("You entered: " +n1);
			if (n1>=10) {
				System.out.println("What a lucky number!");
			}
			System.out.println("Enter a decimal number: ");
			double d1 = sc.nextDouble();
			System.out.println("You entered: "+d1);
			System.out.println("Do you wish to continue? (y/n) :");
			choice = sc.next();
			if (choice.equals("y")) {
				System.out.println("You have chosen to go again");
									}
			
			else if (choice.equals("n")) {
				System.out.println("How sad.");
											}
			
			else {
				System.out.println(choice + " is not a valid answer");
				}	
			}
		System.out.println("Goodbye");
		sc.close(); // this closes your import, ending any resource leaks
		
	}
		
	}


