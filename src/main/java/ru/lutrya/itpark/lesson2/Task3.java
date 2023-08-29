package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        while (i < 12) {
            int mass = console.nextInt();
            sum = sum + mass;
            i++;
        }

        System.out.println(sum);

    }
}
