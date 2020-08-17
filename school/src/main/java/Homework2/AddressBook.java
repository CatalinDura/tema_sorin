package Homework2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        if (findContact(contact.getName())==null) {
            this.contacts.add(contact);
        }
    }

    public boolean deleteContact(String contactName) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(contactName)) {
                return this.contacts.remove(contact);
            }
        }
        return false;
    }

    public Contact findContact(String contactName) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }
}
