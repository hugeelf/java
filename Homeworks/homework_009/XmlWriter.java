package Homeworks.homework_009;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XmlWriter extends Writer {

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public void write(Map<String, Float> studentsGrades) {
        StringBuilder sb = new StringBuilder();

        try (FileWriter writer = new FileWriter("Xml.txt", true)) {
            writer.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.append("<students>\n");

            for (Map.Entry<String, Float> entry : studentsGrades.entrySet()) {
                sb.delete(0, sb.length());
                sb.append("\t<student>\n" + "\t\t<name>" + entry.getKey() + "</name>\n" + "\t\t<grade>"
                        + entry.getValue() + "</grade>\n" + "\t</student>\n");
                writer.append(sb);
            }

            writer.append("</students>");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
