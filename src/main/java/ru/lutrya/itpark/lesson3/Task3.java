package ru.lutrya.itpark.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int max = 0;
        int min = 100;
        int difference = 0;
        int maxIndex = 0;
        int minIndex = 0;

        int arraySize = console.nextInt();
        int[] array = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 101);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            else if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        difference = max - min;

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Разница максимального и минимального элемента: " + difference);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Индекс минимального элемента: " + minIndex);
    }
}
