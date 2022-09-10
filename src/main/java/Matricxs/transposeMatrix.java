package Matricxs;

class M2{

    public int[][] transpose(int [][]matrix){


        // 1 2 3
        // 4 5 6

        // 1 4
        // 2 5
        // 3 6

        int [][]n = new int[matrix[0].length][matrix.length];

        for(int col=0;col<matrix[0].length;col++){

            for(int row=0;row<matrix.length;row++){

                n[col][row] = matrix[row][col];


            }

        }

        return n;

    }

}


public class transposeMatrix {
    public static void main(String[] args) {

        new M2().transpose(new int[][]{{1,2,3},{4,5,6}});

    }
}
