package com.practice_dsa.Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. 1:  ");
        int x = sc.nextInt();

        System.out.println("Enter No. 2:  ");
        int y = sc.nextInt();

        System.out.println("Enter No. 3:  ");
        int z = sc.nextInt();

        System.out.println("maximum No from Three: " + Math.max(x, (Math.max(y, z))));

    }
}
