package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;

            System.out.println("Корни уравнения равны " + x + " и " + x2);
        }

        if (d == 0) {
            double x = -b / 2 * a;

            System.out.println("Корень уравнения равен " + x);
        }

        if (d < 0) {
            System.out.println("Вещественных корней нет");
        }
    }
}
