package javaArraysExamples;

import java.util.Scanner;

public class PrintArray3App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("NO");
        }
        else{
            System.out.println(count);
            for (int i = n - 1; i >= 0; i--) {
                if(arr[i] % 2 == 0){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
