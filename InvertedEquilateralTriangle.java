public class InvertedEquilateralTriangle {
    public static void main(String[] args) {
        int n = Input.getInt();
        
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i<=j && i+j<=2*n){
                    System.out.print(" X");
                }else{
                    System.out.println();
                }
            }
        }
    }
}