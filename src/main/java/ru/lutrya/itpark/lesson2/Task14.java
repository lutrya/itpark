package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Сумма равна: " + sum);
    }
}
