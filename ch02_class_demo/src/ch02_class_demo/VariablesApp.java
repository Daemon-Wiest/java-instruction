package ch02_class_demo;

public class VariablesApp {

	public static void main(String[] args) {
		System.out.println("Hello from Variables App");
		
		//can also be written int quantity=1
		int quantity; 
		quantity=0;
		
		//quantity is currently 0, this adds 1 to quantity
		quantity=quantity+1; 
		
		//compound assignment operator, same function as above
		quantity += 1; 
		
		// unary operator, operate on one variable, same function as above but can only add one
		quantity ++;
		
		double price = 57.99;
		// now increase price by 10%
		price *= 1.1;
		
		//the system puts out quantity = as well as the current value of quantity at the end of execution
		System.out.println("Quantity = "+quantity);
		System.out.println("Price ="+price);
		System.out.println("Bye");
	}

}
