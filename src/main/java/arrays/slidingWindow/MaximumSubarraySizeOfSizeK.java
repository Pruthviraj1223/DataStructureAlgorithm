package arrays.slidingWindow;

class Subbaray{


    public void MaxSubArrayOfSizek(int []nums,int k){

        int n = nums.length;

        int sum=0;

        int index=0;

        for (;index < k; index++) {

            sum += nums[index];

        }

        int maxSum =0;

        for(;index<n;index++){

            sum = sum + nums[index] - nums[index-k];

            maxSum = Math.max(sum,maxSum);

        }

        System.out.println("max = " + maxSum);

    }

}

public class MaximumSubarraySizeOfSizeK {
    public static void main(String[] args) {

        new Subbaray().MaxSubArrayOfSizek(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20},4);

    }
}
