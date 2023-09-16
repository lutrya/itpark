package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        for (int i = 10; i <= 99; i++) {

            if ((i + "").contains(n + "") || i % n == 0) {
                System.out.println(i);
            }
        }
    }
}
