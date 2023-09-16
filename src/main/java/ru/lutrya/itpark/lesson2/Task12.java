package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int n = console.nextInt();
        int b = console.nextInt();

        double sum = 0;
        for (int i = 20; i <= 40; i++) {
            sum += Math.pow(i, 3);
        }
        System.out.println("Сумма кубов чисел от 20 до 40: " + sum);

        sum = 0;
        for (int i = a; i <= 50; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов чисел от a до 50: " + sum);

        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов чисел от 1 до n: " + sum);

        sum = 0;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                sum += Math.pow(i, 2);
            }
            System.out.println("Сумма квадратов чисел от a до b: " + sum);
        }
    }
}
