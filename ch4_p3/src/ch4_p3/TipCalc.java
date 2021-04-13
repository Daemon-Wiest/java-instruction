package ch4_p3;
import java.math.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalc {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			// get input - cost of the meal as a bigdecimal
			// create big decimal from string for sake of exercise
			System.out.println("Cost of Meal? ");
String costOfMealStr= sc.next();
//can also use : BigDecimal costOfMeal = sc.nextBigDecimal();
BigDecimal costOfMeal = new BigDecimal(costOfMealStr);

			// business logic - calculate tip and total meal cost for 15%.20%,25%
			// usage of for loop reccomended for this exercise
NumberFormat percent = NumberFormat.getPercentInstance();
NumberFormat currency = NumberFormat.getCurrencyInstance();
for (double d= .15; d <= .25; d +=.05) {
	System.out.println(percent.format(d));
	BigDecimal tipPct = new BigDecimal(d);
	BigDecimal tipAmt = costOfMeal.multiply(tipPct);
	System.out.println("Tip Amount:  "+currency.format(tipAmt));
	BigDecimal total = costOfMeal.add(tipAmt);
	System.out.println("total amount:  "+currency.format(total));
}
			// display amounts
			
System.out.println("Continue? (y/n)");
choice = sc.next();
		}
		sc.close();
		System.out.println("Thanks for using the tip calculator");

	}

}
