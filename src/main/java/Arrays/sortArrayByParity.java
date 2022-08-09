package Arrays;

class Solution3 {
    public int[] sortArrayByParity(int[] nums) {

//        public int[] sortArrayByParity(int[] A) {
//            int[] ans = new int[A.length];
//            int t = 0;
//
//            for (int i = 0; i < A.length; ++i)
//                if (A[i] % 2 == 0)
//                    ans[t++] = A[i];
//
//            for (int i = 0; i < A.length; ++i)
//                if (A[i] % 2 == 1)
//                    ans[t++] = A[i];
//
//            return ans;
//        }

        // two pointer
        // this is optimal solution

        int i=0;
        int j=nums.length-1;

        while(i<j){

            if (nums[i]%2 > nums[j]%2){

                int temp = nums[i];

                nums[i] = nums[j];

                nums[j] = temp;

            }

            if(nums[i]%2==0){

                i++;

            }

            if(nums[j]%2==1){

                j--;

            }

        }

        return nums;

    }
}


public class sortArrayByParity {
}
