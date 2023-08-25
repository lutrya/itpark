package ru.lutrya.itpark.lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int seconds = console.nextInt();
        int hour = seconds / 3600;
        int minute = (seconds - (hour * 3600)) / 60;
        int second = seconds - (hour * 3600) - (minute * 60);

        System.out.println("Прошло: " + hour + "ч. " + minute + "мин. " + second + "сек.");
    }

}
