package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int start = 1;
        int hours = 24;
        int i = 3;

        while (i <= hours) {
            int ameba = start * (int) Math.pow(2, i / 3);
            System.out.println("Через " + i + "ч. будет " + ameba + " клеток");
            i += 3;
        }

    }
}
