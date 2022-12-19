package Homeworks.homework_009;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonWriter extends Writer {

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public void write(Map<String, Float> studentsGrades) {

        StringBuilder sb = new StringBuilder();

        try (FileWriter writer = new FileWriter("Json.txt", true)) {
            writer.append("{\n");
            int counter = 0;
            for (Map.Entry<String, Float> entry : studentsGrades.entrySet()) {
                sb.delete(0, sb.length());
                sb.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ",\n");
                counter++;
                if (counter==studentsGrades.size()){
                    sb.deleteCharAt(sb.length()-2);
                }
                writer.append(sb);
            }

            writer.append("}");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
