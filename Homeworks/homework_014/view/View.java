package view;

import java.util.Map;

import agent.User;

public class View {
    public void printTips(String text) {
        System.out.println(text);
    }

    public void mainMenu() {
        System.out.println("1: Show partner list \n2: Find partner \n3: Add partner \n4: Delete partner\n");
    }

    public void editMenu(){
        System.out.println("1: Add contact\n2: Delete contact");
    }

    public void contactMenu() {
        System.out.println("1: Add new contact \n2: Delete contact");
    }

    public void showAll(Map<Integer, User> userList) {
        if (userList.size() == 0) {
            System.out.println("User list is empty\n");
        } else {
            System.out.println(userList);
        }
    }

    public void showPartner(User user){
        if (user == null){
            System.out.println("User not found\n");
        }
        else{
            System.out.println(user);
        }
    }
}
