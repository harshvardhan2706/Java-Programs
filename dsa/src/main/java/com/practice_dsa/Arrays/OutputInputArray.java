package com.practice_dsa.Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[5];

        System.out.println("Enter 5 elements: ");

        for(int i =0; i<arrays.length; i++){
            arrays[i] = sc.nextInt();
        }

        System.out.println("Arrays Elements are: ");
        System.out.print("[");

        for (int i =0; i<arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.print("]");
        
    }
}
