package matricxs;

import java.util.ArrayList;
import java.util.List;

class traverse {

    // 1,2,3,4
    // 5,6,7,8
    // 9,10,11,12
    // 13,14,15,16

    public void diagonally(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int col;
        int row;

        int n = 4;

        for (int index = 0; index < n; index++) {

            row = index;
            col = 0;


            while (row >= 0 && row < n && col < n) {

                list.add(matrix[row][col]);
                row--;
                col++;

            }
        }


        for (int index = 1; index < n; index++) {

            row = n - 1;
            col = index;


            while (col >= 0 && row < n && col < n) {

                list.add(matrix[row][col]);
                row--;
                col++;

            }
        }

        System.out.println(list);


    }


}

public class antiDiagnoallyTraverse {
    public static void main(String[] args) {

        int[][] mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        new traverse().diagonally(mat);


    }
}
