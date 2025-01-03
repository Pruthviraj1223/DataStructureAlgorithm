package arrays;

class Rotate {

    static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];

            nums[start] = nums[end];

            nums[end] = temp;

            start++;
            end--;

        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % nums.length;                    // must condition

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
    }
}

public class rotateArray {
    public static void main(String[] args) {

        //https://leetcode.com/problems/rotate-array/

    }

}
