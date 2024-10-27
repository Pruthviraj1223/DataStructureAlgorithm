package arrays;

class nextPermutation {

    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];

        nums[i] = nums[j];

        nums[j] = temp;

    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            swap(nums, start, end);

            start++;

            end--;

        }
    }

    public static void nextPermutations(int[] nums) {

        if (nums == null || nums.length <= 1) {
            return;
        }

        // 1 2 3 4 6 5
        // 1 2 3 5 4 6
        // 1 2 3 5 6 4
        // 1 2 3 6 4 5
        // 1 2 3 6 5 4
        // reverse - 1 2 4 6 5 3
        // 1 2 4 3 5 6

        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {

            i--;

        }

        int j = nums.length - 1;

        if (i >= 0) {

            while (j >= 0 && nums[j] <= nums[i]) {

                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
    }

    public static void main(String[] args) {

    }
}
