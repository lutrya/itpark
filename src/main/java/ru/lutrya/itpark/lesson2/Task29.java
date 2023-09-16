package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double max = a;
        double min = a;

        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("Максимальное значение: " + max);

        if (b < a && b < c) {
            min = b;
        }
        if (c < a && c < b) {
            min = c;
        }
        System.out.println("Минимальное значение: " + min);
    }
}
