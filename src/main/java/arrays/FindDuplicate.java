package arrays;

class Solution4 {
    public int findDuplicate(int[] nums) {

        if (nums == null || nums.length == 1) {

            return 0;

        }

        int duplicate = -1;

        for (int index = 0; index < nums.length; index++) {

            int idx = Math.abs(nums[index]) - 1;

            if (nums[idx] < 0) {

                duplicate = Math.abs(nums[index]);


            }

            nums[idx] = -nums[idx];

        }

        return duplicate;

    }
}

public class FindDuplicate {

    public static void main(String[] args) {
        //https://leetcode.com/problems/find-the-duplicate-number/submissions/873453283/
    }
}
