package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        int product = 1;
        for (int i = 8; i <= 15; i++) {
            product *= i;
        }
        System.out.println("Произведение чисел от 8 до 15: " + product);

        product = 1;
        for (int i = a; i <= 20; i++) {
            product *= i;
        }
        System.out.println("Произведение чисел от a до 20: " + product);

        product = 1;
        for (int i = 1; i <= b; i++) {
            product *= i;
        }
        System.out.println("Произведение чисел от 1 до b: " + product);

        product = 1;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                product *= i;
            }
            System.out.println("Произведение чисел от a до b: " + product);
        }
    }
}
