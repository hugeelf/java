package Seminars.Seminar_04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class program_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque <String> deque = new LinkedList<>();

        while(true){
            String input = scanner.nextLine();
            if (input == "quit"){
                break;
            }
            if (input.equals("print")){
                System.out.println(deque);
            }
            if (input.equals("revert")){
                System.out.println( deque.pollLast());
            }
            else{
                deque.addFirst(input);
            }
        }
        scanner.close();
    }
}
