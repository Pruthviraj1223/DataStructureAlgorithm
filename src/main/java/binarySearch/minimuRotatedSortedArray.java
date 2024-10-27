package binarySearch;

class Solution12 {
    public int findMin(int[] nums) {

        /*
        * First look at Solution13 solution
        * */

        if(nums.length==1){

            return nums[0];

        }

        int n = nums.length;
        int low=0;
        int high=nums.length-1;

        while(low < high){


            int mid = low + (high-low)/2;

            if (nums[mid] > nums[high]){

                low = mid + 1;

            }else{

                high = mid;

            }

        }


        return nums[low];

    }
}

class Solution13 {
    public int findMin(int[] nums) {

        if(nums.length==1){

            return nums[0];

        }

        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(mid < high && nums[mid+1] < nums[mid]){

                return nums[mid+1];

            }else if(mid >low && nums[mid] < nums[mid-1]){

                return nums[mid];

            }

            else if(nums[low] < nums[mid]){

                low = mid+1;

            }else{

                high = mid-1;
            }

        }

        return nums[0];

    }
}

public class minimuRotatedSortedArray {
    public static void main(String[] args) {

    }
}
