package matricxs;

class reshape {
    public int[][] matrixReshape(int[][] mat, int newRow, int newCol) {


        int [][]result = new int[newRow][newCol];

        int oldCol = mat[0].length;
        int oldRow = mat.length;


        if(newRow * newCol != oldRow*oldCol){

            return mat;

        }

        for(int index=0;index<newRow*newCol;index++){



            result[index/newCol][index%newCol] = mat[index/oldCol][index%oldCol];


        }


        return result;


    }
}

public class reshapeMatrix {
    public static void main(String[] args) {

    }
}
