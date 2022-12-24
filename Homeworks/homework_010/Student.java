package Homeworks.homework_010;

public class Student {
    private String name;
    private String birthDay;
    private float grade;
    
    public Student(String name, String birthDay, float grade) {
        this.name = name;
        this.birthDay = birthDay;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", birthDay=" + birthDay + ", grade=" + grade + "]";
    }
}
