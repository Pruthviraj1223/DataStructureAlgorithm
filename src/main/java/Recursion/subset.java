package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

    public static void subset(int[] candidates, List<List<Integer>> result, List<Integer> partialResult, int currSum, int currIndex, int target) {

        if (currSum > target) {
            return;
        }

        result.add(new ArrayList<>(partialResult));

        for (int index = currIndex; index < candidates.length; index++) {

            partialResult.add(candidates[index]);

//            System.out.println("step 1 "+ partialResult + " index " + index);

            subset(candidates, result, partialResult, currSum, index + 1, target);

            partialResult.remove(partialResult.size() - 1);

//            System.out.println("step 2 "+ partialResult + " index " + index);

        }
    }

    public static List<List<Integer>> subsetSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        subset(candidates, result, new ArrayList<>(), 0, 0, target);

        System.out.println(result);

        return result;

    }

    public static void main(String[] args) {

        subsetSum(new int[]{1, 2, 3, 4}, 6);

    }
}
