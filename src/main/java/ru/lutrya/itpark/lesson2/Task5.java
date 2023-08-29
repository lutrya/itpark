package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int i = 0;
        int sum = 0;

        while (i < n) {
            int salary = console.nextInt();
            sum = sum + salary;
            i++;
        }

        System.out.println(sum);

    }
}
