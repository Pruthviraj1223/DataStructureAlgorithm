package Matricxs;

public class rotateMatrix90DegreeAntiClockWise {
    public static void main(String[] args) {

        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        System.out.println("after");


        new M1().reverse(matrix);

        matrix = new M2().transpose(matrix);

        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }

    }
}
