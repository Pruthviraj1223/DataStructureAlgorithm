package matricxs;

import java.util.Arrays;
import java.util.List;

class Solution1143 {
    public List shiftGrid(int[][] grid, int k) {


        int rowSize = grid.length;
        int colSize = grid[0].length;


        int [][]result = new int[rowSize][colSize];

        for(int row=0;row<rowSize;row++){

            for(int col=0;col<colSize;col++){


                int newCol = (col+k) % colSize;

                int newRow = (row + (col+k)/colSize ) % rowSize;


                result[newRow][newCol] = grid[row][col];



            }

        }


        return (List)Arrays.asList(result);


    }
}

public class shift2DGrid {
    public static void main(String[] args) {

    }
}
