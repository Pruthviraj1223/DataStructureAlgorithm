package Stack_Queue.stack;

import java.util.Stack;

class celebrity{

    public int findCeleb2PointerApproach(int [][]grid){

        int n = grid.length;

        int row = n-1;
        int col =0;

        while (col < row){      // why this condition // To reduce search space e

            if(grid[row][col]==1){

                row--;

            }else {

                col++;

            }

        }

        var candidate = col;


        for (int index = 0; index < n; index++) {

            if(index!=candidate){

                if(grid[index][candidate]== 0 || grid[candidate][index]==1){

                    return -1;

                }

            }

        }

        return candidate;
    }

    public int findCelebStackApproach(int [][]grid){

        int length = grid.length;

        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < length; index++) {

            stack.push(index);

        }

        while (stack.size() > 1){

            int num1 = stack.pop();
            int num2 = stack.pop();

            if(grid[num1][num2]==1){
                stack.push(num2);

            }else {

                stack.push(num1);

            }

        }

        int candidate = stack.pop();

        for (int index = 0; index < length; index++) {

            if(index!=candidate){

                if(grid[index][candidate]==0 || grid[candidate][index]==1){

                    return -1;

                }

            }
        }


        return candidate;
    }



}


public class celebrityProblem {
    public static void main(String[] args) {

        int MATRIX[][] = { { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };

        int ans = new celebrity().findCelebStackApproach(MATRIX);

        System.out.println("ans " + ans);

    }
}
