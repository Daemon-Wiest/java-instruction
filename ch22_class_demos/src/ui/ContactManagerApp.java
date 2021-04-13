package ui;

import java.util.*;
import java.util.function.*;


import business.Contact;
import business.TestContact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the contact manager");
		//p.703
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact ("mike murach", null, "800-211-5528"));
		contacts.add(new Contact ("anne boehm", null, null));
		contacts.add(new Contact ("mike murach", "joel@murach.com",null));
		System.out.println("All contacts");
		System.out.println("===================");
		displayContacts(contacts);
		System.out.println("===================");
		System.out.println("contacts with no phone #");
		System.out.println("===================");
		//displayContactsNoPhone(contacts);
		List<Contact> contactsNoPhone = filterContacts(contacts, c-> c.getPhone()==null);
		displayContacts(contactsNoPhone);
		System.out.println("===================");
		System.out.println("contacts with no email");
		System.out.println("===================");
		//displayContactsNoEmail(contacts);
		List<Contact> contactsNoEmail = filterContacts(contacts, c-> c.getEmail()==null);
		displayContacts(contactsNoEmail);
		System.out.println("===================");
		System.out.println("contacts with no email or phone");
		System.out.println("===================");
		//displayContactsNoEmailPhone(contacts);
		List<Contact> contactsNoEmailPhone = filterContacts(contacts, c-> c.getPhone()==null && c.getEmail()==null);
		displayContacts(contactsNoEmailPhone);
		System.out.println("===================");
		System.out.println("Use consumer to print contact names");
		System.out.println("===================");
		processContacts(contacts, c-> System.out.println(c.getName()));
		System.out.println("Use function interface to transform contact list");
		System.out.println("===================");
		List<String> contactPhoneNumbers = transformContacts(contacts, c->{
			String phone = c.getPhone()==null? "N/A" : c.getPhone();
			return c.getName()+": "+phone;
		});
		//p.716 using a stream to display the output from above lambda
		contactPhoneNumbers.stream().forEach(s-> System.out.println(s));
		//above is equivalent to below
		for (String s:contactPhoneNumbers) {
			System.out.println(s);
		}
		System.out.println("you have exited the contact manager");

	}
	//one method using functional interface, TestContact, to replace all methods below (original methods)
	/*public static List<Contact> filterContacts(List<Contact> contacts, TestContact condition){
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c:contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
	}*/
	
	//p.709 using predicate interface to replace test interface
	public static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition){ //you can replace the test interface with the predicate interface
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c:contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
	
	}
	//p.711 using consumer interface
	public static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
	//p.713
	public static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function){
		List<String> strings = new ArrayList<>();
		for (Contact c : contacts) {
			strings.add(function.apply(c));
		}
		
		return strings;
	}
private static void displayContacts(List<Contact> contacts){
	for (Contact c: contacts) {
		System.out.println(c);
	}
}
/*	private static void displayContactsNoPhone(List<Contact> contacts){
		for (Contact c: contacts) {
			if (c.getPhone()==null)
			System.out.println(c);
		}
}
	private static void displayContactsNoEmail(List<Contact> contacts){
		for (Contact c: contacts) {
			if (c.getEmail()==null)
			System.out.println(c);
		}
}
	private static void displayContactsNoEmailPhone(List<Contact> contacts){
		for (Contact c: contacts) {
			if (c.getEmail()==null&&c.getPhone()==null)
			System.out.println(c);
		}
}*/
}
