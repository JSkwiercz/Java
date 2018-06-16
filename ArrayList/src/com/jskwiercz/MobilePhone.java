package com.jskwiercz;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public void addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists");
        } else {
            myContacts.add(contact);
            System.out.println("Contact successfully added");
        }
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact.getName()) >= 0) {
            myContacts.set(findContact(oldContact), newContact);
            System.out.println("Contact successfully updated");
        } else {
            System.out.println("Contact doesn't exists");
        }
    }

    public void removeContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            myContacts.remove(contact);
            System.out.println("Contact successfully removed");
        } else {
            System.out.println("Contact doesn't exists");
        }
    }

    public void showContactList() {
        if (myContacts.size() == 0) {
            System.out.println("You don't have any contacts");
        } else {
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i + 1) + " " + myContacts.get(i).getName() + ": " + myContacts.get(i).getNumber());
            }
        }
    }

    public Contact querryContact(String name) {
        if(findContact(name) >= 0)
            return myContacts.get(findContact(name));
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
