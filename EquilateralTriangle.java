public class EquilateralTriangle {
    public static void main(String[] args) {
        int n = Input.getInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars (important: 2*i - 1)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}