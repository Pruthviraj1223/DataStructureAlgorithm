package matricxs;

 class M1{

    public void reverse(int [][]matrix){


        int totalRows = matrix.length;

        for (int index = 0; index < totalRows; index++) {

            int low=0;
            int high = matrix[index].length-1;

            while (low < high){

                int temp = matrix[index][low];
                matrix[index][low] = matrix[index][high];
                matrix[index][high] = temp;

                low++;
                high--;

            }

        }

    }

}

public class reverseMatrix {
    public static void main(String[] args) {

        int [][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12,13,14}};

        new M1().reverse(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j <matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
