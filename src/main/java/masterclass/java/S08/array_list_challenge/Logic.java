package masterclass.java.S08.array_list_challenge;

import java.util.Scanner;

public class Logic {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1144555897856");


    protected static void addNewContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone number: " + phoneNumber);
        } else {
            System.out.println("Can not add, " + name + " already exists");
        }
    }

    protected static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("ERROR");
        }
    }

    protected static void removeContact() {
        System.out.println("Enter existing contact name to remove: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    protected static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "| Phone number: " + existingContactRecord.getPhoneNumber());
    }

    protected static void startPhone() {
        System.out.println("Starting phone");
    }

    protected static void printActions()
    {
        System.out.println("\nAvailable actions:\nPRESS:");
        System.out.println("0 || SHUTDOWN\n" +
                "1 || PRINT CONTACTS\n" +
                "2 || ADD NEW CONTACT\n" +
                "3 || UPDATE EXISTING CONTACT\n" +
                "4 || REMOVE EXISTING CONTACT\n" +
                "5 || QUERY IF AN EXISTING CONTACT EXISTS\n" +
                "6 || PRINT A LIST OF AVAILABLE ACTIONS");
        System.out.println("choose your action: ");
    }

}
