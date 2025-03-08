package javaArraysExamples;

import java.util.Scanner;

public class FirstTheSmallestApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;


        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
