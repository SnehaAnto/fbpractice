package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));

        }
    }

    public static String fizzBuzz(int num) {
        if (num == 1 || num == 2) {
            return String.valueOf(num);
        }
        return null;
    }
}
