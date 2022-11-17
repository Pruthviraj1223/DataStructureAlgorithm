package string;

public class longestRepeatingSubSequence {

    public static int LCS(String text1) {

        // first understand LCS algorithm

        char[] str1 = text1.toCharArray();

        int m = str1.length;

        int[][] mat = new int[m + 1][m + 1];

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= m; j++) {

                if (str1[i - 1] == str1[j - 1] && i != j) {         // only i!=j condition added

                    mat[i][j] = mat[i - 1][j - 1] + 1;

                } else {

                    mat[i][j] = Math.max(mat[i - 1][j], mat[i][j - 1]);

                }
            }
        }

        return mat[m][m];
    }

    public static void main(String[] args) {

        // first understand LCS algorithm

        LCS("AABEBCDD");

    }
}
