package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        while (i < 10) {
            int number = console.nextInt();
            sum = sum + number;
            i++;
        }

        System.out.println(sum);

    }
}
