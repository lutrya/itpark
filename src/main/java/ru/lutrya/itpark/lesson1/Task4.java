package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double degrees = console.nextDouble();

        System.out.println("По шкале Фаренгейта: " + (degrees * 1.8 + 32));
        System.out.println("По шкале Кельвина: " + (degrees + (-273.15)));
    }
}
