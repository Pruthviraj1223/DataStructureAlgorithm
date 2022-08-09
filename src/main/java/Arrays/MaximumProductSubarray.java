package Arrays;

class Solution2 {
    public int maxProduct(int[] nums) {

        if (nums == null || nums.length == 1) {

            return nums[0];

        }

        int max = nums[0];
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;


        for (int index = 0; index < nums.length; index++) {


            leftSum = (leftSum == 0 ? 1 : leftSum) * nums[index];

            rightSum = (rightSum == 0 ? 1 : rightSum) * nums[n - 1 - index];

            max = Math.max(max, Math.max(leftSum, rightSum));


        }

        return max;


    }
}

public class MaximumProductSubarray {


}
