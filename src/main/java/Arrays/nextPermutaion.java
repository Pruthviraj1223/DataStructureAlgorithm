package Arrays;

class nextPermutaion {

    public void swap(int []nums,int i,int j){

        int temp = nums[i];

        nums[i] = nums[j];

        nums[j] = temp;

    }


    public void reverse(int []nums,int start,int end){

        while(start<end){

            swap(nums,start,end);

            start++;
            end--;

        }
    }

    public void nextPermutation(int[] nums) {


        if(nums==null || nums.length<=1){


            return;

        }

        int i = nums.length - 2;

        while(i>=0 && nums[i]>=nums[i+1]){

                i--;

        }

        int j = nums.length-1;

        if (i>=0){

            while(j>=0 && nums[j]<=nums[i]){

                j--;
            }

              swap(nums,i,j);
        }

        reverse(nums,i+1,nums.length-1);

    }
}
