package Arrays;

public class kadaneAlog {
    public int maxSubArray(int[] nums) {

        int totalSum = nums[0];

        int curSum = nums[0];

        for(int i=1;i<nums.length;i++){

            curSum = Math.max(nums[i],curSum+nums[i]);

            totalSum = Math.max(totalSum,curSum);

        }

        return totalSum;

    }
}
