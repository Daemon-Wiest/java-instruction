package ui;
import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {

	private static List<String> items = new ArrayList<>();
	

public static void main(String[] args) {
		System.out.println("Welcome to the Wizard Inventory App");
		
		items.add("Wooden Staff");
		items.add("Wizard Hat");
		items.add("Cloth Shoes");
		
		String command = "";
		
		while (!command.equalsIgnoreCase("exit")) {
			
			System.out.println("COMMAND MENU: ");
			System.out.println("show - show all items");
			System.out.println("grab - grab an item");
			System.out.println("edit - edit an item");
			System.out.println("drop - remove an item");
			System.out.println("exit - exit app");
			command= Console.getRequiredString("Command: ");
			
		switch (command) {
			case "show":
			for (int i = 0; i< items.size(); i++) {
				System.out.println((i+1)+". "+items.get(i));
			}
			break;
			case "grab":
			if (items.size()>=4) {
				System.out.println("Max items reached. Drop an item before adding.");
			}
			else {	
			String name = Console.getRequiredString("Name: ");
			items.add(name);
			System.out.println(name+" was added");
			}
			break;
			case "edit":
			int itemNbr=Console.getInt("Number: ", 0, (items.size()+1));
			if (validateItemNumber(itemNbr)) {
				String updName=Console.GetRequiredString("Updated name: ");
				items.set((itemNbr-1), updName);
				System.out.println("Item "+itemNbr+" was updated.");
			}
			else {
				System.out.println("Item number not valid");
			}
			break;
			case "drop":
			itemNbr=Console.getInt("Number: ", 0, (items.size()+1));
			if (validateItemNumber(itemNbr)) {
				String droppedItem = items.remove(itemNbr-1);
				System.out.println(droppedItem+" was dropped.");
			}
			else {
				System.out.println("Item number not valid");
			}
			break;
			case "exit":
			
			break;
		}
		}
		
		
		
	
		
		
		
	}
private static boolean validateItemNumber(int itemNbr) {
	return (items.get(itemNbr-1)) !=null;
}
}
