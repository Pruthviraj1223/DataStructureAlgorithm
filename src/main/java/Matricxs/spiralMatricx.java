package Matricxs;

import java.util.ArrayList;

import java.util.List;

class Solution12 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int index, k = 0, l = 0;

        int m = matrix.length;

        int n = matrix[0].length;

        while (k < m && l < n) {

            for (index = l; index < n; ++index) {

                list.add(matrix[k][index]);
            }

            k++;

            // columns
            for (index = k; index < m; ++index) {

                list.add(matrix[index][n-1]);

            }

            n--;

            if (k < m) {

                for (index = n - 1; index >= l; --index) {

                    list.add(matrix[m-1][index]);

                }
                m--;

            }

            if (l < n) {
                for (index = m - 1; index >= k; --index) {

                    list.add(matrix[index][l]);

                }
                l++;
            }
        }

        return list;

    }

    public List<Integer> spiralOrder2(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int di=0;

        int m = matrix.length;

        int n = matrix[0].length;

        boolean[][] seen = new boolean[m][n];

        int x=0,y=0;

        int []dirRow = new int[]{0,1,0,-1};

        int []dirCol = new int[]{ 1, 0, -1, 0 };

        for (int i = 0; i < m * n; i++) {

            list.add(matrix[x][y]);

            seen[x][y] = true;

            int newX = x + dirRow[di];

            int newY = y + dirCol[di];

            if (0 <= newX && newX < m && 0 <= newY && newY < n && !seen[newX][newY]) {

                x = newX;

                y = newY;

            } else {

                di = (di + 1) % 4;

                x = x + dirRow[di];

                y = y + dirCol[di];

            }
        }


        return list;

    }

}

public class spiralMatricx {

    public static void main(String[] args) {

    }
}
