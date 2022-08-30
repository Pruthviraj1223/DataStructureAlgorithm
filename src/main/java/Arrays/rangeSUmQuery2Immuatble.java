package Arrays;

class NumMatrix {

    int [][]dp;

    public NumMatrix(int[][] matrix) {

        // TECH DOSE Best Solution

        if(matrix == null || matrix.length == 0) return;

        int m = matrix.length, n = matrix[0].length;

        dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++) {

            for(int j = 1; j <= n; j++) {

                // this is imp

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i -  1][j - 1] + matrix[i - 1][j - 1];

            }
        }
    }

/*
*
* matrix = [1,2,3,4]
*          [5,6,7,8]
*          [9,10,11,12]
*
* dp =     [0,0,0,0,0]
*          [0,1,2,3,4]
*          [0,5,6,7,8]
*          [0,9,10,11,12]
*
*
*
* */

    public int sumRegion(int row1, int col1, int row2, int col2) {

        row1++;
        col1++;
        row2++;
        col2++;

        // this is imp

        return dp[row2][col2]- dp[row2][col1-1] - dp[row1-1][col2]+ dp[row1-1][col1-1];

    }
}

public class rangeSUmQuery2Immuatble {
    public static void main(String[] args) {



    }
}
