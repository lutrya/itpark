package ru.lutrya.itpark.lesson3;

//Задача 8.5
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j + " + " + i + " = " + (j + i) + "\t");
            }
            System.out.println();
        }
    }
}
