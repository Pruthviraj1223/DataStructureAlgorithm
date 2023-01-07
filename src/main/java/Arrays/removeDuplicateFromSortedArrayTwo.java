package Arrays;

public class removeDuplicateFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {

//         to understand this , first understand previous question removeDuplicateFromSortedArray

//        https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//        Input: nums = [0,0,1,1,1,1,2,3,3]

        int index = 0;
        int k = 2; // k is for general

        for (int num : nums) {

            if (index < k || num > nums[index - k]) {

                nums[index++] = num;

            }
        }

        return index;

    }
}
