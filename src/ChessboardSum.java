import java.util.*;

public class ChessboardSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int blackSum = 0;
        int whiteSum = 0;
        
        // Calculate sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    blackSum += mat[i][j];
                } else {
                    whiteSum += mat[i][j];
                }
            }
        }
        
        // Output
        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}
