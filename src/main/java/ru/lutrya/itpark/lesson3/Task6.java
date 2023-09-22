package ru.lutrya.itpark.lesson3;

import java.util.Random;
// Задача 11.22
public class Task6 {
    public static void main(String[] args) {

        int[] array = new int[11];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}

