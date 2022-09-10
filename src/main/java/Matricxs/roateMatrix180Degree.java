package Matricxs;

public class roateMatrix180Degree {
    public static void main(String[] args) {

        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        new M2().easyTranspose(matrix);

        new M1().reverse(matrix);

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
