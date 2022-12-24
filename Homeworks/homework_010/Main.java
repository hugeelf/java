package Homeworks.homework_010;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Group mainGroup = new Group(Arrays.asList(
                new Student("Ivan", "12.12.2000", 4.8f),
                new Student("John", "01.12.2000", 4.1f),
                new Student("Nikolay", "23.08.2001", 5.0f)));
        for (Student student : mainGroup) {
            System.out.println(student);
        }
        System.out.println();
        Iterator<Student> itr = mainGroup.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        ListIterator <Student> listIter = mainGroup.listIterator();
        while (listIter.hasNext()){
            System.err.println(listIter.next());
            if(listIter.hasPrevious()){
                System.out.println("Предыдущий элемент" + listIter.previous());
                listIter.next();
            }
        }
        ReverseIterator rev =  mainGroup.reverseIterator();
        while (rev.hasNext()){
            System.out.println("Текущая позиция" + rev.getCurrentIndex());
            System.out.println(rev.next());
        }
    }

}
