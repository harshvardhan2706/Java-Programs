import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt() {
        System.out.print("Enter size: ");
        return sc.nextInt();
    }
}