package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        int sum = 0;
        for (int i = 100; i <= 500; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 100 до 500: " + sum);

        sum = 0;
        for (int i = a; i <= 500; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от a до 500: " + sum);

        sum = 0;
        for (int i = -10; i <= b; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от -10 до b: " + sum);

        sum = 0;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от a до b: " + sum);
        }
    }
}
