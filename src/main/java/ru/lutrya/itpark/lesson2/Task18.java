package ru.lutrya.itpark.lesson2;

public class Task18 {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            double num = Math.pow(i, 2);

            if (num % 1000 == i) {
                System.out.println("a) " + i);
            }
        }

        for (int i = 100; i <= 999; i++) {

            String stringifiedNumber = i + "";
            int num = ((Integer.parseInt(stringifiedNumber.charAt(0) + "")) + (Integer.parseInt(stringifiedNumber.charAt(1) + "") + (Integer.parseInt(stringifiedNumber.charAt(2) + ""))));

            if (i % 7 == 0 && num % 7 == 0) {
                System.out.println("б) " + i);
            }
        }
    }
}
