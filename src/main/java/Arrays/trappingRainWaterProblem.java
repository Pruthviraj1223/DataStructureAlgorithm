package Arrays;

class TrappingRainWater {

    public int trappingRainWater(int[] height) {

        if (height == null || height.length == 0 || height.length == 1) {

            return 0;

        }

        // similar to next greater element in stack
        // here we are using arrays for left max and right max , more efficient that stack solution

        int size = height.length;

        int[] leftMax = new int[size];

        int[] rightMax = new int[size];

        leftMax[0] = height[0];

        rightMax[size - 1] = height[size - 1];

        for (int index = 1; index < size; index++) {

            leftMax[index] = Math.max(leftMax[index - 1], height[index]);

        }

        for (int index = size - 2; index >= 0; index--) {

            rightMax[index] = Math.max(rightMax[index + 1], height[index]);

        }

        int ans = 0;

        for (int index = 1; index < size - 1; index++) {        // there is no way that water can trap on index 0 and last index.

            ans += Math.min(leftMax[index], rightMax[index]) - height[index];

        }

        return ans;

    }

    public static int trappingRainWaterTwoPointer(int[] nums) {

        int ans = 0;

        int size = nums.length;

        int leftMax = 0, rightMax = 0;

        int left = 0, right = size - 1;

        // instead of maintaining the array for left and right max for individual position
        // we are having just leftMax and rightMax variable. Which is more efficient than above solution.

        // why we are not taking minimum of leftMax and rightMax like above solution ????
        // simulation is important to understand.

        // because when nums[left] < nums[right] qualified it also indicates that leftMax is also less than or equal to nums[right]
        // so here leftMax - nums[left] we don't have to do minimum of leftMax and rightMax
        // there will be always leftMax less than or equal to nums[right]

        // same for right ( else part )

        while (left < right) {

            if (nums[left] < nums[right]) {                         // this condition is important. that nums[left] < nums[right]. not <=.

                if (nums[left] >= leftMax) {           // if there is new leftMax then there will be no water can be trapped on that place.

                    leftMax = nums[left];

                } else {

                    ans += (leftMax - nums[left]);

                }

                left++;

            } else {

                if (nums[right] >= rightMax) {

                    rightMax = nums[right];

                } else {

                    ans += (rightMax - nums[right]);
                }

                right--;

            }

        }

        return ans;
    }
}

public class trappingRainWaterProblem {

    public static void main(String[] args) {

        // there is also stack solution, next greater element
        // https://leetcode.com/problems/trapping-rain-water/

    }
}
