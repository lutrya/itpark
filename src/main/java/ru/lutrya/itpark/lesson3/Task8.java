package ru.lutrya.itpark.lesson3;

import java.util.Random;
// Задача 11.63
public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int count = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }
        System.out.println("Неотрицательных элементов: " + count);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
