package ru.lutrya.itpark.lesson3;

import java.util.Random;
import java.util.Scanner;
// Задача 11.13
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int index = console.nextInt();

        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 500);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[index] == array[i]) {
                System.out.println(array[i]);
            }
        }

    }
}
