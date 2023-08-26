package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        int jar = a + b - 1;

        a = jar - a;
        b = jar - b;

        System.out.println(a + " " + b);
    }
}
