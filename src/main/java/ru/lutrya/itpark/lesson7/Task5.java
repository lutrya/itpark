package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//удаление гласных
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String comment = console.nextLine();

        System.out.println(deleteVowelLetters(comment));
    }

    static char[] vowelLetters = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

    private static String deleteVowelLetters(String text) {
        text = text.toLowerCase();

        StringBuilder builder = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            for (int i = 0; i < vowelLetters.length; i++) {
                if (symbol == vowelLetters[i]) {
                    builder.append(symbol);
                }
            }
        }

        return builder.toString();
    }

}
