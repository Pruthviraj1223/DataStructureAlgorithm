package Matricxs;

public class rotateMatrix90DegreeClockWise {

    static void rotate(int [][]matrix){

//        { 1, 2, 3, 4 },
//        { 5, 6, 7, 8 },
//        { 9, 10, 11, 12 },
//        { 13, 14, 15, 16 }

        // 1st method

        int rowSize= matrix.length;
        int colSize = matrix[0].length;

        for (int col = 0; col < colSize; col++) {

            for (int row = rowSize-1; row >=0; row--) {

                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//

        // HIGHLY Pre-requiste - Transpose , Reverse of matrix


        //2nd method


        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        new M2().easyTranspose(matrix);

        new M1().reverse(matrix);

        System.out.println();
        System.out.println("after 90 ");
        System.out.println();


        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        new M2().easyTranspose(matrix);

        new M1().reverse(matrix);

        System.out.println();
        System.out.println("after 180");
        System.out.println();

        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }


    }
}
