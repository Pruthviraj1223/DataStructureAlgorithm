package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset2 {

    public static void subset(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currIndex) {

        result.add(new ArrayList<>(partialResult));

        // we can do target - candidates[index] and then check for target == 0
        // we don't need currSum

        for (int index = currIndex; index < candidates.length; index++) {

            if (index != currIndex && candidates[index] == candidates[index - 1]) {         // to avoid duplicates
                continue;
            }

            partialResult.add(candidates[index]);

            subset(candidates, result, partialResult, index + 1);

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
