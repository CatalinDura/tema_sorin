package Homework2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AddressBook addressBook = new AddressBook();
        ContactData contactData1 = new Address("alba");
        ContactData contactData2 = new Address("cluj");
        ContactData contactData3 = new Phone("111111");
        ContactData contactData4 = new Phone("222222");
        Contact contact1 = new Contact("primul contact");
        Contact contact2=new Contact("al doilea contact");
        contact1.addContactData(contactData1);
        contact2.addContactData(contactData2);
        contact1.addContactData(contactData3);
        contact2.addContactData(contactData4);
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        Storage storage=new Storage();
        storage.store(addressBook);
    }
}
