package arrays;

class NumArray {

    int[] nums;

    public NumArray(int[] nums) {

        for (int index = 1; index < nums.length; index++) {

            nums[index] += nums[index - 1];

        }

        this.nums = nums;

    }

    public int sumRange(int left, int right) {

        if (left == 0) {

            return nums[right];

        }

        return nums[right] - nums[left - 1];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

public class rangeSumQuery1 {
    public static void main(String[] args) {

    }
}

