package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset2 {

    public static void susbset(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currSum, int currIndex, int target) {

        if (currSum > target) {
            return;
        }

        result.add(new ArrayList<>(partialResult));

        // we can do target - candidates[index] and then check for target == 0
        // we don't need currSum

        for (int index = currIndex; index < candidates.length; index++) {

            if (index != currIndex && candidates[index] == candidates[index-1]){
                continue;
            }

            partialResult.add(candidates[index]);

//            System.out.println("step 1 "+ partialResult + " index " + index);

            susbset(candidates, result, partialResult, currSum, index + 1, target);

            partialResult.remove(partialResult.size() - 1);

//            System.out.println("step 2 "+ partialResult + " index " + index);

        }
    }


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        susbset(nums, result, new ArrayList<>(), 0, 0, 0);

        System.out.println(result);

        return result;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/subsets/

    }
}
