package model.util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.data.StudentUser;

public class AttendanceService {
    private List <StudentUser> attendanceBase = new ArrayList<>();

    // public AttendanceService(List<StudentUser> attendanceBase) {
    //     this.attendanceBase = attendanceBase;
    // }

    public List<StudentUser> getAttendanceBase(){
        List <StudentUser> copyOfAttendanceBase = new ArrayList<>();
        for (StudentUser student : this.attendanceBase){
            copyOfAttendanceBase.add(student);
        }
        return copyOfAttendanceBase;
    }

    public void addStudent(StudentUser student){
        this.attendanceBase.add(student);
    }

    private Map<String, Integer> getPercentageOfAttendance (){
        Map <String, Integer> studentPercentage = new TreeMap<>();
        for (StudentUser student : attendanceBase){
            studentPercentage.put(student.getName(), student.getPercentge());
        }
        return studentPercentage;
    }

    public List<Map.Entry<String, Integer>> sortedPercentage() {

        Map<String, Integer> result = getPercentageOfAttendance();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(list);

        return list;
    }

    

    // @Override
    // public String toString() {
    //     return attendanceBase.toString();
    // }

}
