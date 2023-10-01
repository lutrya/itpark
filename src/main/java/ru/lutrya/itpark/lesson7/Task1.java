package ru.lutrya.itpark.lesson7;

import java.util.Scanner;
//шифр Цезаря
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        System.out.println(encrypt(text, 3));
        System.out.println(decrypt(text, 3));
    }

    static char[] alphabet = new char[] { 'а', 'б', 'в', 'г', 'д', 'е', 'ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я' };

    private static String encrypt(String message, int shift) {
        message = message.toLowerCase();

        StringBuilder builder = new StringBuilder();
        for (char symbol : message.toCharArray()) {
            int symbolIndex = -1;

            for (int i = 0; i < alphabet.length; i++) {
                if (symbol == alphabet[i]) {
                    symbolIndex = i;
                    break;
                }
            }

            if (symbolIndex < 0)
                builder.append(symbol);
            else
                builder.append(alphabet[Math.abs(symbolIndex + shift) % 33]);
        }

        return builder.toString();
    }

    private static String decrypt(String message, int shift) {
        return encrypt(message, -shift);
    }
}
