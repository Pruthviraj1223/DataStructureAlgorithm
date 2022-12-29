package Arrays;

public class jumpGame2 {

    static int jump(int[] nums) {

        int steps = 0;
        int upcomingIndex = 0;
        int max = 0;

        for (int index = 0; index < nums.length - 1; index++) {

            max = Math.max(nums[index] + index, max);

            if (index == upcomingIndex) {

                steps++;

                upcomingIndex = max;

            }

        }

        return steps;
    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/jump-game-ii/submissions/867584420/

        var result = jump(new int[]{1,2,3});

    }

}
