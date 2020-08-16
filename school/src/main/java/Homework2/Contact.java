package Homework2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
    private String name;
    private List<ContactData> data;

    public Contact(String name) {
        this.name = name;
        this.data = new ArrayList<ContactData>();
    }

    public void addContactData(ContactData contactData){
        data.add(contactData);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContactData> getData() {
        return data;
    }

    public void setData(List<ContactData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
