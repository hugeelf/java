// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
package Homeworks.Homework_005;

import java.util.LinkedList;
import java.util.List;

public class hw_005_ex_001 {
    // Метод воозвращает "перевернутый список"
    public static List<String> reverseList(List<String> mainList) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = mainList.size() - 1; i >= 0; i--) {
            reversedList.addLast(mainList.get(i));
        }
        return reversedList;
    }

    // Методы очереди
    public static void enqueue(LinkedList<String> list, String element) {
        list.addLast(element);
    }

    public static String dequeue(LinkedList<String> list) {
        String element = list.pollFirst();
        return element;
    }

    public static String first(LinkedList<String> list) {
        String element = list.get(0);
        return element;
    }

    public static void main(String[] args) {
        LinkedList<String> mainList = new LinkedList<>();
        mainList.add("Number One");
        mainList.add("Number Two");
        mainList.add("Number Three");
        mainList.add("Number Four");

        System.out.println(reverseList(mainList));

        LinkedList<String> queue = new LinkedList<>();
        System.out.println(queue);
        enqueue(queue, "one");
        enqueue(queue, "two");
        enqueue(queue, "three");
        enqueue(queue, "four");

        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
        System.out.println(queue);
  
    }

}
