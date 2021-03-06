import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Get input from the the user
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and validate user's date of birth
        LocalDate userDOB = LocalDate.parse(dateOfBirthString);
        if (userDOB.isAfter(currentDate)) {
        	System.out.println("Invalid Date, No Time Travel Allowed");
        }
        // If user's date of birth is valid
        else {
            // Format and print user's date of birth
        	   DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(
                       FormatStyle.MEDIUM);        
               
        	
        	System.out.println("Your date of birth is "+mediumDate.format(userDOB));
            // Format and print the current date
            
        	
        	System.out.println("The current date is "+mediumDate.format(currentDate));

            // Calculate and print the user's age
            long yearsDiff = ChronoUnit.YEARS.between(userDOB, currentDate);
        	System.out.println("Your age is " + yearsDiff);
            
        }
    }
}