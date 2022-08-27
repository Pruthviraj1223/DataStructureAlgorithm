package Arrays;

class SubarrayProduct {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // leetcode

        int n = nums.length;

        if (n==0 || k<=1){

            return 0;

        }

        int left=0;

        int prod=1;

        int ans = 0;

        for(int right=0;right<n;right++){


            prod = prod * nums[right];


            while(prod>=k){

                prod = prod / nums[left];

                left++;


            }

            ans += right - left + 1;

        }

        return ans;

    }
}

public class subarrayProductLessThanK {

    public static void main(String[] args) {

        new SubarrayProduct().numSubarrayProductLessThanK(new int[]{10,5,2,6},100);

    }
}
