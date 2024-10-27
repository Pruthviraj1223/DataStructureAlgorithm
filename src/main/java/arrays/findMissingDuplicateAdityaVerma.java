package arrays;

// try out in leetcode first

class missingAndDuplicate {

    public void duplicate(int[] nums) {

        int index = 0;

        while (index < nums.length) {

            if (nums[index] != nums[nums[index] - 1]) {

                int temp = nums[nums[index] - 1];

                nums[nums[index] - 1] = nums[index];

                nums[index] = temp;

            } else {

                index++;

            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {

                System.out.println(nums[i]);

                // i + 1 will be missing element
                // nums[i] will be duplicate element

                // return nums[i]

            }

        }
    }

}


public class findMissingDuplicateAdityaVerma {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 1, 3, 4, 2};

        new missingAndDuplicate().duplicate(nums);
    }
}
