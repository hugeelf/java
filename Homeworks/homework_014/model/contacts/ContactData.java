package contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactData {
    private List<String> addressList = new ArrayList<>();
    private String name;

    public void addAddress(String address) {
        this.addressList.add(address);
    }

    public List<String> getAddress() {
        return this.addressList;
    }

    private int getSize(){
        return this.addressList.size();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "ContactData [addressList=" + addressList + "]";
    }
}
