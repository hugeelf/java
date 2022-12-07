package Seminars.Seminar_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class program4 {
    public static String getPath() {
        String src = System.getProperty("user.dir");
        return src;
    }

    public static String[] getContent(String src) {
        File folder = new File(src);
        String[] list = folder.list();
        return list;

    }

    public static void writeToFile(String[] list) {
        try (FileWriter writer = new FileWriter("./Seminars/Seminar_02/test.txt", false)) {
            for (int i = 0; i < list.length; i++) {
                writer.write(list[i]);
                writer.write("\n");
                writer.flush();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printConsole(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        writeToFile(getContent(getPath()));
    }

}
