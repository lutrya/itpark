package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        switch (num) {
            case 61, 62, 63, 64:
                System.out.println("первый полусредний вес");;
                break;
            case 65, 66, 67, 68, 69:
                System.out.println("полусредний вес");;
                break;
            default:
                System.out.println("легкий вес");;
                break;
        }
    }
}
