package Homework2;

import java.io.*;
import java.util.List;

public class Storage {

    public boolean store(AddressBook adddressBook) throws IOException {
        FileOutputStream fileOut =
                new FileOutputStream("AddressBook.serializare");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(adddressBook.getContacts());
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in AddressBook.serializare");
        return true;
    }

    public AddressBook load() {
        try {
            FileInputStream fileIn = new FileInputStream("AddressBook.serializare");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            AddressBook adddressBook = new AddressBook();
            adddressBook.setContacts((List<Contact>) in.readObject());
            in.close();
            fileIn.close();
            return adddressBook;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}