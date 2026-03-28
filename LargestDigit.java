//Java; Program to find the largest digit in a given Number.
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int large=0;
        while(num!=0){
            int digit = num%10;
            
            if(digit>large){
                large = digit;
            }
            num= num/10;
            
        }System.out.println("Largest Digit: " + large);
    }
}
