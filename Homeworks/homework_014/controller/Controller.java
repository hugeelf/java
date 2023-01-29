package controller;

import view.View;

import java.util.Scanner;

import book.Contactbook;

public class Controller {
    private View view = new View();
    private Contactbook model = new Contactbook();
    private String menuNavigation = "main";
    private Scanner scanner = new Scanner(System.in);

    private void setNavigation(String userSelect) {
        this.menuNavigation = userSelect;
    }

    private String getUserInput() {
        return scanner.next();
    }

    private int menuChoice() {
        return scanner.nextInt();
    }

    // public Controller(View view, Contactbook model) {
    // this.view = new View();
    // this.model = new Contactbook();
    // }

    public void run() {

        while (true) {
            switch (this.menuNavigation) {
                case "main":
                    view.mainMenu();
                    switch (menuChoice()) {
                        case 1:
                            view.showAll(model.getPartnerList());
                            this.menuNavigation = "choiceMenu";
                            break;
                        case 2:
                            view.printTips("Input partner name: ");
                            view.showPartner(model.findUser(getUserInput()));
                            this.menuNavigation = "choiceMenu";
                            break;
                        case 3:
                            view.printTips("Input partner name: ");
                            model.addUser(getUserInput());
                            this.menuNavigation = "choiceMenu";
                            break;
                        case 4:
                            view.printTips("input partner name: ");
                            model.removeUserFromList(getUserInput());
                            this.menuNavigation = "choiceMenu";
                            break;

                    }
                    break;
                case "choiceMenu":
                    view.printTips("1: Main menu\n2: Edit contact menu\n");
                    switch (menuChoice()) {
                        case 1:
                            this.menuNavigation = "main";
                            break;
                        case 2:
                            this.menuNavigation = "editPartner";
                            break;
                    }
                    break;
                case "editPartner":
                    view.editMenu();
                    switch (menuChoice()) {
                        case 1:
                            view.printTips("Input partner name:\n");
                            String name = getUserInput();
                            if (model.findUser(name) == null) {
                                view.showPartner(model.findUser(name));
                                this.menuNavigation = "main";
                                break;
                            } else {
                                view.showPartner(model.findUser(name));
                            }

                            // view.showPartner(model.findUser(name));
                            view.printTips(
                                    "1: add addres\n2: add email\n3: add telegram\n4: add phone number\n5: add vk\n");
                            int switcher = menuChoice();
                            view.printTips("Input contact details:\n");
                            String contact = getUserInput();
                            model.addContact(name, contact, switcher);
                            this.menuNavigation = "choiceMenu";
                            break;
                        case 2:
                            view.printTips("Input partner name:\n");
                            String findName = getUserInput();
                            if (model.findUser(findName) == null) {
                                view.showPartner(model.findUser(findName));
                                this.menuNavigation = "main";
                                break;
                            } else {
                                view.showPartner(model.findUser(findName));
                            }
                            view.printTips(
                                    "1: remove addres\n2: remove email\n3: remove telegram\n4: remove phone number\n5: remove vk\n");
                            int removeSwitcher = menuChoice();
                            view.printTips("Number of contact to remove is: \n");
                            int removeNumber = menuChoice();
                            model.removeContact(findName, removeSwitcher, removeNumber);
                            this.menuNavigation = "choiceMenu";
                            break;
                    }
                    break;

            }

        }
    }
}
