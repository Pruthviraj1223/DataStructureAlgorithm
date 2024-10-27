package arrays;

public class jumpGame1 {
    boolean canJump(int[] nums) {

        int max = 0;

        for (int index = 0; index < nums.length; index++) {

            if (index > max) {      // it means we have reached to that position by walking , not by jumping.

                return false;

            }

            max = Math.max(index + nums[index], max);

        }

        return true;

        // 2 approach . Good solution

//
//        int dis = 0;
//
//        for (int i = 0; i <= dis; i++) {
//
//            dis = Math.max(dis, i + nums[i]);
//
//            if (dis >= nums.length-1) {
//
//                return true;
//
//            }
//
//        }
//
//        return false;

    }


    public static void main(String[] args) {


        // https://leetcode.com/problems/jump-game/description/


    }

}
