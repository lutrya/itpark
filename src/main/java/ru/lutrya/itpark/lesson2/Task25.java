package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int max = 0;
        int average  = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a > b && a < c || a < b && a > c) {
            average = a;
        } else if (b < a && b > c || b > a && b < c) {
            average = b;
        } else {
            average = c;
        }
        int sum = max + average;

        System.out.println("Сумма наибольших чисел равна: " + sum);
    }
}
