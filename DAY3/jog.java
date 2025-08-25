package DAY3;
import java.util.*;

public class jog {
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = new int[n][n];
        int count = 1;

        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            if (sum % 2 == 0) {
                // even diagonal → go top to bottom
                for (int i = 0; i < n; i++) {
                    int j = sum - i;
                    if (j >= 0 && j < n) {
                        mat[i][j] = count++;
                    }
                }
            } else {
                // odd diagonal → go bottom to top
                for (int i = n - 1; i >= 0; i--) {
                    int j = sum - i;
                    if (j >= 0 && j < n) {
                        mat[i][j] = count++;
                    }
                }
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
