package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//извлечение числа из текста
public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String comment = console.nextLine();

        System.out.println(deleteVowelLetters(comment));
    }

    static char[] vowelLetters = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    private static int deleteVowelLetters(String text) {

        StringBuilder builder = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            for (int i = 0; i < vowelLetters.length; i++) {
                if (symbol == vowelLetters[i]) {
                    builder.append(symbol);
                }
            }
        }

        return Integer.parseInt(builder.toString());
    }

}
