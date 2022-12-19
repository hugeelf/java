package Homeworks.homework_009;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SimpleTextWriter extends Writer {

    @Override
    public void read() {

    }

 
    public void write(Map<String, Float> studentsGrades) {
        try (FileWriter writer = new FileWriter("Simple.txt", true)) {
            for (Map.Entry<String, Float> entry : studentsGrades.entrySet()) {
                writer.append(entry.toString());
                writer.append('\n');
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        };
    }

    @Override
    public void write() {

    }

}
