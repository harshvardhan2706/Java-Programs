//Java; program to Find the given number is spy or not (Spy Number: Where Sum of the Number is equal to the Product of the Number).
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number to find Spy Number or Not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0 ;
        int prod = 1;

        while(num!=0){
            int digit = num %10;
            sum = digit + sum;
            prod = digit * prod;

            num = num/10;
        }

        if(sum==prod){
            System.out.println("Spy Number.");
        }else{
            System.out.println("Not a Spy Number.");
        }
    }
}
