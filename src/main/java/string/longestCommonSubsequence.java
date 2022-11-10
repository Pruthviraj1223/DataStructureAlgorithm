package string;

public class longestCommonSubsequence {

    public static int LCS(String text1, String text2) {

        char[] str1 = text1.toCharArray();

        char[] str2 = text2.toCharArray();

        int m = str1.length;        // m=6 means string is having 6 letters

        int n = str2.length;

        int[][] mat = new int[m + 1][n + 1];        // why m+1 , n+1 bcoz m=6 n=6 then need to store 6 row 6 col in matrix and one row,col of zero's

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

               if (str1[i - 1] == str2[j - 1]) {

                    mat[i][j] = mat[i - 1][j - 1] + 1;

                } else {

                    mat[i][j] = Math.max(mat[i - 1][j], mat[i][j - 1]);

                }
            }
        }

        return mat[m][n];
    }

    public static void main(String[] args) {

        LCS("ABCDGH", "AEDFHR");


    }
}
