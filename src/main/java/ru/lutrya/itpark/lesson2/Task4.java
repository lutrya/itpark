package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        while (i < 4) {
            int mark = console.nextInt();
            sum = sum + mark;
            i++;
        }

        System.out.println(sum);

    }
}
