package ru.lutrya.itpark.lesson2;

public class Task19 {
    public static void main(String[] args) {
        for (int i = 31; i < 100; i++) {
            if ( i % 3 == 0 && (i % 10 == 2 || i % 10 == 4 || i % 10 == 8)) {
                System.out.println(i);
            }
        }
    }
}
