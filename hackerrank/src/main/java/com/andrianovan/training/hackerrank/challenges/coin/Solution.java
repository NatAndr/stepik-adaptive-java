package java.com.andrianovan.training.hackerrank.challenges.coin;

import java.util.Scanner;

/**
 * Created by natal on 24-May-17.
 */
public class Solution {

    private static long getWays(long n, long[] c){
        // Complete this function
        int coinsNumber = c.length;
        long[][] matrix = initMatrix(n, coinsNumber);
        for (int i = 2; i <= coinsNumber; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = matrix[i - 1][j];
                if (matrix[0][j] >= c[i - 1]) {
                    matrix[i][j] = matrix[i][j] + matrix[i][(int) (j - c[i - 1])];
                }
            }
        }
        return matrix[coinsNumber][(int) n];
    }

    private static long[][] initMatrix(long cents, int coinsNumber) {
//        int coinsNumber = COINS.length;
        long[][] matrix = new long[coinsNumber + 1][(int)(cents + 1)];
        for (int i = 1; i <= cents; i++) {
            matrix[0][i] = i;
            matrix[1][i] = 1;
        }
        for (int i = 1; i <= coinsNumber; i++) {
            matrix[i][0] = 1;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
