package arrays;

class circular {
    public int maxSubarraySumCircular(int[] nums) {


        // techdose video's last 2 solution

        int maxSofar = nums[0];

        int maxSum = nums[0];


        int arrSum=nums[0];

        int minSofar = nums[0];

        int minSum = nums[0];



        for(int index=1;index<nums.length;index++){


            arrSum += nums[index];


//            kadane's algorithm to find maximum

            maxSum = Math.max(maxSum + nums[index],nums[index]);

            maxSofar = Math.max(maxSofar,maxSum);

//            kadane's algorithm to find minimum

            minSum = Math.min(minSum + nums[index],nums[index]);

            minSofar = Math.min(minSofar,minSum);


        }


        if(minSofar==arrSum){

            // special case handle
            // for all negative element

            return maxSofar;
        }

        return Math.max(maxSofar,arrSum - minSofar);


    }
}

public class maximumSubArrayCircularSum {
    public static void main(String[] args) {

    }
}
