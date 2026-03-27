//Java; Program to print the sum of Each digit of a Number.
import java.util.Scanner;

public class SumOfEachDigit {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        while(num!=0){
            int digit = num%10;
            sum = digit+sum;
            num = num /10;
        }
        System.out.println("Sum = " + sum);
    }
}
