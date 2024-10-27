package stackAndQueue.stack;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Solution {


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

        return result;

    }

    public int MAH(int []height){

        var right = nextSmallerElementRightSide(height);

        var left = nextSmallerElementLeftSide(height);

        int maxArea = -1;

        for (int index = 0; index < height.length; index++) {

            int width  = right.get(index) - left.get(index) - 1;

            maxArea = Math.max(maxArea,height[index] * width);

        }

        return maxArea;

    }

    public void maximalRectangle(char[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        for(int index=0;index<colLength;index++){

            ans.add(matrix[0][index] - '0');

        }

        int[] primitive = ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        int maxArea = MAH(primitive);

        for(int row=1;row<rowLength;row++){

            for(int col=0;col<colLength;col++){

                if(matrix[row][col] == '0'){

                    ans.set(col,0);

                }else{

                    ans.set(col,ans.get(col) + 1);

                }
            }

            int[] temp = ans.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            maxArea = Math.max(maxArea,MAH(temp));

        }

    }
}
public class maximumRectangleAreaInBinaryMatrix {
    public static void main(String[] args) {

//        new Solution().maximalRectangle(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}});

        new Solution().maximalRectangle(new char[][]{{'0'}});
    }
}
