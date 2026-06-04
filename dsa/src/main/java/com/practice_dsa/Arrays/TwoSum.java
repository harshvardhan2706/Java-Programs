package com.practice_dsa.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //taking size of the array
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        //creating an array:
        int[] arr = new int[size];

        //taking array element
        System.out.println("Enter elements in an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Setting Target
        System.out.println("Enter Target Element for Two Sum: ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]+arr[j] == target){
                        System.out.println("Yes Got it " + arr[i] + ", " + arr[j] + " TwoSum is " + target);
                    }           
            }
            
        }
    }
}
