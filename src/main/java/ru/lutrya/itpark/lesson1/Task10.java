package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int v = console.nextInt();
        int m = console.nextInt();

        System.out.println("Плотность материала равна: " + (m / v));
    }
}
