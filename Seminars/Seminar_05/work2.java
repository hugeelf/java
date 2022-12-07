package Seminars.Seminar_05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class work2 {
    public static boolean areAllClosed(String expression) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('<', '>');
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');

        Deque<Character> bracketsInExpression = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            if (brackets.containsKey(expression.charAt(i))) {
                bracketsInExpression.addLast(expression.charAt(i));
            } else if (brackets.containsValue(expression.charAt(i))) {
                if (bracketsInExpression.size() == 0)
                    return false;
                else if(expression.charAt(i) == bracketsInExpression.remove()){
                    continue;
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String expression = "{(fhdjf)}";
        System.out.println(areAllClosed(expression));
    }

}
