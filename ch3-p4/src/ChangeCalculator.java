import java.util.Scanner;

public class ChangeCalculator{ 
	public static void main(String[] args) {
		System.out.println("Welcome to the change calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y"; // declare choice now, you know this kind of app will require it
		
		while (choice.equalsIgnoreCase("y")) {
			//prompt for cents =int
			System.out.println("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			//biz logic, calc quarters, dimes, nickels, and pennies as ints
			int quarters = cents / 25;
			cents = cents % 25; //use of modulus essentially gives the leftovers from the quarters above, study up
			int dimes = cents / 10;
			cents = cents % 10;
			int nickels = cents/ 5;
			cents = cents % 5;
			int pennies = cents;
			// then display values of all variables above
			System.out.println("Quarters: "+quarters);
			System.out.println("Dimes: "+dimes);
			System.out.println("Nickels: "+nickels);
			System.out.println("Pennies: "+pennies);
			
		
		
			
			
			System.out.println("Continue (y/n)? ");
			choice = sc.next();
		}
		sc.close(); // closes resource leak caused by scanner sc, always required in good practice
		System.out.println("Bye");
	
}
}