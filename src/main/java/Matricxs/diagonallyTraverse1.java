package Matricxs;

class traversal {

    public int[] findDiagonalOrder(int[][] mat) {

        int rowSize = mat.length;
        int colSize = mat[0].length;

        int[] result = new int[rowSize * colSize];

        int row = 0, col = 0;

        for (int index = 0; index < rowSize * colSize; index++) {

            result[index] = mat[row][col];

            if ((row + col) % 2 == 0) {

                // The direction is always up when the sum of row & col is even

                if (col == colSize - 1) {

                    row++;

                } else if (row == 0) {

                    col++;

                } else {

                    row--;
                    col++;

                }

            } else {

                if (row == rowSize - 1) {

                    col++;

                } else if (col == 0) {

                    row++;

                } else {

                    row++;
                    col--;

                }
            }
        }

        return result;

    }

}

public class diagonallyTraverse1 {
    public static void main(String[] args) {

    }
}
