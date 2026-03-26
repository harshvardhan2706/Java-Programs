//Java: To print all digit present in the given number.

import java.util.Scanner;

public class AllDigit{
    public static void main(String[] args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            System.out.println("Digits present in the Given Number: " + digit);
            n=n/10;
        }

    }
}