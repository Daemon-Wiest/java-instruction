import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthName and monthSales arrays
        String[] monthName = {"null", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[] monthSales = {0.00, 1000.55, 2000.55, 1784.59, 4000.55, 5000.55, 6000.55, 7000.55, 8000.55, 3279.62, 10000.55, 11000.55, 12000.55};
        
        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales  
            
            
              System.out.println("Month:   " +monthName[monthNumber]);
              System.out.println("Sales:   "+currency.format(monthSales[monthNumber]));
            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double sum = 0.0;
        for (int  i = 0; i < monthSales.length; i++ ) {
        	sum += monthSales[i];
        	
        System.out.println("Total sales:    "+sum);
        
        Console.displayLine();
    }    

}
