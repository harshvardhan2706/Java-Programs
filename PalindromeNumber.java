
import java.util.Scanner;

//Java; A palindrome number is an integer that remains the same when its digits are reversed, reading identically forward and backward (e.g., 121, 1331, 757). Negative numbers are generally not considered palindromes due to the sign trailing at the end when reversed (e.g., -121 becomes 121-).  
public class PalindromeNumber {
    public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int original_num = num;
    int rev =0;

    while(num!=0){
        int digit = num%10;
        rev = rev * 10 + digit;
        num = num / 10;
    }

    if(rev==original_num) 
        System.out.println(original_num + " is a Palindrom Number.");
    else 
        System.out.println(original_num + " is not a Palindrome Number.");

    }
}
