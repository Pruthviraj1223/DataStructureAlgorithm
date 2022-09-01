package BinarySearch;

class Solution2 {

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

    public int searchRange(int[] nums, int target) {

        if(nums==null || nums.length==0){

            return -1;

        }

        var left= findFirst(nums,target);

        var right = findLast(nums,target);

        return right - left + 1;

    }
}

public class countOfElementOccurence {

    public static void main(String[] args) {

    }
}
