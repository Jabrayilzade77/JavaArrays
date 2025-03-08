package javaArraysExamples;

import java.util.Scanner;

public class InitialValuesElementsApp {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int min = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            min /= 2;
            for (int i = 0; i < n; i++) {
                arr[i] -= min;
                System.out.print(arr[i] + " ");
            }
    }
}
