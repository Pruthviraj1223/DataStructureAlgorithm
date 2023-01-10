package Recursion;

import java.util.*;

public class combinationSum {

    public static void combination(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currSum, int currIndex, int target) {

        if (currSum > target) {
            return;
        }

        if (currSum == target) {

            result.add(new ArrayList<>(partialResult));             // because of reference issue we have stored new ArrayList<>()
            return;

        }

        for (int index = currIndex; index < candidates.length; index++) {

            partialResult.add(candidates[index]);

            currSum += candidates[index];

            combination(candidates, result, partialResult, currSum, index, target);

            currSum -= candidates[index];

            partialResult.remove(partialResult.size() - 1);

        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        combination(candidates, result, new ArrayList<>(), 0, 0, target);

        return result;

    }

    public static void main(String[] args) {

        var ans = combinationSum(new int[]{2, 3, 6, 7}, 7);

        // https://leetcode.com/problems/combination-sum/solutions/1777569/full-explanation-with-state-space-tree-recursion-and-backtracking-well-explained-c/?orderBy=most_votes

        // https://leetcode.com/problems/combination-sum/solutions/16521/java-solution-using-recursive/

    }
}
