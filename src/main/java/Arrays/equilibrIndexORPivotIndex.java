package Arrays;

public class equilibrIndexORPivotIndex {


    public static int main(String[] args) {
        int []nums = new int[]{1,3,5,6};
        int n = nums.length;


        int sum = 0;

        for(int num:nums){

            sum += num;

        }

        int leftSum=0;

        for(int index=0;index<n;index++){


            sum -= nums[index];

            if(sum==leftSum){

                return index;

            }


            leftSum += nums[index];

        }


        return -1;
    }
}
