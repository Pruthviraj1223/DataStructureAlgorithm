package Recursion;

import java.util.*;

public class combinationSum2 {

    public static void combination(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currSum, int currIndex, int target) {

        if (currSum > target) {
            return;
        }

        if (currSum == target) {

            result.add(new ArrayList<>(partialResult));             // because of reference issue we have stored new ArrayList<>()
            return;

        }

        // we can do target - candidates[index] and then check for target == 0
        // we don't need currSum

        for (int index = currIndex; index < candidates.length; index++) {

            if (index > currIndex && candidates[index] == candidates[index-1]){
                continue;
            }

            partialResult.add(candidates[index]);

            currSum += candidates[index];

            combination(candidates, result, partialResult, currSum, index +  1, target);

            currSum -= candidates[index];

            partialResult.remove(partialResult.size() - 1);

        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        combination(candidates, result, new ArrayList<>(), 0, 0, target);

        return result;

    }

    public static void main(String[] args) {

        var ans = combinationSum(new int[]{10,1,2,7,6,1,5}, 8);

        // https://leetcode.com/problems/combination-sum-ii/solutions/16878/combination-sum-i-ii-and-iii-java-solution-see-the-similarities-yourself/

        // https://leetcode.com/problems/combination-sum-ii/solutions/1277764/combination-sum-i-ii-and-iii-subsets-i-and-ii-permutations-i-and-ii-one-stop-c-solutions/
    }
}
