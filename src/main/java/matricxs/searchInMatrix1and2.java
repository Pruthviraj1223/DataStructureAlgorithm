package matricxs;

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowSize = matrix.length;

        int colSize = matrix[0].length;

        int i=0;

        int j = colSize-1;

        while(i < rowSize && j >=0){

            if(matrix[i][j] == target){

                return true;

            }else if (matrix[i][j] > target){

                j--;

            }else {


                i++;

            }

        }

        return false;

    }
}

public class searchInMatrix1and2 {
    public static void main(String[] args) {


    }
}
