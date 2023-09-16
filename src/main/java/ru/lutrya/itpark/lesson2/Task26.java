package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int min = 0;
        int average  = 0;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        if (a > b && a < c || a < b && a > c) {
            average = a;
        } else if (b < a && b > c || b > a && b < c) {
            average = b;
        } else {
            average = c;
        }
        int sum = min + average;

        System.out.println("Сумма наименьших чисел равна: " + sum);
    }
}
