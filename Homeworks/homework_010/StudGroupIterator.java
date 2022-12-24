package Homeworks.homework_010;

import java.util.Iterator;

public class StudGroupIterator implements Iterator<Student>{
    private int index = -1;
    private Group studentGroup;
    

    public StudGroupIterator(Group studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.studentGroup.groupSize() - 1;
    }

    @Override
    public Student next() {
        this.index++;
        return this.studentGroup.getStudent(this.index);
    }
    
}
