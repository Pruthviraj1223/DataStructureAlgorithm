package matricxs;

import java.util.*;

class Common{

    public Integer[] commonElement(int [][]matrix){

        int totalNoOfRows = matrix.length;
        int totalNoOfCols = matrix[0].length;

        Set<Integer> answer = new HashSet<>();

        HashMap<Integer,Integer> counts = new HashMap<>();

        for (int col = 0; col < totalNoOfCols; col++) {

            counts.put(matrix[0][col],0);

        }

        for (int row = 1; row < totalNoOfRows; row++) {

            for (int col = 0; col < totalNoOfCols; col++) {

                if(counts.get(matrix[row][col]) !=null){

                    if(counts.get(matrix[row][col]) == row-1){

                        answer.add(matrix[row][col]);

                        counts.put(matrix[row][col],row);

                    }

                }

            }

        }


        return answer.toArray(new Integer[0]);

    }

}

public class commonElementsInAllRowsOfMatrix {
    public static void main(String[] args) {
        int mat[][] =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9},
                };

       Integer[] arr=  new Common().commonElement(mat);

        System.out.println(arr);
    }
}
