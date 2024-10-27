package matricxs;

import java.util.ArrayList;

import java.util.List;

class Solution12 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length;
        int startCol = 0;
        int endCol = matrix[0].length;


        while (startRow <endRow && startCol <endCol) {


            for (int index = startCol; index < endCol; index++) {

                list.add(matrix[startRow][index]);

            }

            startRow++;

            for (int index = startRow; index < endRow; index++) {

                list.add(matrix[index][endCol-1]);

            }

            endCol--;

            if(startRow<endRow) {

                for (int index = endCol - 1; index >= startCol; index--) {

                    list.add(matrix[endRow - 1][index]);

                }

                endRow--;
            }

            if(startCol<endCol) {

                for (int index = endRow - 1; index >= startRow; index--) {

                    list.add(matrix[index][startCol]);

                }

                startCol++;

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

        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        new Solution12().spiralOrder(matrix);

    }
}
