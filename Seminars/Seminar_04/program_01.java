package Seminars.Seminar_04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class program_01 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String[] line = scanner.nextLine().split("~");
            int index = Integer.parseInt(line[1]);
            String string = line[0];

            if (index >= list.size()) {
                for (int j = list.size(); j <= index; j++) {
                    list.add(null);
                }
            }

            if (string.equals("print")) {
                System.out.println(list.get(index));
                list.remove(index);
            } else {
                list.set(index, string);
            }

            System.out.println(list);
        }

        scanner.close();

    }
}
