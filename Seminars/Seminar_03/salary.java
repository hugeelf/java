package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class salary {
    public static void main(String[] args) {
        ArrayList<String> planetsList = new ArrayList<>();
        planetsList.add("Земля");
        planetsList.add("Юпитер");
        planetsList.add("Венера");
        planetsList.add("Марс");
        planetsList.add("Сатурн");
        planetsList.add("Плутон");
        planetsList.add("Нептун");
        planetsList.add("Уран");
        ArrayList<String> randomPlanets = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(planetsList.size());
            randomPlanets.add(i, planetsList.get(index));
        }
        System.out.println(randomPlanets);
        for (int i = 0; i < planetsList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < randomPlanets.size(); j++) {
                if(randomPlanets.get(j)==(planetsList.get(i))){
                    counter++;
                }
            System.out.println( );
            }

        }
    }

}
