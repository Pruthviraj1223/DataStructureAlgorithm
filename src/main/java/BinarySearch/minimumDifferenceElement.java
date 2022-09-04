package BinarySearch;

class MinDiff{
    public int binarySearch(int []nums,int low,int high, int key){

        while (low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==key){

                return 0;

            }else if (key < nums[mid]){

                high = mid -1;


            }else {

                low = mid + 1;

            }

        }

        int diff1 = Math.abs(nums[high] - key);

        int diff2 = Math.abs(nums[low] - key);

        return Math.min(diff1,diff2);

    }

}

public class minimumDifferenceElement {
    public static void main(String[] args) {

    }
}
