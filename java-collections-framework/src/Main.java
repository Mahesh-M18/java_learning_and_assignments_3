import java.util.HashMap;

import contactmanagementsystem.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Contact> contacts = new HashMap<>();

        //Add contacts
        Contact contact1 = new Contact("Mahesh", "9876543210", "mahesh@gmail.com");
        Contact contact2 = new Contact("Rahul", "9876543211", "rahul@gmail.com");
        Contact contact3 = new Contact("Priya", "9876543212", "priya@gmail.com");

        contacts.put(contact1.getName(), contact1);
        contacts.put(contact2.getName(), contact2);
        contacts.put(contact3.getName(), contact3);

        //Display all contacts
        System.out.println("All Contacts : ");

        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }

        //Search
        String searchName = "Mahesh";

        if (contacts.containsKey(searchName)) {
            System.out.println("Contact Found");
            System.out.println(contacts.get(searchName));
        } else {
            System.out.println("Contact not found");
        }

        //Remove
        contacts.remove("Rahul");
        System.out.println("Contacts after removing Rahul : ");

        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}
