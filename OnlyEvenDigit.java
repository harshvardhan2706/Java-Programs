//Java; program to print only even digits from the Number

import java.util.Scanner;

public class OnlyEvenDigit {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num != 0){
            int digit = num%10;
            num=num/10;
            if(digit%2==1){
                System.out.println("Even Numbers: " + digit);
            }
        }
        
    }    
}
