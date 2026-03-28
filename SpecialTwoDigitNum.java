//Java; program to find the given number is special two digit number or not.
// Special Two Digit Number: The Summation of sum and prod of the two digit number.
import java.util.Scanner;

public class SpecialTwoDigitNum {
    public static void main(String[] args) {
        System.out.print("Enter an Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int last = num%10;
        int first = num/10;

        int sum = first + last;

        int prod = first * last;

        int SpecialNum = sum + prod;

        if(SpecialNum == num)
            System.out.println("Spcial Two Digit Number");
        else
            System.out.println("Not a Special Two Digit Number");
    }
}
