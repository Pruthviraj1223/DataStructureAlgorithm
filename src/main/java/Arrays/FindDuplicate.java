package Arrays;

class Solution4 {
    public int findDuplicate(int[] nums) {

        // 1 3 4 2 2

        // 3 1 4 2 2

        // 2 1 4 3 2

        // 4 1 2 3 2

        // 2 1 2 3 4

//        public int findDuplicate(int[] nums) {
//            while (nums[0] != nums[nums[0]]) {
//                int nxt = nums[nums[0]];
//                nums[nums[0]] = nums[0];
//                nums[0] = nxt;
//            }
//            return nums[0];
//        }


        if (nums == null || nums.length == 1) {

            return nums[0];

        }

        int duplicate = -1;

        for (int index = 0; index < nums.length; index++) {

            int idx = Math.abs(nums[index]) - 1;

            if (nums[idx] < 0) {

                duplicate = Math.abs(nums[index]);


            }

            nums[idx] = -nums[idx];

        }

        return duplicate;


    }
}

public class FindDuplicate {
}
