package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset2 {

    public static void subset(int[] nums, List<List<Integer>> result, List<Integer> partialResult, int currIndex) {

        result.add(new ArrayList<>(partialResult));

        // we can do target - nums[index] and then check for target == 0
        // we don't need currSum

        for (int index = currIndex; index < nums.length; index++) {

            if (index != currIndex && nums[index] == nums[index - 1]) {         // to avoid duplicates
                continue;
            }

            partialResult.add(nums[index]);

            subset(nums, result, partialResult, index + 1);

            partialResult.remove(partialResult.size() - 1);                         // for backtracking

        }
    }


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        subset(nums, result, new ArrayList<>(), 0);

        return result;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/subsets/

    }
}
