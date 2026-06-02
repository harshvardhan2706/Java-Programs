package com.practice_dsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking size
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        //taking array input
        System.out.println("Enter elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();    
        }

        Arrays.sort(arr);

        //getting output
        System.out.println("Sorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
}
}