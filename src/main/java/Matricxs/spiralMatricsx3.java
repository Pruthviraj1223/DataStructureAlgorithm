package Matricxs;

import java.util.ArrayList;
import java.util.List;

class spiral3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {


        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};


        int d = 0;
        int len = 0;
        int x = rStart, y = cStart;


        List<int[]> result = new ArrayList<>();

        result.add(new int[]{x, y});

        while (result.size() < rows * cols) {

            if (d == 0 || d == 2) {       // IMPORTANT DECISION
                len++;
            }


            for (int index = 0; index < len; index++) {


                x = x + direction[d][0];
                y = y + direction[d][1];

                if (x >= 0 && x < rows && y >= 0 && y < cols) {

                    result.add(new int[]{x, y});

                }

            }

            d = (d + 1) % 4;

        }

        return result.toArray(new int[rows * cols][2]);


    }
}

public class spiralMatricsx3 {
    public static void main(String[] args) {

    }
}
