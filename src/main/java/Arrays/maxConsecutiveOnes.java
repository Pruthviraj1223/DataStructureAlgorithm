package Arrays;

public class maxConsecutiveOnes {
    public static void main(String[] args) {

        // take u forward

        int []nums = new int[]{1,1,0,1,1,1};

        int count=0;
        int maxOneCount=0;

        for (int index = 0; index < nums.length; index++) {


            if(nums[index]==1){

                count++;


            }else {

                count=0;
            }

            maxOneCount = Math.max(maxOneCount,count);


        }

        System.out.println("ans " + maxOneCount);


//        return maxOneCount;


    }
}
