package Homeworks.homework_003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw_003_ex_001 {

    // Удаляем четные числа
    public static List deleteOdd(List intNumbers) {

        List<Integer> list = new ArrayList<>();
        list.addAll(intNumbers);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    // Максимальное и минимальное значение
    public static List<Integer> minMax(List intNumbers) {

        intNumbers.sort(null);

        int min = (int) intNumbers.get(0);
        int max = (int) intNumbers.get(intNumbers.size() - 1);

        List<Integer> answer = new ArrayList<>();
        answer.add(min);
        answer.add(max);
        return answer;
    }

    // Среднее арифметическое
    public static double average(List intNumbers) {

        int sum = 0;

        for (int i = 0; i < intNumbers.size(); i++) {
            sum += (int) intNumbers.get(i);
        }

        double answer = sum / (int) intNumbers.size();

        return answer;
    }

    // Спиоск в массив
    public static int[] listToArray(List intNumbers) {
        int[] result = new int[intNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) intNumbers.get(i);
        }
        return result;
    }

    // Рекурсия (когда нибудь я ее научусь использовать) - сортировка слиянием
    public static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);

    }

    // Алгоритм слияния
    public static void merge(int[] targetArray, int[] array1, int[] array2) {

        int array1MinIndex = 0;
        int array2MinIndex = 0;

        int targetArrayMinIndex = 0;

        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {
            if (array1[array1MinIndex] <= array2[array2MinIndex]) {
                targetArray[targetArrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;

            } else {
                targetArray[targetArrayMinIndex] = array2[array2MinIndex];
                array1MinIndex++;
            }
            targetArrayMinIndex++;
        }
        while (array1MinIndex < array1.length) {
            targetArray[targetArrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            targetArrayMinIndex++;
        }
        while (array2MinIndex < array2.length) {
            targetArray[targetArrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            targetArrayMinIndex++;
        }
    }

    public static void main(String[] args) {
        // Задаем исходный список
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(53);
        list.add(153);

        // список в массив - для реализации сортировки слиянием
        int[] intArray = listToArray(list);
        System.out.println("Не сортированный массив: " + Arrays.toString(intArray));
        mergeSort(intArray);
        System.out.println("Сортированный массив: " + Arrays.toString(intArray));
        // Работаем с исходным списком
        System.out.println("Исходный список: " + list);
        System.out.println("Список, после удаления всех четных чисел: " + deleteOdd(list)); // Удаляем четные числа
        System.out.println("min = " + minMax(list).get(0)); // Находим и выводим минимальное значение
        System.out.println("max = " + minMax(list).get(1)); // Находим и выводим максимальное значение
        System.out.println("average = " + average(list)); // Находим и выводим среднее арифметическое списка

    }
}
