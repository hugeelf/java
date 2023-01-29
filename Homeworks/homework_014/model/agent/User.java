package agent;

import contacts.Address;
import contacts.Email;
import contacts.Telegram;
import contacts.Telephone;
import contacts.Vk;

public class User {
    private String name;
    private Address addressList = new Address();
    private Email emailList = new Email();
    private Telegram telegramList = new Telegram();
    private Telephone phoneList = new Telephone();
    private Vk vkList = new Vk();
    // private List<Email> emailList = new ArrayList<>();
    // private List<Telegram> telegramList = new ArrayList<>();
    // private List<Telephone> telephoneList = new ArrayList<>();
    // private List<Vk> vkList = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", addressList=" + addressList + ", emailList=" + emailList + ", telegramList="
                + telegramList + ", phoneList=" + phoneList + ", vkList=" + vkList + "]";
    }

    public Address getAddressList() {
        return addressList;
    }

    public Email getEmailList() {
        return emailList;
    }

    public Telegram getTelegramList() {
        return telegramList;
    }

    public Telephone getPhoneList() {
        return phoneList;
    }

    public Vk getVkList() {
        return vkList;
    }

    // public List<Address> geAddresses() {
    //     return this.addressList;
    // }

    // public List<Email> getEmails() {
    //     return this.emailList;
    // }

    // public List<Telegram> getTelegrams() {
    //     return this.telegramList;
    // }

    // public List<Telephone> getTelephones() {
    //     return this.telephoneList;
    // }

    // public List<Vk> getVk() {
    //     return this.vkList;
    // }

    // @Override
    // public String toString() {
    //     return "\n"+"[name=" + name + "\n" +"addressList=" + addressList + "\n" + "emailList=" + emailList + "\n" +"telegramList="
    //             + telegramList + "\n" + "telephoneList=" + telephoneList + "\n" + "vkList=" + vkList + "]" + "\n";
    // }



}
