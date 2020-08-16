package Homework2;

public class MainDeserializare {

    public static void main(String[] args) {
        Storage storage=new Storage();
        AddressBook addressBook=storage.load();
        System.out.println(addressBook.toString());
    }
}
