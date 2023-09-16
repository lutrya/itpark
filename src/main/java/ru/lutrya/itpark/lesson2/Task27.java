package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int a1 = console.nextInt();
        int b1 = console.nextInt();
        int c1 = console.nextInt();

        int average;
        int averageTwo;

        if (a > b && a < c || a < b && a > c) {
            average = a;
        } else if (b < a && b > c || b > a && b < c) {
            average = b;
        } else {
            average = c;
        }

        if (a1 > b1 && a < c1 || a1 < b1 && a1 > c1) {
            averageTwo = a1;
        } else if (b1 < a1 && b1 > c1 || b1 > a1 && b1 < c1) {
            averageTwo = b1;
        } else {
            averageTwo = c1;
        }

        int arithmeticMean = (average + averageTwo) / 2;
        System.out.println("Среднее арифметическое: " + arithmeticMean);
    }
}
