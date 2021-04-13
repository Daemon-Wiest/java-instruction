package ch7_class_demos;

public class ProductApp {

	public static void main(String[] args) {
		
		System.out.println("hello");
		//p221 creating instances of product
		Product product1=new Product("java", "Murachs java programming", 59.50);
		System.out.println("product1 = "+product1.getCode()+", "+product1.getDescription()+", "+product1.getPrice());
		
		
		
		//create a vendor
		Vendor_test vendor1= new Vendor_test(); // java gives you a default constructor
		
		
		
		
		
		
		
		
		
		System.out.println("goodbye");

	}

}
