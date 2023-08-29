package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int i = 0;
        int sum = 0;

        while (i < n) {
            int a = console.nextInt();
            sum = sum + a;
            i++;
        }

        System.out.println(sum);

    }
}
