import java.time.LocalDate;

import controller.Presenter;
import model.data.StudentUser;
import model.util.AttendanceService;
import view.AttendanceView;

public class Main {
    public static void main(String[] args) {
        
        StudentUser oleg = new StudentUser("Oleg", LocalDate.of(1990, 01, 01));
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 01), true);
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 02), true);
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 03), false);
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 04), false);
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 05), true);
        oleg.addAttendanceDate(LocalDate.of(2023, 01, 06), false);

        StudentUser ivan = new StudentUser("Ivan", LocalDate.of(1990, 01, 01));
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 02), false);
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 01), true);
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 03), true);
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 04), false);
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 05), true);
        ivan.addAttendanceDate(LocalDate.of(2023, 01, 06), true);

        StudentUser svetlana = new StudentUser("Svetlana", LocalDate.of(1990, 01, 01));
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 02), false);
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 01), false);
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 03), false);
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 04), false);
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 05), false);
        svetlana.addAttendanceDate(LocalDate.of(2023, 01, 06), true);
        
        AttendanceService base = new AttendanceService();
        base.addStudent(oleg);
        base.addStudent(ivan);
        base.addStudent(svetlana);

        AttendanceView view = new AttendanceView();
        Presenter presenter = new Presenter(view, base);
        presenter.presentation();

    }
}
