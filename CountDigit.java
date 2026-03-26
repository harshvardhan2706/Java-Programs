//Java program to count the digit from the given Number

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            int digit = n%10;
            count++;
            n=n/10;
        }
        System.out.println("Total Digits are: " + count);
    }
}
