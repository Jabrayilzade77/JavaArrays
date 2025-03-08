package javaArraysExamples;

import java.util.Scanner;

public class DifferenceMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != max && arr[i] != min){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
