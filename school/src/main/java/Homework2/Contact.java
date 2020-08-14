package Homework2;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<ContactData> data;

    public Contact(String name) {
        this.name = name;
        this.data = new ArrayList<ContactData>();
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
}
