package Arrays;

public class sortNegativePositiveInArray {

    static int[] sort(int[] nums) {

        int i = 0, j = 0;

        while (j < nums.length) {

            if (nums[j] >= 0) {

                j++;                    // if positive then go ahead

            } else {

                // if negative then traverse back , by shifting one element to the right
                // and take negative element to the left

                for (int index = j; index > i; index--) {

                    int temp = nums[index];
                    nums[index] = nums[index - 1];
                    nums[index - 1] = temp;

                }

                i++;
                j++;

            }
        }

        return nums;

        // o(n*window)
    }

    public static void main(String[] args) {

        int[] arr = {5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};

        sort(arr);

        // https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/

    }
}
