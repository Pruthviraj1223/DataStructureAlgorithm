package Arrays;

public class jumpGame1 {


    boolean canJump(int[] nums){

        int max = 0;

        for(int i=0;i<nums.length;i++){

            if(i>max){

                return false;

            }

            max = Math.max(i+nums[i],max);

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

//        new jumpGame1().canJump();


    }

}
