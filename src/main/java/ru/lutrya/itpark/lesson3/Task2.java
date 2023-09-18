package ru.lutrya.itpark.lesson3;

import java.util.Scanner;
//натуральное число от a до b с максимальной суммой делителей
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int max = 0;
        int result = 0;

        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int num = 1; num <= i; num++) {
                if (i % num == 0) {
                    sum += num;
                }
            }
            if (sum > max) {
                max = sum;
                result = i;
            }
        }
        System.out.println(result);
    }
}
