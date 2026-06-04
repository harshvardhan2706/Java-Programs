package com.practice_dsa.Arrays;

import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking size 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        //creating array
        int[] arr = new int[n];

        //creating array
        System.out.println("Enter elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        }

        //approach to search in an array
        //target to find
        System.out.println("Enter a element to find  in given array: ");
        int findEle = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findEle) {
                System.out.println("Element Found at index " + i + " & element is " + arr[i]);
            }
        }
        
    
    } 
}
