package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Точка принадлежит первой четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка принадлежит четвертой четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка принадлежит третьей четверти");
        } else {
            System.out.println("Точка принадлежит второй четверти");
        }
    }
}
