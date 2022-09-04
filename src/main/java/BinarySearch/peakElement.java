package BinarySearch;


class peak{

    public int binarySearch(int []nums){

//        Aditya verma
//        GFG solution

        int n = nums.length;

        if(n==0){

            return -1;

        }

        if(n==1){

            return 0;

        }

        int low=0;

        int high = nums.length-1;



        while (low<=high){

            int mid = low + (high-low)/2;



            if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == n - 1 || nums[mid + 1] <= nums[mid])){

                return mid;

            }else if (mid > 0 && nums[mid-1] > nums[mid]){

                high = mid -1;

            }else {

                low = mid + 1;

            }

            System.out.println("low " + low + " mid " + mid + " high " + high);


        }

        return -1;

    }


}

public class peakElement {
    public static void main(String[] args) {

        new peak().binarySearch(new int[]{1,2,3,1});

    }
}
