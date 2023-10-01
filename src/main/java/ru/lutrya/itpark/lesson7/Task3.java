package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//удаление нулевых битов
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        System.out.println(eliminate_unset_bits(text));
    }

    private static Long eliminate_unset_bits(String text) {
        StringBuilder builder = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            if (symbol == '1') {
                builder.append(symbol);
            }
        }

        return Long.parseLong(builder.toString(), 2);
    }
}
