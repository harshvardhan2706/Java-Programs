
import java.util.Scanner;

//Java; Program to find out the Prime Number ): If a Number is divisible by 1 or itself such numbers are called Prime Number.
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean flag = false;

        if(num==1){
            System.out.println(num + "It's a Prime Number.");
        }else{
            for(int i = 2; i < num; i++){
                if(num%i==0){
                    flag = true;
                    break;
                }
            }if(flag==false){
                System.out.println(num + " It's a Prime Number.");
            }else{
                System.out.println(num + " It's Not a Prime Number.");
            }
        }
    }
}
