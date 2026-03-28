// Perfect Number?
// A number is perfect if the sum of its proper divisors (excluding itself) is equal to the number.
// Example: 6 → 1 + 2 + 3 = 6

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num/2; i++) {
            if(num % i==0){
            sum = sum + i;   
            }
        }
        if(sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number.");
    }
}
