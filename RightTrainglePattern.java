public class RightTrainglePattern {
    public static void main(String[] args) {
        int n = Input.getInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n; j++) {
                if(i>=j) System.out.print("X ");
                else System.out.print(" ");
            }System.out.println();
        }
    }
}
