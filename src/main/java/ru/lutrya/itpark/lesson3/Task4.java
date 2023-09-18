package ru.lutrya.itpark.lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int maxPrice = 0;

        int[] array = new int[50];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000, 10001);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPrice) {
                maxPrice = array[i];
            }
        }
        System.out.println("Самый дорогой автомобиль стоит: " + maxPrice + "$");
    }
}
