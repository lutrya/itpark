package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a > b && a > c) {
            System.out.println("а) " + a);
        } else if (b > a && b > c) {
            System.out.println("а) " + b);
        } else {
            System.out.println("а) " + c);
        }

        if (a < b && a < c) {
            System.out.println("б) " + a);
        } else if (b < a && b < c) {
            System.out.println("б) " + b);
        } else {
            System.out.println("б) " + c);
        }

        if (a > b && a < c || a < b && a > c) {
            System.out.println("в) " + a);
        } else if (b < a && b > c || b > a && b < c) {
            System.out.println("в) " + b);
        } else {
            System.out.println("в) " + c);
        }
    }
}
