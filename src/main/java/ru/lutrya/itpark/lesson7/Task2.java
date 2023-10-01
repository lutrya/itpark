package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//сбалансированность строк
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        System.out.println(check(text));
    }

    private static boolean check(String message) {
        int count = 0;

        for (char symbol : message.toCharArray()) {
            if (symbol == '(') {
                count++;
            } else if (symbol == ')') {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}
