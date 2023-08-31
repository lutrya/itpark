package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int a = console.nextInt();

        for (int i = 1; i <= n; i++) {
            int pow = 1;

            for (int j = 0; j < i; j++) {
                pow *= a;
            }

            System.out.println(pow);
        }

    }
}
