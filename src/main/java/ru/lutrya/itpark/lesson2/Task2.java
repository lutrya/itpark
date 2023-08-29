package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int i = 0;
        double sum = 0;

        while (i < n) {
            double a = console.nextDouble();
            sum = sum + a;
            i++;
        }

        System.out.println(sum);

    }
}
