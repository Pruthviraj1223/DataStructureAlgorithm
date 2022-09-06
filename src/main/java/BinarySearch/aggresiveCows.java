package BinarySearch;

import java.util.Arrays;

class Aggressive {

    public boolean isPossible(int []nums,int totalCows,int minDiff){

        int countOfCows=1;
        int previousCow = nums[0];


        for (int index = 0; index < nums.length; index++) {


            if(nums[index] - previousCow >=minDiff){

                countOfCows++;

                previousCow = nums[index];

            }

            if (countOfCows==totalCows){

                return true;

            }

        }

        return false;

    }

    public int cows(int[] nums, int cows) {

        int size = nums.length;

        /**
         * Sort the array. It could be unsorted
        * */
        Arrays.sort(nums);

        int low = 0;

        int high = size-1;

        int ans = -1;

        while (low<=high){


            int mid = (low+high)/2;

            if(isPossible(nums, cows,mid)){

                ans = mid;

                low = mid + 1;

            }else {

                high = mid-1;

            }
        }

        return ans;

    }

}

public class aggresiveCows {
    public static void main(String[] args) {

        System.out.println(new Aggressive().cows(new int[]{1,2,8,4,9}, 3));

    }
}
