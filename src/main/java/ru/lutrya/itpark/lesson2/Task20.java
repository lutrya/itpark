package ru.lutrya.itpark.lesson2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int d = console.nextInt();

        int sum = 0;
        int sumEven = 0;
        int count = 0;
        int countOdd = 0;
        int countEven = 0;
        int countD = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("a) " + i);

                sum += i;
                count++;

                if (i % 2 == 0) {
                    sumEven += i;
                    countEven++;
                }

                if (i % 2 != 0) {
                    countOdd++;
                }

                if (i > d) {
                    countD++;
                }
            }
        }
        System.out.println("б) " + sum);
        System.out.println("в) " + sumEven);
        System.out.println("г) " + count);
        System.out.println("д) " + countOdd);
        System.out.println("е) " + countEven);
        System.out.println("ж) " + countD);
    }
}
