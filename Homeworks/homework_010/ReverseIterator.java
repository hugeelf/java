package Homeworks.homework_010;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student>{
    private Group studentGroup;
    private int index;

    public ReverseIterator(Group studentGroup) {
        this.studentGroup = studentGroup;
        this.index = this.studentGroup.groupSize();
    }   
    @Override
    public boolean hasNext() {
        return this.index>0;
    }

    @Override
    public Student next() {
        this.index--;
        return this.studentGroup.getStudent(this.index);
    }
    public int getCurrentIndex(){
        return this.index;
    }
}
