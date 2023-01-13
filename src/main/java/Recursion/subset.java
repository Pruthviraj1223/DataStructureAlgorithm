package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

    public static void subset(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currIndex) {

        // here we are increasing index every time as we want subset so.
        // we will backtrack once loop is completed. No base condition used here.

        result.add(new ArrayList<>(partialResult));

        for (int index = currIndex; index < candidates.length; index++) {

            partialResult.add(candidates[index]);

            subset(candidates, result, partialResult, index + 1);

            partialResult.remove(partialResult.size() - 1);                     // for backtracking

        }
    }

    public static List<List<Integer>> subsetSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        subset(candidates, result, new ArrayList<>(), 0);

        return result;

    }

    public static void main(String[] args) {

        subsetSum(new int[]{1, 2, 3,4}, 6);

    }
}
