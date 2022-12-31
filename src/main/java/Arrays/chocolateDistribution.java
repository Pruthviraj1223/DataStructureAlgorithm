package Arrays;

import java.util.Arrays;

public class chocolateDistribution {

    static int findMinDiff(int[] nums, int students) {

        int n = nums.length;

        if (students == 0 || n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        if (n < students) {
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;

        int j;

        // in the question it is given that diff between maximum and minimum chocolate should be minimum

        // nums[j] (maximum) - nums[index] (minimum)

        for (int index = 0; index + students - 1 < n; index++) {

            j = index + students - 1;

            int diff = nums[j] - nums[index];

            minDiff = Math.min(diff, minDiff);

        }

        return minDiff;

    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/chocolate-distribution-problem/

    }
}
