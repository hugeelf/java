// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
package Homeworks.homework_006;

import java.util.ArrayList;
import java.util.HashMap;

public class hw_006_ex_001 {
    public static void addContact(HashMap<String, ArrayList<String>> phoneBook, String key, String value) {
        ArrayList<String> newValue = new ArrayList<>();
        
        if (phoneBook.containsKey(key)) {
            phoneBook.get(key).add(value);
        } else {
            newValue.add(value);
            phoneBook.put(key, newValue);
        }
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Иванов", "+71111111111");
        addContact(phoneBook, "Иванов", "+72222222222");
        addContact(phoneBook, "Петров", "+73333333333");
        System.out.println(phoneBook);
    }
}
