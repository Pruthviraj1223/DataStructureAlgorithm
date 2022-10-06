package stacksAndQueues.stack;

import java.util.Stack;

class celebrity{

    public int findCeleb2PointerApproach(int [][]grid){

        int n = grid.length;

        int i = n-1;
        int j=0;

        while (j < i){      // why this condition // To reduce search space

            if(grid[i][j]==1){

                i--;

            }else {

                j++;

            }

        }

        var candidate = j;


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
