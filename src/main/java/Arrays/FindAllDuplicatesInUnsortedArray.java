package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList();

        if (nums.length <= 1){

            return result;

        }

        for(int index=0;index<nums.length;index++){

            int idx = Math.abs(nums[index]) - 1;

            if (nums[idx]<0){

                result.add(Math.abs(nums[index]));

            }

            nums[idx] = -nums[idx];

        }

        return result;


    }
}

public class FindAllDuplicatesInUnsortedArray {
}
