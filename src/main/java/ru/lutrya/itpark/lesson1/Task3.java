package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double weight = console.nextDouble();
        double height = console.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi <= 18.5) {
            System.out.println("недовес");
        } else if (bmi <= 25.0) {
            System.out.println("всё в норме");
        } else if (bmi <= 30.0) {
            System.out.println("лишний вес");
        } else {
            System.out.println("ожирение");
        }
    }
}
