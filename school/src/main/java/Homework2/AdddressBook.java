package Homework2;

import java.util.ArrayList;
import java.util.List;

public class AdddressBook {
    private List<Contact> contacts;

    public AdddressBook(List<Contact> contacts) {
        this.contacts=new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public boolean deleteContact(String contactName){
        for(Contact contact:contacts){
            if(contact.getName().equals(contactName)){
                return this.contacts.remove(contact);
            }
        }
        return false;
    }

    public Contact findContact(String contactName){
        for(Contact contact:contacts){
            if(contact.getName().equals(contactName)){
               return  contact;
            }
        }
        return null;
    }
}
