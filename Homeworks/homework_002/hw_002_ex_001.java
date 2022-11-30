// В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
package Homeworks.homework_002;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class hw_002_ex_001 {
    public static String readFile() throws FileNotFoundException, IOException {
        File file = new File("hw_001_file.txt");
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

    public static String[] splitedStrings(String str, String str2) {
        String[] answer = str.split(str2);
        return answer;
    }

    public static String makeRequest(String[] pairs, String str) {
        String mainString = "SELECT * FROM students WHERE";
        String exceptionString = "null";
        StringBuilder sb = new StringBuilder(mainString);
        for (int i = 0; i < pairs.length; i++) {
            String[] splitPairs = pairs[i].split(str);
            if(splitPairs[1].replaceAll("\"", "").equals(exceptionString)){
                continue;
            }
            sb.append(" " + splitPairs[0].replaceAll("\"", "") + " = " + splitPairs[1] + " AND");

        }
        sb.setLength(sb.length() - 4);
        return sb.toString();

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(makeRequest(splitedStrings(readFile(), ", "), ":"));
    }

}
