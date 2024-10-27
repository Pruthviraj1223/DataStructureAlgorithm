package arrays;

import java.util.HashSet;
import java.util.Set;

class LongestSequence {

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        Set<Integer> values = new HashSet<>();

        for (Integer num : nums) {

            values.add(num);

        }

        // [100,4,200,2,3,1]

        int longestSequence = 0;

        for (int num : nums) {

            if (!values.contains(num - 1)) {     // efficient condition // we will not start from middle // we will start from actual starting point of sequence

                int currentNum = num;

                int currentSeq = 1;

                while (values.contains(currentNum + 1)) {

                    currentNum += 1;

                    currentSeq += 1;

                }

                longestSequence = Math.max(longestSequence, currentSeq);

            }
        }

        return longestSequence;

    }
}


public class longestConsecutiveSubSequence {

    public static void main(String[] args) {

        //https://leetcode.com/problems/longest-consecutive-sequence/
    }
}
