package stackAndQueue.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Histogram{
    public List<Integer> nextSmallerElementRightSide(int []nums){

        // 1 3 2 4
        // 4 5 2 25

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        for (int index = n-1; index >= 0; index--) {

            int currentElement = nums[index];

            while (!stack.isEmpty() && nums[stack.peek()] >= currentElement){   // >= is must

                stack.pop();

            }
            if(stack.isEmpty()){

                ans.add(n);  //understand the reason
//
            }else {

                ans.add(stack.peek());

            }

            stack.push(index);

        }

        Collections.reverse(ans);

        System.out.println("ans " + ans);

        return ans;

    }

    public List<Integer> nextSmallerElementLeftSide(int []nums) {

        java.util.Stack<Integer> stack = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            var currentElement = nums[index];

            while (!stack.isEmpty() && nums[stack.peek()] >= currentElement) {  // >= is must

                stack.pop();

            }

            if (stack.isEmpty()) {

                result.add(-1); // understand the reason

            } else {

                result.add(stack.peek());

            }

            stack.push(index);

        }


        System.out.println("Result : " + result);

        return result;


    }
}

public class maximumAreaHistogram {
    public static void main(String[] args) {

//        var height = new int[]{15, 2, 5, 4, 5, 1, 6};

        var height = new int[]{1,1};

        var right = new Histogram().nextSmallerElementRightSide(height);

        var left = new Histogram().nextSmallerElementLeftSide(height);

        int maxArea = -1;

        System.out.println("left " + left);
        System.out.println("right " + right);

        for (int index = 0; index < height.length; index++) {

            int width  = right.get(index) - left.get(index) - 1;

            maxArea = Math.max(maxArea,height[index] * width);

        }

        System.out.println("maxArea : " + maxArea);
    }
}
