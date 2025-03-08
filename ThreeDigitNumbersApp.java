package javaArraysExamples;

import java.util.Scanner;

public class ThreeDigitNumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        int a;
        int b;
        int c;

        for (int i = 100; i <= 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;

            if (a + b + c == n) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 100; i <= 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;

            if (a + b + c == n) {
                System.out.println(i);
            }
        }

    }
}
