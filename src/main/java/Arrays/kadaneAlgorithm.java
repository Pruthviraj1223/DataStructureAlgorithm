package Arrays;

public class kadaneAlgorithm {
    public int maxSubArray(int[] nums) {

        int totalSum = nums[0];

        int curSum = nums[0];

        for (int index = 1; index < nums.length; index++) {

            curSum = Math.max(nums[index], curSum + nums[index]);

            totalSum = Math.max(totalSum, curSum);

        }

        return totalSum;

    }
}
