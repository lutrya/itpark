package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int x = 0;

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        x = sum / 1000;

        System.out.println("Среднее арифметическое чисел от 1 до 1000: " + x);

        sum = 0;
        for (int i = 100; i <= b; i++) {
            sum += i;
        }
        x = sum / (b - 100 + 1);

        System.out.println("Среднее арифметическое чисел от 100 до b: " + x);

        sum = 0;
        for (int i = a; i <= 200; i++) {
            sum += i;
        }
        x = sum / (200 - a + 1);

        System.out.println("Среднее арифметическое чисел от a до 200: " + x);

        sum = 0;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            x = sum / (b - a + 1);

            System.out.println("Среднее арифметическое чисел от a до b: " + x);
        }
    }
}
