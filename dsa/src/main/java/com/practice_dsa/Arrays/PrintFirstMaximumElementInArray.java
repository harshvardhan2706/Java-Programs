package com.practice_dsa.Arrays;

import java.util.Scanner;

public class PrintFirstMaximumElementInArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //taking size
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        //taking input
        System.out.println("Enter the elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //getting output
        int fmax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > fmax){
            fmax = arr[i];
            }
        }

        System.out.println("First Maximum Element in Array: " + fmax);
    
    }
}
