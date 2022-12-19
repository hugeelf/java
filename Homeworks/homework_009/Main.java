package Homeworks.homework_009;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String, Float> studentsGrades = new HashMap<>();
        studentsGrades.put("Иван Иванов", (float) 4.8);
        studentsGrades.put("Мария Кузнецова", (float) 5.0);
        studentsGrades.put("Степан Кузьмин", (float) 3.6);
        SimpleTextWriter writer = new SimpleTextWriter();
        JsonWriter jsonWriter = new JsonWriter();
        XmlWriter xmlWriter = new XmlWriter();

        jsonWriter.write(studentsGrades);
        xmlWriter.write(studentsGrades);
        writer.write(studentsGrades);
    }
}
