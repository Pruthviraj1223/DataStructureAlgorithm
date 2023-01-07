package Arrays;


class MinSwap {

    public void check(int[] nums, int k) {

        /// GFG

        /// 2 APPOROACHES

        // 1 st approach

        int count = 0;

        int n = nums.length;

        for (int num : nums) {

            if (num <= k) {
                ++count;

            }
        }

        int bad = 0;

        for (int index = 0; index < count; ++index) {

            if (nums[index] > k) {

                ++bad;
            }

        }

        int ans = bad;

        for (int i = 0, j = count; j < n; ++i, ++j) {

            if (nums[i] > k) {
                --bad;

            }

            if (nums[j] > k) {
                ++bad;
            }


            ans = Math.min(ans, bad);

        }

        System.out.println("ans 1 = " + ans);


        // 2nd approach is easy

        int window = 0;

        int count2 = 0;

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] > k) {

                window++;

            } else if (window > 0) {

                // swap

                int temp = nums[index];

                nums[index] = nums[index - window];

                nums[index - window] = temp;

                count2++;

            }

        }

        System.out.println("ans 2 = " + count2);
    }

}


public class MinimumSwapsRequiredBringElementsLessThanKTogether {

    public static void main(String[] args) {

        new MinSwap().check(new int[]{2, 1, 5, 6, 3}, 3);

        //https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/

    }
}
