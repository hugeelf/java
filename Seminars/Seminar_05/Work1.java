package Seminars.Seminar_05;
//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//        повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//        (Например, add - egg изоморфны)
//        буква может не меняться, а остаться такой же. (Например, note - code)

import java.util.HashMap;
import java.util.Map;

public class Work1 {
    public static void main(String[] args) {
        String first = "foo";
        String second = "bta";

        Boolean res = isIsomorph(first, second);
        System.out.println(res);
    }
    public static boolean isIsomorph(String first_str, String sec_str){
        Map<Character, Character> dictionary = new HashMap<>();
        if(first_str.length()==sec_str.length()){
            for (int i = 0; i < first_str.length(); i++) {
                if(dictionary.containsKey(first_str.charAt(i))){
                    if(dictionary.get(first_str.charAt(i)) != sec_str.charAt(i)){
                        return false;
                    }
                }
                else dictionary.put(first_str.charAt(i), sec_str.charAt(i));
            }
        return true;
        }
        else return false;
    }

}