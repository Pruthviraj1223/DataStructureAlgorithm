package Arrays.SlidingWindow;

class SubarrayGraterValue {
    public int minSubArrayLen(int x, int[] arr) {

        // GFG and  Leetcode
        // Leetcode solution is more optimized

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;

        int curr_sum = 0, min_len = Integer.MAX_VALUE;

        int i = 0, j = 0;

        while (j < n) {

            curr_sum += arr[j++];

            while (curr_sum >= x) {

                min_len = Math.min(min_len, j - i);

                // remove starting elements
                curr_sum -= arr[i++];
            }
        }

        return (min_len != Integer.MAX_VALUE) ? min_len : 0;

    }
}

public class minimumSizeSubArraySum {
    public static void main(String[] args) {

//        https://leetcode.com/problems/minimum-size-subarray-sum/
    }
}