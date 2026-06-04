package com.practice_dsa.Arrays;

import java.util.Scanner;

public class EvenOddIndexOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Arrays Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Updated Array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                arr[i] += 10;
                System.out.print(arr[i] + " "); 
            }else{
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
        }   
    }
}
