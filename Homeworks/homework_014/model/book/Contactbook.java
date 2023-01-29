package book;

import java.util.Map;
import java.util.TreeMap;

import agent.PartnerUser;
import agent.User;


public class Contactbook {
    private Map<Integer, User> userList = new TreeMap<>();

    private Integer getUserListSize() {
        return this.userList.size();
    }

    public Map<Integer, User> getPartnerList() {
        return this.userList;
    }

    public void addUser(String name) {
        PartnerUser partner = new PartnerUser();
        partner.setName(name);
        addUserToList(partner);
    }

    private void addUserToList(User user) {
        this.userList.put(getUserListSize(), user);
    }

    public void removeUserFromList(String name) {
        Integer userNumber = 0;
        for (Map.Entry<Integer, User> entry : this.userList.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                userNumber = entry.getKey();
            }
        }
        removeUser(userNumber);
    }

    private void removeUser(Integer userNumber) {
        this.userList.remove(userNumber);
    }

    public User findUser(String name) {
        for (Map.Entry<Integer, User> entry : this.userList.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void addContact(String name, String contact, int switcher) {
        switch (switcher){
            case 1:
                findUser(name).getAddressList().addAddress(contact);
                break;
            case 2:
                findUser(name).getEmailList().addAddress(contact);
                break;
            case 3:
                findUser(name).getTelegramList().addAddress(contact);
                break;
            case 4:
                findUser(name).getPhoneList().addAddress(contact);
                break;
            case 5:
                findUser(name).getVkList().addAddress(contact);
                break;
        }
    }
    public void removeContact(String name, int switcher, int contactNumber){
        switch (switcher){
            case 1: 
                findUser(name).getAddressList().getAddress().remove(contactNumber-1);
                break;
            case 2:
                findUser(name).getEmailList().getAddress().remove(contactNumber-1);
                break;
            case 3:
                findUser(name).getTelegramList().getAddress().remove(contactNumber-1);
                break;
            case 4:
                findUser(name).getPhoneList().getAddress().remove(contactNumber-1);
                break;
            case 5:
                findUser(name).getVkList().getAddress().remove(contactNumber-1);
                break;
        }
    }

}
