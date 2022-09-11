package Matricxs;

class spiral {
    public int[][] generateMatrix(int n) {

        int startRow = 0;
        int endRow = n;
        int startCol = 0;
        int endCol = n;
        int num=1;
        int [][]result = new int[n][n];


        while (startRow <endRow && startCol <endCol) {


            for (int index = startCol; index < endCol; index++) {

                result[startRow][index] = num++;

            }

            startRow++;

            for (int index = startRow; index < endRow; index++) {

                result[index][endCol-1] = num++;;

            }

            endCol--;

            if(startRow<endRow) {

                for (int index = endCol - 1; index >= startCol; index--) {

                    result[endRow - 1][index] = num++;

                }

                endRow--;
            }

            if(startCol<endCol) {

                for (int index = endRow - 1; index >= startRow; index--) {

                    result[index][startCol] = num++;

                }

                startCol++;

            }

        }

        return result;

    }
}

public class spiralMatricxs {
    public static void main(String[] args) {

    }
}
