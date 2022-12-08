// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и 
// выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package Homeworks.homework_006;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class hw_006_ex_002 {
    // Сбор данных о количестве упоминаний имени
    public static HashMap<String, Integer> celebrity(LinkedList<String> names) {

        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (result.containsKey(names.get(i))) {
                int temp = result.get(names.get(i));
                temp++;
                result.put(names.get(i), temp);
            } else {
                result.put(names.get(i), 1);
            }
        }
        return result;
    }
    //Вывод сортированного списка по убыванию.
    public static LinkedList<String> sortedCelebrity(HashMap<String, Integer> unsortedMap) {

        LinkedList<String> answer = new LinkedList<>();
        TreeMap<Integer, String> tempMap = new TreeMap<>();

        for (Entry<String, Integer> entry : unsortedMap.entrySet()) {
            tempMap.put(entry.getValue(), entry.getKey());
        }

        for (int i = tempMap.size() - 1; i >= 0; i--) {
            String tempString = tempMap.lastEntry().toString();
            
            String[] tempArray = tempString.split("=");
            tempString = tempArray[1] + "=" + tempArray[0];
            answer.add(tempString);
            tempMap.pollLastEntry();
        }
        return answer;

    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Иван");
        names.add("Иван");
        names.add("Иван");
        names.add("Петр");
        names.add("Иван");
        names.add("Петр");
        names.add("Петр");
        names.add("Петр");
        names.add("Иван");
        names.add("Сидор");
        names.add("Сидор");
        names.add("Сидор");
        names.add("Сидор");
        names.add("Сидор");
        names.add("Себастьян");
        names.add("Иван");
        names.add("Иван");
        names.add("Иван");
        names.add("Сидор");
        names.add("Петр");

        System.out.println(sortedCelebrity(celebrity(names)));
    }

}
