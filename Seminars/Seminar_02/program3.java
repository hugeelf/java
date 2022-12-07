package Seminars.Seminar_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class program3 {
    public static String myltiplyString (String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            builder.append(str);
        }
        return builder.toString();
    }
    public static void toFile (String str){
       try ( FileWriter writer = new FileWriter("test.txt", false)){
        writer.write(str);
        writer.flush();
       }
       catch(IOException ex){
        System.out.println(ex.getMessage());
       }
    }
    public static void main(String[] args) {
        String str = "TEST";
        toFile(myltiplyString(str));
    }
}
