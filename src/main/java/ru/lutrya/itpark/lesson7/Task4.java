package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//количество гласных букв
public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        System.out.println(countVowelLetters(text));
    }
    static char[] vowelLetters = new char[] { 'a', 'e', 'i', 'o', 'u', 'y'};
    private static int countVowelLetters(String text) {
        text = text.toLowerCase();

        int count = 0;

        for (char symbol : text.toCharArray()) {
            for (int i = 0; i < vowelLetters.length; i++) {
                if (symbol == vowelLetters[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}
