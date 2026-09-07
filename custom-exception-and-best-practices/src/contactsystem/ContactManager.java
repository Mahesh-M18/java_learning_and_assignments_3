package contactsystem;

import customexceptions.DuplicateContactException;
import customexceptions.InvalidContactException;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {

    private Map<String, ContactProfile> contacts = new HashMap<>();

    //Add contact
    public void addContact(String name, String phone, String email) {
        validateContact(name, phone, email);

        if (contacts.containsKey(phone)) {
            throw new DuplicateContactException("Contact with this phone number already exists.");
        }
        ContactProfile contact = new ContactProfile(name, phone, email);
        contacts.put(phone, contact);
    }

    //Validate contact details
    private void validateContact(String name, String phone, String email) {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidContactException("Name cannot be empty.");
        }

        if (phone == null || !phone.matches("\\d{10}")) {
            throw new InvalidContactException("Phone number must contain exactly 10 digits.");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidContactException("Invalid email address");
        }
    }

    //Search contact
    public ContactProfile searchContact(String phone) {
        if (!contacts.containsKey(phone)) {
            throw new InvalidContactException("No contact found with phone number : " + phone);
        }
        return contacts.get(phone);
    }

    //Delete contact
    public void deleteContact(String phone) {
        if (!contacts.containsKey(phone)) {
            throw new InvalidContactException("No contact found with phone number : " + phone);
        }
        contacts.remove(phone);
        System.out.println("Contact deleted Successfully");
    }

    //Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        for (ContactProfile contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}
