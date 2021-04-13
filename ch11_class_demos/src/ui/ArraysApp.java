package ui;

import java.util.Arrays;

import business.Product;

public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Arrays");
		//p.355
		double[] prices = new double[4]; //the array names prices will store doubles, and will have a length of 4
		prices[0] = 5.99; //index position 0 stores the double 5.99 as an element
		prices[1] = 7.55;
		prices[2] = 11.11;
		prices[3] = 25.25;
		//prices[4] = 57.25;      the fifth index position isnt allowed, as this array has a defined length of 4 index positions
		
		System.out.println("item at idx2:   " + prices[2] );
		
		System.out.println("all prices within array:   ");
		for (int i=0; i<4; i++) {
			System.out.println(i+", "+prices[i]);
		}
		
		
		
		
		
		// p.357
		//creating an array and declaring its values in one line, length of 6 as there are 6 values
		int[] numbers = {5,24,7,9,45,11};
		System.out.println("numbers array length: "+numbers.length);
		
		//p.361
		int sum = 0;
		for (int i: numbers) {
			sum+=i;
		}
		System.out.println("sum= "+sum);
		System.out.println("# of elements= "+numbers.length);
		System.out.println("avg= "+(double)sum/numbers.length);
		System.out.println("Bye");
		
		
		Product p1 = new Product("java", "Murach's Java Programming", 59.50);
		Product p2 = new Product("mysql", "Murach's My SQL", 59.50);
		Product p3 = new Product("andr", "Murach's Android Programming", 59.50);
				
		Product[] products = {p1, p2, p3};
		
		//p364 sorting
		
		for (int i:numbers) {
			System.out.println(i);
		}
		Arrays.sort(numbers);
		System.out.println("---- sorted numbers ----");
		for (int i:numbers) {
			System.out.println(i);
		}
		System.out.println("sort products");
		  for (Product p: products) {
			System.out.println(p);
		}
		Arrays.sort(products);
		
		System.out.println("---- sorted products ----");
		for (Product p: products) {
			System.out.println(p);
		}
		
	}
}


