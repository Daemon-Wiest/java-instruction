// app in reference to pg 49
package ch02_class_demo;

public class StringsApp {

	public static void main(String[] args) {
	System.out.println("Hello Strings");
	
	String firstName= "Bob";
	System.out.println(firstName);
    String lastName = "Marley";
    System.out.println(firstName + " "+ lastName);
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    fullName = "Sarah";
    fullName += "Connor";
    System.out.println(fullName);
    
	//char c = 'c', single quotes for single characters (not int)
    
    //p.48 reference types vs primitive types
	//int n=5
			//System.out.println(n.);
	//n cannot be resolved to a type, as n was declared as int and int is not a type (it is a primitive type)
    // concat a string and a primitive
    fullName += 5;
    //p.51 escape sequences
    String msg = "This is going to be a really, really"
    		+" really really long message";
    // above wont resolve in two lines, below is how to correctly do so
    // i missed it, just look in the book and experiment with escape sequences
    System.out.println(msg);
    System.out.println(fullName);
    
	System.out.println("Bye");

	}

}
