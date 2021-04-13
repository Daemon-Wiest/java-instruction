package ui;

public class InterfacesApp {

	public static void main(String[] args) {
		System.out.println("hello");
Printable p = new Book("java", "Murachs's Java Programming", 59.50, "Joel Murach");
Book b = new Book("andr", "Murach's Android Programming", 57.50, "Joel Murach");
p.print();
printIt(b);	
		
		
		
		
		
		
		
		
		System.out.println("goodbye");
	}
private static void printIt(Printable p) {
	p.print();
}
}
