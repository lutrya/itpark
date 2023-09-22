package ru.lutrya.itpark.lesson3;

import java.util.Random;
// Задача 11.45
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
        }

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

    }
}
