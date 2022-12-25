package Homeworks.homework_011;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //For Integer
        
        ArrayList <Integer> integerList = new ArrayList<>();
        for (int i = 0; i< 10; i++){
            integerList.add(new Random().nextInt(-100, 100));
        }
        System.out.println(integerList);

        IsGood <Integer> isGoodInteger = new IsEven();
        System.out.println(filter(integerList, isGoodInteger));

        IsGood <Integer> isGoodPositive = new IsPositive();
        System.out.println(filter(integerList, isGoodPositive));

        //For String
        
        ArrayList <String> stringList = new ArrayList<>();
        stringList.add("Abracadabra");
        stringList.add("Anaconda");
        stringList.add("Bruh");
        stringList.add("Brush");
        stringList.add("Brutal");

        IsGood <String> isGoodBeginWithA = new BeginWithA();
        System.out.println(filter(stringList, isGoodBeginWithA));

        IsGood <String> isGoodBeginWith = new BeginWith("Bru");
        System.out.println(filter(stringList, isGoodBeginWith));
    }

    public static <InputData> Iterable <InputData> filter (Iterable<InputData> array, IsGood <InputData> isGood){
        ArrayList <InputData> newData = new ArrayList<InputData>();
        for (InputData element : array){
            if (isGood.isGood(element)==true){
                newData.add(element);
            }
        }
        return newData;
    }
}
