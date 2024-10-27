package matricxs;

class setMatrixZero {

    public void setZeroes1(int[][] matrix) {

        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int []row = new int[rowSize];
        int []col = new int[colSize];

        for(int index=0;index<rowSize;index++){

            row[index]=1;

        }

        for(int index=0;index<colSize;index++){

            col[index]=1;

        }

        for(int index=0;index<rowSize;index++){

            for(int j=0;j<colSize;j++){

                if(matrix[index][j]==0){

                    row[index] = 0;
                    col[j] = 0;

                }

            }

        }

        for(int index=0;index<rowSize;index++){

            for(int j=0;j<colSize;j++){

                if(row[index]==0 || col[j]==0){

                    matrix[index][j] = 0;

                }

            }
        }

    }

    public void setZeroes2SpaceOptimized(int[][] matrix) {

        // you can watch 2nd approach from take u forward and also Leetcode solution


        int rowSize = matrix.length;
        int colSize = matrix[0].length;


        boolean isCol=false;


        for(int index=0;index<rowSize;index++){



            if(matrix[index][0]==0){

                isCol=true;

            }


            for(int j=1;j<colSize;j++){


                if(matrix[index][j]==0){

                    matrix[index][0] =0;
                    matrix[0][j] = 0;

                }

            }


        }


        for(int row=1;row<rowSize;row++){


            for(int col=1;col<colSize;col++){

                if(matrix[row][0]==0 || matrix[0][col]==0){


                    matrix[row][col]=0;

                }

            }

        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {

            for (int j = 0; j < colSize; j++) {

                matrix[0][j] = 0;

            }
        }

        if (isCol) {

            for (int i = 0; i < rowSize; i++) {

                matrix[i][0] = 0;

            }

        }



    }
}


public class setMatrixZeros {
    public static void main(String[] args) {

    }
}
