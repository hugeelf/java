package model.data;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class StudentUser extends User {
    private Map <LocalDate, Boolean> attendanceDates = new TreeMap<>();

    public StudentUser(String name, LocalDate birthDay) {
        super(name, birthDay);
    }

    public String getName(){
        return super.getName();
    }

    public Map <LocalDate, Boolean> getAttendanceDates(){
        return this.attendanceDates;
    }
    
    public void addAttendanceDate(LocalDate date, Boolean isVisited){
        this.attendanceDates.put(date, isVisited);
    }

    @Override
    public String toString() {
        return getName() + attendanceDates;
    }

    public int getPercentge() {
        float percentage = 0.0f;
        for (Map.Entry<LocalDate, Boolean> entry : this.attendanceDates.entrySet()) {
            if (entry.getValue().equals(true)) {
                percentage++;
            }
        }
        percentage = percentage / this.attendanceDates.size() * 100;

        return ((Float)percentage).intValue();
    }
    
}
