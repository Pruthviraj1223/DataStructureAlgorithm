package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        // the same way you can reverse string as well

        int[] nums = new int[]{1, 4, 2, 8, 9};

        int start = 0;

        int end = nums.length - 1;

        while (start < end) {

            int temp = nums[start];

            nums[start] = nums[end];

            nums[end] = temp;

            start++;

            end--;

        }

    }
}
