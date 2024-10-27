package arrays;

import java.util.HashMap;

class summation {

    int subarraySum(int[] nums, int k) {

        // GFG - sub array sum equal to zero

        if (nums.length < 1) {

            return 0;

        }

        int sum = 0, count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {

            sum += num;

            int find = sum - k;

            if (map.containsKey(find)) {

                count += map.get(find);

            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;

    }
}


public class subarraySumEqualsToK {

    public static void main(String[] args) {

        // Input : arr[] = {10, 2, -2, -20, 10}, k = -10

        new summation().subarraySum(new int[] {1, 2, 3, 4, 5},7);

    }

}
