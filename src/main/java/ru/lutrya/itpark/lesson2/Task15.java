package ru.lutrya.itpark.lesson2;

public class Task15 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 2; i <= 10; i++) {
            sum += (double)i / (i + 1);
        }

        System.out.println("Сумма равна: " + sum);
    }
}
