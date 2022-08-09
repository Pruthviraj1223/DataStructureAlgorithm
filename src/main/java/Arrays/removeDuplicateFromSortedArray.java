package Arrays;

public class removeDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {


        int index = 0;

        for (int num : nums) {


            if (index == 0 || num > nums[index - 1]) {

                nums[index++] = num;


            }

        }

        return index;


    }
}
