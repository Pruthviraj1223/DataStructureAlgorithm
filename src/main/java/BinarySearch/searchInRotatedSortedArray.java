package BinarySearch;

class Solution {


    public int find(int[] nums,int target){

        if(nums.length==1) {

            return 0;

        }

        int n = nums.length;
        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(mid < high && nums[mid+1] < nums[mid]){

                return mid+1;

            }else if(mid >low && nums[mid] < nums[mid-1]){

                return mid;
            }

            else if(nums[low] < nums[mid]){

                low = mid+1;

            }else{

                high = mid-1;
            }

        }

        return 0;

    }

    public int search(int[] A, int target) {

        int rot = find(A,target);

        int n = A.length;

        int lo=0;

        int hi = n-1;

        while(lo<=hi){

            int mid=(lo+hi)/2;

            int realmid=(mid+rot)%n;

            if(A[realmid]==target)return realmid;

            if(A[realmid]<target)lo=mid+1;

            else hi=mid-1;

        }

        return -1;

    }

    // Extra tip : watch if -INF +INF Solution
}

public class searchInRotatedSortedArray {
    public static void main(String[] args) {

    }

}
