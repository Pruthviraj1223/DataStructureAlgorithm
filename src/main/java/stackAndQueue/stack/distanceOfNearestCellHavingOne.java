package stackAndQueue.stack;

import java.util.LinkedList;
import java.util.Queue;

class distance{

    static class matrix_element {
        int row;
        int col;
        matrix_element(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }

    public int [][] findDistance(int [][]mat){

        int rowLength = mat.length;
        int colLength =  mat[0].length;

        int [][]ans = new int[rowLength][colLength];

        for (int row = 0; row < rowLength; row++)

            for (int col = 0; col < colLength; col++) {

                ans[row][col] = Integer.MAX_VALUE;

            }

        for (int row = 0; row < rowLength; row++)

            for (int col = 0; col < colLength; col++) {

                for (int extraRow = 0; extraRow < rowLength; extraRow++)

                    for (int extraCol = 0; extraCol < colLength; extraCol++) {

                        if (mat[extraRow][extraCol] == 1)

                            ans[row][col] = Math.min(ans[row][col], Math.abs(row - extraRow) + Math.abs(col - extraCol));

                    }
            }

        return ans;

    }

    public int [][] findDistance2(int [][]arr){

        int Row_Count = arr.length;

        int Col_Count = arr[0].length;

        Queue<matrix_element> q
                = new LinkedList<>();

        for (int i = 0; i < Row_Count; i++) {

            for (int j = 0; j < Col_Count; j++) {

                if (arr[i][j] == 1) {       // nearest one

                    q.add(new matrix_element(i, j));
                }

            }
        }


        int Queue_Size = q.size();

        for (int row = 0; row < Row_Count; row++) {

            for (int col = 0; col < Col_Count; col++) {

                int distance;

                int min_distance = Integer.MAX_VALUE;

                if (arr[row][col] == 0) {       // nearest one

                    for (int k = 0; k < Queue_Size; k++) {

                        matrix_element One_Pos = q.poll();

                        int One_Row = One_Pos.row;

                        int One_Col = One_Pos.col;

                        distance = Math.abs(One_Row - row)
                                + Math.abs(One_Col - col);

                        min_distance = Math.min(
                                min_distance, distance);

                        if (min_distance == 1) {

                            arr[row][col] = 1;

                            q.add(new matrix_element(
                                    One_Row, One_Col));

                            break;
                        }

                        q.add(new matrix_element(One_Row,
                                One_Col));
                    }

                    arr[row][col] = min_distance;

                }

                else {

                    arr[row][col] = 0;

                }
            }
        }
        return arr;
    }

}

public class distanceOfNearestCellHavingOne {
    public static void main(String[] args) {

        // 2 approaches from GFG

        // optimized will be BFS , Graph.





    }
}
