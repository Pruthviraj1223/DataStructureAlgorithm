package Stack_Queue.stack;

import java.util.Stack;

class pattern {

    public boolean findPattern(int[] nums) {


        int two = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();

        // 5 1 3 2

        for (int index = nums.length - 1; index >= 0; index--) {

            var currentElement = nums[index];

            if (currentElement < two) {

                // it will be 'one'

                return true;

            } else {

                while (!stack.isEmpty() && currentElement > stack.peek()) {        // 'three' > 'two'

                    two = stack.pop();

                }

                stack.push(currentElement);

            }

        }

        return false;

    }


}

public class pattern132 {
    public static void main(String[] args) {

        new pattern().findPattern(new int[]{3,1,4,2});

    }
}
