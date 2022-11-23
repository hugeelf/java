// Вывести все простые числа от 1 до 1000

package Homeworks.homework_001;

import java.util.Scanner;

public class hw_001_ex_002 {
    public static int getNumber() {
        Scanner user_input = new Scanner(System.in, "cp866");
        System.out.print("Введите N: ");
        int userNumber = user_input.nextInt();
        user_input.close();
        return userNumber;
    }

    public static void printAnswer(int answer) {
        System.out.println(answer);
    }

    public static boolean isASimple(int number) {
        int dividerCounter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividerCounter++;
            }

        }
        if (dividerCounter > 2) {
            return false;
        } else {
            return true;
        }
    }

    public static void solution(int userNumber) {
        int currentNumber = 2;
        while (currentNumber <= userNumber) {
            boolean trigger = isASimple(currentNumber);
            if (trigger == false) {
                currentNumber++;
            } else {
                printAnswer(currentNumber);
                currentNumber++;
            }
        }
    }

    public static void main(String[] args) {
        // int userNumber = getNumber();
        int userNumber = 1000;
        solution(userNumber);
    }

}
