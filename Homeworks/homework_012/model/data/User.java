package model.data;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate birthDay;

    public User(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
    protected String getName(){
        return this.name;
    }
}
