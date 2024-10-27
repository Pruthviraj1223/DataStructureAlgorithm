package arrays;

class Product {
    public int maxProduct(int[] nums) {

        if (nums.length == 1) {

            return nums[0];

        }

        int max = nums[0];
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;

        //[2,-3,20,1,2,-4]

        for (int index = 0; index < nums.length; index++) {

            leftSum = (leftSum == 0 ? 1 : leftSum) * nums[index];

            rightSum = (rightSum == 0 ? 1 : rightSum) * nums[n - 1 - index];

            max = Math.max(max, Math.max(leftSum, rightSum));


        }

        return max;


    }
}

public class MaximumProductSubarray {

    public static void main(String[] args) {

        //https://leetcode.com/problems/maximum-product-subarray/

    }

}
