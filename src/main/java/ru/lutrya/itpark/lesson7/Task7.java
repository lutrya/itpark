package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//codewars Stringy Strings
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();

        System.out.println(stringy(size));
    }

    private static int stringy(int size) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                builder.append(1);
            } else  {
                builder.append(0);
            }
        }

        return Integer.parseInt(builder.toString());
    }
}
