package Arrays;

public class removeDuplicateFromSortedArrayTwo {

    public int removeDuplicates(int[] nums) {

        int i=0;
        int k = 2; // k is for general
        for(int num:nums){

            if(i < k || num > nums[i-k]){

                nums[i++] = num;

            }

        }

        return i;


    }
}
