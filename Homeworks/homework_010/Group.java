package Homeworks.homework_010;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Group implements Iterable<Student>{
    private List <Student>  studentGroup;

    public Group(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }
    public int groupSize(){
        return this.studentGroup.size();
    }

    public Student getStudent(int index){
        return studentGroup.get(index);
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudGroupIterator(this);
    }

    public ListIterator <Student> listIterator (){
        return new GroupListIterator(this);
    }
    public ReverseIterator<Student> reverseIterator(){
        return new ReverseIterator<>(this);
    }

}
