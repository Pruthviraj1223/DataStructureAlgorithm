package matricxs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sort2D {
    public int[][] diagonalSort(int[][] mat) {

        int rowSize = mat.length;

        int colSize = mat[0].length;


        for(int index=0;index<colSize;index++){

            sort(mat,0,index,rowSize,colSize);

        }

        for(int index=1;index<rowSize;index++){

            sort(mat,index,0,rowSize,colSize);

        }

        return mat;

    }

    public void sort(int [][]mat,int row,int col,int rowSize,int colSize){

        List<Integer> values = new ArrayList();

        int r=row;
        int c=col;

        while(r<rowSize && c<colSize){

            values.add(mat[r][c]);

            r++;
            c++;

        }

        r = row;
        c = col;

        Collections.sort(values);

        int index=0;

        while(r < rowSize && c < colSize){

            mat[r][c] = values.get(index++);

            r++;
            c++;

        }


    }

}

public class sort2DVector {
    public static void main(String[] args) {

    }
}
