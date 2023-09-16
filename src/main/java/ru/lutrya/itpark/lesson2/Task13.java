package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int sum = 0;

        for (int i = n * n; i <= 2 * n * n; i++) {
            sum += i;
        }

        System.out.println("Сумма равна: " + sum);
    }
}
