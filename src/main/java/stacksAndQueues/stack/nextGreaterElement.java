package stacksAndQueues.stack;

import java.util.*;
import java.util.Stack;

class next{

    public void nextGreaterElementRightSide(int []nums){

        // 1 3 2 4
        // 4 5 2 25

        Stack<Integer> stack = new Stack<>();

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        for (int index = n-1; index >= 0; index--) {

            int currentElement = nums[index];

            while (!stack.isEmpty() && stack.peek() < currentElement){

                stack.pop();

            }

            if(stack.isEmpty()){

                ans.add(-1);

            }else {

                ans.add(stack.peek());

            }

            stack.push(currentElement);

        }

        Collections.reverse(ans);

        int[] primitive = ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("ans " + ans);

    }

    public void nextGreaterElementLeftSide(int []nums){

        Stack<Integer> stack = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (int currentElement : nums) {

            while (!stack.isEmpty() && currentElement > stack.peek()) {

                stack.pop();

            }

            if (stack.isEmpty()) {

                result.add(-1);

            } else {

                result.add(stack.peek());

            }

            stack.push(currentElement);

        }


        System.out.println("Result : " + result);


    }

    public void nextSmallerElementRightSide(int []nums){

        // 1 3 2 4
        // 4 5 2 25

        Stack<Integer> stack = new Stack<>();

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        for (int index = n-1; index >= 0; index--) {

            int currentElement = nums[index];

            while (!stack.isEmpty() && stack.peek() >  currentElement){

                stack.pop();

            }
            if(stack.isEmpty()){

                ans.add(-1);

            }else {

                ans.add(stack.peek());

            }

            stack.push(currentElement);

        }

        Collections.reverse(ans);

        System.out.println("ans " + ans);

    }

    public void nextSmallerElementLeftSide(int []nums){

        Stack<Integer> stack = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (int currentElement : nums) {

            while (!stack.isEmpty() && stack.peek() >  currentElement) {

                stack.pop();

            }

            if (stack.isEmpty()) {

                result.add(-1);

            } else {

                result.add(stack.peek());

            }

            stack.push(currentElement);

        }


        System.out.println("Result : " + result);


    }



}

public class nextGreaterElement {
    public static void main(String[] args) {

        new next().nextGreaterElementRightSide(new int[]{3,2,5,13,7,6,12});

        new next().nextGreaterElementLeftSide(new int[]{3,2,5,13,7,6,12});

        new next().nextSmallerElementRightSide(new int[]{3,2,5,13,7,6,12});

        new next().nextSmallerElementLeftSide(new int[]{3,2,5,13,7,6,12});
    }
}
