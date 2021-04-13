package ch7_class_demos;
//pg217. this method will be used in pretty much every business class we create
public class Product {
//seans rules for creating a class
//1 create the class
//2 create the instance variables
//3 generate constructor(s)
//4 generate getters/setters
//optional-generate a toString()
	
	
	// instance variables
private String code;
private String description;
private double price;
	// getters and setters, genned same way as constructor
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
//constructors ('fully loaded'), not required, but very nice to have
public Product(String code, String description, double price) {
	super();
	this.code = code;
	this.description = description;
	this.price = price;
	
	
	
}
@Override
public String toString() {
	return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
}

		
	
}
