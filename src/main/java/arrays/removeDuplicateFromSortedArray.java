package arrays;

public class removeDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {

//        https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]

        int index = 0;

        for (int num : nums) {

            if (index == 0 || num > nums[index - 1]) {

                nums[index++] = num;

            }
        }

        return index;

    }
}
