package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        if (a == b) {
            System.out.println("=");
        } else if (a > b) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }
}
