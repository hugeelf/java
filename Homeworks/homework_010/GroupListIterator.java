package Homeworks.homework_010;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = -1;
    private Group studentGroup;

    public GroupListIterator(Group studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.studentGroup.groupSize() - 1;
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(index);
    }

    @Override
    public boolean hasPrevious() {
        return this.index > 0 && this.index <= this.studentGroup.groupSize() - 1 && this.index - 1 >= 0;
    }

    @Override
    public Student previous() {
        this.index--;
        return this.studentGroup.getStudent(this.index);
    }

    @Override
    public int nextIndex() {
        return this.index++;
    }

    @Override
    public int previousIndex() {
        return this.index--;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub

    }

}
