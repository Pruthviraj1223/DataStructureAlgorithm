package stacksAndQueues.stack;

import java.util.Stack;

class pattern {

    public boolean findPattern(int[] nums) {


        int two = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();

        for (int index = nums.length - 1; index >= 0; index--) {

            if (nums[index] < two) {

                // it will be 'one'

                return true;

            } else {
                while (!stack.isEmpty() && nums[index] > stack.peek()) {        // 'three' > 'two'

                    two = stack.pop();

                }

                stack.push(nums[index]);

            }

        }

        return false;

    }


}

public class pattern132 {
    public static void main(String[] args) {

    }
}
