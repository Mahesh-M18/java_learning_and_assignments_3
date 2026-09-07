import contactsystem.ContactProfile;
import contactsystem.ContactManager;
import customexceptions.DuplicateContactException;
import customexceptions.InvalidContactException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContactManager manager = new ContactManager();

        while (true) {

            System.out.println("\n===== Contact Manager =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            try {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = input.nextLine();
                        System.out.print("Enter Phone: ");
                        String phone = input.nextLine();
                        System.out.print("Enter Email: ");
                        String email = input.nextLine();
                        manager.addContact(name, phone, email);
                        System.out.println("Contact Added Successfully");
                        break;

                    case 2:
                        System.out.print("Enter Phone to search contact: ");
                        String searchPhone = input.nextLine();
                        ContactProfile contact = manager.searchContact(searchPhone);
                        System.out.println("Contact Found");
                        System.out.println(contact);
                        break;

                    case 3:
                        System.out.print("Enter Phone to delete contact: ");
                        String deletePhone = input.nextLine();
                        manager.deleteContact(deletePhone);
                        break;

                    case 4:
                        System.out.println("\n----- All Contacts -----");
                        manager.displayContacts();
                        break;

                    case 5:
                        System.out.println("Exiting Contact Manager...");
                        input.close();
                        return;

                    default:
                        System.out.println("Invalid Choice. Please select 1-5.");

                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter numeric values.");
                input.nextLine();
            } catch (InvalidContactException e) {
                System.out.println("Validation Error: " + e.getMessage());
            } catch (DuplicateContactException e) {
                System.out.println("Duplicate Error: " + e.getMessage());
            }
        }
    }
}
