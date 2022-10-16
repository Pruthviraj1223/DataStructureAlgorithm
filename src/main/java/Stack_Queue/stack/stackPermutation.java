package Stack_Queue.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class permutation{

    public boolean checkPermutation(int []ip,int []op){
        Queue<Integer> input = new LinkedList<>();

        for (int i : ip) {
            input.add(i);
        }

        Queue<Integer> output = new LinkedList<>();

        for (int i : op) {
            output.add(i);
        }

        Stack<Integer> stack = new Stack<>();

        while (!input.isEmpty()){

            int ele = input.poll();

            if(ele==output.peek()){

                output.poll();

                while (!stack.isEmpty()){

                    if(stack.peek()==output.peek()){

                        stack.pop();
                        output.poll();

                    }else {
                        break;
                    }


                }



            }else {

                stack.push(ele);

            }


        }

        return input.isEmpty() && stack.isEmpty();

    }

    public boolean checkPermutationOptimized(int []pushed, int []popped){

        Stack<Integer> stack = new Stack<>();

        int j=0;

        for (int num : pushed) {

            stack.push(num);

            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {

                stack.pop();

                j++;

            }

        }

        return j==popped.length;

    }

}

public class stackPermutation {
    public static void main(String[] args) {

        // Input Array
        int[] input = { 4, 5, 6, 7, 8 };

        // Output Array
        int[] output = { 8, 7, 6, 5, 4 };

        System.out.println(new permutation().checkPermutationOptimized(input,output));

    }
}
