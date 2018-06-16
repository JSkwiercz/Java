package com.jskwiercz;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("Choose option: \n" +
                    "1 - Show contacts\n" +
                    "2 - Add contact\n" +
                    "3 - Update contact\n" +
                    "4 - Remove contact\n" +
                    "5 - Find contact\n" +
                    "6 - Quit");
            int select = scan.nextInt();
            scan.nextLine();
            switch (select) {
                case 1:
                    myPhone.showContactList();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    findContact();
                    break;

                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void addContact() {
        System.out.print("Type name: ");
        String name = scan.nextLine();
        System.out.print("Type number: ");
        String number = scan.nextLine();
        Contact newContact = new Contact(name, number);
        myPhone.addNewContact(newContact);
    }

    public static void updateContact() {
        System.out.print("Type contact's name to update: ");
        String oldname = scan.nextLine();
        Contact oldContact = myPhone.querryContact(oldname);
        if (oldContact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.print("Type new name: ");
            String newname = scan.nextLine();
            System.out.print("Type new number: ");
            String newnumber = scan.nextLine();
            Contact updatedContact = new Contact(newname, newnumber);
            myPhone.updateContact(oldContact, updatedContact);
        }
    }

    public static void removeContact() {
        System.out.print("Type contact's name to remove: ");
        String name = scan.nextLine();
        Contact contact = myPhone.querryContact(name);
        if (contact == null) {
            System.out.println("Contact not found");
        } else {
            myPhone.removeContact(contact);
        }
    }

    public static void findContact() {
        System.out.print("Type contact's name to find: ");
        String name = scan.nextLine();
        Contact contact = myPhone.querryContact(name);
        if (contact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println(contact.getName() + ": " + contact.getNumber());
        }
    }
}
