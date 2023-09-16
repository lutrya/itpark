package ru.lutrya.itpark.lesson2;

public class Task16 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            String stringifiedNumber = i + "";
            int num = (int) (Math.pow(Integer.parseInt(stringifiedNumber.charAt(0) + ""), 2) + Math.pow(Integer.parseInt(stringifiedNumber.charAt(1) + ""), 2));
            if (num % 13 == 0) {
                System.out.println(num);
            }
        }

        for (int i = 10; i <= 99; i++) {
            String stringifiedNumberTwo = i + "";
            int numTwo = (Integer.parseInt(stringifiedNumberTwo.charAt(0) + "") + (Integer.parseInt(stringifiedNumberTwo.charAt(1) + "")));
            double numThree = Math.pow(numTwo, 2);

            double sum = numTwo + numThree;

            if (i == sum) {
                System.out.println("Число с указанным свойством: " + i);
            }
        }
    }
}
