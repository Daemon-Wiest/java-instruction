package ch8_inheritance_practice;

public class InheritanceDemoApp {
	public static void main(String[] args) {
System.out.println("hello ch8");
Product p1 = new Product("java","murach", 59.50);
Product p2 = new Product("java","murach", 59.50);
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		if (p1==p2) {
			System.out.println("p1 and p2 point to same object");
		}
		else {
			System.out.println("p1 and p2 dont point to same object");
		}
		if (p1.equals(p2)) {
			System.out.println("p1 and p2 havr same state");
		}
		else {
			System.out.println("p1 and p2 dont have same state");
		}
		
		
		
		
	}


}
