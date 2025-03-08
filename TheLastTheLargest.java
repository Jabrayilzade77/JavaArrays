package javaArraysExamples;

import java.util.Scanner;

public class TheLastTheLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int maxIndex = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[n - 1];
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
