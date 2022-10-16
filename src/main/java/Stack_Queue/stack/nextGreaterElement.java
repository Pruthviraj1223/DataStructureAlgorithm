package Stack_Queue.stack;

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

            while (!stack.isEmpty() && currentElement >= stack.peek()){

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

            while (!stack.isEmpty() && currentElement >= stack.peek()) {

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

    public void stockSpan(int []nums){

        // Leetcode is bit diiferent
        // this is from aditya verma and GFG

        Stack<Integer> stack = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            int currentElement = nums[index];

            while (!stack.isEmpty() && currentElement > nums[stack.peek()]) {

                stack.pop();

            }

            if (stack.isEmpty()) {

                result.add(index+1);

            } else {

                result.add(index - stack.peek());

            }

            stack.push(index);

        }


        System.out.println("Result : " + result);


    }

    public int leetcodeStockSpan(int price) {

        Stack<int[]> stack = new Stack<>();   // it comes in global scope

        int span =1;

        while(!stack.isEmpty() && price >=stack.peek()[0]){

            span += stack.peek()[1];

            stack.pop();

        }


        stack.push(new int[]{price,span});

        return span;



    }

    public int[] dailyTemperatures(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        for(int index=n-1;index>=0;index--){

            var currentElement = nums[index];

            while(!stack.isEmpty() && currentElement >=nums[stack.peek()]){

                stack.pop();

            }

            if(stack.isEmpty()){

                ans.add(0);

            }else{

                ans.add(stack.peek() - index);

            }

            stack.push(index);

        }

        Collections.reverse(ans);

        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

}

public class nextGreaterElement {
    public static void main(String[] args) {

        // >= condition is must
        // <= condition is must
        // understand that scenario, you can look into maximumAreaHistogram

        new next().nextGreaterElementRightSide(new int[]{3,2,5,13,7,6,12});

        new next().nextGreaterElementLeftSide(new int[]{3,2,5,13,7,6,12});

        new next().nextSmallerElementRightSide(new int[]{3,2,5,13,7,6,12});

        new next().nextSmallerElementLeftSide(new int[]{3,2,5,13,7,6,12});

        new next().stockSpan(new int[]{ 10, 4, 5, 90, 120, 80 });

    }
}
