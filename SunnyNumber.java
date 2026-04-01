
import java.util.Scanner;

//Java; Program to find a Sunny Number
// //Sunny Number: A sunny number is a positive integer 
//  whose immediate successor (
// ) is a perfect square, meaning 
//  for some integer 
// . For example, 3 is a sunny number because 
// , and 4 is a perfect square (
// ). Common examples include 3, 8, 15, 24, 35, and 48. 

public class SunnyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;

        for (int i = 1; (i*i) <= num+1; i++) {
            if(i*i==num+1){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("Sunny Number");
        else System.out.println("Not a Sunny Number");
    }
    
}
