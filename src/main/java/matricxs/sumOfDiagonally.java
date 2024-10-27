package matricxs;

class sumDiagonally {

    public void sum1(int [][]matrix){

//        { 1, 2, 3, 4 },
//        { 5, 6, 7, 8 },
//        { 9, 10, 11, 12 },
//        { 13, 14, 15, 16 }

        int principalDiagonalSum = 0, secondaryDiagonalSum = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {


                if (row == col){

                    principalDiagonalSum += matrix[row][col];

                }

                if ((row + col) == (matrix.length - 1)){

                    secondaryDiagonalSum += matrix[row][col];

                }
            }
        }

        System.out.println(principalDiagonalSum + " " + secondaryDiagonalSum);


    }

    public void sum2(int [][]matrix){

        // optimized

//        { 1, 2, 3, 4 },
//        { 5, 6, 7, 8 },
//        { 9, 10, 11, 12 },
//        { 13, 14, 15, 16 }

        int principalDiagonalSum = 0, secondaryDiagonalSum = 0;

        for(int i=0; i<matrix.length; i++)
        {

            principalDiagonalSum += matrix[i][i];

            secondaryDiagonalSum += matrix[i][matrix.length-(i+1)];
        }

        System.out.println(principalDiagonalSum + " " + secondaryDiagonalSum);

    }
}

public class sumOfDiagonally {
    public static void main(String[] args) {
        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        new sumDiagonally().sum2(matrix);

    }
}
