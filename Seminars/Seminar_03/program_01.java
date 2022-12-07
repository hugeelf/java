package Seminars.Seminar_03;

import java.util.ArrayList;

public class program_01 {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomList.add((int)(Math.random()*10)); //Используй Random random
        }
        randomList.sort(null);
        System.out.println(randomList);
    }
}
