package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

    public static void subset(int[] nums, List<List<Integer>> result, List<Integer> partialResult, int currIndex) {

        // here we are increasing index every time as we want subset so.
        // we will backtrack once loop is completed. No base condition used here.

        result.add(new ArrayList<>(partialResult));

        for (int index = currIndex; index < nums.length; index++) {

            partialResult.add(nums[index]);

            subset(nums, result, partialResult, index + 1);

            partialResult.remove(partialResult.size() - 1);                     // for backtracking

        }
    }

    public static List<List<Integer>> subsetSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        subset(nums, result, new ArrayList<>(), 0);

        return result;

    }

    public static void main(String[] args) {

        subsetSum(new int[]{1, 2, 3,4});

    }
}
