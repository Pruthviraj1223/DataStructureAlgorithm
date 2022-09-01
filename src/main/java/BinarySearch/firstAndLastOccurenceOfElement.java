package BinarySearch;

class Solution1 {

    private int findFirst(int[] nums, int target){

        int low=0;

        int high = nums.length-1;

        int res=-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(nums[mid]==target){

                res = mid;

                high = mid-1;

            }else if(target < nums[mid]){

                high = mid - 1;

            }else{

                low = mid + 1;

            }

        }

        return res;

    }

    private int findLast(int[] nums, int target){

        int low=0;

        int high = nums.length-1;

        int res=-1;

        while(low<=high){


            int mid = (low+high)/2;

            if(nums[mid]==target){

                res = mid;

                low = mid + 1;

            }else if(target < nums[mid]){

                high = mid - 1;

            }else{

                low = mid + 1;

            }
        }

        return res;


    }

    public int[] searchRange(int[] nums, int target) {

        int []ans = new int[2];

        ans[0] = -1;
        ans[1] = -1;

        if(nums==null || nums.length==0){

            return ans;

        }

        ans[0] = findFirst(nums,target);

        ans[1] = findLast(nums,target);

        return ans;


    }
}


public class firstAndLastOccurenceOfElement {
    public static void main(String[] args) {

    }
}
