package com.practice_dsa.Arrays;

import java.util.Scanner;

import com.sun.source.tree.NewArrayTree;

public class PrintFirstMinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        //taking input
        System.out.println("Enter elements in array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int fmin = Integer.MAX_VALUE;

        //getting output
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<fmin) {
                fmin = arr[i];
            }
        }
        System.out.println("The First Minimum Element in array is: " + fmin);
    }
}
