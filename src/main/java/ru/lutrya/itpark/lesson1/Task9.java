package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        System.out.println("Среднее арифметическое: " + ((a + b) / 2) + "\nСреднее геометрическое: " + Math.sqrt(a * b));
    }
}
