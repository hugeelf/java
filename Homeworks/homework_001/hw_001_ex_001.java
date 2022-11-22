// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package Homeworks.homework_001;
import java.util.Scanner;
public class hw_001_ex_001 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in, "cp866");
        System.out.print("Введите N: ");
        int userNumber = user_input.nextInt();
        user_input.close();
        int tripleAnswer = 0;
        for (int i = 1; i <= userNumber; i++) {
            tripleAnswer+=i;
        }
    System.out.println("Треугольное число от N = "+tripleAnswer);
        int factorialAnswer = 1;
        for (int i = 1; i <=userNumber; i++) {
             factorialAnswer*=i;           
        }
    System.out.println("Факториал от N = "+factorialAnswer);
    }
}
