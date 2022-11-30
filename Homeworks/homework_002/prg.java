package Homeworks.homework_002;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prg {
    public static String readFile() throws FileNotFoundException, IOException {
        File file = new File("ex_003.txt");
        String answer = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                answer = answer + line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String [] mama = readFile().split("[:,;]");
        for (int i = 0; i < mama.length; i++) {
            System.out.println(mama[i]);
        }
    }
    
}
