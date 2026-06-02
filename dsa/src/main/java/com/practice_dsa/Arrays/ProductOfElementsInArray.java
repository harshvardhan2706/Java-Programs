package com.practice_dsa.Arrays;

import java.util.Scanner;

public class ProductOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //taking size
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        //taking array elements
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //taking output
        System.out.println("Array: ");
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }

        System.out.println("Product of the Array is: " + prod);
    }
}
