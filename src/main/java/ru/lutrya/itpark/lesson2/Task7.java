package ru.lutrya.itpark.lesson2;

public class Task7 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i <= 10; i++) {
            int pow = 1;

            for (int j = 0; j < i; j++) {
                pow *= 2;
            }

            sum += pow;
        }

        System.out.println(sum);

    }
}
