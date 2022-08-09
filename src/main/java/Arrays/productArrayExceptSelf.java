package Arrays;


class pruthvi {
    void prod(int[] nums) {

        // MUST understand two approaches
        // tech dose

        int[] left = new int[nums.length];

        int[] right = new int[nums.length];

        int n = nums.length;

        left[0] = nums[0];

        right[n - 1] = nums[n - 1];

        for (int index = 1; index <= nums.length - 1; index++) {

            left[index] = nums[index] * left[index - 1];


        }

        for (int index = n - 2; index >= 0; index--) {

            right[index] = nums[index] * right[index + 1];

        }

        int[] ans = new int[left.length];

        for (int index = 1; index < left.length - 1; index++) {

            ans[index] = left[index - 1] * right[index + 1];

        }

        ans[0] = right[1];

        ans[left.length - 1] = left[left.length - 2];

        // Above solution works well

        // below solution is optimized


        int[] left1 = new int[nums.length];

        int n1 = nums.length;

        left[0] = nums[0];

        for (int index = 1; index <= nums.length - 1; index++) {

            left[index] = nums[index] * left[index - 1];

        }

        int prod = 1; // instead of right array use prod variable

        for (int index = n - 1; index > 0; index--) {

            left[index] = left[index - 1] * prod;

            prod = prod * nums[index];

        }

        left[0] = prod;

    }
}

public class productArrayExceptSelf {

    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4};

        new pruthvi().prod(n);
    }
}
