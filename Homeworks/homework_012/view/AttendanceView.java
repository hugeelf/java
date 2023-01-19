package view;
import model.data.StudentUser;
import model.util.AttendanceService;

public class AttendanceView {
    public void printAttendance (AttendanceService studentList){
        for (StudentUser student : studentList.getAttendanceBase()){
            System.out.println("[" + student.getName()+ "=" + student.getPercentge() + "]");
        }
    }

    public void printSortedAttendance (AttendanceService studentList){
        System.out.println(studentList.sortedPercentage());
    }

    public void printSortedAttendanceTruants (AttendanceService studentList){
        for (StudentUser student :studentList.getAttendanceBase()){
            if (student.getPercentge() <= 25){
                System.out.println("[" + student.getName()+ "=" + student.getPercentge() + "]");
            }
        }
    }
}
